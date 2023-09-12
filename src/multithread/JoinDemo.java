package multithread;

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException
	{
		
		// TODO Auto-generated method stub
		Thread mt=Thread.currentThread();
		MyThread21 t=new MyThread21();
		t.start();
		t.join();
		for(int i=0;i<5;i++)
		{
			System.out.println("Main-Thread");
		}

	}

}
class MyThread21 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Child-Thread");
			try
			{
				Thread.sleep(1000);
			}
				catch(InterruptedException e) {}
		}
		
	}
}

