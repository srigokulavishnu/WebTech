import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Person implements Comparable<Person> {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + "(" + age + ")";
    }
}

public class PersonExample {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("John", 25));
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 20));

        // Sort by age using Comparable
        people.sort(null); // or Collections.sort(people);
        System.out.println("Sorted by age: " + people);

        // Filter persons older than 22
        List<Person> filtered = people.stream()
                                     .filter(p -> p.age > 22)
                                     .collect(Collectors.toList());

        System.out.println("Filtered (>22): " + filtered);
    }
}
