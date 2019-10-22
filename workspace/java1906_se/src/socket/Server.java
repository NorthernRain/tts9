package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

/**
 * 聊天室服务端
 *
 * @author tarena
 */
public class Server {
    /*
     * 运行在服务端的ServerSocket主要有两个作用 1：向系统申请服务端口，客户端就是通过这个端口与服务器程序建立连接的
     * 2：监听服务端口，一旦一个客户端建立连接就会返回一个Socket实例，服务端就可以通过 这个Socket实例与该客户端交互了。
     */
    private ServerSocket server;
    /*
    用来保存所有对应的客户端的输出流，用于让clientHandler之间广播消息使用
    内部类是可以访问外部类属性的，因此所有的ClientHandler都可以看到外部类Server定义的属性，因此
    这里定义的属性可以作为他们共享数据的地方使用。
     */
    private PrintWriter[] allout = {};


    public Server() {
        try {
            /*
             * 实例化ServerSocket时要制定端口号，如果该端口被占用时会抛出异常。
			 */
            System.out.println("正在启动服务器...");
            server = new ServerSocket(8088);
            System.out.println("服务器启动完毕！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

    public void start() {

        try {
            /*
             * 阻塞方法 Socket accept() 调用后就"卡住"了，此时开始等待客户端的连接，
			 * 一旦一个客户端建立连接，此时该方法会立刻返回一个Socket实例，通过这个Socket就可以 与客户端交互了。
			 */
            while (true) {
                System.out.println("等待客户端连接...");
                Socket socket = server.accept();
                System.out.println("连接成功...");
                // 启动一个线程，处理该客户端交互
                ClientHandler handler = new ClientHandler(socket);
                Thread t = new Thread(handler);
                t.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 该线程负责与指定客户端交互
     *
     * @author tarena
     */
    private class ClientHandler implements Runnable {
        private Socket socket;
        private String host;// 记录客户端IP地址

        public ClientHandler(Socket socket) {
            this.socket = socket;
            host = socket.getInetAddress().getHostAddress();
        }

        public void run() {
            PrintWriter pw = null;
            try {

				/*
                 * InputStream getInputStream()
				 * Socket的该方法获取的输入流读取的是远端计算机发送过来的字节。
				 */
                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is, "UTF-8");
                BufferedReader br = new BufferedReader(isr);
                /*
                通过socket获取输出流，用于将消息发送客户端
				 */
                OutputStream out = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(out, "UTF-8");
                BufferedWriter bw = new BufferedWriter(osw);
                pw = new PrintWriter(bw, true);

                /*
                将该输出流存入allout数组中，这样每个clientHandler 实例都会做这样的事，那么所有的
                ClientHand通过这个数组获取到其它的ClientHanlder放进来的输出流了，从而做到共享。从而做到共享。
                 */
                synchronized (allout) {
                    allout = Arrays.copyOf(allout, allout.length + 1);
                    allout[allout.length - 1] = pw;
                }
                System.out.println(host + "上线了！当前在线" + allout.length + "人！");
                String s = null;
                /*
                 * 当客户端断开连接时，服务器这边的readLine方法有两种情况：
				 * 1：返回值为null，通常linux客户端断开时会出现这种情况
				 * 2：直接抛出异常SocketException：connection reset
				 */
                while ((s = br.readLine()) != null || !"exit".equals((s = br.readLine()))) {
                    System.out.println(host + "：");
                    System.out.println(s);
                    synchronized (allout) {
                        for (int i = 0; i < allout.length; i++) {
                            allout[i].println(host + "->" + s);
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                //处理客户端断开后的操作


                //将当前客户端中的输出流从allout中删除
                synchronized (allout) {
                    for (int i = 0; i < allout.length; i++) {
                        if (allout[i] == pw) {
                            allout[i] = allout[allout.length - 1];
                            allout = Arrays.copyOf(allout, allout.length - 1);
                            break;
                        }
                    }
                    System.out.println(host + "下线了！当前在线" + allout.length + "人！");
                }
            }

        }
    }
}