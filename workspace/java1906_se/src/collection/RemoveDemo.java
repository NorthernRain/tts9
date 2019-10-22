package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 删除几何元素
 * @author LeafDust
 * @create 2019-08-06
 */
public class RemoveDemo {
    public static void main(String[] args) {
        Collection collection=new ArrayList();
        collection.add(new Point(1,2));
        collection.add(new Point(2,3));
        collection.add(new Point(3,4));
        collection.add(new Point(4,5));
        collection.add(new Point(5,6));
        System.out.println(collection);
        Point point = new Point(1,2);
        collection.remove(point);
        System.out.println(collection);
    }
}
