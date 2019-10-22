package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 泛型是JDK5之后推出的一个特性，又称为参数化类型，
 * 允许我们在使用一个类时指定它的属性，
 * 方法的参数和返回值的类型，使得我们使用起来更加灵活
 * 泛型的原型是Object，不指定就是Object
 * 泛型在集合中广泛使用，用于规定集合中的元素类型。
 *
 * @author LeafDust
 * @create 2019-08-07
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<String>();
       /* collection.add("1");
//collection.add(1);
        collection.add("2");
        collection.add("3");
        System.out.println(collection);

        for (String s:collection){
            System.out.println(s);
        }*/

    }
}
