package inheritance;

import java.util.Scanner;

public class HierarchicalInheritance
{

	public static void main(String[] args)
	{
		
		C1 c1=new C1();
		C2 c2=new C2();
		C3 c3=new C3();
		System.out.println("Parent Variable + Child Variable of child 1 = "+(c1.parentVariable+c1.childVariable));
		System.out.println("Parent Variable + Child Variable of child 2 = "+(c2.parentVariable+c2.childVariable));
		System.out.println("Parent Variable + Child Variable of child 3 = "+(c3.parentVariable+c3.childVariable));
		
		

	}

}
class P
{
	int parentVariable = 5;
	
	
}

class C1 extends P
{
	int childVariable=1;
}
class C2 extends P
{
	int childVariable=2;
}
class C3 extends P
{
	int childVariable=3;
}
