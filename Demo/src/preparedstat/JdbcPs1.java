package preparedstat;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
class JdbcPs1
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/kphb", "root", "Maha@143");
				PreparedStatement preparedStatement = connection.prepareStatement("insert into emp3 values(?,?,?,?)");
				while(true)
				{
					System.out.print("Employee Number : ");
					int eno = Integer.parseInt(bufferedReader.readLine());
					System.out.print("Employee Name : ");
					String ename = bufferedReader.readLine();
					System.out.print("Employee Salary : ");
					float esal = Float.parseFloat(bufferedReader.readLine());
					System.out.print("Employee Address : ");
					String eaddr = bufferedReader.readLine();
					preparedStatement.setInt(1, eno);
					preparedStatement.setString(2, ename);
					preparedStatement.setFloat(3, esal);
					preparedStatement.setString(4, eaddr);
					int rowCount = preparedStatement.executeUpdate();
					if(rowCount == 1)
					{
						System.out.println("Employee "+eno+"Inserted Successfully");
						System.out.print("One more Employee [Yes/No]? : ");
						String option =bufferedReader.readLine();
						if(option.equalsIgnoreCase("yes"))
						{
							continue;
						}
						else
						{
							break;
						}
					}
					else
					{
						break;
					
					}
				}
		}
		catch(Exception exception)
		{
				exception.printStackTrace();
		}

	}

}
