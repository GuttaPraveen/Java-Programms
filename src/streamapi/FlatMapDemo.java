package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo
{
    public static void main(String[] args)
    {
        // Creating Employees
        Employee1 emp1 = new Employee1("John", "john@example.com");
        Employee1 emp2 = new Employee1("Alice", "alice@example.com");
        Employee1 emp3 = new Employee1("Bob", "bob@example.com");

        // Creating Departments
        Department dept1 = new Department("HR", Arrays.asList(emp1, emp2));
        Department dept2 = new Department("IT", Arrays.asList(emp3));

        // List of Departments
        List<Department> departments = Arrays.asList(dept1, dept2);

        // Using flatMap to get all emails from all departments
        List<String> allEmails = departments.stream()
                .flatMap(department -> department.getEmployees()
                .stream()) // flatMap to stream of employees
                .map(Employee1::getEmail) // map to stream of emails
                .collect(Collectors.toList());

        // Print all emails
        System.out.println("All Emails: " + allEmails);
    }
}
class Employee1 
{
    private String name;
    private String email;

    // Constructor, getters, and setters
    Employee1(String name, String email)
    {
        this.name = name;
        this.email = email;
    }

    String getEmail()
    {
        return email;
    }
}

class Department
{
    private String name;
    private List<Employee1> employees;

    // Constructor, getters, and setters
    Department(String name, List<Employee1> employees) 
    {
        this.name = name;
        this.employees = employees;
    }

    List<Employee1> getEmployees() 
    {
        return employees;
    }
}

