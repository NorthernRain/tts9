package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author LeafDust
 * @create 2019-08-21 10:52
 */
public class SimpleDateFormatDemo1 {
    public static void main(String[] args) {
        String string="2008-08-08 20:08:08";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date=sdf.parse(string);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
