package Sample;
import java.util.*;
public class SoretdOrNot 
{
	public static int sorted(int a[])//5 4 2 1 3
	{
		int flag=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j] || a[i]>a[j])
					flag=1;
				else 
					flag=0;
					
			}
		}
		return flag;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[] {5,4,3,2,1};
		int k=sorted(a);
		if(k==0)
			System.out.println("Not Sorted");
		else
		{
			System.out.println("Sorted");
		}
	}
}
