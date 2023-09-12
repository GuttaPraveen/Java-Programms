package Exceptions;

public class IllegalArgumentExceptionDemo
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Thread t=new Thread(); 
		t.setPriority(10);//valid 
		t.setPriority(100);//invalid
		Thread thread = new Thread();
	    System.out.println(thread.getPriority());
	     thread.setPriority(7);
	     System.out.println(thread.getPriority());
	     thread.setPriority(12);

	}

}
