public class Main {

    public static void main(String[]args){

        //Calling functions that create, read and write files
        CreateFile cf = new CreateFile();
        WriteFile wf = new WriteFile();

        ReadFile rf = new ReadFile();

        String o = rf.ReadFile("kek.txt");
        System.out.println(o);


    }

}
