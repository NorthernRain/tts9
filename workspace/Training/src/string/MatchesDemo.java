package string;
/**
 * boolean matches(String regex)
 * @author tarena
 *
 */
public class MatchesDemo {
public static void main(String[] args) {
	String string="1218680620@qq.com";
	boolean flag=string.matches("[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+");
	System.out.println(flag);
}
}
