package Raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 完成修改昵称
 * 
 * 
 * 程序启动后要求输入用户名和新的昵称 然后修改user.dat文件中该用户的昵称。 若输入的用户名在user.dat文件中不存在则输出提示：该用户不存在！
 * 
 * @author tarena
 *
 */
public class UpdateDemo {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你的用户名：");
		String username = scanner.nextLine();
		System.out.println("请输入新的昵称：");
		String nickname = scanner.nextLine();
		RandomAccessFile raf = new RandomAccessFile("user.dat", "rw");

		byte[] data = new byte[32];
		for (int i = 0; i < raf.length() / 100; i++) {
			raf.seek(i * 100);
			// System.out.println(raf.getFilePointer());
			raf.read(data);
			String name = new String(data, "UTF-8").trim();
			if (name.equals(username)) {

				raf.seek(raf.getFilePointer() + 32);
				byte[] newnick = nickname.getBytes();
				newnick = Arrays.copyOf(newnick, 32);
				raf.write(newnick);
				System.out.println("修改完成！");
				raf.close();
				return;
			}

		}

		System.out.println("此用户不存在！");

	}

}
