package io;

import java.io.FileInputStream;

import java.io.IOException;

/**
 * 
 * 文件输入流，用于从文件中读取数据
 * 
 * @author tarena
 *
 */
public class FISDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./fos.txt");
		byte[] data = new byte[1000];
		int len=fis.read(data);

		//System.out.println(new String(data, "UTF-8").trim());
		System.out.println(new String(data,0,len, "UTF-8"));
		fis.close();
	}

}
