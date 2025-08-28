import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }

        System.out.println("Original List: " + list);

        // Insert at first position
        System.out.print("Enter a string to insert at first position: ");
        String firstElement = sc.nextLine();
        list.add(0, firstElement);
        System.out.println("After inserting at first position: " + list);

        // Remove 5th element (index 4)
        if (list.size() >= 5) {
            list.remove(4);
            System.out.println("After removing 5th element: " + list);
        }

        // Retrieve element at a given index
        System.out.print("Enter index to retrieve element: ");
        int idx = sc.nextInt();
        if (idx >= 0 && idx < list.size()) {
            System.out.println("Element at index " + idx + ": " + list.get(idx));
        }

        sc.nextLine(); // consume newline

        // Update element at a given index
        System.out.print("Enter index to update: ");
        int updIdx = sc.nextInt();
        sc.nextLine();
        if (updIdx >= 0 && updIdx < list.size()) {
            System.out.print("Enter new string: ");
            String newVal = sc.nextLine();
            list.set(updIdx, newVal);
        }
        System.out.println("After update: " + list);

        // Search an element
        System.out.print("Enter string to search: ");
        String search = sc.nextLine();
        if (list.contains(search)) {
            System.out.println(search + " found at index " + list.indexOf(search));
        } else {
            System.out.println(search + " not found.");
        }

        // Test empty
        System.out.println("Is list empty? " + list.isEmpty());

        // Print all using index
        System.out.println("All elements with position:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index " + i + ": " + list.get(i));
        }

        // Extract portion
        if (list.size() >= 3) {
            System.out.println("Sublist (1 to 3): " + list.subList(1, 3));
        }

        // Number of elements
        System.out.println("Number of elements: " + list.size());

        // Collections operations
        Collections.sort(list);
        System.out.println("Sorted: " + list);

        Collections.shuffle(list);
        System.out.println("Shuffled: " + list);

        Collections.reverse(list);
        System.out.println("Reversed: " + list);

        sc.close();
    }
}
