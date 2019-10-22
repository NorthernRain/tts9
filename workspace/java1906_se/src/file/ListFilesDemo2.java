package file;

import java.io.File;
import java.io.FileFilter;

/**
 * 
 * 获取一个目录下指定的子项
 * File[] listFiles(FileFilter filter)
 * 将目录中符合过滤器要求的子项获取
 * @author tarena
 *
 */
public class ListFilesDemo2 {
public static void main(String[] args) {
	
	
	File dir=new File(".");
	if (dir.isDirectory()) {
		//匿名内部类
		FileFilter filter=new FileFilter() {
			
			public boolean accept(File file) {
				String name=file.getName();
				return name.startsWith(".");
			}
		};
		File[] subs=dir.listFiles(filter);
		System.out.println(subs.length);
		for (int i = 0; i < subs.length; i++) {
			System.out.println(subs[i].getName());
		}
	}
}
}


//
/*

class MyFilter implements FileFilter{
	
	
	public boolean accept(File file) {
		String name=file.getName();
		return name.startsWith(".");
	}
	
	
}*/