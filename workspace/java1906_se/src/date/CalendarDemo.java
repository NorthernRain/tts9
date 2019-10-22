package date;

import java.util.Calendar;
import java.util.Date;

/**
 * Calendar类
 * 是一个抽象类，规定了日历类操作时间的一系列方法。
 * 可以使用其提供的静态方法getInstance来获取一个当前系统
 * 所在地区的适用实现类，大部分地区获取的是
 * GregorianCalendar，即：阳历实现类。
 *
 * @author LeafDust
 * @create 2019-08-21 14:08
 */
public class CalendarDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println(date);

        //int get(int field) 获取当前Calendar表示的
        //中指定的分量对应的值。
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);
        //获取指定时间分量所允许的最大值
        int d = calendar.getActualMaximum(Calendar.YEAR);
        System.out.println(d);

        calendar.set(Calendar.YEAR, 2008);
        //允许越界12 但是会变成下一年的一月份
        calendar.set(Calendar.MONTH, 13);
        System.out.println(calendar.getTime());

        //void add(int field,int amount)对指定的时间分量加上给定的值
        calendar.add(Calendar.YEAR,3);
        calendar.add(Calendar.MONTH,3);
        System.out.println(calendar.getTime());
    }
}
