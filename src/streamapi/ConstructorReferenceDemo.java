package streamapi;
import java.util.*;
public class ConstructorReferenceDemo
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		new ConstructorReferenceDemo().display();

	}
	void display()
	{
		InterfaceA12 x = new ClassB()::show; //Non-Static method referencoing
		InterfaceA12 y = ClassB::m2; //Static method referencoing
	    InterfaceA12 z = ClassB::new;//Constructor method referencng
  		z.m1();
	}

}

