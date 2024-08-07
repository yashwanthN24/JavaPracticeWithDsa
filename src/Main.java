import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        File myfile = new File("yash.txt");
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create file");
            e.printStackTrace();
        }

//        writing to file
        try {
            FileWriter fileWriter = new FileWriter("yash.txt");
            fileWriter.write("My name is yashwanth");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//      reading from file
        try {
            Scanner sc = new Scanner(myfile);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        if(myfile.delete()){
            System.out.println("Deleted file " + myfile.getName());
        }else{
            System.out.println("Error deleting the file");
        }
//        sout + tab  to get system.out.println()

    }
}