package weektest1;

import java.util.Scanner;

/**
 * 企业发放的奖金根据利润提成。利润(I)低于或等于1万元时，
 * 奖金可提1%；利润高于1万元，低于2万元时，低于1万元的部分按1%提成，
 * 高于1万元的部分，可可提成7.5%；2万到4万之间时，高于2万元的部分，可提成5%；
 * 4万到6万之间时高于4万元的部分，可提成3%；6万到1万之间时，高于6万元的部分，
 * 可提成1.5%，高于1万元时，超过1万元的部分按1%提成，从键盘输入当月利润，求应发放奖金总数？
 *
 * @author LeafDust
 * @create 2019-08-08
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入金额：");
        double num = scanner.nextDouble();
        double money = 0;
        switch ((int) (num / 10000)) {
            default: {
                money = money + (num - 100000) * 0.01;
                num = 100000;
            }
            case 9:
            case 8:
            case 7:
            case 6: {
                money = money + (num - 60000) * 0.015;
                num = 60000;
            }
            case 5:
            case 4: {
                money = money + (num - 40000) * 0.03;
                num = 40000;
            }
            case 3:
            case 2: {
                money = money + (num - 20000) * 0.05;
                num = 20000;
            }
            case 1: {
                money = money + (num - 10000) * 0.075;
                num = 10000;
            }
            case 0:
                money = money + num * 0.01;
                break;
        }
        System.out.println(money);
    }
}
