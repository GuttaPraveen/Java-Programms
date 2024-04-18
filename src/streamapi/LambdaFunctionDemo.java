package streamapi;

public class LambdaFunctionDemo
{
	void display()
	{
		System.out.println("Welcome To Lambda Function");
//		Intf1 x=()->System.out.println("Welcome To Java 8 Features");
//		x.m1();
//		Intf1 y=(int m,int n)->System.out.println("Addition is: "+(m+n));
//		y.m2(20,30);
//		Intf1 z=(int num1,int num2)->
//				{
//					int a[]=new int[] {10,20,30,40,50};
//					if(num1>=a[2])
//					{
//						System.out.println("If block is executed");
//						return num1*2;
//					}
//					else
//					{
//						System.out.println("Else block is executed");
//						return num2*5;
//					}
//				};
//				int res=z.m3(30, 40);
//				System.out.println("The return values is:" +res);
		Intf1 l=num1 ->
		{
			if(num1%2==0)
			{
				return num1+" is an Even number";
			}
			else
			{
				return num1+" is a odd number";
			}
				
		};
		String ans=l.m4(28);
		System.out.println(ans);
//		Intf1 w=(int a,int b[])->
//		{
//			for(int k:b)
//				System.out.print(k+" ");
//		};
//		w.m5(10,new int[] {10,20,30});
//		
	}
	public static void main(String[] args)
	{
		new LambdaFunctionDemo().display();
		
	}
}
interface Intf1
{
	//void m1();
	//void m2(int m,int n);
	//int m3(int p,int q);
	String m4(int a);
	//void m5(int a,int b[]);
	
}


/*
 	Lambda Expression or Lambda function is a new feature added in java 8 version.
	Lambda function is a anonymous function which does not any name.

 
*/