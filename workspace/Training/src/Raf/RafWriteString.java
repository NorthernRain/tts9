package Raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RafWriteString {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("./raf.dat", "rw");
		String str = "三玖天下第一！";
		raf.write(str.getBytes("UTF-8"));
		raf.close();

	}
}
