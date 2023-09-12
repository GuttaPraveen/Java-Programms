package preparedstat;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class JdbcPs2 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
				Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/kphb","root", "Maha@143");
				PreparedStatement preparedStatement = connection.prepareStatement("update emp1 set ESAL = ESAL + ? where ESAL < ?");
				System.out.print("Bonus Amount : ");
				int bonusAmount =Integer.parseInt(bufferedReader.readLine());
				System.out.print("Salary Range : ");
				float salaryRange = Float.parseFloat(bufferedReader.readLine());
				preparedStatement.setInt(1, bonusAmount);
				preparedStatement.setFloat(2, salaryRange);
				int rowCount = preparedStatement.executeUpdate();
				System.out.println("Employees Updated :"+rowCount);
		}
		catch(Exception exception)
		{
				exception.printStackTrace();
	    }

	}

}
