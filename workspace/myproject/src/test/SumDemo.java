package test;

public class SumDemo {
public static void main(String[] args) {
	System.out.println(sum(100));
}


public static int sum(int sum) {
	if(sum==1)
		return 1;
	
	return sum+sum(sum-1);
}
}
