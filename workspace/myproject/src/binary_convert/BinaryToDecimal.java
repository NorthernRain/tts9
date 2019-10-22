package binary_convert;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// 二进制转10进制
		Scanner scan = new Scanner(System.in);
		//一个布尔门开关，控制后面判断是不是二进制数会用到
		boolean flag=true;
		int bin=0;
		while(flag){
		System.out.println("请输入一个二进制数：");
		bin=scan.nextInt();
		int bin1=bin;
		//判断是不是为二进制数
		while(bin1!=0){
			//如果有位数大于1就表示他不是二进制数，退出当前循环。进入上层循环
			if(bin1%10>1){
				flag=true;
				System.out.println("你输入的不是二进制数，请重新输入！");
				break;}
			else
				flag=false;
			bin1=bin1/10;
		}
		
		}
		System.out.println(bin);
		int dec=0;
		int i=0;
		while(bin!=0){
		
			dec+=bin%10*Math.pow(2, i);
			bin=bin/10;
			i++;
		}
		
		System.out.println(dec);
		System.out.println(getType(dec));
	}

	
	public static String getType(Object o){
		return o.getClass().toString();
		
		
	}
}
