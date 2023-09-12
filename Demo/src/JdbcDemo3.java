import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class JdbcDemo3
{
	public static void main(String[] args) 
	{
		BufferedReader bufferedReader = null;
		Connection connection = null;
		Statement statement = null;
		String tableName = "";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kphb","root", "Maha@143");
			statement = connection.createStatement();
			System.out.print("Table Name [Sugg: Student Related] : ");
			bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			tableName = bufferedReader.readLine();
			int rowCount=statement.executeUpdate("create table"+tableName+"(SID int primary key, SNAME varchar(10),SADDR varchar(10))");
			System.out.println("Table "+tableName+" Created Successfully");
		}
		catch (Exception e)
		{
			System.out.println("Table "+tableName+" Creation Failure");
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