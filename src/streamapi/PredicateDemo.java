package streamapi;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Predicate<Integer> even=i->i%2==0;
		System.out.println(even.test(20));
		Predicate<Integer> greaterThanTen=i->i>10;
		Predicate<Integer> res=even.and(greaterThanTen);
		System.out.println(greaterThanTen.test(30));
		Predicate<String> p=s->s.length()>3;
		System.out.println(p.test("Praveen"));
		Predicate<Collection> p1=c->c.isEmpty();
		List list=new ArrayList();
		list.add("Praveen");
		System.out.println(p1.test(list));
		
		
	}

}
