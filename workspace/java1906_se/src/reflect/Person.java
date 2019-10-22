package reflect;

/**
 * @author LeafDust
 * @create 2019-08-20 10:48
 */
public class Person {
    public Person() {
        System.out.println("无参构造！");
    }

    public Person(String name, int age) {
        System.out.println("有参构造！");
    }

    public void sayHello() {
        System.out.println("hello");
    }

    public void sayHi() {
        System.out.println("say");
    }

    public void sayHello(int age) {
        System.out.println("hello:" + age);
    }

    public void sayHi(String name, int age) {
        System.out.println("say:" + name + ":" + age);
    }

    private void say() {
        System.out.println("private");
    }
}
