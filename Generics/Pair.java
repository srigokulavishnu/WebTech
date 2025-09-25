public class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Alice", 30);
        Pair<Double, String> pair2 = new Pair<>(3.14, "Pi");

        System.out.println(pair1.getFirst() + " - " + pair1.getSecond());
        System.out.println(pair2.getFirst() + " - " + pair2.getSecond());
    }
}
