package test;

import java.util.Arrays;

public class ArrayChange {

	public static void main(String[] args) {
		int[] arr = { 8, 9, 5, 7, 5,3, 35, 44 };
	
		

	
		for (int i = 0, j = 0; i < arr.length/2; i++) {
			j = arr.length - 1 - i;
			arr[i] = arr[j] + 0 * (arr[j] = arr[i]);
			
		}
		String str=Arrays.toString(arr);
	
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(str);
		

	}

}
