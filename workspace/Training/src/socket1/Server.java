package socket1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private ServerSocket serverSocket;

	public Server() {

		try {
			System.out.println("Turn on the Server...");
			serverSocket = new ServerSocket(9600);
			System.out.println("Turn on the Server successfully!");
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public void run() {
		try {
			while (true) {
				System.out.println("Wait for connecting...");
				Socket socket = serverSocket.accept();
				System.out.println("Successfully connected!");

				ClientHandler clientHandler = new ClientHandler(socket);
				Thread t = new Thread(clientHandler);
				t.start();

			}

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Server server = new Server();
		server.run();
	}

	class ClientHandler implements Runnable {

		private Socket socket;
		private String host;

		public ClientHandler(Socket socket) {

			this.socket = socket;
			host = socket.getInetAddress().getHostAddress();
		}

		public void run() {
			try {
				InputStream is = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(is, "UTF-8");
				BufferedReader br = new BufferedReader(isr);
				String message = null;
				message = br.readLine();
				System.out.println(message);
				System.out.println(111);
				while ((message = br.readLine()) != null) {
					System.out.println(message);
				}

			} catch (IOException e) {

				e.printStackTrace();
			}

		}
	}

}
