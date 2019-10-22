package password;

import java.util.Scanner;

public class PasswordDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int psw;
		do {
			System.out.println("请输入密码：");
			psw = scan.nextInt();
		} while (psw != 123456);
		System.out.println("欢迎进入系统！");
	}

}
