package constructor;

import java.util.Scanner;

public class ThisMethod
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter pname and plocation:");
		String pname=sc.nextLine();
		String plocation=sc.next();
		Park p=new Park(pname,plocation);
		System.out.println(p.display());
		

	}

}

class Park
{
	String pname;
	String plocation;
	Park()
	{
		System.out.println("Default Constructor");
	}
	Park(String pname,String plocation)
	{
		this();
		this.pname=pname;
		this.plocation=plocation;
		
	}
	String display()
	{
		return pname+" "+plocation;
	}
}