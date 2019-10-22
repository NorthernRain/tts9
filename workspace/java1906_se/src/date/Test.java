package date;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * 程序启动后，要求用户输入自己的生日
 * 格式：yyyy-MM-dd
 * 然后经过计算，输出到今天为止一共活了多少天。
 * 然后再输出其出生10000天的纪念日哪天
 * 输出的格式同上。
 *
 * @author LeafDust
 * @create 2019-08-21 10:59
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("傻逼！请输入你的生日：");
        String birth = scanner.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = sdf.parse(birth);
            //获取从1970.1.1 00：00到当前指定时间的ms数
            long time1 = date.getTime();
            //当前系统时间到1970.1.1 00：00的ms数
            long time2 = System.currentTimeMillis();
            System.out.println((time2 - time1) / 1000 / 3600 / 24);
            //10000天：10000L*24*3600*1000ms
            Date dayOfTenThousand = new Date(time1 + 10000L * 24 * 3600 * 1000);
            /*date.setTime(time1 + 10000L * 24 * 3600 * 1000);
            System.out.println(date);*/
            System.out.println(sdf.format(dayOfTenThousand));

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
