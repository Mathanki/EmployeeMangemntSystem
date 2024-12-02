public class SalaryEmp extends  Employee {
    public SalaryEmp() {
    }

    public SalaryEmp(String firstName, String lastName, String title, double payRate) {
        super(firstName, lastName, title, payRate);
    }

    @Override
    public double calculateSalary() {
        return super.getPayRate()/24;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Annual Salary: $" + super.getPayRate());
        System.out.println("Bi-Monthly Salary: $" + calculateSalary());

    }
}
