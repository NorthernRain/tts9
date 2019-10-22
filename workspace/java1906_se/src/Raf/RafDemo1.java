package Raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RAF是专门用来读写文件数据的API，其基于指针对文件任意位置进行读写
 * 
 * @author tarena
 *
 */
public class RafDemo1 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("./raf.dat", "rw");
		raf.write(5);
	
		raf.close();
	}
}
