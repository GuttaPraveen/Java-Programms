package string;

public class VowelsAndConsonants
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s="Hello World";
		int vow=0,cons=0;
		s=s.toUpperCase();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='A' || s.charAt(i)=='E'|| s.charAt(i)=='I'|| s.charAt(i)=='O'|| s.charAt(i)=='U')
			{
				vow++;
			}
			else
				cons++;
		}
		System.out.println("Vowels are: "+vow +" Consonants are: "+cons);
	}

	

}
