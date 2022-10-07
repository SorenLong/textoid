import java.io.IOException;
import java.io.FileWriter;

public class WriteFile {

    public static void writeFile(String f){
        //function that writes to a file

        try{
            FileWriter fw = new FileWriter(f);
            fw.write("This is my first time adding text to a file in java");
            fw.write("\n\nThis is my second time I am writing to a file in Java.");
            fw.close();
            System.out.println("Successfully written to file");

        } catch(IOException e){
            System.out.println("an error occured");
            e.printStackTrace();

        }




    }





}
