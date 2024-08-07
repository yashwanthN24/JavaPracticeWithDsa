package audio;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.* ;
public class audio {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("src/audio/song1.wav");
        AudioInputStream audiostream = AudioSystem.getAudioInputStream(file);
        Clip clip =AudioSystem.getClip();
        clip.open(audiostream);


        Scanner sc = new Scanner(System.in);
        String response = "";

        while(!response.equals("Q")){
            System.out.println("P = play , S = stop ,  R = reset  , Q = quit");
            System.out.println("Enter your choice :");

            response = sc.next().toUpperCase();
            switch (response){
                case "P" :  clip.start();
                            break ;
                case "S" : clip.stop();
                            break ;
                case "R" : clip.setMicrosecondPosition(0);
                           break ;
                case "Q" : clip.close();
                           break ;
                default:
                    System.out.println("Invalid response");
            }
        }
        System.out.println("Byee!!");
    }
}
