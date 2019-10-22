package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * List提供了一对重载的add，remove方法
 *
 * @author LeafDust
 * @create 2019-08-07
 */
public class ListDemo1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        System.out.println(list);
        System.out.println("-------------");
        /*
        void add(int index,E e)
        将给定元素插入到指定位置
         */
        list.add(2, "s");
        System.out.println(list);
        System.out.println("-------------");
        /*
        E remove(int index)
        删除给定位置上的元素，并返回这个元素
        */
        list.remove(2);
        System.out.println(list);
        System.out.println("-------------");


    }


}
