package arrays;

public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s="123 Praveen 23 Maha";
		String s1[]=s.split(" ");
		String ans="";
		for(int i=0;i<s1.length;i++)
		{
			String k=s1[i];
			if(Character.isDigit(k.charAt(0)))
				ans+=s1[i];
			else
				ans+=-1;
		}
		System.out.println(ans);
		

	}

}
