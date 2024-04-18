package abstraction;
import java.io.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class Payroll 
{
    private ArrayList<Employee> employeeList;
    private Employee currentUser; 
    private int currentID; 
    private String menu = "Payroll Menu\n\t1. Log In" +
            "\n\t2. Enter employees\n\t3. List Employees" +
            "\n\t4. Change employees" +
            "\n\t5. Terminate employees" +
            "\n\t6. Pay employees +\n\t0. Exit system";
    private Scanner keyboardScanner;
    private Scanner employeeFileScanner;
    private PrintWriter employeeFileWriter;
    
    public Payroll() 
    {
        employeeList = new ArrayList<>();
        Object currentEmployee = null;
        keyboardScanner = new Scanner(System.in);
        createBossRecord();
        logIn();
        
 }
    
    public void doMenu() {
        int choice;

        while (true) {
            System.out.println(menu);
            System.out.print("Enter your choice: ");
            choice = keyboardScanner.nextInt();

            switch (choice) {
                case 1:
                    logIn();
                    break;
                case 2:
                    enterEmployees();
                    break;
                case 3:
                    listEmployees();
                    break;
                case 4:
                    changeEmployeeData();
                    break;
                case 5:
                    terminateEmployees();
                    break;
                case 6:
                    payEmployees();
                    break;
                case 0:
                    exitSystem();
                    return; 
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }


    private void logIn()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your login name: ");
        String loginName = sc.nextLine();
   
        for (Employee employee : employeeList) 
        {
            if (employee.loginName.equals(loginName)) 
            {
                currentUser = employee;
                currentID = employee.employeeID;
                System.out.println("Login Successful. Welcome, " + currentUser.name + "!");
                return;
            }
        }

        System.out.println("User not found in the Employee collection.");
    }

    private void enterEmployees() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the employee's full name: ");
        String fullName = sc.nextLine();
        System.out.print("Enter the employee's login name: ");
        String loginName = sc.next();
        System.out.print("Enter the employee's salary: ");
        double salary = sc.nextDouble();
        Employee newEmployee = new Employee(loginName, salary, fullName);
        employeeList.add(newEmployee);

        System.out.println("Employee added successfully.");
        try(FileWriter fileWriter = new FileWriter("EmpDetails.txt",true);PrintWriter printWriter = new PrintWriter(fileWriter);) 
        {
        	printWriter.println(newEmployee);
        }
        catch(Exception e) 
        {
    	   e.getStackTrace();
        }

    }
    private void listEmployees()
    {
        
    	for (Employee employee : employeeList)
    	{
    		System.out.println("0000"+employee.employeeID+" "+employee.loginName+" "+employee.salary+" "+employee.entryDate+" "+employee.name);
    	}
    }

    private void changeEmployeeData() 
    {
       // not required in P4 Assignment we will use this for later assignments 
    }

    private void terminateEmployees()
    {
        // not required in P4 Assignment we will use this for later assignments 

    }

    private void payEmployees() 
    {
        // not required in P4 Assignment we will use this for later assignments 

    }
     private void exitSystem() {
        
        keyboardScanner.close();
        if (employeeFileScanner != null) {
            employeeFileScanner.close();
        }
        if (employeeFileWriter != null) {
            employeeFileWriter.close();
        }
        System.out.println("Exiting the system.");
    }
    
     private void createBossRecord(){
         
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter the Boss full name: ");
         String fullName = scanner.nextLine();
         System.out.print("Enter the Boss login name: ");
         String loginName = scanner.next();
         System.out.print("Enter the Boss salary: ");
         double salary = scanner.nextDouble();

      
         Employee newEmployee = new Employee(loginName, salary, fullName);
         employeeList.add(newEmployee);

         System.out.println("Boss added successfully.");
         try(FileWriter fileWriter = new FileWriter("EmpDetails.txt",true);PrintWriter printWriter = new PrintWriter(fileWriter);) 
         	{
         		  printWriter.println(newEmployee);
         	}
         catch(Exception e) {
     	      e.getStackTrace();
     	    }


 	}
    
    public static void main(String[] args) {
        System.out.println("Program 4: Files: An Employee Database");
        System.out.println("Lakshmi Reddy Bhavanam");
        Payroll payroll = new Payroll();
        payroll.doMenu();
    }
   
}