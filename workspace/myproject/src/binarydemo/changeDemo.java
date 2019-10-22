package binarydemo;

public class changeDemo {
public static void main(String[] args) {
	int a=2,b=3;
	change(a, b);
	System.out.println("a:"+a+"b:"+b);
}

public static void change(int a,int b) {
 a=a^b;
 b=a^b;
 a=a^b;
	
}
}


