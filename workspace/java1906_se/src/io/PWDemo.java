package io;


import java.io.IOException;
import java.io.PrintWriter;

/**
 * 缓冲字符流 java.io.bufferedWriter java.io.bufferedReader
 * 
 * 缓冲流是块读写文本数据,提高读写效率. 并且可以按行读写字符串
 *
 * java.io.printWriter具有自动行缓冲字符输出流,内部总是连接bufferedWriter作为 其缓冲加速操作.
 * 
 * @author tarena
 *
 */
public class PWDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 向pw.txt文件中写入字符串
		 * 该构造方法内部会自动进行流连接操作，
		 * 分别连接缓冲字符流，转换流和文件流.
		 * 
		 */

		PrintWriter pw = new PrintWriter("pw.txt","UTF-8");
		pw.println("我好想睡觉啊！");
		pw.println("我好喜欢二乃和三玖啊！");
		pw.close();
	}
}
