package preparedstat;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
public class JdbcPs3 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try 
		{
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kphb", "root", "Mah@143");
				PreparedStatement preparedStatement =connection.prepareStatement("delete from emp1 where ESAL <?");
				System.out.print("Salary Range : ");
				float salaryRange = Float.parseFloat(bufferedReader.readLine());
				preparedStatement.setFloat(1, salaryRange);
				int rowCount = preparedStatement.executeUpdate();
				System.out.println("Employees Deleted :"+rowCount);
		}
		catch(Exception exception)
		{
				exception.printStackTrace();
		}


	}

}
