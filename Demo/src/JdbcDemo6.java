import java.io.*;
import java.sql.*;
public class JdbcDemo6
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try 
		{
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
				Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/kphb","root","Maha@143");
				Statement statement = connection.createStatement();
				System.out.print("Salary Range : ");
				float salaryRange = Float.parseFloat(bufferedReader.readLine());
				int rowCount = statement.executeUpdate("delete from emp1 where ESAL < "+salaryRange);
				System.out.println("Employees Deleted : "+rowCount);
		} 
		catch (Exception e)
		{
				e.printStackTrace();
		}

	}

}
