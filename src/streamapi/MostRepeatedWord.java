package streamapi;

import java.util.List;
import java.util.Map;
import java.util.Map;
import java.util.stream.Collectors;

public class MostRepeatedWord 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<String> list=List.of("java","oracle","spring","java","microservices","java","spring","python");
		Map.Entry<String,Long> mostRepeatedWord=list.stream().collect(Collectors.groupingBy(w->w,Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get();
		System.out.println(mostRepeatedWord.getKey()+" "+mostRepeatedWord.getValue());
	}

}
