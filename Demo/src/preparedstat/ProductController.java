package preparedstat;
import java.io.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
public class ProductController
{

	public static void main(String[] args) throws IOException, SQLException 
	{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{

			System.out.println("====Welocme To Product Application======");
			System.out.println("Enter your option[1 2]");
			int op=Integer.parseInt(br.readLine());
			
			String pname="";
			String pcode="";
			int pprice=0;
			int pquantity=0;
			
			ProductDto p=null;
			Connection con=null;
			switch(op)
			{
				case 1://Add Product Details means Insert
					System.out.println("Insert Product Details");
					System.out.println("Enter Product Name: ");
					pname=br.readLine();
					System.out.println("Enter Product Code: ");
					pcode=br.readLine();
					System.out.println("Enter product Price: ");
					pprice=Integer.parseInt(br.readLine());
					System.out.println("Enter product Quantity: ");
					pquantity=Integer.parseInt(br.readLine());
					
					p = new ProductDto();
					p.setPname(pname);
					p.setPcode(pcode);
					p.setPprice(pprice);
					p.setPquantity(pquantity);
					
					String query = "insert into product(pname,pcode,pprice,pquantity) values(?,?,?,?)";
					con=ConnectionFactory.getConnection();
					PreparedStatement pst=con.prepareStatement(query);
					pst.setString(1,p.getPname());
					pst.setString(2,p.getPcode());
					pst.setInt(3,p.getPprice());
					pst.setInt(4,p.getPquantity());
					int rowCount=pst.executeUpdate();
					if(rowCount==1)
					{
						System.out.println("Successfully Inserted Product Details");
					}
					else
					{
						System.out.println("Insertion Failure");
					}
					break;
				case 2:
					System.out.println("===ThanQ for using Product Application=====");
					System.exit(0);
					break;
			}
			
		}

	}

}
