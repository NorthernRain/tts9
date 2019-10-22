package file;

import java.io.File;

/**
 * 在当前目录下创建一个目录
 * @author tarena
 *
 */
public class MkDirDemo {
public static void main(String[] args) {
	File dir=new File("./demo");
	if (!dir.exists()) {
		dir.mkdir();
		System.out.println("创建");
	}
	else {
		System.out.println("已存在");
	}
}
}
