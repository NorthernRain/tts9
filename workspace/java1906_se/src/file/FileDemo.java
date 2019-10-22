package file;

import java.io.File;

/**
 * input output java.io.File用于表示文件系统的一个文件或目录的
 * 
 * 
 * 使用File我们可以“ 1：访问其表示的文件或者目录的属性(名字大小等) 2.创建删除文件或者目录 3.访问一个目录中的子文件
 * 
 * 但是不能访问文件数据.
 * 
 * @author tarena
 *
 */
public class FileDemo {

	public static void main(String[] args) {
		/*//相对路径，.就代表当前目录
		 * 
		 * 创建file要指定路径
		 * 路径有两种：绝对路径和相对路径
		 * 绝对路径通常不使用，虽然清晰明了
		 * 但是无法做到跨平台
		 * 
		 * 相对路径不能直观显示出文件的具体位置
		 * 但是灵活并且适应各种不同的环境
		 * 在eclipse下执行代码时，"./"表示当前目录
		 * 即是当前项目的目录
		 * 
		 * 
*/		
		File file = new File("./demo.txt ");
		String name=file.getName();
		System.out.println(name);
		
		long len=file.length();
		System.out.println(len+"字节");
		
		
		String path=file.getAbsolutePath();
		System.out.println(path);
		
		
		boolean re=file.canRead();
		boolean wr=file.canWrite();
		boolean hi=file.isHidden();
		System.out.println(re);
		System.out.println(wr);
		System.out.println(hi);
		
		
	}
}
