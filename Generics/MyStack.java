import java.util.ArrayList;

public class MyStack<T> {
    private ArrayList<T> list = new ArrayList<>();

    public void push(T item) {
        list.add(item);
    }

    public T pop() {
        if (list.isEmpty()) return null;
        return list.remove(list.size() - 1);
    }

    public T peek() {
        if (list.isEmpty()) return null;
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.peek());  // 20
        System.out.println(stack.pop());   // 20
        System.out.println(stack.isEmpty()); // false
    }
}
