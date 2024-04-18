package streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap
{
	public static void main(String[] args)
	{
		List<CustomerDemo> customers = new ArrayList();
		customers.add(new CustomerDemo("1240","Praveen"));
		customers.add(new CustomerDemo("1318","Maha"));
		customers.add(new CustomerDemo("1310","Ravi"));
		
		Map<String,CustomerDemo> map=customers.stream()
				.collect(Collectors.toMap(CustomerDemo::getCustomerId,customer->customer));
		
		System.out.println(map);
		
     	List<CustomerDemo> cid=customers.stream()
     			.sorted(Comparator.comparing(CustomerDemo::getCustomerId)).toList();
		
     	System.out.println(cid);
	}
}
class CustomerDemo
{
	private String customerId;
	private String customerName;
	public CustomerDemo(String id,String name) 
	{
		// TODO Auto-generated constructor stub
		this.customerId=id;
		this.customerName=name;
	}

	public String getCustomerId()
	{
		return customerId;
	}
	public String getCustomerName()
	{
		return customerName;
	}

	@Override
	public String toString() {
		return "[customerId=" + customerId + ", customerName=" + customerName + "]";
	}

	
	

	
}