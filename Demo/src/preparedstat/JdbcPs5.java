package preparedstat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcPs5 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kphb","root","Maha@143");
		PreparedStatement pst=con.prepareStatement("INSERT INTO PRODUCT(PNAME,PCODE,PPRICE,PQUANTITY)VALUES(?,?,?,?)");
		pst.setString(1,"HP");
		pst.setString(2, "H");
		pst.setInt(3, 5000);
		pst.setInt(4, 6);
		int rowCount=pst.executeUpdate();
		if(rowCount>0)
		{
			System.out.println("Success");
		}
		else
		{
			System.out.println("Failure");
		}
		
		
		

	}

}
