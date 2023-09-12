package multithread;

public class RaceCondition 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		MyRunnable r=new MyRunnable();
		Thread t1=new Thread();
		t1.start();
		Thread t2=new Thread();
		t2.start();
		Thread t3=new Thread();
		t3.start();
		
		

	}

}
class MyRunnable implements Runnable
{
	int x;
	public void run()
	{
		for(int y=0;y<10;y++)
		{
			System.out.println(x);
		}
	}
}
/*
			A race condition is a phenomenon that occurs when two or more threads access
			a shared resource or variable concurrently and try to modify it at the same time,
			resulting in unpredictable behavior. It can lead to incorrect results and program
			crashes.
*/