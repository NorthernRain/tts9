package file;

import java.io.File;

/**
 * 删除目录
 * 
 * @author tarena
 *
 */
public class DeletDirDemo {
	public static void main(String[] args) {
		File dir = new File("./demo");
		if (dir.exists()) {
			dir.delete();
			System.out.println("删除");
		}
	}
}
