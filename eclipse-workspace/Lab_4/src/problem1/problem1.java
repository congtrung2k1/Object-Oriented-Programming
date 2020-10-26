package problem1;

import javax.swing.JOptionPane;

public class problem1
{
  public static void main()
  {
    String name = JOptionPane.showInputDialog("What is your name?");
    JOptionPane.showMessageDialog(null, "Welcome, " + name + ", to Java Programming!");
  }
}