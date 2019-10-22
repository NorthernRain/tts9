package file;

import java.io.File;
import java.io.IOException;

/**
 * 
 * 使用File创建一个文件
 * 
 * @author tarena
 *
 */
public class CreatNewFileDemo {
public static void main(String[] args) throws IOException {
	/**
	 * 在当前目录下创建一个文件text.txt
	 */
	
	File file=new File("./test.txt");
	if (!file.exists()) {
		
		file.createNewFile();
		System.out.println(true);
	}
	else{
		System.out.println(false);
	}
	
}
}
