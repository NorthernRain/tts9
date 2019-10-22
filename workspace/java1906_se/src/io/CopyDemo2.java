package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲流 java.io.BufferedOutputStream java.io.BufferedInputStream
 * 
 * 缓冲流是一对高级流,在流连接中的作用是提高读写效率 使得我们在进行读写操作时用单字节读写和块读写都能保证读写效率 (建议实际读写时还是使用块读写)
 * 
 * 
 * 缓冲流之所以可以提高读写效率，是因为缓冲流内部有一个缓冲区(一个字节数组)，无论我们使用缓冲流进行何种读写(单字节或者块读写)最终都会被缓冲流
 * 转换为块读写来提高效率
 * 
 * @author tarena
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./CentOS-6.5.iso");
		FileOutputStream fos = new FileOutputStream("./CentOS-6.5_cp2.iso");
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int len = -1;
		byte[] data = new byte[1024 * 10];
		long start = System.currentTimeMillis();
		while ((len = bis.read(data)) != -1) {
			bos.write(data, 0, len);

		}
		long end = System.currentTimeMillis();
		System.out.println((end - start) / 1000);
		bis.close();
		bos.close();
	}
}
