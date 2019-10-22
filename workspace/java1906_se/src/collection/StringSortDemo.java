package collection;

/**
 * @author LeafDust
 * @create 2019-08-08
 */
public class StringSortDemo {
    public static void main(String[] args) {
        int cod1='一';
        int cod2='二';
        int cod3='三';
        int cod4='四';
        int cod5='五';
        System.out.println(cod1);
        System.out.println(cod2);
        System.out.println(cod3);
        System.out.println(cod4);
        System.out.println(cod5);
        String s1="熊大";
        String s2="光头强";
        //字符串提供了比较大小的方法，比较两个字符串的时候，返回0表示相等etc...
        int n=s1.compareTo(s2);
        System.out.println(n);

    }
}
