package io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 实现简易记事本工具 程序启动后 要求输入文件名，然后对文件写内容 将后续在控制台输入的每行字符串都按照行写入到该文件中，当单独输入了exit时，程序退出
 * 
 * 要求：自行使用流连接创建PW
 * 
 * @author tarena
 *
 */
public class PWDemo2 {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入文件名:");
		String fileName = scanner.nextLine();
		FileOutputStream fos = new FileOutputStream(fileName + ".txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		// 第二个参数为打开自动行刷新，为boolean型变量，true打开，false关闭。只有第一个参数是传入的流连接才能写true

		PrintWriter pw = new PrintWriter(bw, true);
		System.out.println("请输入文件内容：");
		String text = scanner.nextLine();
		while (!"exit".equals(text)) {
			pw.println(text);

			text = scanner.nextLine();

		}
		System.out.println("success");
		pw.close();
	}

}
