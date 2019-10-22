package weektest1;

import java.util.Scanner;

/**
 * .题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
 * @author LeafDust
 * @create 2019-08-08
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入字符串：");
        String string=scanner.nextLine();
        int ch=0,num=0,space=0,other=0;
        for (int i=0;i<string.length();i++){
            char c=string.charAt(i);
            if (c<='Z'&&c>='A'||(c>='a'&&c<='z'))
            {
                ch++;
            }
            else if (c>='0'&&c<='9'){
                num++;
            }
            else if (c==32){
                space++;
            }
            else {
                other++;
            }
        }
        System.out.println("字母："+ch+"个。");
        System.out.println("数字："+num+"个。");
        System.out.println("空格："+space+"个。");
        System.out.println("其他字符："+other+"个。");
    }
}
