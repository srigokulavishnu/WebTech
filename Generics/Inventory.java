import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private HashMap<String, Integer> inventory = new HashMap<>();

    public void addItem(String product, int quantity) {
        inventory.put(product, inventory.getOrDefault(product, 0) + quantity);
    }

    public void updateQuantity(String product, int quantity) {
        if (inventory.containsKey(product)) {
            inventory.put(product, quantity);
        } else {
            System.out.println(product + " not found in inventory.");
        }
    }

    public void displayInventory() {
        System.out.println("Current Inventory:");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Inventory inv = new Inventory();
        inv.addItem("Apples", 20);
        inv.addItem("Oranges", 15);
        inv.displayInventory();

        inv.updateQuantity("Apples", 25);
        inv.displayInventory();

        inv.updateQuantity("Bananas", 10);
    }
}
