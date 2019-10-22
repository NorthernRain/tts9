package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 方法含有参数时使用lambda
 *
 * @author LeafDust
 * @create 2019-08-21 17:15
 */
public class LambdaDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("刘苍松");
        list.add("传奇");
        list.add("范冰冰");
        System.out.println(list);
        /*
        如果方法最终使用return关键字进行返回，那么可以忽略“｛｝”时，
        return关键字也要一同忽略。
         Comparator<String> comparator = (o1, o2) ->o1.compareTo(o2);
        };
         */
        Comparator<String> comparator = (o1, o2) -> o1.compareTo(o2);

        Collections.sort(list, comparator);
        System.out.println(list);
    }
}
