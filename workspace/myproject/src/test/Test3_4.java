package test;
import java.util.Scanner;
public class Test3_4 {

	public static void main(String[] args) {
		/*3.4������ݺ��·ݣ���������Ӧ���ж����죨ʹ��switch�ṹ��*/
	Scanner scan=new Scanner(System.in);
	System.out.println("���������");
	int year=scan.nextInt();
	System.out.println("�������·�");
	int mon=scan.nextInt();
	if (year%4==0&&year/100!=0||year%400==0){
		switch(mon){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:System.out.println(year+"��"+mon+"����31�졣");break;
		case 4:
		case 6:
		case 9:
		case 11:System.out.println(year+"��"+mon+"����30�졣");break;
		case 2:System.out.println(year+"��"+mon+"����29�졣");break;

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
		case 12:System.out.println(year+"��"+mon+"����31�졣");break;
		case 4:
		case 6:
		case 9:
		case 11:System.out.println(year+"��"+mon+"����30�졣");break;
		case 2:System.out.println(year+"��"+mon+"����28�졣");break;
	}
	
	}
	}

}
