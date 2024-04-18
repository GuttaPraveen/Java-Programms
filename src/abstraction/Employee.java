package abstraction;
import java.text.SimpleDateFormat;
import java.util.Date;

class Employee 
{
    String loginName;
    double salary;
    String name;
    Date entryDate;
    final int employeeID;
    static int nextId = 1;

    public Employee(String loginName, double salary, String name) {
        this.loginName = loginName;
        this.salary = salary;
        this.name = name;
        this.entryDate = new Date();
        this.employeeID = generateEmployeeID();
    }

    private int generateEmployeeID() {
        int generatedID = nextId;
        nextId++;
        return generatedID;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(entryDate);
        return String.format("%05d\t%s\t%.2f\t%s\t%s", employeeID, loginName, salary, formattedDate, name);
    }
    
}