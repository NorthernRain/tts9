package sort;

import java.util.Scanner;

public class InsertSort {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入你要排序的5个数（用空格隔开）：");
		int[] arr=new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scanner.nextInt();
		}
		
		int time=0;
		for (int i = 1; i < arr.length; i++) {
			for (int j = i-1; j >=0; j--) {
				time++;
				if(arr[j]>arr[j+1]){
					arr[j]=arr[j+1]+0*(arr[j+1]=arr[j]);
				}
				else 
					break;
			}
			
		}
		System.out.println(time);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		
		
	}
}
