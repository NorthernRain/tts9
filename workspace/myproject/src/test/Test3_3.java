package test;

import java.util.Scanner;

public class Test3_3 {

	public static void main(String[] args) {

		/*
		 * 3.3选择一个形状（1长方形、2正方形、3三角形、4圆形） 根据不同的选择让用户输入不同的信息， 长方形有长和宽、 正方形有边长、
		 * 三角形有底和高、 圆形有半径， 计算输出指定形状的面积
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("请选择一种图形（长方形、正方形、三角形、圆形）");
		String shape=scan.next();
		if(shape.equals("长方形")){
			System.out.println("请输入长方形的长：");
			double length=scan.nextDouble();
			System.out.println("请输入长方形的宽：");
			double width=scan.nextDouble();
			System.out.println("此长方形的面积为"+length*width);
			
			
		}else if(shape.equals("正方形")){
			System.out.println("请输入正方形的边长：");
			double length=scan.nextDouble();
			System.out.println("此长方形的面积为"+length*length);
		}else if(shape.equals("三角形")){
			System.out.println("请输入三角形的底：");
			double length=scan.nextDouble();
			System.out.println("请输入三角形的高：");
			double width=scan.nextDouble();
			System.out.println("此长方形的面积为"+length*width/2);
		}else{
			System.out.println("请输入圆的半径：");
			double radius=scan.nextDouble();
			System.out.println("此长方形的面积为"+radius*radius*Math.PI);
		}

	}

}
