package string;
import java.util.*;
public class Sort
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();// Hello all Good Morning
		String s1[]=s.split(" ");
		//Sorting of Strings in Dictionary Order
		for(int i=0;i<s1.length;i++)
		{
			for(int j=0;j<s1.length-1;j++)
			{
				if(s1[j].compareToIgnoreCase(s1[j+1])>0)
				{
					String temp=s1[j];
					s1[j]=s1[j+1];
					s1[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(s1));// [all, Good, Hello, Morning]
	}

}
