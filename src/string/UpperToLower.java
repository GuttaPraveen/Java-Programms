package string;

public class UpperToLower
{
	public static void main(String[] args)
	{
		String s="Hello";
		String s1="";
		System.out.println("hello world");
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				s1+=Character.toLowerCase(s.charAt(i));
			}
			else
				s1+=Character.toUpperCase(s.charAt(i));
		}
		System.out.println(s1);
	}
}
