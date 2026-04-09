import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AssignmentDetails {
    public static void main(String[] args) {
        
        File file = new File("assignment.txt");

        try {
        boolean value = file.createNewFile();
        
        if (value) {
            System.out.println("File successfully created: " + file.getName());
        }
        else {
            System.out.println("File already exits.");
        }

        String data = "Java File Handling Practice";

            FileWriter writer = new FileWriter(file);

            writer.write(data);
            System.out.println("Data is written to the file.");

            writer.close();

        BufferedReader reader = new BufferedReader(new FileReader(file));
        
        String line;

        System.out.println("Reading file content:");

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
         reader.close();   

        boolean del = file.delete();

        if (del) {
            System.out.println("File deleted successfully.");
        }
        else {
            System.out.println("Failed to delete the file.");
        }
        }
    catch (IOException e) {
        System.out.println("An error occured: " + e.getMessage());
    }
}
}