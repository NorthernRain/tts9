package thread;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*
		 * 倒计时程序 程序启动后，要求在控制台输入一个数字， 然后从这个数字开始每秒递减并输出该数到0时输出的时间，程序结束。
		 */
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("请输入你的数字：");
			long number = scanner.nextLong();
			long start = System.currentTimeMillis();
			while (number > 0) {
				Thread.sleep(1000);
				number--;

			}
			long end = System.currentTimeMillis();
			System.out.println("耗时：" + (end - start) / 1000 + "s");
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println("输入类型错误！");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
