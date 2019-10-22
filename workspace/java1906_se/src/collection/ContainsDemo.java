package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * boolean contains(Object o)
 * 判断集合是否包含给定元素
 * @author LeafDust
 * @create 2019-08-06
 */
public class ContainsDemo {
    public static void main(String[] args) {
        Collection collection=new ArrayList();
        collection.add(new Point(1,2));
        collection.add(new Point(2,3));
        collection.add(new Point(3,4));
        collection.add(new Point(4,5));
        collection.add(new Point(5,6));
        System.out.println(collection);
        Point point = new Point(1,2);
        /**
         * contains方法的判断依据是用给定的元素与集合中的元素中的每一个元素
         * 进行equals比较，只要有为true的，就认为包含。
         * 因此元素的equals方法直接影响contains的判断结果。
         */
        boolean falg=collection.contains(point);
        System.out.println(falg);

    }


}
