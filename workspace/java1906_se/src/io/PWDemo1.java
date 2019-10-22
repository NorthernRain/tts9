package io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 
 * 自行完成流连接使用pw写出文本
 * 
 * @author tarena
 *
 */
public class PWDemo1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("pw1.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		PrintWriter pw = new PrintWriter(bw);
		pw.println("我要学日语！");
		pw.close();
	}

}
