package constructor;
import java.util.*;
class Test
{
	 public static void main(String[] args)
	{
	    Account account = new Account(); 
	    Employee emp = new Employee(account);
	 }
 }
class Account
{
	String name;
	int id;
}
class Employee
{ 
	Account account; 	
	Employee(Account account)
	{
	    this.account = account;
	    System.out.println(account);
	}
	
 }