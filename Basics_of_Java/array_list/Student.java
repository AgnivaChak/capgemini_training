package array_list;

public class Student {

    int id;
    String name;
    double percentage;

    public Student(int id, String name, double percentage) {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
    }

    public boolean isPassed() {
        return percentage > 40;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + percentage;
    }
}
