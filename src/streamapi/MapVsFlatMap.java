package streamapi;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapVsFlatMap 
{
    // mock sample response
    public static List<Student> getAll() 
    {
        return Stream.of(new Student(101, "john", "john@gmail.com", Arrays.asList("011727277", "010129912")),
                new Student(102, "smith", "smith@gmail.com", Arrays.asList("09328328", "1211212122")),
                new Student(103, "peter", "peter@gmail.com", Arrays.asList("09129129", "212121212")),
                new Student(104, "kely", "kely@gmail.com", Arrays.asList("0818128128", "9191020120"))
        ).collect(Collectors.toList());
    }

    public static void main(String args[])
    {

        //map - transformation

        List<String> emails = getAll().stream()
                .map(Student::getEmail)
                .collect(Collectors.toList());

        System.out.println(emails);

        //flatmap - transformation and flattering

        List<String> phoneNos =  getAll().stream()
               .flatMap(user ->  user.getPhoneNos().stream())
                .collect(Collectors.toList());


        System.out.println(phoneNos);

        // output - map + flatten - [011727277, 010129912, 09328328, 1211212122, 09129129, 212121212, 0818128128, 9191020120]
        // if use map - output - [ [011727277, 010129912], [09328328, 1211212122], [09129129, 212121212], [0818128128, 9191020120] ]


    }
}
class Student
{
	
	
	private int Id;
	private String name;
	private String email;
	private List<String>phoneNumbers;
	public Student(int id, String name, String email, List<String> phoneNumbers) {
		super();
		Id = id;
		this.name = name;
		this.email = email;
		this.phoneNumbers = phoneNumbers;
	}
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getPhoneNos() {
		return phoneNumbers;
	}

	public void setPhoneNos(List<String> phoneNos) {
		this.phoneNumbers = phoneNos;
	}

	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", email=" + email + ", phoneNos=" + phoneNumbers + "]";
	}
	
	
}