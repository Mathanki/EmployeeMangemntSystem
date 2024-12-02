public class HourlyEmp  extends  Employee {

    private  int hoursWorked;
    public HourlyEmp() {
    }

    public HourlyEmp(String firstName, String lastName, String title, double payRate,int hoursWorked) {
        super(firstName, lastName, title, payRate);
        this.hoursWorked =hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return this.hoursWorked * super.getPayRate();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Hourly Salary rate: $" + super.getPayRate());
        System.out.println("Hourly Salary: $" + calculateSalary());
    }
}
