import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Mon Nov 23 03:46:30 ICT 2020
 */



/**
 * @author congtrung2k1
 */
public class Search extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Search() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - congtrung2k1
		label1 = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		scrollPane2 = new JScrollPane();
		textArea1 = new JTextArea();
		scrollPane3 = new JScrollPane();
		textArea2 = new JTextArea();
		textField1 = new JTextField();
		button1 = new JButton();

		//======== this ========
		Container contentPane = getContentPane();

		//---- label1 ----
		label1.setText("Product Name");

		//---- label2 ----
		label2.setText("Amount");

		//---- label3 ----
		label3.setText("Description");

		//======== scrollPane2 ========
		{
			scrollPane2.setViewportView(textArea1);
		}

		//======== scrollPane3 ========
		{
			scrollPane3.setViewportView(textArea2);
		}

		//---- button1 ----
		button1.setText("Search");

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGap(34, 34, 34)
					.addGroup(contentPaneLayout.createParallelGroup()
						.addComponent(label2, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
						.addComponent(label3)
						.addComponent(label1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
					.addGap(34, 34, 34)
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addComponent(scrollPane3, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
							.addGap(0, 0, Short.MAX_VALUE))
						.addComponent(textField1)
						.addComponent(scrollPane2))
					.addGap(27, 27, 27)
					.addComponent(button1)
					.addGap(97, 97, 97))
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGap(30, 30, 30)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addComponent(label1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(button1)))
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addComponent(label2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addComponent(label3)
							.addGap(0, 86, Short.MAX_VALUE))
						.addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
					.addContainerGap())
		);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - congtrung2k1
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JScrollPane scrollPane2;
	private JTextArea textArea1;
	private JScrollPane scrollPane3;
	private JTextArea textArea2;
	private JTextField textField1;
	private JButton button1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
