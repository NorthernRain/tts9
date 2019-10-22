package arraydemo;

public class StringDemo {

	public static void main(String[] args) {
	String str1="你好";
	String str2="你好";
	
	String str3="你好你好";
	
	String str4=str1+str2;
	String str5="你好"+"你好";
	
	System.out.println(str4);
	System.out.println(str3==str4);
	System.out.println(str5==str4);
	System.out.println(str5==str3);
	str5="你好"+str1;
	System.out.println(str5==str3);
	}

}
