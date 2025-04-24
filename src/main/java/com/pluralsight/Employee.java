import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Employee {
    public static void main(String[] args) throws FileNotFoundException {

        FileReader fileReader = new FileReader("employees.csv");
        BufferedReader bufReader = new BufferedReader(fileReader);
        System.out.println();
    }


    private int employeeID;
    private String name;
    private double hoursWorked;
    private float payRate;

    public Employee(int employeeID, String name, double hoursWorked, float payRate) {
        this.employeeID = employeeID;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public float getPayRate() {
        return payRate;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setPayRate(float payRate) {
        this.payRate = payRate;
    }
    public double getGrossPay() {
        return hoursWorked * payRate;
    }
}
