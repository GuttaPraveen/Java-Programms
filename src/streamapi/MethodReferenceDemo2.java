package streamapi;
import java.util.ArrayList;
public class MethodReferenceDemo2 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);	
		
		// with Lambda 
		list.forEach((x) -> {PrintDemo.print(x);});	
				
		// with :: operator 
		//ClassName::staticMethodName
		list.forEach(PrintDemo::print);

	}

}
class PrintDemo
{
	
	public static void print(Integer s) 
	{
		System.out.println(s);
	}
}
