package binary;

public class Demo01 {

	public static void main(String[] args) {
		/**
		 * ��ʶ2����
		 */
		int n =0xffffffff; //八进制
		System.out.println(n); //"50"
		int max1=10;
		int max2=~max1+1;
		
		System.out.println(max2);
		//��������е�2����ֱ����ʾ������
		System.out.println(Integer.toBinaryString(max1)); 
		//���0~49��ʵ��2��������
		int i=0;
		while(i<50) {
			System.out.println(
				Integer.toBinaryString(i++));
		
		} 
	}

}



