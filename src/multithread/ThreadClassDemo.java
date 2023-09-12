package multithread;

public class ThreadClassDemo
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ThreadClass d=new ThreadClass();
		d.start();
		for(int i=0;i<=5;i++)
		{
			System.out.println("Parent Class Thread");
		}
		

	}

}
class ThreadClass extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("Child Thread Class");
		}
	}
}