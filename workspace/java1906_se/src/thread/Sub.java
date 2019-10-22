package thread;

/**
 * @author LeafDust
 * @create 2019-08-20 18:54
 */


public class Sub extends Super {
    public static void main(String[] args) {
        Super sooper = new Super();
        Super sub = new Sub();
        //Super sub1 = (Sub)sooper;
        Super sooper1 = new Sub();
        ((Sub) sooper).getLength1();
        System.out.println(sooper.getLength() + "," + sub.getLength()+",");
        String s = new String("hello");
        String t = new String("hello");
        char c [ ] = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(t.equals(String.valueOf(c)));

    }
    public int getLength1() {
        return 5;
    }
    public int getLength() {
        return 5;
    }
}

class Super {
    public int getLength() {
        return 4;
    }
}



