package inheritance;

class Developer extends Employee {
    String technology;

    void showDeveloper() {
        System.out.println("Technology: " + technology);
    }

    public static void main(String[] args) {
        Developer d = new Developer();

        // Person properties
        d.name = "Agniva";
        d.age = 21;

        // Employee properties
        d.id = 101;
        d.salary = 50000;

        // Developer property
        d.technology = "Java";

        // Accessing all levels
        d.showPerson();
        d.showEmployee();
        d.showDeveloper();
    }
}
