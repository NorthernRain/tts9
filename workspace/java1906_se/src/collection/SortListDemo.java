package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * List的排序
 * @author LeafDust
 * @create 2019-08-07
 */
public class SortListDemo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        for (int i=0;i<10;i++){
            list.add((int) (100*Math.random()));
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
