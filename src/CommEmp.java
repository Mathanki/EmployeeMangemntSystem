public class CommEmp extends  Employee {

    private double sales;

    private  int hoursWorked;

    private static final double COMMISSION_RATE = 0.01;

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
        double commission = this.calculateCommission(this.sales);
        return ( super.getPayRate() * this.hoursWorked ) + commission;
    }

    private double calculateCommission(double sales){
        double commission = 0;
        if(sales >= 1000){
            commission = sales * COMMISSION_RATE;
        }
        return commission;
    }

    @Override
    public void display() {
        super.display();
        if(sales >= 1000) {
            System.out.println("Commission on Sales: $" + calculateCommission(this.sales));
        } else{
            System.out.println("Commission not getting for sales when sales amount less than $ 1000");
        }

        System.out.println("Weekly Pay: $" + calculateSalary());
    }
}
