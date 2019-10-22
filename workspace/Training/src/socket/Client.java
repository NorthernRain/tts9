/*package socket;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	private Socket socket;
	Scanner scanner = new Scanner(System.in);

	public Client() {
		try {
			System.out.println("Connecting...");
			socket = new Socket("localhost", 9600);
			System.out.println("Connected!");

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public void run() {
		try {
			OutputStream out = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(out, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			PrintWriter pw = new PrintWriter(bw);

			System.out.println("你的消息：");
			String message = scanner.nextLine();
			while (!"exit".equals(message)) {
				pw.println(message);
				System.out.println("你的消息：");
				message = scanner.nextLine();
			}
		} catch (Exception e) {

		}

	}

	public static void main(String[] args) {
		Client client = new Client();
		client.run();
	}

}
*/