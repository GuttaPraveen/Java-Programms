import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class CrudApp
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kphb","root","Maha@143");
		Statement stmt=con.createStatement();
		int rowCount=stmt.executeUpdate("update  emp3 set ename='Siva' where ENO=222");
		ResultSet rs=stmt.executeQuery("select * from emp3");
		while(rs.next())
		{
			System.out.print(rs.getString("ENO")+" "+rs.getString("ENAME"));
			System.out.println();
		}
		if(rowCount>0)
		{
			System.out.println("Updatesuccessfully ");
		}
		else
		{
			System.out.println("Failure");
		}
		
		
		
	}
}
