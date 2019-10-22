/*package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;

import socket.Server.ClientHandler;

public class Server {
	private ServerSocket server;

	public Server() {
		try {
			System.out.println("正在启动服务器...");
			server = new ServerSocket(9600);
			System.out.println("服务器启动完毕！");
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public void run() {
		try {

			while (true) {
				System.out.println("等待客户端连接...");
				Socket socket = server.accept();
				System.out.println("连接成功...");

				ClientHandler handler = new ClientHandler(socket);
				Thread t = new Thread(handler);
				t.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		Server server = new Server();
		server.run();
	}

	class ClientHandler implements Runnable {
		private Socket socket;
		private String host;// 记录客户端IP地址

		public ClientHandler(Socket socket) {
			this.socket = socket;
			host = socket.getInetAddress().getHostAddress();
		};

		public void run() {
			try {
				InputStream is = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(is, "UTF-8");
				BufferedReader br = new BufferedReader(isr);

				String s = null;
				while ((s = br.readLine()) != null || !"exit".equals((s = br.readLine()))) {
					System.out.println(host + "：");
					System.out.println(s);
				}
				;
			} catch (UnsupportedEncodingException e) {

				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}

}
*/