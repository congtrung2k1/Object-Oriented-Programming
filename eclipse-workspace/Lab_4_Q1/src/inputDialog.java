import javax.swing.JOptionPane;

public class inputDialog
{
  public static void main(String[] args)
  {
    String name = JOptionPane.showInputDialog("What is your name?");
    JOptionPane.showMessageDialog(null, "Welcome, " + name + ", to Java Programming!");
  }
}