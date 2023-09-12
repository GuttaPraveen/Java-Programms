package Sample;
import java.util.*;
public class AbsoluteDiffer
{
	public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		int ans=a[0];
		for(int i=0;i<n-1;i++)
		{ 
		    for(int j=i+1;j<n;j++)
		    {
		        int diff=Math.abs(a[i]-a[j]);
		        ans=Math.min(ans,diff);
		    }
		}
		System.out.println(ans);
	}
}
