package preparedstat;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
public class JdbcPs4
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kphb", "root", "Maha@143");
				PreparedStatement preparedStatement = connection.prepareStatement("select * from emp3");
				ResultSet resultSet = preparedStatement.executeQuery();
				System.out.println("ENO\tENAME\tESAL\tEADDR");
				System.out.println("---------------------------------");
				while(resultSet.next())
				{
					System.out.print(resultSet.getInt("ENO")+"\t");
					System.out.print(resultSet.getString("ENAME")+"\t");
					System.out.print(resultSet.getFloat("ESAL")+"\t");
					System.out.print(resultSet.getString("EADDR")+"\n");
				}
		}
		catch(Exception exception)
		{
				exception.printStackTrace();
		}
	}

}
