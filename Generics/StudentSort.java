import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    @Override
    public String toString() {
        return name + "(" + age + ")";
    }
}

public class StudentSort {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", 22));
        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 23));

        // Sort by age
        students.sort(Comparator.comparingInt(s -> s.age));

        System.out.println(students);
    }
}
