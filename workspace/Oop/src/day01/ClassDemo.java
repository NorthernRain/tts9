package day01;

public class ClassDemo {

	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.name="Mix";
		d1.age=5;
		d1.weight=20;
		d1.strain="¹þÊ¿Ææ";
		d1.showDog();
		Dog d2=new Dog();	
		d2.showDog();
	}

}

class Dog {
	String name;
	int age;
	double weight;
	String strain;

	public void showDog() {
		System.out.println("name:" + name + "," + "age:" + age + "," + "weight:" + weight + "," + "strain:" + strain);
	}
}