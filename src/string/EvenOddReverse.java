package string;
import java.util.*;
public class EvenOddReverse
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1[]=s.split(" ");
		String ans="";
		for(int i=0;i<s1.length;i++)
		{
			if(i%2==0)
			{	
				String k=s1[i];
				if(k.charAt(0)>='A'&& k.charAt(0)<='Z')
				{
					ans+=k.substring(0,1).toUpperCase()+k.substring(1,k.length()-1)+k.substring(k.length()-1).toLowerCase()+" ";
				}
				else
				{
					ans+=k.substring(0,1).toLowerCase()+k.substring(1,k.length()-1)+k.substring(k.length()-1).toUpperCase()+" ";
				}
			}
			else
			{
				String res=s1[i];
				for(int j=res.length()-1;j>=0;j--)
				{
					ans+=res.charAt(j);
				}
			}
		}
		System.out.println(ans);
		

	}

}
