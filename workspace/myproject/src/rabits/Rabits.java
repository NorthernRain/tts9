package rabits;

public class Rabits {

	public static void main(String[] args) {
	
		System.out.println(sum(24));

	}

	public static int sum(int i){
		if(i==1)
			return 1;
		else if(i==2){
			return 1;
		}
		else {
			return sum(i-2)+sum(i-1);
		}
	}
}
