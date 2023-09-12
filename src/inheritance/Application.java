package inheritance;

import java.util.Scanner;

public class Application
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		/*String cname=sc.next();
		int ccode=sc.nextInt();*/
		College c=new College();
		System.out.print("Enter your name and Mobile Number: ");
		String name=sc.next();
		long mobile=sc.nextLong();
		System.out.print("Do you want admission in PG or UG : ");
		String option=sc.next();
		switch(option)
		{
			
		case "PG":
				String pgbranch="M.Tech";
				String pgstream=sc.next();
				long pgfee=sc.nextLong();
				PostGrad pg=new PostGrad(1000,"CS","M.TECh");
					pg.branch();
					pg.fee(pgfee,pgbranch);
					pg.streams();
					break;
		case "UG":
			String ugbranch="B.Tech";
			String ugstream=sc.next();
			long ugfee=sc.nextLong();
			UnderGrad ug=new UnderGrad(1,"CSE","B.TECh");
					ug.branch();
					ug.fee(ugfee,ugbranch);
					ug.streams(ugstream,ugbranch);
		break;
					
		}
		
		

	}

}
class College
{
	String name;
	int code;
	College()
	{
		name="Gudlavalleru Engineering College";
		code=12;
		System.out.println("Welcome to "+name+" `code is: "+code);
		
	}
}
class UnderGrad extends College
{
	int ufee;
	String ubranch,ustream;
	UnderGrad(int ufee,String ubranch,String ustream)
	{
		this.ufee=ufee;
		this.ubranch=ubranch;
		this.ustream=ustream;
		System.out.println("Under Graduate Avaliable Branches are: ");
		System.out.println("1.B.Tech\n");
	}
	
	public void branch()
	{
		System.out.println("1.B.Tech\n");
	}
	public void fee(long fee,String branch)
	{
		switch(branch)
		{
		  case "CSE":System.out.println(branch+" "+fee);
		  break;
		  case "IT":System.out.println(branch+" "+fee);
		  break;
		  case "ECE":System.out.println(branch+" "+fee);
		  break;
		  case "ME":System.out.println(branch+" "+fee);
		  break;
		  default:System.out.println(branch+" "+fee);
		
		}
	}
	public void streams(String ugstream,String branch)
	{
		switch(branch)
		{
		  case "CSE":System.out.println(ugstream+" "+branch);
		  break;
		  case "IT":System.out.println(ugstream+" "+branch);
		  break;
		  case "ECE":System.out.println(ugstream+" "+branch);
		  break;
		  case "ME":System.out.println(ugstream+" "+branch);
		  break;
		  default:System.out.println(ugstream+" "+branch);
		
		}
	}
}
class PostGrad extends College
{
	int pfee;
	String pbranch,pstream;
	PostGrad(int pfee,String pbranch,String pstream)
	{
		this.pfee=pfee;
		this.pbranch=pbranch;
		this.pstream=pstream;
	}
	public void branch()
	{
		System.out.println("1.CSE\n2.IT\n3.");
	}
	public void fee(long fee,String branch)
	{
		switch(branch)
		{
		  case "Economics":System.out.println(branch+" "+fee);
		  break;
		  case "SE":System.out.println(branch+" "+fee);
		  break;
		  case "ME":System.out.println(branch+" "+fee);
		  break;
		  case "EE":System.out.println(branch+" "+fee);
		  break;
		  default:System.out.println(branch+" "+fee);
		
		}
	}
	public void streams()
	{
		
	}
}