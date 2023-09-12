package multithread;

public class JoinDemoByChildThread {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		MyThread22 t=new MyThread22();
		t.start();
		for(int i=0;i<5;i++)
		{
			Thread.sleep(1000);
			System.out.println("Main-Thread");
		}
		

	}

}
class MyThread22 extends Thread
{
	static Thread mt=Thread.currentThread();
	public void run()
	{
		try
		{
			mt.join();
		}
		catch(InterruptedException e) 
		{}
		for(int i=0;i<5;i++)
		{
			System.out.println("Child-Thread");
		}
		
	}
}