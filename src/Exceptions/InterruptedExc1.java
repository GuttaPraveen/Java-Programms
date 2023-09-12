package Exceptions;

public class InterruptedExc1
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		Thread9 t=new Thread9();
		t.sleep(1000);
		t.start();

	}

}
class Thread9 extends Thread
{
	public void run()
	{
		for(int i=1;i<=4;i++)
		{
			System.out.println("Hello");
		}
	}
}