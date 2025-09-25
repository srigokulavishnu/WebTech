import java.util.HashMap;
import java.util.Map;

public class ProductInventory {
    public static void main(String[] args) {
        HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("Apples", 15);
        inventory.put("Oranges", 8);
        inventory.put("Bananas", 20);

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            if (entry.getValue() > 10) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
