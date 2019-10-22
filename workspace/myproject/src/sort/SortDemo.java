package sort;

import java.util.*;

public class SortDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ÇëÊäÈë5¸öÊı×Ö£º");
		int[] input = new int[5];
		for (int i = 0; i < input.length; i++) {
			input[i] = scan.nextInt();
		}
		Arrays.sort(input);
		for (int i = 0; i < input.length; i++) {
			System.out.print("" + input[i] + "\0");
		}
		System.out.print(Arrays.toString(input));
		System.out.print("\r" );
		System.out.print("4665" );
	}
}
