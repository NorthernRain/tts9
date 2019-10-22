package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * 缓冲输出流
 * 
 * @author tarena
 *
 */
public class BOSDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("fos.txt", true);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		bos.write("二乃最美！".getBytes("UTF-8"));
		// bos.flush();
		bos.close();
	}
}
