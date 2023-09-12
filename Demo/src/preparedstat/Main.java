/*package preparedstat;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import com.mysql.cj.jdbc.CallableStatement;

public class Main 
{
	public static void main(String[] args) throws Exception
	{
		String url="";
		String uname="";
		String password="";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kphb","root","root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from product");
		while(rs.next())
		{
			System.out.println(rs.getString(1));
			System.out.println(rs.getString("PCODE"));
			System.out.println(rs.getInt(3));
		}

	}
}

class DriverManager 
{
	static Connection con=new ConnectionImpl();
	public static Connection getConnection(String url,String uname,String password)
	{
		return con;
	}
	
}
class ConnectionImpl implements Connection
{

	Statement st=null;
	public Statement createStatement()
	{
		// TODO Auto-generated method stub
		return st;
	}


	
}
interface Connection
{
	public Statement createStatement();
	//public PreparedStatement prepareStatemnt();
	//public CallableStatement prepareCall();

	public PreparedStatement prepareStatement(String string);
	
}*/