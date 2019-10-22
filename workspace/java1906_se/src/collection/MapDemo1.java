package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author LeafDust
 * @create 2019-08-08
 */
public class MapDemo1 {
    public static void main(String[] args) {
        /*
        HashMap 查询性能
        对比顺序查询

        在List中储存n1 n2 n3....n1000000个字符串
        用for循环找到n999700 的位置
         */

        List<String> list=new ArrayList<>();
        Map<String,String> map=new HashMap<>();
        for (int i=1;i<=1000000;i++){
            list.add("n"+i);
        }
        long start=System.nanoTime();
        int i=0;
        for (String s:list){
         if ("n999700".equals(s)){
             System.out.println(i);
             break;
         }
            i++;
        }
        System.out.println( System.nanoTime()-start);
        start=System.nanoTime();
        map.get("n999700");
        System.out.println( System.nanoTime()-start);

    }
}
