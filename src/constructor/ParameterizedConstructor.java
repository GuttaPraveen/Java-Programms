package constructor;

public class ParameterizedConstructor
{
	static int sum;
	ParameterizedConstructor(){System.out.println("Hello");}
	ParameterizedConstructor(int a,int b)
	{
		sum=a+b;
		System.out.println(sum);
	}
	//instance Block
	{
		System.out.println("Paramerized Constructor");
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ParameterizedConstructor p3=new ParameterizedConstructor();
		ParameterizedConstructor p=new ParameterizedConstructor(10,20);
		ParameterizedConstructor p1=new ParameterizedConstructor(100,200);

	}

}
/*
 	Paramerized Constructor
	30
	Paramerized Constructor
	300
*/
