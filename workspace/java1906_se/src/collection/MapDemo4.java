package collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LeafDust
 * @create 2019-08-08
 */
public class MapDemo4 {
    public static void main(String[] args) {
        /*HashMap==散列表==哈希表
        Map中的key类型，value类型
        1.value可以是任何引用类型
        Integer、String、List、int[].....；
        2.key的类型，引用类型，要求必须很好的成对重写hashCode和equals；
        Java API一般都很好的重写了hashCode和equals这两个方法，如String，Integer等；
        3.如果不很好的成对重写key的hashCode和equals方法会造成散列表工作异常！
        4.如果使用String作为key，是没有任何问题的；
        5.开发工具提供了自动成对重写hashCode和equals方法的功能。
         */

        /*
        使用整数作为key，使用Double作为value
         */
        Map<Integer,Double> map=new HashMap<>();
        map.put(1,3.141592653589793);
        map.put(3,3*3.141592653589793);
        map.put(8,8*3.141592653589793);
        map.put(10,10*3.141592653589793);
        System.out.println(map);
        System.out.println(map.get(8));
        System.out.println("-------------------");
        /*
        使用Location 作为key
         */
        Map<Location,String> map1=new HashMap<>();
        map1.put(new Location("东"),"范传奇");
        map1.put(new Location("西"),"刘苍松");
        map1.put(new Location("南"),"张皓岚");
        map1.put(new Location("北"),"王克晶");
        map1.put(new Location("东"),"程祖红");
        /*
        如果重写的时候不成对重写hashCode和equals方法，则不会完成替换，而是直接添加上去
         */
        System.out.println(map1);

    }
}

class Location{
    String name;

    public Location(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Location location = (Location) o;

        return name.equals(location.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                '}';
    }
}