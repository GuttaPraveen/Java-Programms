package multithread;

public class RunnableInterfaceDemo1
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Demo d=new Demo();
		Thread t=new Thread(d);
		t.start();
		for(int i=1;i<=5;i++)
		{
			System.out.println("Parent Thread");
		}
		
		

	}

}
class Demo implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Child Thread");
		}
	}
}