package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author LeafDust
 * java.util.Collection接口
 * 集合框架
 * 集合是用来保存一组元素的，不同的实现类实现了不同数据结构。
 * Collection是所有集合的顶级接口，规定了所有的结合都必须具备的功能。
 * <p>
 * 集合与数组一样，保存了一组元素，但是操作元素的方法集合已经提供了。
 * Collection下面有两个常见的子接口(分类)
 * java.util.List:线性表,特点是可以存放重复元素,并且有序.
 * java.util.Set:不可重复的集合,大部分实现类是无需的.
 * <p>
 * 是否为重复元素是根据元素自身的equals比较的结果判定的.
 */
public class CollectionDemo {

    public static void main(String[] args) {
        Collection collection = new ArrayList();
        /*
        boolean add(E e)
        向集合中添加元素，添加成功则返回true。
         */
        collection.add("one");
        collection.add("two");
        collection.add("three");
        collection.add("four");
        collection.add("five");
        System.out.println(collection);
        System.out.println(collection.add(collection));
        System.out.println(collection.size());

        /*
        boolean isEmpty():判断当前集合是否为空集
         */
        System.out.println(collection.isEmpty());

        collection.clear();
        System.out.println(collection.isEmpty());

    }

}
