import javax.swing.JOptionPane;
public class GreetingProgram{
    public static void main(String[]args){
        
        //Prompt User to enter their name.
        String input=JOptionPane.showInputDialog("What is your name?");

        // Display a welcoming greeting
        JOptionPane.showMessageDialog(null,"\"Hello, "+input+"!"+" Welcome to Java Programming!\"");
    }
}