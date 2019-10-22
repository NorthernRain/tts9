package test;
import java.util.Scanner;
public class Test3_4 {

	public static void main(String[] args) {
		/*3.4输入年份和月份，输出这个月应该有多少天（使用switch结构）*/
	Scanner scan=new Scanner(System.in);
	System.out.println("请输入年份");
	int year=scan.nextInt();
	System.out.println("请输入月份");
	int mon=scan.nextInt();
	if (year%4==0&&year/100!=0||year%400==0){
		switch(mon){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:System.out.println(year+"年"+mon+"月有31天。");break;
		case 4:
		case 6:
		case 9:
		case 11:System.out.println(year+"年"+mon+"月有30天。");break;
		case 2:System.out.println(year+"年"+mon+"月有29天。");break;

		}
	}
	else{
		switch(mon){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:System.out.println(year+"年"+mon+"月有31天。");break;
		case 4:
		case 6:
		case 9:
		case 11:System.out.println(year+"年"+mon+"月有30天。");break;
		case 2:System.out.println(year+"年"+mon+"月有28天。");break;
	}
	
	}
	}

}
