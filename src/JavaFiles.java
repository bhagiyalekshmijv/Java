import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class JavaFiles {
    public static void main(String[] args){
        try{
            File file = new File("data.json");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a json data for storing");
            String data = sc.nextLine();
            boolean status = file.createNewFile();
            if (status){
                System.out.println("new file created");
            }else{
                System.out.println("file alredy exists");
            }
            if (file.exists()){
                FileWriter writer = new FileWriter(file);
                writer.write(data);
                writer.close();  
            }
            if (file.exists()){
                FileReader reader = new FileReader(file);
                char[] array = new char[200];
                reader.read(array);
                System.out.println(array);
                reader.close();
            }
            sc.close();
        }catch( Exception e){
            e.getStackTrace();
        }
    }
}
