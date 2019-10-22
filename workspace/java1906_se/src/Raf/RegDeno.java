package Raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 用户注册 程序启动后，要求输入注册信息 用户名，密码，昵称，年龄 其中除了年龄是int外，其余三个是string
 * 然后将该信息写入user.dat文件中保存
 * 
 * 每条记录固定占用100字节 其中用户名 密码，昵称卫子夫串，各占用32字节 年龄为int值 固定占用4字节
 *
 * @author tarena
 *
 */
public class RegDeno {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("欢迎注册");

		System.out.println("请输入用户名：");
		String username = scanner.nextLine();
		System.out.println("请输入密码：");
		String password = scanner.nextLine();
		System.out.println("请输入昵称：");
		String nickname = scanner.nextLine();
		System.out.println("请输入年龄：");
		int age = Integer.parseInt(scanner.nextLine());
		System.out.println("username:" + username + "," + "password:" + password + "," + "nickname:" + nickname + ","
				+ "age:" + age);

		RandomAccessFile raf = new RandomAccessFile("user.dat", "rw");
		raf.seek(raf.length()+100);
		// 用户名
		byte[] data = username.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);
		// 写密码
		data = password.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);
		// 写昵称
		data = nickname.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);
		// 写年龄
		raf.writeInt(age);
		System.out.println("pos:" + raf.getFilePointer());
		raf.close();
	}
}
