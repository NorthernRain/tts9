package day_of_ayear;

public class EvenNumberSum {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i+=2) {
			sum += i;
		}
		System.out.println(sum);
	}

}
