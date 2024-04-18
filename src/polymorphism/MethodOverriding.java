package polymorphism;

public class MethodOverriding
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//Saisri s=new Saisri();
		Sahithi s=new Sahithi();//Upcasting
		
		
		s.marry();

	}

}
class Sahithi
{
	public  void marry()
	{
		System.out.println("Vijay");
	}
}
class Saisri extends Sahithi
{
	public  void marry()
	{
		System.out.println("Arjun");
	}
}
/*
 
		Methodoverriding : Whatever the Parent has by default available to the Child through inheritance,
 	 					   if Child is not satisfied with Parent class method implementation
 	 			   		   then Child is allow to redeine that Parent class method in 
 	 			           Child class in its own way this process is called overriding.
 	 			           
 	 			           
 	 			           MethodSignature(Method name + Arguments )
 	 			           
 	 			  Parent class reference can be used to hold Child class object but by using that reference 
				  we can't call Child specific method.
 	 			           
 	 			           
 	 			           
 	 			           
 	 			           
 	 			          
*/