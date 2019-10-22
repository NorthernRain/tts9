package collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LeafDust
 * @create 2019-08-08
 */
public class MapDemo2 {
    public static void main(String[] args) {
        /*
        Map提供的API
        1.put(key,key) 将key-value成对的添加到Map中，如果Map中已经有key了，则替换原有的value；
        然后返回被替换的value。如果没有替换，返回null。

         */

        Map<String, String> map = new HashMap<>();
        String value = map.put("莫言", "檀香刑");
        System.out.println(value);
        value = map.put("莫言", "檀香刑,生死疲劳");
        System.out.println(value);
        System.out.println("----------------");
        map.put("三十", "和空姐同居的日子");
        map.put("冯唐", "18岁给我一个姑娘");
        map.put("土家野夫", "乡关何处");
        map.put("范传奇", null);

        /*
        2.get(key) 方法用于在map中根据key检索value。返回值是检索到的value，如果没有检索到，返回null；
        由于map中允许value是null，所以检索到value是空的时候，也返回null；
        */
        value = map.get("范传奇");
        System.out.println(value);
        /*
        3.containsKey(key)  检查map中是否包含指定的key，
        如果包含返回true，不包含返回false；
         */
        System.out.println("----------------");
        boolean b = map.containsKey("张皓岚");
        System.out.println(b);
/*
4.size() 返回key-value对的数量
 */
        System.out.println("----------------");
        int n = map.size();
        System.out.println(n);
        System.out.println("----------------");
    /*
    boolean isEmpty() 检查集合是否为空
     */
        b = map.isEmpty();
        System.out.println(b);
        System.out.println("----------------");
        /*
        value remove(key)
        从map中删除key对应的value，返回删除的value
        如果key不存在不会产生任何结果
         */
        value = map.remove("冯唐");
        System.out.println(value);
        System.out.println(map.size());
        System.out.println("----------------");

        /*
        map.clear();清空map
         */
        map.clear();
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println("----------------");
    }

}
