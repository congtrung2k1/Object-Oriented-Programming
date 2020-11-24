import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Mon Nov 23 03:32:13 ICT 2020
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;



/**
 * @author congtrung2k1
 */
public class GUI extends JFrame {
	private static final long serialVersionUID = 1L;
		
	public GUI() {
		initComponents();
		
		String tmp = Product.update();
		this.textArea1.setText(tmp);
	}

	private void searchActionPerformed(ActionEvent e) {
		new Search();
	}

	private void addActionPerformed(ActionEvent e) {
		this.product = this.textField1.getText();
		this.amount = this.textField2.getText();
		this.des = this.textField3.getText();
		Product.addWare(this.product, this.amount, this.des);
		
		String tmp = Product.update();
		this.textArea1.setText(tmp);
	}

	private void removeActionPerformed(ActionEvent e) {
		this.product = this.textField1.getText();
		Product.removeWare(this.product);
		
		String tmp = Product.update();
		this.textArea1.setText(tmp);
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - congtrung2k1
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		label1 = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		textField1 = new JTextField();
		textField2 = new JTextField();
		textField3 = new JTextField();
		label4 = new JLabel();
		scrollPane1 = new JScrollPane();
		textArea1 = new JTextArea();

		//======== this ========
		setTitle("WAREHOUSE MANAGEMENT");
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();

		//---- button1 ----
		button1.setText("Add");
		button1.addActionListener(e -> addActionPerformed(e));

		//---- button2 ----
		button2.setText("Remove");
		button2.addActionListener(e -> removeActionPerformed(e));

		//---- button3 ----
		button3.setText("Search");
		button3.addActionListener(e -> searchActionPerformed(e));

		//---- label1 ----
		label1.setText("Product Name");
		label1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label1.setHorizontalAlignment(SwingConstants.CENTER);

		//---- label2 ----
		label2.setText("Amount");
		label2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label2.setHorizontalAlignment(SwingConstants.CENTER);

		//---- label3 ----
		label3.setText("Description");
		label3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label3.setHorizontalAlignment(SwingConstants.CENTER);

		//---- textField3 ----
		textField3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField3.setHorizontalAlignment(SwingConstants.CENTER);

		//---- label4 ----
		label4.setText("Product List");
		label4.setHorizontalAlignment(SwingConstants.CENTER);
		label4.setFont(new Font("Tahoma", Font.PLAIN, 16));

		//======== scrollPane1 ========
		{

			//---- textArea1 ----
			textArea1.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 14));
			textArea1.setEditable(false);
			scrollPane1.setViewportView(textArea1);
		}

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(button1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(11, 11, 11)
							.addComponent(label1, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(contentPaneLayout.createParallelGroup()
								.addComponent(label3, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
								.addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(contentPaneLayout.createParallelGroup()
						.addComponent(textField1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
						.addComponent(button2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
						.addComponent(textField2)
						.addComponent(textField3))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(contentPaneLayout.createParallelGroup()
						.addComponent(button3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(label4, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
						.addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
					.addContainerGap())
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addComponent(label4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(textField1))
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
								.addComponent(textField2)
								.addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
							.addGroup(contentPaneLayout.createParallelGroup()
								.addComponent(textField3, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
								.addComponent(label3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(button3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(button1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(button2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(17, 17, 17))
		);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - congtrung2k1
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JLabel label4;
	private JScrollPane scrollPane1;
	private JTextArea textArea1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
	
	public String product = "";
	public String amount = "";
	public String des = "";

}
