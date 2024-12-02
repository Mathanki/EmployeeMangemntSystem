import java.util.Objects;
import java.util.Scanner;

public class  Employee {
    private String firstName;

    private String LastName;

    private String title;

    private double payRate;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String title, double payRate) {
        this.firstName = firstName;
        LastName = lastName;
        this.title = title;
        this.payRate = payRate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double calculateSalary(){
        return 0.0;
    };


    public void display(){
        System.out.println("Employee: " + this.firstName + " "+ this.LastName+ "," + "Title: " +  this.title);
    };

    public void inputEmployee() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employee type (salaried/hourly): ");
        String type = scanner.nextLine();

        if (type.equalsIgnoreCase("salaried")) {
            getEmployeeData(scanner);
            System.out.println("Enter annual salary:  ");
            this.payRate = scanner.nextDouble();
            // Create a SalaryEmp object with the input data
            SalaryEmp salaryEmp = new SalaryEmp( this.firstName,   this.LastName, this.title, this.payRate);
            salaryEmp.calculateSalary();
            System.out.println();
            salaryEmp.display();
        } else if (type.equalsIgnoreCase("hourly")) {
            getEmployeeData(scanner);
            System.out.println("Enter hourly rate:  ");
            this.payRate = scanner.nextDouble();
            System.out.println("Enter hours worked:  ");
            int hoursWorked  = scanner.nextInt();
            // Create an HourlyEmp object with the input data
            HourlyEmp hourlyEmp = new HourlyEmp( this.firstName,   this.LastName, this.title, this.payRate, hoursWorked);
            hourlyEmp.calculateSalary();
            System.out.println();
            hourlyEmp.display();
        } else {
            System.out.println("Invalid employee type.");
        }
    }

    private void getEmployeeData( Scanner scanner){
        System.out.println("Enter first name :  ");
        this.firstName = scanner.nextLine();

        System.out.println("Enter last name :  ");
        this.LastName = scanner.nextLine();

        System.out.println("Enter title :  ");
        this.title = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", title='" + title + '\'' +
                ", payRate=" + payRate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(LastName, employee.LastName) && Objects.equals(title, employee.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, LastName, title);
    }
}
