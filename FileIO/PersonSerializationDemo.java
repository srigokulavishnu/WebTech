import java.io.*;

public class PersonSerializationDemo {

    // Static nested Person class
    public static class Person implements Serializable {
        private static final long serialVersionUID = 1L;

        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person[name=" + name + ", age=" + age + "]";
        }
    }

    // Method to write a Person object to file
    public static void writePerson(Person person, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(person);
            System.out.println("Person object saved.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to read a Person object from file
    public static Person readPerson(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (Person) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        String filename = "person.dat";

        // Create and write a Person object
        Person person = new Person("Alice", 30);
        writePerson(person, filename);

        // Read and print the Person object
        Person readPerson = readPerson(filename);
        if (readPerson != null) {
            System.out.println("Read person: " + readPerson);
        }
    }
}
