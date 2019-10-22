package Raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RafDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("./raf.demo", "rw");
		RandomAccessFile raf1 = new RandomAccessFile("./raf.demo", "r");
		String str="三玖天下第一！";
		raf.write(str.getBytes("UTF-8"));
		raf.close();
		
		
		
	/*	raf.write(2);
		raf.close();
		int d = raf1.read();
		System.out.println(d);
		raf1.close();*/
	}
}
