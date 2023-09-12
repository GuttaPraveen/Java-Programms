package patterns;

public class Pattern99
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i=0;
		int j=0;
		for(i=0;i<5;i++)
		{
			for(j=0;j<2;j++)
			{
				if(i>2)
				{
					continue;
				}
				System.out.println("Thinkbig");
			}
		}

	}

}
