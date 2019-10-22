package sort;

import java.util.*;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入五个数：");
		int[] input = new int[5];
		for (int i = 0; i < 5; i++) {
			input[i] = scan.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			System.out.print("" + input[i] + '\0');
		}
		System.out.println();
		System.out.println("排序结果：");
		for (int i = 0; i < 5; i++) {
			System.out.print("" + bubbleSort(input)[i] + '\0');
		}

	}

	public static int[] bubbleSort(int[] input) {
		int[] sorted = input;

		for (int i = 0; i < sorted.length-1; i++) {
			for (int j = 0; j < sorted.length - i -1; j++) {
				if (sorted[j] > sorted[j + 1]) {
					int index = sorted[j + 1];
					sorted[j + 1] = sorted[j];
					sorted[j] = index;
				}
			}
		}
		return sorted;

	}
}
