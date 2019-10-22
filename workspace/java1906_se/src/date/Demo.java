package date;

import java.util.Date;

/**
 * Date的每一个实例用于表示一个确切的时间(精度为毫秒)
 * 内部维护一个long值，该值表示的自1970年1月1日00：00到
 * 当前的时间的ms数。
 * date存在时区等设计缺陷，因此大部分方法被声明为过时的在
 * 以后的开发中不应当再使用。
 *
 * @author LeafDust
 * @create 2019-08-21 9:47
 */
public class Demo {
    public static void main(String[] args) {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);

        //获取格林威治时间
        date.setTime(0);
        System.out.println(date);

    }
}
