package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 集合操作
 *
 * @author LeafDust
 * @create 2019-08-07
 */
public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("java");
        collection.add("c");
        collection.add("cpp");

        Collection collection1 = new HashSet();
        collection1.add("php");
        collection1.add(".net");
        collection1.add("c");
        /*
         *boolean addALL(Colection e)
         * 将给定的集合的所有元素添加到当前集合
         * 当调用后当前集合元素发生改变则返回true
         */
        collection.addAll(collection1);
        System.out.println(collection);
        collection1.addAll(collection);
        System.out.println(collection1);

        Collection collection2 = new ArrayList();
        collection2.add("c++");
        collection2.add("php");
        /*
        判断当前集合是否包含给定集合中的所有元素。其实就是判断是不是子集
         */
        boolean flag = collection.containsAll(collection2);
        System.out.println(flag);
        System.out.println(collection);

        collection.removeAll(collection1);
        System.out.println(collection);

    }
}
