package Exceptions;

class A
{     
	}
class B extends A
{

}
public class ClassCastExceptionDemo
{
   public static void main(String[] args) {
       A a = new A();
       B b = (B) a;
      
   }
}

/*

		It is the child class of RuntimeException and hence it is unchecked. 
		Raised automatically by the JVM whenever we are trying to type cast parent object to child type.
		
		 In Java applications, we are able to keep subclass object reference value in 
		 superclass reference variable , but it is not possible to keep superclass object
		 reference value in the subclass reference variable, if we are trying to keep 
		 superclass object reference value in the subclass reference variable then
		 JVM will raise an exception like java.lang.ClassCastException.

*/