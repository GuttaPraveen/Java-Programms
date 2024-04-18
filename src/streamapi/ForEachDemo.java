package streamapi;

import java.util.ArrayList;

public class ForEachDemo
{
	void display()
	{
		ArrayList<Integer> al=new ArrayList();
		al.add(5);
		al.add(15);
		al.add(25);
		al.add(35);
		al.add(45);
		al.add(55);
		al.forEach(x->System.out.println(x));
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		new ForEachDemo().display();
		
	}

}
