package test;

public class Test5_1_format {
	public static void main(String[] args){
		
		/*5.1��һ����Ǯ���񾭲��������������Ǯ��
		��һ���1Ԫ,�Ժ�ÿ���ǰһ����50%��������м�������
		1)���浽�ڼ��죬������Ǯ�ᳬ��10Ԫ
		2)һ���£�30�죩�����ܹ����˶���Ǯ*/
		double money=1;
		int day=1;
		while(money<=10){
			money*=1.5;
			day++;
		}
		
		System.out.println(day+"��������10Ԫ��");
		money=1;
		double sum=0;
		for(int i=1;i<=30;i++){
			System.out.print(i+"\t");
			System.out.print(money+"\t");
			sum+=money;
			System.out.println(sum);
			money*=1.5;
			
		}

		System.out.println("30�����Ϊ"+String.format("%.2f", sum));
	}


}
