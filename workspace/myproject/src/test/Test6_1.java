package test;

public class Test6_1 {

	public static void main(String[] args) {
		// 6.1��1~1000���������б�,PS��������ֻ�ܱ�1����������������
		boolean flag = true;
		int index=0;
		int a=0;
		for (int i = 1; i <= 1000; i++) {
			for (int j = 2; j <= (i+1 )/ 2; j++) {

				if (i % j == 0) {
					flag = false;
					break;
				}
				else
					flag=true;
			}
			if (flag&&i>1)
			{index++;
			a++;
			//一位数
			if(i/10==0)
				System.out.print("\0\0" + i + "\0");
			//两位数
			else if(i/100==0)
				System.out.print("\0" + i + "\0");
			//三位数
			else
				System.out.print("" + i + "\0");
				if(index==10)
				{
					System.out.println();
					index=0;
				}
			}
		}
		System.out.println(a);
	}
}
