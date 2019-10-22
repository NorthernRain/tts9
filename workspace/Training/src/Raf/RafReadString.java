package Raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RafReadString {
public static void main(String[] args) throws IOException {
	RandomAccessFile raf = new RandomAccessFile("./raf.dat", "r");
	byte[] data= new byte[(int) raf.length()];
	raf.read(data);
	System.out.println(new String(data,"UTF-8"));
	raf.close();
	
}
}
