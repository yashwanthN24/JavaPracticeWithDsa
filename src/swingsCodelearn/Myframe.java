package swingsCodelearn;

import javax.swing.*;
import java.awt.*;

public class Myframe extends JFrame {
    Myframe(){
        
        this.setTitle("My first application"); // sets the title of the this

        this.setSize(420 , 422); // sets the  x-dimension , and y - dimension of this

        this.setVisible(true); // make this visible

        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE); // exit out of application

        this.setResizable(false); // prevent this from being resized

        ImageIcon image = new ImageIcon("src/swingsCodelearn/first.jpg"); // create an ImageIcon
        this.setIconImage(image.getImage()); // change icon of this

        this.getContentPane().setBackground(new Color(123 , 45 , 255));// change background color of this to lightgrey
        ImageIcon image1 = new ImageIcon("src/swingsCodelearn/second.jpg");

        JLabel label = new JLabel("Bro do you even code?");
        label.setIcon(image1);
        this.add(label);
    }
}
