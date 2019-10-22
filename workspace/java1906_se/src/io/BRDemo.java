package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 缓冲字符输入流 java.io.bufferedReader 块读写文本数据,并且可以按行读取字符串.
 * 
 * 
 * @author tarena
 *
 */
public class BRDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./src/io/PWDemo.java");
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		/*
		 * String readLine() 连续读取若干字符知道读取到换行符为止， 将换行符以前的字符组成一个字符串返回.
		 * 如果返回值为null,表示流读取到末尾了.
		 */
		String str = null;
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
		br.close();
	}
}
