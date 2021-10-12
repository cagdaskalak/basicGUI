import javax.swing.JOptionPane;
public class basicGUI {
    public static void main(String[] args) throws Exception {
        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you? "));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old!");

        double height = Double.parseDouble(JOptionPane.showInputDialog("How tall are you?"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");


    }
}
