package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 缓冲输入流
 * @author tarena
 *
 */
public class BISDemo {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("fos.txt");
	BufferedInputStream bis=new BufferedInputStream(fis);
	byte[] data = new byte[1000];
	int len=fis.read(data);
	bis.read(data);
	System.out.println(new String(data,0,len,"UTF-8"));
	bis.close();
}
}
