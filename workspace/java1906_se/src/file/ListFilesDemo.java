package file;

import java.io.File;

/**
 * 访问一个目录中的所有子项
 * 
 * 
 * 
 */
public class ListFilesDemo {
	public static void main(String[] args) {
		File dir = new File("./a");

		/*
		 * if (dir.isDirectory()) { File[] subs = dir.listFiles(); for (int i =
		 * 0; i < subs.length; i++) { System.out.println(subs[i].getName()); } }
		 */

		delet(dir);

	}

	public static void delet(File file) {

		if (file.isDirectory()) {
			File[] subs = file.listFiles();
			for (int i = 0; i < subs.length; i++) {
				File sub = subs[i];
				delet(sub);
			}
		}
		file.delete();

	}

}
