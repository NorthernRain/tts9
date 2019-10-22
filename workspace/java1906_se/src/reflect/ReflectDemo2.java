package reflect;

import java.lang.reflect.Method;

/**
 * 通过反射机制调用方法
 *
 * @author LeafDust
 * @create 2019-08-20 11:33
 */
public class ReflectDemo2 {
    public static void main(String[] args) {
        try {

            Class cls = Class.forName("reflect.Person");
            //必须当前类对象要有无参构造
            Object obj = cls.newInstance();
            Method method = cls.getMethod("sayHello", null);
            method.invoke(obj, null);
            //调用有参数的方法
            method=cls.getMethod("sayHello", int.class);
            method.invoke(obj,10);

            method=cls.getMethod("sayHi",String.class, int.class);
            method.invoke(obj,"daw",20);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
