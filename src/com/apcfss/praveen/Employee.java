package com.apcfss.praveen;

public class Employee
{
	private String firstName;
    private String lastName;
    private int empId;
    private double salary;
    private String gender;
    private String district;
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public int getEmpId()
	{
		return empId;
	}
	public void setEmpId(int empId)
	{
		this.empId = empId;
	}
	public double getSalary() 
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	public String getGender() 
	{
		return gender;
	}
	public void setGender(String gender) 
	{
		this.gender = gender;
	}
	public String getDistrict()
	{
		return district;
	}
	public void setDistrict(String district)
	{
		this.district = district;
	}
	public Employee(String firstName, String lastName, int empId, double salary, String gender, String district)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.empId = empId;
		this.salary = salary;
		this.gender = gender;
		this.district = district;
	}
	@Override
	public String toString()
	{
		return "[firstName=" + firstName + ", lastName=" + lastName + ", empId=" + empId + ", salary=" + salary
				+ ", gender=" + gender + ", district=" + district + "]";
	}
	
	
    
}
