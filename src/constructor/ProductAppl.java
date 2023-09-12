package constructor;

import java.util.Scanner;

public class ProductAppl
{
	int pid;
	String pname;
	ProductAppl()
	{
		pid=1240;
		pname="Hp";
	}
	ProductAppl(int pid,String pname)
	{
		this.pid=pid;
		this.pname=pname;
	}
	void display()
	{
		System.out.println(pid+" "+pname);
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Enter pid and pname");
		Scanner sc=new Scanner(System.in);
		int pid=sc.nextInt();
		String pname=sc.next();
		ProductAppl p1=new ProductAppl();
		ProductAppl p2=new ProductAppl(pid,pname);
		p1.display();
		p2.display();
		

	}

}
