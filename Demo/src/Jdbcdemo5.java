import java.sql.*;
import java.io.*;
public class Jdbcdemo5
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		BufferedReader bufferedReader=null;
		Connection connection=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/kphb","root","Maha@143");
			Statement statement=connection.createStatement();
			bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			while(true)
			{
				System.out.print("Employee Number : ");
				int eno = Integer.parseInt( bufferedReader.readLine() );
				System.out.print("Employee Name : ");
				String ename = bufferedReader.readLine();
				System.out.print("Employee Salary : ");
				float esal = Float.parseFloat( bufferedReader.readLine() );
				System.out.print("Employee Address : ");
				String eaddr = bufferedReader.readLine();
				int rowCount = statement.executeUpdate("insert into emp1 values("+eno+",'"+ename+"',"+esal+",'"+eaddr+"')");
				if(rowCount == 1)
				{
					System.out.println("Employee Inserted Successfully");
				}
				else
				{
					System.out.println("Employee insertion Failure");
				}	
				System.out.print("One more Employee? [Yes/No] : ");
				String userOption = bufferedReader.readLine();
				if(userOption.equalsIgnoreCase("yes")) 
				{
					continue;
				}
				else
				{
					break;
				}
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				
				bufferedReader.close();
				connection.close();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
