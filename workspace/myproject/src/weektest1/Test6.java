package weektest1;

import java.util.Scanner;

/**
 * 将一个正整数分解质因数。例如：输入9，打印出9=2*3*3*5。
 * 程序分析：对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成：
 * (1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。
 * (2)如果n <> k，但n能被k整除，则应打印出k的值，并用n除以k的商，作为新的正整数你n，重复执行第一步。
 * (3)如果n不能被k整除，则用k+1作为k的值，重复执行第一步。
 *
 * @author LeafDust
 * @create 2019-08-08
 */
public class Test6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个数字");
        int num = scanner.nextInt();
        int num1 = num;
        int i = 1;
        System.out.print(num + "=");
        while (true) {
            i++;
            if (i == num1 / 2 + 1) {
                System.out.println("1*" + num);
                break;
            }
            if (num % i == 0) {
                if (num / i == 1) {
                    System.out.print(i);
                    break;
                }
                System.out.print(i+"*");
                num /= i;
                //System.out.print("*");
                i = 1;
            }
        }
    }
}