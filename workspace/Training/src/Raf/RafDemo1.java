package Raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RafDemo1 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("./raf.txt", "rw");
		RandomAccessFile raf1 = new RandomAccessFile("./raf.txt", "r");
		raf.writeInt(Integer.MAX_VALUE);
		raf.writeDouble(123.0);
		raf.writeLong(1234L);
		raf.close();
		raf1.seek(4);
		System.out.println(raf1.readDouble());
		raf1.close();

	}
}
