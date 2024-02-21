import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence :");
        String sent = sc.nextLine();
        String words[] = sent.split(" ");
        int words_with_a = 0 ; 
        System.out.println(words);
        for (String word : words) {
            word = word.toUpperCase();
            System.out.println(word);
            if (word.charAt(0) == 'A'){
                words_with_a++ ; 
            }
        }
        System.out.println("The number of words starting with A in " + sent.toUpperCase() + " are " + words_with_a );
        sc.close();

    }
}
