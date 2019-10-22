package test;

public class Test7_1 {

	public static void main(String[] args) {
		/*//7.1定义一个数组int[] nums={8,7,3,9,5,4,1}
		输出数组中的最大值和最大值所在的下标*/
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
		System.out.println("最大值是："+temp);
		System.out.println("最大值所在下标："+index);
		
	}

}
