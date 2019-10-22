package file;

import java.io.File;

/**
 * 
 * 删除一个文件
 * 
 * @author tarena
 *
 */
public class DeletFileDemo {
public static void main(String[] args) {
	File file=new File("./test.txt");
	
	file.delete();
}
	
}
