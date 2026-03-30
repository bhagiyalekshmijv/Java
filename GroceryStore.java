import java.util.Scanner;
import java.time.LocalDateTime;

public class GroceryStore {
    
    public static double calculateTotal(int[] prices, int[] qty) {
        double total = 0;

        for (int i = 0; i < prices.length; i++) {
            total += prices[i] * qty[i];
        }

        if (total > 500) {
            System.out.println("10% Discount Applied!");
            total = total - (total * 0.10);
        }

        return total;
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String[] items = {"Rice", "Sugar", "Oil", "Soap", "Milk"};
        int[] prices = {50, 40, 100, 25, 30};
        int[] qty = new int[5];

        System.out.println("Available Items:");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - Rs." + prices[i]);
        }

        try {
            for (int i =0; i < items.length; i++) {
                System.out.println("Enter quantity for " + items[i] + ": ");
                qty[i] = input.nextInt();
            }

            double finalAmount = calculateTotal(prices, qty);

            System.out.println("Total Amount: Rs." + finalAmount);

            System.out.println("Purchase Time: " + LocalDateTime.now());
        }
        catch (Exception e) {
            System.out.println("Invalid input! Please enter numbers only.");
        }

        input.close();
    }
}
