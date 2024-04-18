package streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionStreamDemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/*List<String> list=new ArrayList<>();
		list.add("ANT");
		list.add("BAT");
		list.add("CAT");
		list.add("DOG");
		list.add("CAT");
		list.add("BAT");
		list.add(null);
		//remove null values using filter()
		list.stream().filter(x->x!=null).forEach(
				(x)->
				{
					System.out.print(x+" ");
				});
		System.out.println();
		//remove duplicate values
		list.stream().distinct().forEach(
				(x)->
				{
					System.out.print(x+" ");
				});
		System.out.println();
		//remove duplicate values and null values
		list.stream().distinct().filter(x->x!=null).forEach(
				(x)->
				{
					System.out.print(x+" ");
				});
		System.out.println();
		//sort data
		list.stream().distinct().filter(x->x!=null).sorted().forEach(
				(x)->
				{
					System.out.print(x+" ");
				});
		System.out.println();
		//to convert objects lowercase using map()
		list.stream().distinct().filter(x->x!=null).map(y->y.toLowerCase()).sorted().forEach(
				(x)->
				{
					System.out.print(x+" ");
				});
		System.out.println();
		//limit() will take size as i/p
		//limit(2) -> return 2 values
		list.stream().limit(3).forEach(
				(x)->
				{
					System.out.print(x+" ");
				});
		//skip() will take size as i/p
		//skip(2) -> skip first 2 elements
		System.out.println();
		list.stream().skip(3).forEach(
				(x)->
				{
					System.out.print(x+" ");
				});
		System.out.println();
		//skip() and limit()
		list.stream().skip(3).limit(2).forEach(
				(x)->
				{
					System.out.print(x+" ");
				});
				*/
		/*List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		//terminal operations
		//reduce ->reduce data into single element
		Optional<Integer> reduce=list.stream().reduce((a,b)->a+b);
		System.out.println(reduce.get());
		//count() ->return number of elements
		long count=list.stream().count();
		System.out.println(count);
		//forEach() -> will take consumer as i/p , process one by one element and finally displayed end-user
		list.stream().forEach(
				(x)->
				{
					System.out.print(x+" ");
				});
		System.out.println();
		//toArray() -> to convert stream to array
		Object o[]=list.stream().toArray();
		for(Object obj:o)
		{
			System.out.print(obj+" ");
		}
		System.out.println();
		//max() ->
		Optional<Integer> max=list.stream().max((v1,v2)->v1.compareTo(v2));
		System.out.print("max:"+max.get());
		//collect() -> to convert stream into List,Set,Map
		System.out.println();
		List<Integer> collect=list.stream().distinct().collect(Collectors.toList());
		System.out.print(collect);
		System.out.println();
		//findfirst(),findAny(),allMatch(),anyMatch()
		//findfirst() -> return first occurrence from given stream
		Optional<Integer> findFirst=list.stream().findFirst();
		System.out.println(findFirst.get());
		//findAny() -> return any element
		Optional<Integer> findAny=list.stream().findAny();
		System.out.println(findAny.get());
		
		 //anyMatch(),allMatch() and NoneMatch()
		                 : will take predicate as i/p
		                 return true if any element satisfy otherwise false
		 
		 
		 
		 */
		List<String> list1=new ArrayList<>();
		list1.add("We");
		list1.add("are");
		list1.add("going");
		list1.add("to");
		list1.add("conduct");
		list1.add("workshop");
		list1.add("On Stream API");
		//anyMatch()
		boolean b=list1.stream().anyMatch(x->x.startsWith("w"));
		System.out.println(b);
		//allMatch()
		boolean b1=list1.stream().allMatch(x->x.startsWith("w"));
		System.out.println(b1);
		boolean b2=list1.stream().noneMatch(x->x.startsWith("p"));
		System.out.println(b2);
		Map<Integer,String> map=new HashMap();
		map.put(2, "Praveen");
		map.put(1, "Siva");
		map.put(3,"Rajesh");
		map.put(4, "Sai");
		//keySet()->return keys
		map.keySet().stream().forEach(
				(x)->
				{
					System.out.print(x+" ");
				});
		System.out.println();
		//values() -> return values
		map.values().stream().forEach(
				(x)->
				{
					System.out.print(x+" ");
				});
		System.out.println();
		//both keys and values
		map.entrySet().stream().forEach(
				(x)->
				{
					System.out.print(x+" ");
				});
		System.out.println();
		//sort data based on keys in descending order
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Collections.reverseOrder())).forEach(
				(x)->
				{
					System.out.print(x+" ");
				});
		System.out.println();
		//sort the data based values in ascending order
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(
				(x)->
				{
					System.out.print(x+" ");
				});
		System.out.println();
		//sort the data based values in decending order
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder())).forEach(
				(x)->
				{
					System.out.print(x+" ");
				});
		System.out.println();
		//Map to List based on key
		List<Integer> keyset=map.keySet().stream().collect(Collectors.toList());
		System.out.println(keyset);
		//Map to List based on values
				List<String> values=map.values().stream().collect(Collectors.toList());
				System.out.println(values);
		

	}

}
