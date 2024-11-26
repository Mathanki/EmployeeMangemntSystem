import java.util.Objects;

public class Employee {
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

    public double calculateWeeklySalary(){
        return this.payRate * 40;
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
