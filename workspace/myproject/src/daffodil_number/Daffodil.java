package daffodil_number;

public class Daffodil {

	public static void main(String[] args) {
	for (int i = 100; i <= 999; i++) {
		if((i/100%10)*(i/100%100)*(i/100%10)+(i/10%10)*(i/10%10)*(i/10%10)+(i%10)*(i%10)*(i%10)==i)
			System.out.println(i);
	}

	}

}
