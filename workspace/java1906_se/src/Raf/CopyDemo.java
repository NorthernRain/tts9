package Raf;


import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 将一个文件复制到另一个文件
 * @author tarena
 *
 */
public class CopyDemo {
public static void main(String[] args) throws IOException {
	RandomAccessFile src=new RandomAccessFile("1234.jpg", "r");
	RandomAccessFile dst=new RandomAccessFile("1234_cp.jpg", "rw");
	int d=-1;
	while((d=src.read())!=-1){
		dst.write(d);
	}
	src.close();
	dst.close();
}
}
