public class ScoreCheck {
    public static void main(String[] args) {
        
        int scores[] = {98, 73, 85, 65, 45 };

        for( int i = 0; i < scores.length; i++) {
            int score = scores[i];

        System.out.print("Score: " + score + " " + "= ");

        if ( score >= 90) {
            System.out.println("Excellent");
        }

        else if (score >= 75) {
            System.out.println("Good");
        }

        else if (score >= 50) {
            System.out.println("Average");
        }

        else {
            System.out.println("Fail");
        }
        }
    }
}
