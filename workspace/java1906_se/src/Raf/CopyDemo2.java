package Raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 块读写，通过提升每次读写的数量，减少实际的读写次数，提高读写效率
 *
 * 单字节读写是随机读写，效率差， 块读写是一组一组字节的读写，效率高
 * 
 * @author tarena
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile src = new RandomAccessFile("CentOS-6.5-x86_64-bin-DVD1-dehui.iso", "r");
		RandomAccessFile dst = new RandomAccessFile("CentOS-6.5-x86_64-bin-DVD1-dehui_cp.iso", "rw");
		byte[] data = new byte[1024 * 10];
		int len = -1;
		while ((len = src.read(data)) != -1) {
			dst.write(data, 0, len);

		}
		src.close();
		dst.close();
	}
}
