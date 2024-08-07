import javax.swing.JOptionPane;
public class Gui {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter you name :");
        JOptionPane.showMessageDialog(null  , "hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age :"));
        JOptionPane.showMessageDialog(null , "Your are " + age + "years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height:"));
        JOptionPane.showMessageDialog(null , "Your are " + height + " cms");

    }
}
