import java.io.*;
import java.sql.*;
public class JdbcDemo7
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kphb","root","Maha@143");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from emp1");
			while(rs.next())
			{
				System.out.print(rs.getInt("ENO")+"\t");
				System.out.print(rs.getString("ENAME")+"\t");
				System.out.print(rs.getFloat("ESAL")+"\t");
				System.out.print(rs.getString("EADDR")+"\n");
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}

	}

}
