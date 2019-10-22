package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * List subList(int start,int end)
 * 获取当前集合中指定范围的子集
 *
 * @author LeafDust
 * @create 2019-08-07
 */
public class ListDemo2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println("-------------");
        /*
        List subList(int start,int end)
        返回start和end之间的子集
         */
        List<Integer> subList = list.subList(3, 8);
        System.out.println(subList);
        System.out.println("-------------");
        /*
        将子集元素扩大十倍
         */
        for (int i = 0; i < subList.size(); i++) {
            subList.set(i, subList.get(i) * 10);
        }
        System.out.println(subList);
        /*
        修改子集元素就是修改原集合对应的元素
         */
        System.out.println(list);
        System.out.println("-------------");
        /*
        删除原集合中2-8的元素
         */
        list.removeAll(list.subList(2, 9));
        // list.subList(2,9).clear();
        System.out.println(list);
    }


}
