import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    public static String ReadFile(String f){
        String out = new String();

        try{
            File rf = new File(f);
            Scanner mr = new Scanner(rf);

            //reads file

            while(mr.hasNextLine()){
                out += mr.nextLine()+"\n";

            }


        } catch (FileNotFoundException e) {
            System.out.println("The file has not been found.");
            e.printStackTrace();
        }

        return out;


    }


}
