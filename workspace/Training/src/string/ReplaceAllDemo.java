package string;

public class ReplaceAllDemo {
public static void main(String[] args) {
	String string="WCNMD SB!我骂死你!";
	String regex="[WCNMD|SB|CNM|NC|CAO]+";
	string=string.replaceAll(regex, "***");
	System.out.println(string);
}
}
