package polymorphism;

public class Basic
{
	
	int a=10;
	int  b=20;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//System.out.println("How");
		Basic b1=new Basic();
		int a=100;
		System.out.println(a);

	} 
	{
		System.out.println(a+b);
	}
		
}
/*
 	Polymorphism :Polymorphism is the ability of an object to take on many forms. 
 				  The most common use of polymorphism in OOP occurs
 	 			  when a parent class reference is used to refer to a child class object.
 	 			  Parent class reference can be used to hold Child class object but by using that reference 
				  we can't call Child specific method.
				  Polymorphism can be achieved by method Overloading and Overriding.
		MethodOverloading : If a class has multiple methods having same name and different arguments or 
				  			arguments are different data typpes is called Method overloading. 
 	 	Methodoverriding :Whatever the Parent has by default available to the Child through inheritance,
 	 					  if Child is not satisfied with Parent class method implementation
 	 			   		  then Child is allow to redeine that Parent class method in 
 	 			          Child class in its own way this process is called overriding.
*/