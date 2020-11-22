import java.awt.Container;
import java.awt.event.ActionEvent;

import javax.swing.GroupLayout;
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

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - congtrung2k1
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		label1 = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		label4 = new JLabel();
		textField1 = new JTextField();
		textField2 = new JTextField();
		textField3 = new JTextField();
		scrollPane1 = new JScrollPane();
		list1 = new JList<Object>();

		//======== this ========
		Container contentPane = getContentPane();

		//---- button1 ----
		button1.setText("Add");

		//---- button2 ----
		button2.setText("Remove");

		//---- button3 ----
		button3.setText("Search");

		//---- label1 ----
		label1.setText("Product Name");

		//---- label2 ----
		label2.setText("Amount");

		//---- label3 ----
		label3.setText("Description");

		//---- label4 ----
		label4.setText("Product List");

		//======== scrollPane1 ========
		{
			scrollPane1.setViewportView(list1);
		}

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGap(23, 23, 23)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
								.addComponent(label1, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
								.addComponent(label2, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
								.addComponent(label3, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
								.addComponent(textField1, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
								.addComponent(textField2, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
								.addComponent(textField3, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addComponent(button1)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(button2)))
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
							.addComponent(label4, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
							.addGap(46, 46, 46))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(contentPaneLayout.createParallelGroup()
								.addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
								.addGroup(contentPaneLayout.createSequentialGroup()
									.addComponent(button3)
									.addGap(0, 88, Short.MAX_VALUE)))
							.addContainerGap())))
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
					.addGap(29, 29, 29)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(label1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label4, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(label2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(contentPaneLayout.createParallelGroup()
								.addComponent(label3, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField3, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)))
						.addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
					.addGap(30, 30, 30)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(button2)
						.addComponent(button1)
						.addComponent(button3))
					.addContainerGap(15, Short.MAX_VALUE))
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
	private JList<Object> list1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1) {
			System.out.println("Add");
		}
		else
		if (e.getSource() == button2) {
			System.out.println("Remove");
		}
		else
		if (e.getSource() == button3) {
			System.out.println("Search");
			new Search();
		}
	}
	
}
