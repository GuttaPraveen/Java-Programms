package constructor;

import java.util.Scanner;

public class Shape
{
	//int side;
	static String color;
	Shape(int side,String color)
	{
		System.out.println("The side of Square is:"+(side*side));
	}
	Shape()
	{
		System.out.println("The color of Circlr is:" +color);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter side and color:");
		Scanner sc=new Scanner(System.in);
		int side=sc.nextInt();
		color=sc.next();
		Shape Square=new Shape(side,color);//P
		Shape circle =new Shape();//D

	}

}

