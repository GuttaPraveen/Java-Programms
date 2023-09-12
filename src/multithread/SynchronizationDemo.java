package multithread;

public class SynchronizationDemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Display d1=new Display();
		MyThread t1=new MyThread(d1,"Praveen");
		MyThread t2=new MyThread(d1,"Maha");
		t1.start();
		t2.start();

	}

}
class MyThread extends Thread
{
	Display d;
	String name;
	MyThread(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
	    d.wish(name);
	}
}
class Display
{
	public synchronized void wish(String name)
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Good Morning");
		}
	}
}