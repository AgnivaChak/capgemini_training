package     com;
import java.util.*;
public class StudentMain {
	public static void main(String[] args) {
		List<Student> students = List.of(
				new Student("A", 69),
				new Student("B", 90),
				new Student("C", 23),
				new Student("D", 19)
				);
		
		List<Student> passed = students.stream()
								.filter(s -> s.marks > 60)
								.toList();
		System.out.println("Passed students count: "+passed.size());

	}

}


class Student{
	String name;
	int marks;
	
	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}