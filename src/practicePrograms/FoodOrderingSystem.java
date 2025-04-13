package practicePrograms;

import java.util.*;

public class FoodOrderingSystem {
    public static void main(String[] args) {
        // Menu items
        HashMap<Integer, String> menu = new HashMap<>();
        menu.put(1, "Masala Dosa");
        menu.put(2, "Plain Dosa");
        menu.put(3, "Uttapam");
        menu.put(4, "Idli");
        menu.put(5, "Vada");

        // Map to store item name and its total quantity
        Map<String, Integer> orderSummary = new LinkedHashMap<>();

        Scanner scanner = new Scanner(System.in);
        char continueOrdering;

        System.out.println("🍽️ Welcome to South Indian Delight!");

        do {
            // Show menu
            System.out.println("\nHere is the menu:");
            for (Map.Entry<Integer, String> entry : menu.entrySet()) {
                System.out.println(entry.getKey() + ". " + entry.getValue());
            }

            // Ask for item choice
            System.out.print("\nEnter the number of your choice: ");
            int choice = scanner.nextInt();

            if (menu.containsKey(choice)) {
                String item = menu.get(choice);

                // Ask for quantity
                System.out.print("Enter quantity for " + item + ": ");
                int quantity = scanner.nextInt();

                if (quantity <= 0) {
                    System.out.println("❌ Quantity cannot be zero or negative. Please enter a valid quantity.");
                } else {
                    // Update quantity if item already exists in the order
                    orderSummary.put(item, orderSummary.getOrDefault(item, 0) + quantity);
                    System.out.println("✅ " + quantity + " x " + item + " added to your order.");
                }

            } else {
                System.out.println("❌ Invalid choice! Please select a valid item number.");
            }

            // Ask if the user wants to continue ordering
            System.out.print("\nDo you want to add more items to your order? (y/n): ");
            continueOrdering = scanner.next().charAt(0);

        } while (continueOrdering == 'y' || continueOrdering == 'Y');

        // Print final summary
        System.out.println("\n🧾 Your final order summary:");
        int serial = 1;
        for (Map.Entry<String, Integer> entry : orderSummary.entrySet()) {
            System.out.println(serial++ + ". " + entry.getKey() + (entry.getValue() > 1 ? " - " + entry.getValue() : ""));
        }

        System.out.println("\n🙏 Thank you for ordering with us!");
        scanner.close();
    }
}
