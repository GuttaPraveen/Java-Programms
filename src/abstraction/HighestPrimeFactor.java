package abstraction;

public class HighestPrimeFactor
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n=15,count=0;
		for(int i=n-1;i>1;i--)
		{
			if(n%i==0)
			{
				for(int j=2;j<i/2;j++)
				{
					if(i%j==0)
						break;
				}
				if(count==0)
				{
					System.out.println(i);
					break;
				}
			}
		}

	}

}
