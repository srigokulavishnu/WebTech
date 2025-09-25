public class GenericUtils {
    public static <T extends Comparable<T>> T findMaxInArray(T[] array) {
        if (array == null || array.length == 0) {
            return null; // or throw exception
        }
        T max = array[0];
        for (T elem : array) {
            if (elem.compareTo(max) > 0) {
                max = elem;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 5, 3, 9, 2};
        String[] strArray = {"apple", "orange", "banana"};

        System.out.println("Max Integer: " + findMaxInArray(intArray));
        System.out.println("Max String: " + findMaxInArray(strArray));
    }
}
