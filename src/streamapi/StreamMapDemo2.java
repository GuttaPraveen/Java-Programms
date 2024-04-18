package streamapi;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class StreamMapDemo2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(1, "Maha");
		map.put(2, "Praveen");
		map.put(3, "Software");
		map.put(4, "Developer");
		
		/*
		 * sorted() : It returns a stream sorted with given
		 * Comparator.
		 */
		map.entrySet().stream()
		.sorted(Comparator.comparing(Map.Entry::getValue))
		.forEach(e->System.out.println("Key: "+e.getKey() +" "+"Value: "+e.getValue()));
		

	}

}
