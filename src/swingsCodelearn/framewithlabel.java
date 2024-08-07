// You might want to add frame.setVisible(true) to be the very last line. Sometimes with Mac, the components won't appear until you resize the window
package  swingsCodelearn ;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import java.awt.image.ImageObserver;

public class framewithlabel {

    public static void main(String[] args) {

        // JLabel = a GUI display area for a string of text, an image, or both

        ImageIcon image = new ImageIcon("src/swingsCodelearn/first.png");
        ImageIcon resizedIcon = resizeImageIcon(image, 25, 60);
        Border border = BorderFactory.createLineBorder(Color.green,3);

        JLabel label = new JLabel(); //create a label
        label.setText("bro, do you even code?"); //set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT,CENTER, RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP); //set text TOP,CENTER, BOTTOM of imageicon
        label.setForeground(new Color(0x00FF00)); //set font color of text
        label.setFont(new Font("MV Boli",Font.PLAIN,100)); //set font of text
        label.setIconTextGap(-25); //set gap of text to image
        label.setBackground(Color.black); //set background color
        label.setOpaque(true); //display background color
        //label.setBorder(border); //sets border of label (not image+text)
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
        //label.setBounds(100, 100, 250, 250); //set x,y position within frame as well as dimensions

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500,500);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
    private static ImageIcon resizeImageIcon(ImageIcon icon, int width, int height) {
        ImageObserver observer = null;  // You might want to provide a valid ImageObserver
        return new ImageIcon(icon.getImage().getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH));
    }
}