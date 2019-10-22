package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Collection 中定义了一个方法toArray
 * 可以将当前集合转换为数组
 *
 * @author LeafDust
 * @create 2019-08-07
 */
public class CollectionArrayConvertDemo {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.add("4");
        collection.add("5");
        System.out.println(collection);
        System.out.println("-------------");
        /*
        JDK5之前只能用这种方式，只能以object类型的数组接收
        //Object[] arr=collection.toArray();
        */

        /*
        下面这种方式是利用java的泛型，但是此方法的数组长度会根据集合的长度做改变
        如果自己给的长度小于集合的长度，他会自己创建一个新的数组，长度是当前集合的size
        如果大于当前集合的size则会超出部分为null
         */
        String[] array1 = collection.toArray(new String[1]);
        System.out.println(Arrays.toString(array1));
        System.out.println("-------------");
        String[] array = collection.toArray(new String[collection.size()]);
        System.out.println(Arrays.toString(array));
        System.out.println("-------------");

        /**
         * 数组转化为集合
         *
         * 数组的工具类Arrays提供了一个静态方法asList可以将给定的数组转换为一个List集合
         *
         */
        String[] array2 = {"a", "b", "c", "d", "e"};
        List<String> list=Arrays.asList(array2);
        System.out.println("list:"+list);
        System.out.println("-------------");
        /*
         *对数组转换而来的集合进行操作就是对原数组进行操作。
         */
        list.set(2,"s");
        System.out.println("list:"+list);
        System.out.println("array2:"+Arrays.toString(array2));
        System.out.println("-------------");
        /*
        若想对集合元素进行增删操作，可以另外新建一个集合
        所有的集合都支持一个参数为Collection类型的构造方法，
        作用是创建集合的同时，包含给定集合的所有元素
         */
        List<String> list1=new ArrayList<>(list);
        System.out.println(list1);
        System.out.println("-------------");
        List<String> list2=new ArrayList<>();
        list2.addAll(list);
        System.out.println(list2);


    }

}
