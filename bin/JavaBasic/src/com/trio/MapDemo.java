package com.trio;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapDemo
{

	
	public static void main(String[] args)
	{
		
		List<Employee> employeeList = new ArrayList<>();

        // Adding sample data
        employeeList.add(new Employee("Alice", "Product Development", "Female"));
        employeeList.add(new Employee("Bob", "Product Development", "Male"));
        employeeList.add(new Employee("Charlie", "Product Development", "Male"));
        employeeList.add(new Employee("David", "Product Development", "Male"));
        employeeList.add(new Employee("Eve", "Product Development", "Male"));

        employeeList.add(new Employee("Frank", "Security And Transport", "Male"));
        employeeList.add(new Employee("Grace", "Security And Transport", "Male"));

        employeeList.add(new Employee("Hannah", "Sales And Marketing", "Female"));
        employeeList.add(new Employee("Ivy", "Sales And Marketing", "Female"));
        employeeList.add(new Employee("Jack", "Sales And Marketing", "Male"));
        employeeList.add(new Employee("Kevin", "Sales And Marketing", "Male"));

        employeeList.add(new Employee("Lily", "Infrastructure", "Female"));
        employeeList.add(new Employee("Mike", "Infrastructure", "Male"));
        employeeList.add(new Employee("Nancy", "Infrastructure", "Male"));

        employeeList.add(new Employee("Olivia", "HR", "Female"));
        employeeList.add(new Employee("Peter", "HR", "Female"));

        employeeList.add(new Employee("Quincy", "Account And Finance", "Male"));
        employeeList.add(new Employee("Rachel", "Account And Finance", "Female"));
        
        List<String> deptList=employeeList.stream()
        						.map(Employee::getDeptName)
        						.distinct()
        						.toList();
        System.out.println(deptList);
        
        System.out.println(); 
        Map<String,Long> genderList=employeeList.stream()
        								.collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(genderList);
        
        
        System.out.println();
        
        Map<String, Map<String, Long>> res=employeeList.stream()
        		.collect(Collectors.groupingBy(Employee::getDeptName,
        		Collectors.groupingBy(Employee::getGender,Collectors.counting())));
        System.out.println(res);
        
        

	}

}
class Employee
{
	private String deptName;
	private String gender;
	private String name;
	
	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(String name,String deptName, String gender)
	{
		super();
		this.deptName = deptName;
		this.gender = gender;
		this.name = name;
	}
	
}

/*
{Product Development={Female=1, Male=4},
Security And Transport={Male=2},
 Sales And Marketing={Female=1, Male=2},
 Infrastructure={Female=1, Male=2},
 HR={Female=2},
 Account And Finance={Female=1, Male=1}}


ProductDevelopment = {male=1},{Female=2}

Map<String,Map<String,Integer>>

*/

