package Raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 从文件中读取字节
 * 
 * @author tarena
 *
 */
public class RafDemo2 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("./raf.dat", "r");
		int d = raf.read();
		int d1 = raf.read();
		raf.close();
		System.out.println(d);
		System.out.println(d1);
		// 如果返回-1则表示文件末尾
	}
}
