package streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIUser
{
	public static void main(String[] args)
	{
		List<User> user = List.of(new User("Praveen","8919863855"),new User("Sai","9581150114"),new User("Rakesh","7780385514"));
		
		List<String> mobNum=user.stream().filter(u->u.getMobileNumber().startsWith("9")).map(e->e.getMobileNumber()).collect(Collectors.toList());
		System.out.println(mobNum);
		
//		List<User> mobNum=user.stream().filter(u->u.startsWith("9")).collect(Collectors.toList());
		
	}
}
class User
{
	private String name;
	private String mobileNumber;
	
	public User() {}
	
	public User(String name, String mobileNumber)
	{
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getMobileNumber() 
	{
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber)
	{
		this.mobileNumber = mobileNumber;
	}
	
	@Override
	public String toString()
	{
		return "User [name=" + name + ", mobileNumber=" + mobileNumber + "]";
	}
	
	
}
