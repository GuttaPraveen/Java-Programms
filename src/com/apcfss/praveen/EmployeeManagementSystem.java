package com.apcfss.praveen;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeManagementSystem
{
	private static List<Employee> employees = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    private static String firstName;
    private static String lastName;
    private static int empId;
    private static double salary;
    private static String gender;
    private static String district;
    public static void main(String[] args) 
	{
			//TODO Auto-generated method stub
	    	while (true)
	    	{
	    		printMenu();
	    		int choice = sc.nextInt();
	    		sc.nextLine(); 
	    		switch (choice)
	    		{
                	case 1:
                		addEmployee();
                		break;
                	case 2:
                		deleteEmployee();
                		break;
                	case 3:
                		updateEmployee();
                		break;
                	case 4:
                		searchEmployee();
                		break;
                	case 5:
                		listAllEmployees();
                		break;
                	case 6:
                		showStatistics();
                		break;
                	case 7:
                		System.out.println("Exiting the program. Goodbye!");
                		System.exit(0);
                		break;
                	default:
                		System.out.println("Invalid choice. Please try again.");
	    		}
	    	}
    	}
		private static void printMenu()
		{
			System.out.println("\nEmployee Menu:");
			System.out.println("1. Add Employee Details");
			System.out.println("2. Delete Employee Details");
			System.out.println("3. Update Employee Details");
			System.out.println("4. Search Employee");
			System.out.println("5. List All Employees");
			System.out.println("6. Statistics \n\ta. district wise\n\tb. gender\n\tc. salary ");
			System.out.println("7. Exit");
			System.out.print("Enter your choice: ");
		}
		private  static void addEmployee()
		{
			// Implement code to add employee details here
			System.out.println("Enter Your firstName: ");
			firstName=sc.next();
			System.out.println("Enter Your lasttName:");
			lastName=sc.next();
			System.out.println("Enter Your Id:");
			empId=sc.nextInt();
			System.out.println("Enter Your Salary:");
			salary=sc.nextDouble();
			System.out.println("Enter Your Gender:");
			gender=sc.next();
			System.out.println("Enter Your District:");
			district=sc.next();
			employees.addAll(Stream.of(new Employee(firstName,lastName,empId,salary,gender,district)).collect(Collectors.toList()));
		}
		private static void deleteEmployee()
		{
			// Implement code to delete employee details here
			System.out.println("Please Enter EmpId:");
			int id=sc.nextInt();
			Predicate<Employee> p=empid->empid.getEmpId()==id;
			Optional<Employee> delEmp=employees.stream().filter(p).findFirst();
			if(delEmp!=null)
			{
				employees.remove(delEmp.get());
				System.out.println("Deleted Successfully");
			}
			else
			{
				System.out.println("Employee Not Avaliable");
			}
					
		}
		private static void updateEmployee()
		{
			// Implement code to update employee details here
			System.out.println("Please Enter EmpId:");
			int id=sc.nextInt();
			Predicate<Employee> p=empid->empid.getEmpId()==id;
			List<Employee> updateEmp=employees.stream().filter(p).collect(Collectors.toList());
			if(updateEmp!=null)
			{
				System.out.println(updateEmp);
				System.out.println("willing to change firstName:");
				String f=sc.next();
				if(f.equalsIgnoreCase("yes"))
				{
					System.out.println("Enter firstName:");
					firstName=sc.next();
				}
				System.out.println("willing to change lasttName:");
				String l=sc.next();
				if(l.equalsIgnoreCase("yes"))
				{
					System.out.println("Enter lastName:");
					lastName=sc.next();
				}
				System.out.println("willing to change EmpId:");
				String i=sc.next();
				if(l.equalsIgnoreCase("yes"))
				{
					System.out.println("Enter EmpId:");
					empId=sc.nextInt();
				}
				System.out.println("willing to change Salary:");
				String s=sc.next();
				if(s.equalsIgnoreCase("yes"))
				{
					System.out.println("Enter Salary:");
					salary=sc.nextInt();
				}
				System.out.println("willing to change geneder:");
				String g=sc.next();
				if(g.equalsIgnoreCase("yes"))
				{
					System.out.println("Enter Gender:");
					gender=sc.next();
				}
				System.out.println("willing to change District:");
				String d=sc.next();
				if(d.equalsIgnoreCase("yes"))
				{
					System.out.println("Enter District:");
					district=sc.next();
				}
				//employees.addAll(Stream.of(new Employee(firstName,lastName,empId,salary,gender,district)).collect(Collectors.toList()));
				Optional<Employee> delEmp=employees.stream().filter(p).findFirst();
				if(delEmp.isPresent())
				{
					employees.remove(delEmp.get());
					employees.addAll(Stream.of(new Employee(firstName,lastName,empId,salary,gender,district)).collect(Collectors.toList()));
				}
				System.out.println("Update successfully");
			}
			else
			{
				System.out.println("Employee Not Found");
			}
		}
		private static void searchEmployee()
		{
			// Implement code to search employee details here
			System.out.println("search by 1.name Or 2.EmpId");
			int k=sc.nextInt();
			if(k==1)
			{
				System.out.println("Please Enter name: ");
				String name=sc.next();
				Predicate<Employee> p=s->s.getFirstName().equals(name);
				List<Employee> emp=(List)employees.stream().filter(p).collect(Collectors.toList());
				if(emp!=null)
					System.out.println(emp);
				else
					System.out.println("Employee Not Avaliable");
			}
			else
			{
				System.out.println("Please Enter EmpId:");
				int id=sc.nextInt();
				Predicate<Employee> p=empid->empid.getEmpId()==id;
				List<Employee> emp=(List)employees.stream().filter(p).collect(Collectors.toList());
				if(emp!=null)
					System.out.println(emp);
				else
					System.out.println("Employee Not Avaliable");
				
				
			}
		}
		private static void listAllEmployees() 
		{
			// Implement code to list all employees here
			System.out.println(employees);
		}
		private static void showStatistics() 
		{
			// Implement code to show statistics here
			System.out.println("Enter a. district wise \nb. gender\r\nc. salary  ");
			char op=sc.next().charAt(0);
			switch(op)
			{
			 	case'a':
			 		System.out.println("district wise data:");
			 		Function<Employee,String> f=d->d.getDistrict();
			 		Map<String,Long> distCount=employees.stream().map(f).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
			 		System.out.println(distCount);
			 		break;
			 	case'b':
			 		System.out.println("Gender wise data:");
			 		Function<Employee,String> gen=g->g.getGender();
			 		Map<String,Long> genderCount=employees.stream().map(gen).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
			 		System.out.println(genderCount);
			 		break;
			 	case'c':
			 		System.out.println("Salary wise data:");
			 		Function<Employee,Double> sal=p->p.getSalary();
			 		Map<Double, List<String>> emp=employees.stream().collect(Collectors.groupingBy(sal,Collectors.mapping(Employee::getFirstName,Collectors.toList())));
			 		//System.out.println(salaryCount);
			 		break;
			 		default:
			 			break;
			 		
			}
			
		}

}


