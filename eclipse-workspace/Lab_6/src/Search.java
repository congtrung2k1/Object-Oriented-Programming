import java.awt.*;
import java.awt.event.*;
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

	private void searchActionPerformed(ActionEvent e) {
		System.out.println("Searching...");
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
		setTitle("WAREHOUSE SEARCH");
		setVisible(true);
		setResizable(false);
		setFont(new Font(Font.DIALOG, Font.PLAIN, 12));
		Container contentPane = getContentPane();

		//---- label1 ----
		label1.setText("Product Name");
		label1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label1.setHorizontalAlignment(SwingConstants.CENTER);

		//---- label2 ----
		label2.setText("Amount");
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setFont(new Font("Tahoma", Font.PLAIN, 14));

		//---- label3 ----
		label3.setText("Description");
		label3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label3.setHorizontalAlignment(SwingConstants.CENTER);

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
		button1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button1.addActionListener(e -> searchActionPerformed(e));

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
						.addComponent(label1, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
						.addComponent(label2, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
						.addComponent(label3, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
					.addGap(18, 18, 18)
					.addGroup(contentPaneLayout.createParallelGroup()
						.addComponent(scrollPane3, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
						.addComponent(textField1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
						.addComponent(scrollPane2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
					.addComponent(button1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(20, 20, 20))
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGap(29, 29, 29)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(button1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(contentPaneLayout.createParallelGroup()
						.addComponent(scrollPane3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(contentPaneLayout.createParallelGroup()
						.addComponent(label3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
					.addGap(20, 20, 20))
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
