import java.util.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " (" + age + ")";
    }
}

public class Person1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        sc.nextLine(); 

      
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            sc.nextLine(); 
            people.add(new Person(name, age));
        }

        System.out.println("Original List: " + people);

       
        System.out.print("Enter name to insert at first: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();
        people.add(0, new Person(name, age));
        System.out.println("After inserting: " + people);

   
        if (people.size() >= 5) {
            people.remove(4);
            System.out.println("After removing 5th element: " + people);
        }


        System.out.print("Enter index to retrieve person: ");
        int idx = sc.nextInt();
        if (idx >= 0 && idx < people.size()) {
            System.out.println("Person at " + idx + ": " + people.get(idx));
        }

        sc.nextLine();


        System.out.print("Enter index to update: ");
        int updIdx = sc.nextInt();
        sc.nextLine();
        if (updIdx >= 0 && updIdx < people.size()) {
            System.out.print("Enter new name: ");
            String newName = sc.nextLine();
            System.out.print("Enter new age: ");
            int newAge = sc.nextInt();
            sc.nextLine();
            people.set(updIdx, new Person(newName, newAge));
        }
        System.out.println("After update: " + people);

    
        System.out.print("Enter name to search: ");
        String searchName = sc.nextLine();
        boolean found = false;
        for (Person p : people) {
            if (p.name.equalsIgnoreCase(searchName)) {
                System.out.println("Found: " + p);
                found = true;
                break;
            }
        }
        if (!found) System.out.println(searchName + " not found.");

       
        System.out.println("Is empty? " + people.isEmpty());

      
        System.out.println("All persons:");
        for (int i = 0; i < people.size(); i++) {
            System.out.println("Index " + i + ": " + people.get(i));
        }

 
        if (people.size() >= 3) {
            System.out.println("Sublist (1 to 3): " + people.subList(1, 3));
        }

     
        System.out.println("Number of persons: " + people.size());
       
        Collections.sort(people, Comparator.comparingInt(p -> p.age));
        System.out.println("Sorted by age: " + people);

        Collections.shuffle(people);
        System.out.println("Shuffled: " + people);

        Collections.reverse(people);
        System.out.println("Reversed: " + people);

        sc.close();
    }
}
