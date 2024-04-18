package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterDemo2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Person> list=Arrays.asList(new Person(1,"Praveen",21),
						                new Person(2,"Maha",19),
						                new Person(3,"Rishi",10));
		List<Person> person =    list.stream() //convert list to stream
				.filter(p -> p.getName().startsWith("Praveen"))
				.collect(Collectors.toList()); //we want "Praveen" only
				
		System.out.println(person);

	}

}
class Person
{
	private int id;
	private String name;
	private int age;
	public Person(int id, String name, int age)
	{
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public String toString()
	{
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}