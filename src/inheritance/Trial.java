package inheritance;

public class Trial extends Sample
{
	public static void main(String[] args)
	{
		/*int m=2,n=4;
		Sample s=new Sample();
		s.put(m,n);
		System.out.println(Sample.tally);*/
		int num1=2;
		int num2=10;
		do
		{
			num2=num2/num1;
			if(num1>num2)
				break;
			num2--;
		}
		while(++num1<5);
		System.out.println(num1+" "+num2);
	}
}
/*class Sample
{
	static int tally=0;
	public void put(int a,int b)
	{
		for(;a<10;a++) 
			++b;
		tally+=b;
	}
}*/
/*
 2-5
 3-6
 4-7
 5-8
 6-9
 7-10
 8-11
 9-12
 10-13
 */
