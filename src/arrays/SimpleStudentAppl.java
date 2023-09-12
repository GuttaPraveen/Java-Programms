package arrays;
import java.util.*;
import java.util.Arrays;
public class SimpleStudentAppl
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Student s=new Student();
		s.display();
		s.insertSid(191250,2);
		s.insertSname("Ravi",1);
		s.insertSlocation("Hyderabad",2);
		s.displayAfterinsert();
		s.deleteSid(1);
		s.deleteSname(2);
		s.deleteSlocation(3);
		s.displayAfterDelete();
		s.displaySmarks();
		s.scholarship();

		

	}

}
class Student 
{
	static String branch="B.Tech";
	int sId[]=new int[] {191240,191241,191242,191243,0000};
	String sName[]=new String[] {"praveen","Maha","Vani","Siva","null"};
	int sMarks[][]=new int[][] {{80,70,86,83,75},{90,75,86,80,85},{80,55,78,70,71},{70,65,86,70,80}};
	String sLocation[]=new String[] {"Krishna","Guntur","Vijayawada","Prakasam","null"};
	
	public void display()
	{
		
		System.out.println("\t           Student Application\t");
		System.out.println("\t----------------------------------");
		System.out.printf("\t |%s |%s | %s |%s |%n","sId","sName","sLocation","branch");
		for(int i=0;i<sId.length;i++)
		{
			System.out.println("\t------------------------------------");
			System.out.printf("\t| %d | %s |%s |%5s |",sId[i],sName[i],sLocation[i],branch);
			System.out.println();
			
		}
		System.out.println("\t-------------------------------------");
	}
	public void insertSid(int n,int p)
	{
		System.out.println(Arrays.toString(sId));
		for(int i=sId.length-1;i>p;i--)
		{
			sId[i]=sId[i-1];
		}
		sId[p]=n;
	}
	public void insertSname(String s,int p)
	{
		System.out.println(Arrays.toString(sName));
		for(int i=sName.length-1;i>p;i--)
		{
			sName[i]=sName[i-1];
		}
		sName[p]=s;
		System.out.println(Arrays.toString(sName));
	}
	public void insertSlocation(String s,int p)
	{
		System.out.println(Arrays.toString(sLocation));
		for(int i=sLocation.length-1;i>p;i--)
		{
			sLocation[i]=sLocation[i-1];
		}
		sLocation[p]=s;
		System.out.println(Arrays.toString(sLocation));
		
	}
	public void displayAfterinsert()
	{
		System.out.println("After Insertion: ");
		System.out.println("        Student Application  ");
		System.out.println();
		System.out.println("\tsId\tsName\tsLocation\tsbranch");
		System.out.println();
		for(int i=0;i<sId.length;i++)
		{
			
			System.out.println("\t"+sId[i]+"\t"+sName[i]+"\t"+sLocation[i]+"\t"+branch);
			
		}
		
	}
	public void deleteSid(int p)
	{
		for(int i=p;i<sId.length-1;i++)
		{
			sId[i]=sId[i+1];
		}
		System.out.println(Arrays.toString(sId));
	}
	public void deleteSname(int p)
	{
		for(int i=p;i<sName.length-1;i++)
		{
			sName[i]=sName[i+1];
		}
		System.out.println(Arrays.toString(sName));
	}
	public void deleteSlocation(int p)
	{
		for(int i=p;i<sLocation.length-1;i++)
		{
			sLocation[i]=sLocation[i+1];
		}
		System.out.println(Arrays.toString(sLocation));
	}
	public void displayAfterDelete()
	{
		System.out.println("\tAfter Deletion: ");
		System.out.println("Student Application\t");
		System.out.println();
		System.out.println("\tsId\tsName\tsLocation\tbranch");
		System.out.println();
		for(int i=0;i<sId.length;i++)
		{
			System.out.println("\t"+sId[i]+"\t"+sName[i]+"\t"+sLocation[i]+"\t"+branch+"\t");
			
		}
		
	}
	public void displaySmarks()
	{
		for(int i=0;i<sMarks.length;i++)
			Arrays.sort(sMarks[i]);
		System.out.println(Arrays.deepToString(sMarks));
	}
	public void scholarship()
	{
		int k[]=new int[sMarks.length];
		for(int i=0;i<sMarks.length;i++)
		{
			int total=0;
			for(int j=0;j<sMarks[0].length;j++)
			{
				total+=sMarks[i][j];
			}
			k[i]=total;
		}
		for(int i=0;i<k.length;i++)
		{
			int avg=(int)k[i]/sMarks[0].length;
			if(avg>80)
				System.out.println("Scholarship provide to "+sId[i]+" Name is "+sName[i]+" from "+sLocation[i]+" and average is: "+avg);
		}
	}
	
	
	
}
