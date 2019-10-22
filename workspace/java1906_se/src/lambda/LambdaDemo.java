package lambda;

/**
 * lambda表达式  jdk8之后推出的新特性
 * <p>
 * 可以用更简短的方式创建匿名内部类。该语法是的我们可以使用“函数式编程”
 * <p>
 * lambda表达式创建匿名内部类实现的接口必须只能有一个抽象方法，否则不能使用。
 * <p>
 * 语法（参数列表）->｛
 * 方法体｝
 *
 * @author LeafDust
 * @create 2019-08-21 16:59
 */
public class LambdaDemo {
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println("hello");
            System.out.println("Lambda");
        };
        Runnable r1 = () -> System.out.println("hello hello");
        r.run();
        r1.run();


    }
}
