package file;

import java.io.File;

/**
 * 创建一个多级目录
 * 
 * 
 * 
 * @author tarena
 *
 */
public class MkDirsDemo {

	public static void main(String[] args) {
		/*
		 *在当前目录下创建a/b/c/d/e/f 
		 */
		File dirs = new File("./a/b/c/d/e/f");
		if (!dirs.exists()) {
			dirs.mkdirs();
			System.out.println("创建");
			
		}
	}
}
