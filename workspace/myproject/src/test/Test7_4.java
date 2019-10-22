package test;

import java.util.Arrays;

public class Test7_4 {

	public static void main(String[] args) {
		/*
		 * （选做）向一个长度为10的整型数组中随机生成10个0~9的随机整数，完成下列任务 1)统计每个数字出现了多少次 2)输出出现次数最多的数字
		 * 3)输出只出现一次的数字中最小的数字
		 */
		int[] num = new int[10];
		// 定义一个数组去记录0-9的数出现了多少次，下面的switch里面会用到！
		int[] index = new int[10];

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 10);
			/*
			 * switch (num[i]) { // 0每出现一次，对应的index[0]就会+1; case 0: index[0]++;
			 * break; case 1: index[1]++; break; case 2: index[2]++; break; case
			 * 3: index[3]++; break; case 4: index[4]++; break; case 5:
			 * index[5]++; break; case 6: index[6]++; break; case 7: index[7]++;
			 * break; case 8: index[8]++; break; case 9: index[9]++; break; }
			 */
			index[num[i]]++;
		}
		System.out.println(Arrays.toString(num));
		for (int i = 0; i < num.length; i++) {
			System.out.println(i + "出现了：" + index[i] + "次.");

		}

		// 遍历index，找出index中的最大值，他的下标就是出现次数最多的那个数
		int max = 0;
		for (int i = 0; i < num.length; i++) {
			if (index[i] >= max) {
				max = index[i];
			}

		}
		for (int i = 0, j = 0; i < num.length; i++) {
			if (index[i] == max) {
				// 只有一个的话就只输出一个，否则输出顿号加上其他次数相同的数
				if (j == 0) {
					System.out.print("出现次数最多的数字是：" + i);
					j++;
				} else
					System.out.print("、" + i);
			}

		}
		System.out.println();
		boolean flag = true;
		// 遍历index，只要index中元素为1，就输出这个下标，此下标就是出现1次的数字里最小的那个
		for (int i = 0; i < num.length; i++) {
			if (index[i] == 1) {
				System.out.println("只出现1次的数字中最小的数是：" + i);
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println("没有只出现1次的数字!");

	}

}
