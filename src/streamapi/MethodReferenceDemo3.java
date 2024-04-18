package streamapi;

public class MethodReferenceDemo3
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		
			// wrt Lambda
			Runnable r2 = () -> MethodReferenceDemo3.m1();

			// wrt :: operator
			Runnable r3 = MethodReferenceDemo3::m1;



			Thread t2 = new Thread(r2);
			t2.start();

			Thread t3 = new Thread(r3);
			t3.start();

			for (int i = 0; i < 5; i++)
			{
					System.out.println("Parent Thread.....");
			}

		}
		public static void m1()
		{
				for (int i = 0; i < 5; i++) 
				{
					System.out.println("Child Thread.....");
				}
		}

}
