import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;

public class CreateFile {
    public static void createFile() {
        File newFile = new File("MyFirstFile.txt");

        try {

            if (newFile.createNewFile()) {
                System.out.println("File created: " + newFile.getName());
            } else {
                System.out.println("File already exists");

            }

        } catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

}
