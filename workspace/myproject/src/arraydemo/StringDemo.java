package arraydemo;

public class StringDemo {

	public static void main(String[] args) {
	String str1="���";
	String str2="���";
	
	String str3="������";
	
	String str4=str1+str2;
	String str5="���"+"���";
	
	System.out.println(str4);
	System.out.println(str3==str4);
	System.out.println(str5==str4);
	System.out.println(str5==str3);
	str5="���"+str1;
	System.out.println(str5==str3);
	}

}
