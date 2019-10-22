package Raf;


import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 使用raf向文件写入字符串
 * 
 * 
 * 
 */
public class WriteStringDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");
		String line = "夜空中最亮的星";
		byte[] data = line.getBytes("UTF-8");
		raf.write(data);
		raf.close();
	}
}
