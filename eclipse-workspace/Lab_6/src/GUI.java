import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

import javax.swing.GroupLayout;
import org.json.simple.*;
/*
 * Created by JFormDesigner on Mon Nov 23 03:32:13 ICT 2020
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
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
	}

	private void searchActionPerformed(ActionEvent e) {
		System.out.println("Search");
		new Search();
	}

	private void addActionPerformed(ActionEvent e) {
		System.out.println("Add");
		
		this.product = this.textField1.getText();
		this.amount = Integer.parseInt(this.textField2.getText());
		this.des = this.textField3.getText();
		new Jadd(this.product, this.amount, this.des);
	}

	private void removeActionPerformed(ActionEvent e) {
		System.out.println("Remove");
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
		list1 = new JList<>();

		//======== this ========
		setTitle("WAREHOUSE MANAGEMENT");
		setVisible(true);
		setResizable(false);
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
			scrollPane1.setViewportView(list1);
		}

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(button1)
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
							.addComponent(button2))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGroup(contentPaneLayout.createParallelGroup()
								.addGroup(contentPaneLayout.createSequentialGroup()
									.addGap(15, 15, 15)
									.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
										.addComponent(label1, GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
										.addComponent(label3, GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)))
								.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
									.addContainerGap()
									.addComponent(label2, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
							.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
								.addComponent(textField2)
								.addComponent(textField1)
								.addComponent(textField3, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE))))
					.addGap(21, 21, 21)
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
							.addComponent(label4, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addGap(32, 32, 32))
						.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
							.addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
							.addComponent(button3)
							.addGap(53, 53, 53))))
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(29, 29, 29)
							.addComponent(label4, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
						.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(label1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))))
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(0, 13, Short.MAX_VALUE)
							.addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
							.addComponent(button3))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
							.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(label2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
							.addGroup(contentPaneLayout.createParallelGroup()
								.addComponent(label3, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField3, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
							.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(button2)
								.addComponent(button1))))
					.addGap(20, 20, 20))
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
	private JList<JSONArray> list1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
	
	public String product = "";
	public int amount = 0;
	public String des = "";

}
