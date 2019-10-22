package classdemo;

public class ClassDemo {

	public static void main(String[] args) {
		Student s=new Student(2);
		s.age=20;
		s.job="学习";
		s.score=90;
		s.getScore();

		int a=2,b=5,c=6;
		a=b*(c=a);
		
		System.err.println(a);
		System.err.println(b);
		System.err.println(c);
	}


}
class Student{
	int age;
	String job;
	int score;
	public void getScore(){
		System.out.println("分数："+score);
	}
	public Student(int a){
		System.out.println("这是Student的构造");
	}
	
}