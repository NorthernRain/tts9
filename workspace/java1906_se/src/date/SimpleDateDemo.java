package date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 该类可以将date和string之间按照格式进行转换
 * @author LeafDust
 * @create 2019-08-21 10:30
 */
public class SimpleDateDemo {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E a");
        String line=sdf.format(date);
        System.out.println(line);
    }
}
