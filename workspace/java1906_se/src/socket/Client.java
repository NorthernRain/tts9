package socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * 聊天室客户端
 *
 */
public class Client {
	/*
	 * java.net.Socket 套接字 Scoket封装了TCP协议传输数据的细节，使得我们可以通过 两条流的读写完成与远端计算机的数据交互
	 */
	private Socket socket;
	Scanner scanner = new Scanner(System.in);

	/**
	 *
	 * 构造方法，用来初始化客户端
	 */
	public Client() {
		try {
			/*
			 * 实例化Socket的过程就是连接服务器的过程。 参数1：服务端的IP地址 参数2：服务端程序打开的端口
			 * 
			 * 我们通过IP可以查找到网络上的服务端所在的计算机，通过端口可以找到该计算机 上运行的服务端应用程序从而建立连接.
			 * 
			 */
			System.out.println("正在连接服务器...");
			socket = new Socket("176.198.114.7", 8088);
			System.out.println("已连接到服务器！");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 *
	 * 客户端开始工作的方法
	 */
	public void start() {

		try {
			ServerHandler serverHandler=new ServerHandler();
			Thread thread = new Thread(serverHandler);
			thread.start();

			/*
			 * Socket提供的方法： OutputStream getOutputStream()
			 * 通过该方法获取的输出流写出的字节会通过网络发送给远端计算机。
			 */

			OutputStream out = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(out, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			PrintWriter pw = new PrintWriter(bw, true);
			System.out.println("你的消息：");
			String message = scanner.nextLine();
			while (!"exit".equals(message)) {

				message="Coldrain："+message;
				pw.println(message);
				System.out.println("你的消息：");
				message = scanner.nextLine();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		Client client = new Client();

		client.start();
	}

	private class ServerHandler implements Runnable{

        public void run() {

            try {
                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is, "UTF-8");
                BufferedReader br = new BufferedReader(isr);
                String message=null;
                while((message=br.readLine())!=null){
                    System.out.println(message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

	}

}
