package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author LeafDust
 * @create 2019-08-08
 */
public class MapDemo3 {
    public static void main(String[] args) {
        /*
        Map集合的遍历迭代
         */
        Map<String, String> map = new HashMap<>();
        map.put("莫言", "檀香刑");
        map.put("三十", "和空姐同居的日子");
        map.put("冯唐", "18岁给我一个姑娘");
        map.put("土家野夫", "乡关何处");
     /*
     输出全部作者和书籍
     利用map.entrySet()方法将map转换为set集合，再对set进行遍历
      */
        System.out.println(map);
        System.out.println("-------------------");
        /*
        如何遍历一个map
        1.导入Entry类型
        2.利用entrySet()将map储存到一个set集合，其中set中每一个元素都是一个entry类型
        3.对set集合进行遍历处理，遍历时候set的元素是entry类型
        4.每个entry对象包含两个方法：
        getKey()
        getValue()
         */
        Set<Map.Entry<String, String>> set=map.entrySet();
        System.out.println(set);
        System.out.println("-------------------");
        for (Map.Entry<String, String> e : set) {
            String author=e.getKey();
            String books=e.getValue();
            System.out.print(author+":");
            System.out.println(books);

        }
        System.out.println("-------------------");
    }
}
