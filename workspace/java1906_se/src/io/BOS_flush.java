package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲输出流的缓冲区问题
 * 
 * @author tarena
 *
 */
public class BOS_flush {
	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("bos.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
	bos.write("团战可以输，提莫必须死！".getBytes("UTF-8"));
	/*
	 * void flush();
	 * flush放阿飞是OutputStream中定义的方法，
	 * 所有的输出流都具有该方法，但只有缓冲流的该方法有实际意义，
	 * 其他流具有该方法的目的实在流连接中传递缓冲操作给缓冲流
	 * 
	 * flush的作用是将缓冲流中已经存在的数据一次性写出
	 * 频繁地调用flush方法会提高写出的次数从而降低写出效率，
	 * 但是能保证数据的写出的及时性.
	 * 
	 *
	 */
	bos.flush();
	bos.close();
	System.out.println("success!");
	}
}
