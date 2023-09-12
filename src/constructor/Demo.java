package constructor;

public class Demo
{
	static int count=0;
	//instance Block
	{
		count++;
		System.out.println("Hello");
	}
	Demo()
	{
		System.out.println("World");
	}
	Demo(int i)
	{
		
	}

	public static void main(String[] args)
	{
		
		Demo o1=new Demo();
		Demo o2=new Demo(10);
		Demo o3=new Demo();
		System.out.println(count);
	}

}
/*
  				Constructor Vs instance block:
  				
  				
1. Both instance block and constructor will be executed automatically for every 
object creation but instance block 1st followed by constructor.
2. The main objective of constructor is to perform initialization of an object.
3. Other than initialization if we want to perform any activity for every object 
creation we have to define that activity inside instance block.
4. Both concepts having different purposes hence replacing one concept with 
another concept is not possible.
5. Constructor can take arguments but instance block can't take any arguments 
hence we can't replace constructor concept with instance block.
6. Similarly we can't replace instance block purpose with constructor.
*/
