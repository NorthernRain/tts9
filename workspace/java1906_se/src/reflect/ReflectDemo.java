package reflect;

import java.lang.reflect.Method;

/**
 * java反射机制：可以使用字符串来指挥程序的
 * 实例化操作，操作属性调用方法等。
 * <p>
 * 这使得代码提高了灵活性，但是带来更多的资源开销
 * 和较慢的运行效率
 * <p>
 * 所以我们不应当过分依赖反射，而是该适度调用
 *
 * @author LeafDust
 * @create 2019-08-20 9:43
 */
public class ReflectDemo {
    public static void main(String[] args) {
        /*
        Class
        Class类称为类对象，它的每一个实例表示jvm加载的一个类
        ，并且jvm内部每个被加载的类都有且只有一个Class实例与之对应

        通过类对象，我们可以得到其表示的类的一切信息，便于我们
        在程序的运行期间通过他操作其表示的类。

        获取一个类对象的3种方式：
        1：调用该类的静态属性class

        2.通过class的静态方法forName，该方法可以指定要获取的类的名字从而获取
        该类的类对象

        3：通过加载器ClassLoader获得
         */
        try {
            Class cls=Class.forName("reflect.Person");
            String name=cls.getName();
            System.out.println(name);

            Method[] methods=cls.getMethods();
            for (Method method : methods) {
                System.out.println(method.getName());
            }
            System.out.println("--------------------------------");
            Method[] methods1=cls.getDeclaredMethods();
            for (Method method : methods1) {
                System.out.println(method.getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
