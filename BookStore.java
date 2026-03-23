public class BookStore {
    public static void main(String[] args) {
         int numOfBooks = 3;
         int pricePerBook = 275;
         int discountPercent = 10;

         double totalAmount = pricePerBook * numOfBooks;

         double discount = discountPercent;

         double discountAmount = totalAmount * (discount / 100);

         double finalAmount = totalAmount - discountAmount;

         System.out.println("Number of Books: " + numOfBooks);
         System.out.println("Price per Book: " + pricePerBook);
         System.out.println("Total Amount: " + totalAmount);
         System.out.println("Discount (%): " + discount);
         System.out.println("Discount Amount: " + discountAmount);
         System.out.println("Final Amount: " + finalAmount);

    }
}
