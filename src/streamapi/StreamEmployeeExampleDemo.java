package streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalLong;
import java.util.stream.Collectors;

public class StreamEmployeeExampleDemo
{
	public static void main(String[] args) 
	{

		 ArrayList<EmployeeDemo> employees = new ArrayList<>();
		 employees.add(new EmployeeDemo(1240,"Praveen",23000));
		 employees.add(new EmployeeDemo(1318,"Maha",190000));
		 employees.add(new EmployeeDemo(1520,"Ram",200000));
		 employees.add(new EmployeeDemo(1220,"Rishi",240000));
		 employees.add(new EmployeeDemo(1329,"Naveen",220000));
		 
		 //Print the employee data using the stream
		 employees.stream().forEach(System.out::println);
		 
		 //Print the employee data by sorting employee salaries in descending order.
		 List<EmployeeDemo> empList=employees.stream().sorted(Comparator.comparing(EmployeeDemo::getEmpSalary).reversed()).collect(Collectors.toList());
		 System.out.println(empList);
		 
		 //Filter the employee names starting with ‘R’
		 employees.stream().filter(e->e.getEmpName().startsWith("R")).collect(Collectors.toList()).forEach(System.out::println);
		 
		 //Add 10000 to each employee’s salary and print
		 List<Long> salary =employees.stream().map(e->e.getEmpSalary()+10000).collect(Collectors.toList());
		 salary.forEach(System.out::println);
		 
		 //Return the employee object having max salary
		 OptionalLong opt=employees.stream().mapToLong(e->e.getEmpSalary()).max();
		 if(opt.isPresent())
			 System.out.println("Maximum Salary:"+opt.getAsLong());
	}
}
class EmployeeDemo 
{
    int empId;
    String empName;
    long empSalary;

    public EmployeeDemo(int empId, String empName, long empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public long getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(long empSalary) {
        this.empSalary = empSalary;
    }
    @Override
    public String toString() 
    {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }
}
