package constructor;

public class DefaultConstructor
{
	String name="";
	int id;
	DefaultConstructor()
	{
		name="Praveen";
		id=1240;
		System.out.println(name+" "+id);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		DefaultConstructor o=new DefaultConstructor();
	}

}
