package string;

public class ConvertCharArrToString
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		char ch[]=new char[] {'P','r','a','v','e','e','n'};
		String s="";
		for(int i=0;i<ch.length;i++)
		{
			s+=ch[i];
		}
		System.out.println(s);

	}

}
/*
 	input : char ch[]= {'P','r','a','v','e','e','n'};
 	output : praveen 
 */
