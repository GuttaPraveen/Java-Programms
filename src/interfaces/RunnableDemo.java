package interfaces;
public class RunnableDemo
{
	public static void main(String[] args)
	{
	
		/* Runnable r=()-> 
		 {
			 for(int i=1;i<=5;i++)
				 System.out.println("Hello");
		 };
		 r.run();*/
		/*Intf i= x->x*x;
		System.out.println("The square of 7 is :"+i.square(7));*/
	}
}
interface Intf
{
	public void square(int x);

}

/*public class RunnableDemo
{
	public static void main(String[] args)
	{
		MyRunnable r=new MyRunnable();
		r.run();
		Thread t=new Thread(r);
		t.start();
	}
}
 
 
class MyRunnable implements Runnable
 
{
	public void run()
	{
		for(int i=0;i<1;i++)
		{
			System.out.println("Hello Good Evening");
		}
	}
}*/