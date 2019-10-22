package reflect;

/**
 * 通过反射机制进行实例化对象。
 *
 * @author LeafDust
 * @create 2019-08-20 10:59
 */
public class ReflectDemo1 {
    public static void main(String[] args) {
    /*
    1：加载要实例化的类的类对象
    2：通过类对象的newInstance()方法实例化
     */

        try {
            Class cls=Class.forName("reflect.Person");
            Object obj=cls.newInstance();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
