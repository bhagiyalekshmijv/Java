import java.util.regex.*;

public class PhoneNumberExtractor {
    public static void main(String[] args) {
        
        String message = "Contact us at 9517538525 or office number 8975524133. Invaild: 1234";

        findPhoneNumbers(message);
    }

    @SuppressWarnings("unchecked")
    public static void findPhoneNumbers(String message) {

        String regex = "\\b\\d{10}\\b";

        JavaExam1Pattern pattern = JavaExam1Pattern.compile(regex);

        Matcher matcher = pattern.matcher(message);

        boolean found = false;

        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        if (!found) {
            System.out.println("No phone numbers found.");
        }
    }
}
