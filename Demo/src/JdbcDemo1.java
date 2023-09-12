import java.sql.*;
import java.io.*;
public class JdbcDemo1
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/bitlabs","root","Maha@143");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from employee order by id");
			//String filePath="C:\\Users\\91891\\OneDrive\\Desktop\\Serializable//emp5.txt";
			FileWriter fw=new FileWriter("C:\\Users\\\\91891\\OneDrive\\Desktop\\Serializable//emp5.txt",true);
			PrintWriter out=new PrintWriter(fw);
			while(rs.next())
			{
				out.write(rs.getInt("id"));
				out.write(rs.getString("name"));
				System.out.print(rs.getInt("id")+" "+rs.getString("name"));
				System.out.println();
			}
			out.flush();
			out.close();
			fw.close();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
}
