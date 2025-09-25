import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(1);
        pq.add(10);
        pq.add(3);

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
        // Output: 1 3 5 10
    }
}
