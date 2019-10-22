package socket1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	private Socket socket;
	Scanner scanner = new Scanner(System.in);

	public Client() {
		try {
			System.out.println("Connecting...");
			socket = new Socket("176.198.114.5", 9600);
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
			PrintWriter pw = new PrintWriter(bw, true);
			System.out.println("请输入你的信息:");
			String message = scanner.nextLine();
			while (true) {

				pw.println(message);

				System.out.println(message);
				System.out.println("请输入你的信息:");
				message = scanner.nextLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		Client client = new Client();
		client.run();
	}
}
