package streamapi;

public class Java8Demo
{
	public static void main(String[] args) 
	{
		
		
		
		Calculator add=(int a,int b)->System.out.println(a+b);
		add.cal(10,20);
		
		
		Calculator sub=(int a,int b) ->System.out.println(a-b);
		sub.cal(10,20);
		
	
	}
}



interface Calculator
{
	public abstract void cal(int a,int b);
}
