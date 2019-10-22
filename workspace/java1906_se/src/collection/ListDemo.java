package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.List
 * 线性表
 * List集合是个可以重复的集合，并且有序，
 * 特点是提供了一组通过下标操作元素的方法。
 * 常用实现类：
 * java.util.ArrayList
 * 内部使用数组实现，查询性更好，但是增删元素性能差
 * <p>
 * java.util.LinkedList
 * 内部使用链表实现，增删元素性能较好，尤其是首尾增删元素性能最佳，
 * 但是查询性能较差。
 * <p>
 * 如果对性能没有比较苛刻的要求的时候，通常使用ArrayList即可。
 *
 * @author LeafDust
 * @create 2019-08-07
 */
public class ListDemo {
    public static void main(String[] args) {
        /*
        JDk7之后，右侧的<>中的泛型部分可以不用写了，编译器会理解为和前面的一致。
         */
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        System.out.println(list);
        System.out.println("------------");
        /*
        E get(int index)
        获取给定下标处对应的元素
         */
        String str = list.get(1);
        System.out.println(str);
        System.out.println("------------");
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);

        }
        System.out.println("------------");
     /*
     E set(int index,E e)
     将给定的元素设置到指定的位置上，返回值为原来位置对应的元素。所以set是替换元素操作。
      */
        String s1 = list.set(3, "s");
        System.out.println(s1);
        System.out.println(list);
        System.out.println("------------");
         /*
    在不创建新集合的前提下，将集合元素颠倒位置。
     */
        for (int i = 0; i < list.size() / 2; i++) {
          list.set(i, list.set(list.size()-1 - i,list.get(i)));
        }
        System.out.println(list);
    }
}
