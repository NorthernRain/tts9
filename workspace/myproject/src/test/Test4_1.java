package test;

import java.util.Random;
import java.util.Scanner;

public class Test4_1 {
/*	4.1随机生成一个1-100之间的数字num，循环让用户输入猜这个数，
	如果用户输入的数字大于num提示输入的数字比较大，
	如果用户输入的数字小于num提示输入的数字比较小，
	直到用户输入的数字和num相等为止，然后输出用户猜数的总次数*/
	public static void main(String[] args) {
		System.out.println("准备好游戏开始啦！");
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int src = rand.nextInt(100);
		while(true){
		System.out.println("请输入你的答案：");
		int result = scan.nextInt();
		
			if (result < src) {
				System.out.println("您输入的数太小啦！");
			} else if (result > src) {
				System.out.println("您输入的数太大啦！");
			} else {
				System.out.println("恭喜您猜对啦！");
				break;
				}
			}
	}

}
