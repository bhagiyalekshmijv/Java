public class DailySales {
  public static void main(String[] args) {
    
    int [][] sales = {
        {100, 90, 70},
        {80, 70, 50},
        {120, 100, 70},
        {90, 80, 60},
        {110, 60, 40}
    };

    int products = 3;
    int days = 5;

    for (int i = 0; i < products; i++) {

        int total = 0;

        for (int j = 0; j < days; j++) {
            total += sales[j][i];
        }

        System.out.println("Product " + (i + 1) + " Total Sales: " + total);

        if (total >= 500) {
            System.out.println("Target Achieved");
        }

        else if (total >= 300) {
            System.out.println("Average Performance");
        }

        else {
            System.out.println("Needs Improvement");
        }

        System.out.println();
    }
  }  
}
