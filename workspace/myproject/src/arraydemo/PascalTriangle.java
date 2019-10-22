package arraydemo;

import java.util.Arrays;
import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		//二维数组的声明和赋值：
		int[][] arr=new int[5][];
		int[][] arr1={
				{1,2,3},
				{2,3,4,5},
				{4,5,6,7},
				{1,3}		
		};
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j]+"\t");
			}
			System.out.println();
		}

		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入杨辉三角的行数：");
		int row = scan.nextInt();
		int[][] array = new int[row][];
		for (int i = 0; i < array.length; i++) {
			//i+1表示的是array.length
			array[i] = new int[i+1];
			for (int j = 0; j <array[i].length; j++) {
				if (j == 0 || i == j)
					array[i][j] = 1;

				else
					array[i][j] = array[i - 1][j] + array[i - 1][j - 1];
				if(j==0){
				for (int j2 = row - 1 - i; j2 >= 0; j2--) 
					System.out.print("\0");
				}
				System.out.print(array[i][j] + "\0");
				// System.out.print("\0");
			}
			System.out.println();
		}
	}

}
