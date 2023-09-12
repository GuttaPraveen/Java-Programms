package preparedstat;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class EmployeeAppl
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		System.out.println("Welcome To Employee Application");
		String ename="";
		int eid=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc=new Scanner(System.in);
		System.out.println("Enter eid:");
		eid=Integer.parseInt(br.readLine());
		System.out.println("Enter ename:");
		ename=br.readLine();
		
		Employee e=new Employee();
		
		e.setEid(eid);
		e.setEname(ename);
		try
		{
			Connection con=ConnectionFactory.getConnection();
			PreparedStatement pst=con.prepareStatement("insert into emp8 values(?,?)");
			pst.setInt(1,e.getEid());
			pst.setString(2,e.getEname());
			int rowCount=pst.executeUpdate();
			if(rowCount==1)
			{
				System.out.println("Insert successfully");
			}
			else
			{
				System.out.println("Insertion Faiure");
			}
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
		
		
		

	}


}
