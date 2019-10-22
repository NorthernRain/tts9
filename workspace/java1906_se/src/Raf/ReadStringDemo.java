package Raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 
 *
 * @author tarena
 *
 */
public class ReadStringDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "r");
		byte[] data = new byte[(int)raf.length()];
		raf.read(data);
		String string = new String(data,"UTF-8");
		System.out.println(string);
		raf.close();
	}
	
}
