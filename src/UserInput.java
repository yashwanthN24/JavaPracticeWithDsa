import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Whats your name?:");
        String name = sc.nextLine();
        System.out.println("Enter your age :");
        int age = sc.nextInt();
        sc.nextLine(); // remember scanner reads only till it encounters \n so in age 12\n only 12 is read \n has to be read
        // else food will take that \n
        System.out.println("Enter your food:");
        String food = sc.nextLine();
        System.out.println("Hello :" + name);
        System.out.println("Age :" + age);
        System.out.println("Food :" + food);


        // Scanner is also used to read a file
        File myfile = new File("src/yash.txt");
        Scanner sc1 = null;
        try {
            sc1 = new Scanner(myfile);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        while(sc1.hasNextLine()){
            System.out.println(sc1.nextLine());
        }

    }
}
