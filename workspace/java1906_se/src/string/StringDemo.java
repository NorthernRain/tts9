package string;

/**
 * String是不变对象，即： 字符串对象创建后，表示的字符内容不可变， 若要改变，改变的时候必定创建新对象 java对字符串有个优化，即：
 * 字符串常量池，这是在堆中开辟的一块空间， 用于保存所有使用字面量创建的字符串对象。 当再次使用该字面量创建新的字符串对象时会直接使用而不在创建新的字符串，
 * 以此来节省内存开销
 * 
 * @author LeafDust
 * 
 * 
 * 
 * 
 * 
 *
 */
public class StringDemo {
	public static void main(String[] args) {
		String string = "Hello World";
		char c = 'a';
		int a = 1;
		// 刚开始没有hello这个字符串的时候，会在堆里面创建一个hello字符串对象
		String s1 = "hello";
		// 由于常量池里面有hello这个字符串，因此不会新创建字符串，会直接使用s1
		String s2 = "hello";
		String s3 = "he";
		String s4 = "llo";
		// 使用字面量拼接的字符串，虽然是采用了+号，但是一样会在常量池寻找是否已经有这个字符串，没有才会new
		/**
		 * 这里用到了编译器的一个特性：
		 * 编译器在编译源代码时当遇到一个计算表达式可以在编译期间确定结果时就会直接计算，并将结果编译到class文件中，
		 * 这样jvm每次运行程序时就无需再次计算，比如 int a=1+1 编译器编译后class改为int a=2；
		 * 下面的字符串也是如此，会被改为s5=hello
		 * 
		 *  
		 * 
		 */
		String s5 = "he" + "llo";
		// 使用非字符串变量创建的时候，会直接new一个字符串。
		String s6 = s3 + s4;

		System.out.println(s1 == s2);
		System.out.println(s1 == s6);
		System.out.println(s1 == s5);

	}

}
