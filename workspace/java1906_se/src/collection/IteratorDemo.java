package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 遍历集合
 * 集合提供了统一的便利操作，无论那种数据结构实现的集合都提供了该遍历方式：迭代器模式
 * <p>
 * Iterator iterator();
 * Collection提供的iterator方法可以获取一个用于遍历当前集合的迭代器
 * <p>
 * java.util.Iterator接口
 * 该接口是迭代器接口，规定了遍历集合的相关操作所有集合都有一个用于遍历自身的迭代器实现类，
 * 我们无需关注们的类名，以多态的角度用该接口看待并调用相关遍历方法即可。
 * <p>
 * 使用迭代器遍历集合的同一方式遵循为：
 * 问->取->删
 * 其中删除元素不是必须操作
 *
 * @author LeafDust
 * @create 2019-08-07
 */
public class IteratorDemo {

    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("one");
        collection.add("#");
        collection.add("two");
        collection.add("#");
        collection.add("three");
        collection.add("#");
        collection.add("four");
        collection.add("#");
        collection.add("five");
        /*Collection collection1 = new ArrayList();
        collection1.add("#");
        collection1.add("#");
        collection1.add("#");
        collection1.add("#");
        collection.removeAll(collection1);*/
        System.out.println(collection);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            /*
            取E next()
            通过迭代器遍历下一个元素
            迭代器有一个要求，就是在遍历的过程中不能通过集合的
            方法增删元素。否则会抛出遍历异常。
            迭代器本身有一个remove方法
            该方法不需要传入参数，删除的就是本次遍历通过next获取的元素
            但是不能够添加元素
             */
            String str = (String) it.next();
            System.out.println(str);
            if ("#".equals(str)) {
                it.remove();
            }
        }
        System.out.println(collection);


        /*
        使用新循环遍历集合会被编译器编译时改为使用迭代器遍历，
        因此遵循迭代器使用规范，遍历过程中不能通过集合的方法增删元素
         */
        for (Object o : collection) {
            System.out.println(o.toString());
        }
    }
}
