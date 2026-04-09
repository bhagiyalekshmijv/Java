import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;

public class LogFiles {
    public static void main(String[] args) {
        
        File file = new File("log.txt");

        try {

            boolean value = file.createNewFile();

            if (value) {
                System.out.println("File created successfully.");
            }
            else {
                System.out.println("File already exits.");
            }

            String message = "Book order placed at " + LocalTime.now();

            FileWriter writer = new FileWriter(file);
            
            writer.write(message);
            System.out.println("Message written to file.");

            writer.close();

            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line;

            System.out.println("Reading from line:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

            boolean del = file.delete();

            if (del) {
                System.out.println("File deleted successfully.");
            }
            else {
                System.out.println("Failed to delete file.");
            }
        }

        catch (IOException e) {
        System.out.println("An error occured: " + e.getMessage());
    }
    }
}
