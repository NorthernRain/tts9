package test;

import java.util.Scanner;

public class Test3_2 {

	public static void main(String[] args) {

		/*
		 * 3.2机票价格按照淡季旺季、头等舱和经济舱收费、 输入机票原价、月份和头等舱或经济舱， 其中旺季（5-10月）头等舱9折，经济舱85折，
		 * 淡季（11月到来年4月）头等舱7折，经济舱65折， 最终输出机票价格
		 */
		Scanner scan = new Scanner(System.in);
		double count=0;
		System.out.println("请输入机票原价：");
		double price = scan.nextDouble();
		System.out.println("请输入购票月份：");
		int mon = scan.nextInt();
		System.out.println("请输入经济舱或者头等舱：");
		String str = scan.next();
		switch (mon) {
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10: {
			if (str.equals("经济舱"))
				count = price * 0.85;
			else
				count = price * 0.9;
		}
			break;
		case 11:
		case 12:
		case 1:
		case 2:
		case 3:
		case 4: {
			if (str.equals("经济舱"))
				count = price * 0.65;
			else
				count = price * 0.7;
		}
			break;

		}
		System.out.println("您应该支付"+count+"元");
	}

}
