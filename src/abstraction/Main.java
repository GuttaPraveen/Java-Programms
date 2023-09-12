package abstraction;

public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Thread1 t=new Thread1();
		t.start();
		t.setPriority(10);
		for(int i=1;i<=10;i++)
		{
			System.out.println("Hi");
		}

	}

}
class Thread1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
			System.out.println("Hello");
	}
}

