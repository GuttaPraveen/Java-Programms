package streamapi;
import java.util.*;
public class StreamMapDemo1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(1, "Maha");
		map.put(2, "Praveen");
		map.put(3, "Software");
		map.put(4, "Developer");

		/*
		 * Normal way to loop a Map.Before Java 8
		 */
		for (Map.Entry<Integer, String> entry : map.entrySet())
		{
			System.out.println("key : " + entry.getKey() + ", value : "+ entry.getValue());
		}

		System.out.println("------------------------------------");

		/*
		 * In Java 8, we can loop a Map with forEach + lambda expression.
		 */
		map.forEach((k, v) -> System.out.println("key : " + k + " value : " + v));
		
		
		/*
		 * In Java 8, we can loop a Map with forEach + lambda
		 * expression+multiple statements.
		 */

		map.forEach((k, v) -> {
			System.out.println("key : " + k + " value : " + v);
			if ("Praveen".equals(v))
			{
				System.out.println("Hello Praveen");
			}
		});


	}

}
