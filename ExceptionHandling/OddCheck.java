class OddNumberException extends Exception {
    public OddNumberException(String msg) {
        super(msg);
    }
}

public class OddCheck {
    static void checkEven(int num) throws OddNumberException {
        if (num % 2 != 0) {
            throw new OddNumberException("Number is odd: " + num);
        } else {
            System.out.println("Number is even: " + num);
        }
    }

    public static void main(String[] args) {
        try {
            checkEven(10);
            checkEven(7);
        } catch (OddNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
