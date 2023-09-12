package preparedstat;

public class ProductDto 
{
	private String pname;
	private String pcode;
	int pprice;
	int pquantity;
	public String getPname() 
	{
		return pname;
	}
	public void setPname(String pname)
	{
		this.pname = pname;
	}
	public String getPcode()
	{
		return pcode;
	}
	public void setPcode(String pcode)
	{
		this.pcode = pcode;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice)
	{
		this.pprice = pprice;
	}
	public int getPquantity() 
	{
		return pquantity;
	}
	public void setPquantity(int pquantity) 
	{
		this.pquantity = pquantity;
	}
	
	
}
