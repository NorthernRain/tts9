package collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Map地图，映射，对应
 * java集合API中的Map是映射的意思，不建议翻译！直接使用Map
 * Map是一个接口，其目的是为了解决高性能的查找问题。
 * 实现Map接口的类都封装了高性能查找的算法，利用Map接口的实现类
 * 就可以提高软件的查找性能，提供优秀的用户体验。
 * <p>
 * Map的实现类HashMap 是最快的查找算法，没有之一！！！！最常用。
 * <p>
 * Map的实现类TreeMap是比较快的查找算法。
 *
 * Map的使用：
 * 1.创建Map对象；
 * 2.需要将查询的数据，按照key-value成对存储到map对象
 * 3.查询使用的时候，根据key查询对应的value
 * @author LeafDust
 * @create 2019-08-08
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        //put方法，将被查询的数据成对添加到Map中，其中key是被检索的关键字，value是检索到的结果
        map.put("莫言","檀香刑");
        map.put("三十","和空姐同居的日子");
        map.put("冯唐","18岁给我一个姑娘");
        map.put("土家野夫","乡关何处");
        /*
        查询一个结果出来 get方法
         */
        String value=map.get("冯唐");
        System.out.println(value);

    }
}
