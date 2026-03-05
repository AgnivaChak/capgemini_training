package runtime_polymorphism;

public class PermanentEmployee extends Employee {

    double basicSalary;

    public PermanentEmployee(int id, String name, double basicSalary) {
        super(id, name);
        this.basicSalary = basicSalary;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Basic Salary: " + basicSalary);
    }

    @Override
    public double calculateSalary() {
        return basicSalary + (basicSalary * 0.20) + (basicSalary * 0.10);
    }
}
