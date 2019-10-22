package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author LeafDust
 * @create 2019-08-08
 */
public class SortListDemo1 {
    public static void main(String[] args) {
/*
对一组人进行自定义排序
 */
        List<Person> list = new ArrayList<>();
        list.add(new Person("三玖", 16, 45.0));
        list.add(new Person("二乃", 17, 46.0));
        list.add(new Person("一花", 18, 47.0));
        list.add(new Person("四叶", 15, 48.0));
        list.add(new Person("五月", 14, 49.0));
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        });
        System.out.println(list);
        System.out.println("-----------------------");
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return  (int)Math.signum(o1.weight-o2.weight);
            }
        });
        System.out.println(list);
        System.out.println("-----------------------");
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println(list);
    }
}

/**
 * 实现按照年龄进行大小比较的比较器
 */

/*class ByAge implements Comparator<Person> {

    public int compare(Person o1, Person o2) {
        return o1.age - o2.age;
    }
}


class ByWeight implements Comparator<Person> {

    public int compare(Person o1, Person o2) {
        return  (int)Math.signum(o1.weight-o2.weight);
    }
}*/

class Person {
    String name;
    int age;
    double weight;

    public Person(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
