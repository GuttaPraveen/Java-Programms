package multithread;

public class RunnableInterfaceDemo2 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		RunnableInterface d=new RunnableInterface();
		Thread t1=new Thread(d,"Hyderabad");
		t1.start();
		Thread t2=new Thread(d,"KPHB");
		t2.start();
	}

}
class RunnableInterface implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
			System.out.println(Thread.currentThread().getName());
	}
}