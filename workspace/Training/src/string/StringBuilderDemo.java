package string;

public class StringBuilderDemo{

	public static void main(String[] args) {
		String str="i love ";
		StringBuilder builder=new StringBuilder(str);
		str=builder.append(" java").toString();
		
		System.out.println(str);
		
		//增删改查 delete replace insert
	}
	
}
