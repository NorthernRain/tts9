package Raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读写基本类型数据以及RAF指针的操作
 * 
 * @author tarena
 *
 */
public class RafDemo3 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.dat", "rw");
		RandomAccessFile raf1 = new RandomAccessFile("raf.dat", "rw");
		long pos = raf.getFilePointer();
		System.out.println("pos:" + pos);

		int max = Integer.MAX_VALUE;
		/*
		 * raf.write(max>>>24); raf.write(max>>>16); raf.write(max>>>8);
		 * raf.write(max>>>0);
		 */
		raf.writeInt(max);
		raf.writeLong(15231);
		raf.writeDouble(123.0);
		pos = raf.getFilePointer();
		System.out.println("pos:" + pos);

		int d = raf1.readInt();
		System.out.println(d);
		// 将指针移动到指定位置
		raf.seek(12);
		System.out.println(raf.readDouble());
		System.out.println("pos:" + pos);

		raf.close();
	}
}
