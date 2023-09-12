package constructor;

import java.util.Scanner;

public class This1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int bid=sc.nextInt();
		String bname=sc.next();
		Book b1=new Book();
		Book b2=new Book(bid,bname);
		b1.display();
		b2.display();
		

	}

}
class Book
{
	int bid;
	String bname;
	Book()
	{
		System.out.println("Default Constructor");
	}
	Book(int bid,String bname)
	{
		this.bid=bid;
		this.bname=bname;
	}
	void display()
	{
		System.out.println(bid+" "+bname);
	}
}
/*
			Default Constructor
			0 null
			1240 Java
*/