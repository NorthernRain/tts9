package weektest1;

import java.util.Arrays;

/**
 * 判断11-200之间有多少个素数，并输出所有素数。
 程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除，则表明此数不是素数，反之是素数。

 * @author LeafDust
 * @create 2019-08-08
 */
public class Test7 {
    public static void main(String[] args) {
        boolean flag=false;
        int[] arr={};
        int index=0;
        for (int i=2;i<=1000;i++){
            for (int j=2;j<=(i+1)/2;j++){
                if (i%j==0){
                    flag=true;
                    break;
                }
                else flag=false;

            }
            if (!flag){
                arr= Arrays.copyOf(arr,arr.length+1);
                arr[index++]=i;
            }
        }
        System.out.println(index);
        System.out.println("个数"+arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
