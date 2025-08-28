import java.util.Scanner;

public class ArrayIndexExample {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter index (0-9): ");
        try {
            int index = sc.nextInt();
            System.out.println("Element at index " + index + " = " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        }
    }
}
