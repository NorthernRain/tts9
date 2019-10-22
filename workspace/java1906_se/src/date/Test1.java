package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 计算商品促销日期
 * 程序启动后，要求用户输入商品生产日期：yyyy-MM-dd
 * 再输入商品的保质天数，为一个整数。
 * 然后经过程序计算，输出该商品的促销日期，格式同上。
 * <p>
 * 规则：商品过期日前两周的周三为促销日期。
 *
 * @author LeafDust
 * @create 2019-08-21 16:01
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的生产日期：");
        String productDate = scanner.nextLine();
        System.out.println("请输入保质期(天数)：");
        int expirationDay=scanner.nextInt();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date=sdf.parse(productDate);
            Calendar calendar=Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(Calendar.DAY_OF_YEAR,expirationDay);
            calendar.add(Calendar.WEEK_OF_MONTH,-2);
            calendar.set(Calendar.DAY_OF_WEEK,4);
            System.out.println(sdf.format(calendar.getTime()));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
