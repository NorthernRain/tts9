package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author LeafDust
 * @create 2019-08-20 14:47
 */
public class ReflectDemo3 {
    public static void main(String[] args) {
        try {
            Class cls = Class.forName("reflect.Person");
            Constructor constructor = cls.getConstructor(String.class, int.class);
            constructor.newInstance("asan", 27);
            Object object = cls.newInstance();
            Method method = cls.getDeclaredMethod("say");
            method.setAccessible(true);
            method.invoke(object);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
