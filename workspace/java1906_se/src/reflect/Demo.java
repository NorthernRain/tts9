package reflect;

/**
 * jdk5之后推出了新特性：变长参数
 *
 * @author LeafDust
 * @create 2019-08-20 14:26
 */
public class Demo {
    public static void main(String[] args) {

        test(2, 3, "a");
        test(2, 3, "a", "b");
        test(2, 3, "a", "b", "c");
        test(2, 3, "a", "b", "c", "d");
    }

    //变长参数只能够在最后一个，且只能用一次,实际类型为数组
    public static void test(int a, int b, String... strings) {
        System.out.println(strings.length);
    }
}
