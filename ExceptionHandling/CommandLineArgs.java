package ExceptionHandling;



class CheckArgument extends Exception {
    public CheckArgument(String msg) {
        super(msg);
    }
}

public class CommandLineArgs {
    public static void main(String[] args) {
        try {
            if (args.length < 5) {
                throw new CheckArgument("Less than 5 arguments passed!");
            } else {
                int sum = 0;
                for (int i = 0; i < 5; i++) {
                    sum += Integer.parseInt(args[i]);
                }
                System.out.println("Sum of first 5 arguments = " + sum);
            }
        } catch (CheckArgument e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
