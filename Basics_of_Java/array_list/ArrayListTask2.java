package array_list;

import java.util.ArrayList;

public class ArrayListTask2 {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student(1, "Ravi", 80.0));
        students.add(new Student(2, "Pratik", 60.0));
        students.add(new Student(3, "Ram", 30.0));
        students.add(new Student(4, "Sham", 10.0));
        students.add(new Student(5, "Sham", 65.0));

        ArrayList<Student> passedStudents = filterPassedStudents(students);

        System.out.println(passedStudents);
    }

    // filtering using for-each
    public static ArrayList<Student> filterPassedStudents(
            ArrayList<Student> students) {

        ArrayList<Student> temp = new ArrayList<Student>();

        for (Student s : students) {
            if (s.isPassed()) {
                temp.add(s);
            }
        }

        return temp;
    }
}
