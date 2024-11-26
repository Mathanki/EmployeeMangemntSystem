//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       Employee emp1 = new Employee("Sandy","Karne","SE",15.00);

        Employee emp2 = new Employee("John","Tommy","ASE",14.00);
        Employee emp3 = new Employee("John","Tommy","ASE",14.00);
        double weeklySalEmp1 = emp1.calculateWeeklySalary();
        System.out.println("Emp1 weekly salary: " + weeklySalEmp1);

        System.out.println("Check toString: " + emp1);

        System.out.println("Check not equal : " + emp1.equals(emp2));
        System.out.println("Check equal : " + emp2.equals(emp3));
        System.out.println("Check emp2 objects hashcode: " + emp2.hashCode());
        System.out.println("Check emp3 objects hashcode: " + emp3.hashCode());
        System.out.println("Check emp1 objects hashcode: " + emp1.hashCode());


    }
}