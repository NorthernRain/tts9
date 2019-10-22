package io;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流完成文件的复制
 * 
 * @author tarena
 *
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 
		 * 1：创建文件输入流读取源文件 2:创建文件输出流用于写复制文件 3:循环从原文件读取字节到复制文件中 4:关闭两个流
		 * 
		 */
		FileInputStream fis = new FileInputStream("./CentOS-6.5-x86_64-bin-DVD1-dehui.iso");
		FileOutputStream fos = new FileOutputStream("./CentOS-6.5-x86_64-bin-DVD1-dehui_cp1.iso");
		byte[] data = new byte[1024 * 10];
		int len = -1;
long start=System.currentTimeMillis();
		while ((len = fis.read(data)) != -1) {
			fos.write(data, 0, len);
		}
		long end=System.currentTimeMillis();
		System.out.println((end-start));
		fos.close();
		fis.close();
	}
}
