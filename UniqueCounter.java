    import java.util.List;
    import java.util.HashSet;

    public class UniqueCounter {
        public static <T> int countUnique(List<T> list) {
            return new HashSet<>(list).size();
        }

        public static void main(String[] args) {
            List<String> list = List.of("apple", "banana", "apple", "orange", "banana");
            System.out.println("Unique elements: " + countUnique(list));
        }
    }
