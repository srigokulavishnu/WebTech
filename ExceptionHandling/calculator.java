import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            double a = Double.parseDouble(sc.nextLine());

            System.out.print("Enter operator (+,-,*,/): ");
            char op = sc.nextLine().charAt(0);

            System.out.print("Enter second number: ");
            double b = Double.parseDouble(sc.nextLine());

            double result = 0;
            switch (op) {
                case '+': result = a + b; break;
                case '-': result = a - b; break;
                case '*': result = a * b; break;
                case '/': result = a / b; break;
                default: System.out.println("Invalid operator"); return;
            }
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Non-numeric operand entered. Exiting program.");
        }
    }
}
