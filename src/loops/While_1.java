package loops;
import java.util.*;
public class While_1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=1;
		while(n>0)
		{
			if(n>10)
			{
				System.out.println(n--);
			}
			else
			{
				System.out.println(count);
				count++;
				n--;
			}
		}

	}

}
