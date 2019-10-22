package weektest1;

/**
 * 猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不过瘾，
 * 又多吃了一个     第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
 * 以后每天早上都吃了前一天剩下     的一半零一个。
 * 到第1天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。
 *
 * @author LeafDust
 * @create 2019-08-08
 */
public class Test2 {
    public static void main(String[] args) {
        int peach = 1;
        for (int i = 1; i < 10; i++) {
            peach = 2 * (peach + 1);
        }
        System.out.println(peach);
        //第二种
        System.out.println(peach(10));
    }
    public static int peach(int day){
        if (day==1)
            return 1;
        else
            return 2*(peach(day-1)+1);
    }
}
