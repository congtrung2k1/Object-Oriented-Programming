package problem6;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class problem6 extends JPanel 
{
	private static final long serialVersionUID = 1L;
	
	Map<Color, Integer> bar = new LinkedHashMap<Color, Integer>();

    public void addBar(Color color, int val) 
    {
    	bar.put(color, val);
    }

    protected void paintComponent(Graphics g) 
    {
        int max = Integer.MIN_VALUE;
        
        for (Integer val : bar.values())
        	max = Math.max(max, val);
        
        int h = getHeight() / (bar.size() * 2 + 1);
        int y = 10;
        int x = 5;
        
        for (Color color : bar.keySet()) 
        {
        	int val = bar.get(color);
            int w = (int)((getWidth() - 10) * ((double)val / max));
            
            g.setColor(color);
            g.fillRect(x, y, w, h);
            
            g.setColor(Color.black);
            g.drawRect(x, y, w, h);
            
            y += h * 2;
        }
    }

    public static void main() 
    {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the length of bar 1"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the length of bar 2"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Enter the length of bar 3"));
        int num4 = Integer.parseInt(JOptionPane.showInputDialog("Enter the length of bar 4"));
        int num5 = Integer.parseInt(JOptionPane.showInputDialog("Enter the length of bar 5"));
        
        problem6 chart = new problem6();
        chart.addBar(Color.red, num1);
        chart.addBar(Color.blue, num2);
        chart.addBar(Color.yellow, num3);
        chart.addBar(Color.cyan, num4);
        chart.addBar(Color.black, num5);
        
        JFrame frame = new JFrame();
        frame.getContentPane().add(chart);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}

