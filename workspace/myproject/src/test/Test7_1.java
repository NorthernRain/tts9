package test;

public class Test7_1 {

	public static void main(String[] args) {
		/*//7.1����һ������int[] nums={8,7,3,9,5,4,1}
		��������е����ֵ�����ֵ���ڵ��±�*/
		int temp=0;
		int index=0;
		int[] nums={8,7,3,9,5,4,1};
		for(int i=0;i<nums.length;i++){
			System.out.print(nums[i]+"\0");
			if(temp<nums[i])
			{
				temp=nums[i];
				index=i;
				
			}
		}
		
		System.out.println();
		System.out.println("���ֵ�ǣ�"+temp);
		System.out.println("���ֵ�����±꣺"+index);
		
	}

}
