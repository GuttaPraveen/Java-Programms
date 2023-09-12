import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class JdbcDemo2 
{
	public static void main(String[] args)throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kphb","root","Maha@143");
		Statement st = con.createStatement();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Table Name [Sugg: Emp Related] : ");
		String tableName = br.readLine();
		//"create table "+tableName+"(ENO number(5) primary key, ENAME varchar2(10), ESAL float(5), EADDR varchar2(10))"
		st.executeUpdate("create table "+tableName+"(ENO int primary key, ENAME varchar(10), ESAL float, EADDR varchar(10))");
		System.out.println("Table "+tableName+" Created Successfully");
		br.close();
		con.close();
	}
}