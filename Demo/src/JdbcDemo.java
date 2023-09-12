import java.sql.*;
class JdbcDemo
{
	public static void main(String[] args)throws Exception
	{
		//Load And Register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Establish Connection between Java Application and Database.
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kphb","root", "Maha@143");
		// Create Statement
		Statement st = con.createStatement();
		//Write and Execute SQL Query
		int rowCount=st.executeUpdate("create table emp3(ENO int primary key, ENAME varchar(10), ESAL int, EADDR varchar(10))");
		System.out.println("emp1 Table Created Successfully");
		//Close the resources
		st.close();
		con.close();
	}
}
