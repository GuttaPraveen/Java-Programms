import java.sql.*;
public class JdbcDemo4
{
	public static void main(String[] args) throws SQLException,Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kphb","root","Maha@143");
		Statement st=con.createStatement();
		//st.executeUpdate("insert into emp1 values(1,'praveen',40000.40,'Prakasam')");
		st.executeUpdate("insert into emp1 values(2,'Maha',55000.40,'Guntur')");
		System.out.println("Successfully insert record into emp table");
		con.close();
	}
}
