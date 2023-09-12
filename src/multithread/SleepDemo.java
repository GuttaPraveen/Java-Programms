package multithread;

public class SleepDemo 
{
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		MyRunnable12 r=new MyRunnable12();
		Thread t=new Thread(r);
		for(int i=0;i<=5;i++)
		{
			Thread.sleep(2000);
			System.out.println("Main Thread");
		}

	}
}
class MyRunnable12 implements Runnable
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("Child Thread");
		}
	}
}