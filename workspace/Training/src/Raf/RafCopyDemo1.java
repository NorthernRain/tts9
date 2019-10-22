package Raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RafCopyDemo1 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("./1234.jpg", "rw");
		RandomAccessFile raf_c = new RandomAccessFile("./1234_cp1.jpg", "rw");
		int len = -1;
		byte[] data = new byte[1024 * 10];
		while ((len = raf.read(data)) != -1) {
			raf_c.write(data, 0, len);
		}

		System.out.println("复制完成");
		raf.close();
		raf_c.close();
	}
}
