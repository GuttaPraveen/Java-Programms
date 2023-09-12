package abstraction;

public class BankAppl
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Abstract class");
		BankA a=new BankA();
		a.getBalance();
		BankB b=new BankB();
		b.getBalance();
		BankC c=new BankC();
		c.getBalance();

	}

}
abstract class Bank
{
	public abstract void getBalance();
}
class BankA extends Bank
{
	long deposite = 1000;
	public void getBalance()
	{
		System.out.println(deposite);
	}
}
class BankB extends Bank
{
	long deposite = 5000;
	public void getBalance()
	{
		System.out.println(deposite);
	}
}
class BankC extends Bank
{
	long deposite = 2000;
	public void getBalance()
	{
		System.out.println(deposite);
	}
}
