package loops;
import java.util.*;
public class Main 
{
	public static void main(String[] args)
	{
		for(int i=2;i<=100;i++)//2 3 4 5
		{
			int fact=0;
			for(int j=2;j<=i/2;j++)//2 2<=1 2<=1 2<=2
			{
				if(i%j==0)
				{
					fact++;//1
					break;
				}
			}
			if(fact==0)
				System.out.println(i);//2 3
		}
	}
}
