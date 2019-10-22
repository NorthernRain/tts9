package collection;

import java.util.Scanner;

/**
 * @author LeafDust
 * @create 2019-08-08
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("输入一个数字");
            int num = scanner.nextInt();
            int num1 = num;
            int i = 1;
            System.out.print(num + "=");
            while (true) {
                i++;
                if (num % i == 0) {
                    if (i==num1) {
                        System.out.println("1*" + num);
                        break;
                    }

                    if (num / i == 1 ) {
                        System.out.print(i);
                        break;
                    }
                    System.out.print(i);
                    num /= i;
                    System.out.print("*");
                    i = 1;
                }


        }
    }

}
