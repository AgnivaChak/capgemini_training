package inheritance;

class Employee extends Person {
    int id;
    double salary;

    void showEmployee() {
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}
