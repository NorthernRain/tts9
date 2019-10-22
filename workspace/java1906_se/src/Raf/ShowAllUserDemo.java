package Raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 将user.dat文件中的用户信息显示到控制台
 * 
 * @author tarena
 *
 */
public class ShowAllUserDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("./workspace/java1906_se/user.dat", "r");
		for (int i = 0; i < raf.length() / 100; i++) {

			byte[] data = new byte[32];
			raf.read(data);
			String str = new String(data, "UTF-8").trim();
			System.out.println(str);
			raf.read(data);
			str = new String(data, "UTF-8").trim();
			System.out.println(str);
			raf.read(data);
			str = new String(data, "UTF-8").trim();
			System.out.println(str);
			System.out.println(raf.readInt());
		}
		raf.close();

		/*
		 * int[] a={1,4,5,45,1,4,5,54}; for (int b : a) { System.out.println(b);
		 * }
		 */
	}
}
