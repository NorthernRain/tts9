package collection;

/**
 * JDK5之后推出了一个新特性：增强型for循环也称为新循环，
 * 他不取代传统的for循环的工作，
 * 仅用来遍历集合或者数组使用
 *
 * 仅编译器认可，虚拟机内还是会认为是传统的for
 *
 * @author LeafDust
 * @create 2019-08-07
 */
public class NewForDemo {
    public static void main(String[] args) {
        String[] arr={"1","2","3","4"};
        for (String s : arr) {
            System.out.println(s);
        }    }
}
