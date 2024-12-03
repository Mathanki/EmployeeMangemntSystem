public class CommEmp extends  Employee {

    private double sales;

    private  int hoursWorked;

    private final double COMMISSION_RATE = 0.01;

    public CommEmp() {
    }

    public CommEmp(String firstName, String lastName, String title, double payRate,double sales, int hoursWorked) {
        super(firstName, lastName, title, payRate);
        this.sales = sales;
        this.hoursWorked =hoursWorked;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        double commission = 0;
        if(sales >= 1000){
             commission = sales * COMMISSION_RATE;
        }
        return ( super.getPayRate() * this.hoursWorked ) + commission;
    }

    @Override
    public void display() {
        super.display();
        if(sales >= 1000) {
            System.out.println("Commission on Sales: $" + (sales * 0.1));
        } else{
            System.out.println("Commission not getting for sales");
        }

        System.out.println("Weekly Pay: $" + calculateSalary());
    }
}
