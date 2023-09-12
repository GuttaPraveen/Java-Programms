package multithread;

public class RaceConditionBySynchronized
{

	public static void main(String[] args) 

	{
		// TODO Auto-generated method stub
		MyRunnable1 r=new MyRunnable1();
		Thread t1=new Thread(r,"Thread1");
		t1.start();
		Thread t2=new Thread(r,"Thread2");
		t2.start();
		Thread t3=new Thread(r,"Thread3");
		t3.start();
		

	}

}
class MyRunnable1 implements Runnable
{
	int x;
	public void run()
	{
		wish();
	}
	public synchronized void wish()
	{
		for(int y=1;y<=10;y++)
			System.out.println(Thread.currentThread().getName()+" "+ ++x);
	}
}
