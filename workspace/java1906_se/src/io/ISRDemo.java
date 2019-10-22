package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

/**
 * 使用转换流读取数据文本
 * 
 * @author tarena
 *
 */
public class ISRDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("osw.txt");
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		int d = -1;
		
		while ((d = isr.read()) != -1) {
			System.out.print((char) d);
		}
		isr.close();

		RandomAccessFile raf = new RandomAccessFile("osw.txt", "r");
		byte[] data=new byte[(int)raf.length()]; 
		int len=raf.read(data);
		System.out.println(new String(data,0,len,"UTF-8"));
		raf.close();
		
		FileInputStream fis1=new FileInputStream("osw.txt");
		byte[] data1=new byte[1000];
		len=fis1.read(data);
		System.out.println(new String(data,0,len,"UTF-8"));
		fis1.close();
		
	
	}
}
