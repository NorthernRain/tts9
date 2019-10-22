package Raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RafCopyDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("./1234.jpg", "rw");
		RandomAccessFile raf_c = new RandomAccessFile("./1234_cp.jpg", "rw");
		int d = -1;
		while ((d = raf.read()) != -1) {
			raf_c.write(d);

		}
		System.out.println("复制完成");
		raf.close();
		raf_c.close();
	}
}
