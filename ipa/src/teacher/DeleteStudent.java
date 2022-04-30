package teacher;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import database.connection;

public class DeleteStudent extends JPanel {
	private JTextField nameField;
	private JTextField lnameField;
	private JTextField userField;
	private JTextField passField;
	private JComboBox textField_4;
	public static JComboBox studentID;
	static ArrayList <String> studentInfo;

	/**
	 * Create the panel.
	 */
	public DeleteStudent() {
		setBackground(Color.WHITE);
		setBounds(0,0,769,691);
		setLayout(null);
		
		nameField = new JTextField();
		nameField.setEditable(false);
		nameField.setFont(new Font("Dialog", Font.PLAIN, 24));
		nameField.setBounds(272, 157, 247, 32);
		add(nameField);
		nameField.setColumns(10);
		
		lnameField = new JTextField();
		lnameField.setEditable(false);
		lnameField.setFont(new Font("Dialog", Font.PLAIN, 24));
		lnameField.setColumns(10);
		lnameField.setBounds(272, 200, 247, 32);
		add(lnameField);
		
		userField = new JTextField();
		userField.setEditable(false);
		userField.setFont(new Font("Dialog", Font.PLAIN, 24));
		userField.setColumns(10);
		userField.setBounds(272, 243, 247, 32);
		add(userField);
		
		passField = new JTextField();
		passField.setEditable(false);
		passField.setFont(new Font("Dialog", Font.PLAIN, 24));
		passField.setColumns(10);
		passField.setBounds(272, 292, 247, 32);
		add(passField);
		
		textField_4 = new JComboBox();
		textField_4.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_4.setModel(new DefaultComboBoxModel(new String[] {"Student"}));
		textField_4.setBounds(272, 335, 247, 32);
		add(textField_4);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 21));
		lblNewLabel.setBounds(85, 158, 177, 32);
		add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Dialog", Font.BOLD, 21));
		lblLastName.setBounds(85, 201, 177, 32);
		add(lblLastName);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Dialog", Font.BOLD, 21));
		lblUsername.setBounds(85, 244, 177, 32);
		add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Dialog", Font.BOLD, 21));
		lblPassword.setBounds(85, 295, 177, 28);
		add(lblPassword);
		
		JLabel lblAccountType = new JLabel("Account Type");
		lblAccountType.setFont(new Font("Dialog", Font.BOLD, 21));
		lblAccountType.setBounds(85, 336, 177, 32);
		add(lblAccountType);
		
		JButton btnNewButton = new JButton("UPDATE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					if(nameField.getText().equals("")|| lnameField.getText().equals("")||userField.getText().equals("") || passField.getText().equals(""))
					{
						JOptionPane.showMessageDialog(null,"COMPLETE THE FORM!");
					}
					else {
						new connection().updateRecord(studentID.getSelectedItem().toString(), nameField.getText().toString(), lnameField.getText().toString(), userField.getText().toString(),passField.getText().toString());
						JOptionPane.showMessageDialog(null,"User Created");
						nameField.setText("");
						lnameField.setText("");
						userField.setText("");
						passField.setText("");
						try {
							dashboard.show_panel(dashboard.homePanel);
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
					}
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(0, 128, 128));
		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 23));
		btnNewButton.setBounds(200, 378, 142, 46);
		add(btnNewButton);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new connection().deleteRecord(studentID.getSelectedItem().toString());
					JOptionPane.showMessageDialog(null,"User Deleted");
					nameField.setText("");
					lnameField.setText("");
					userField.setText("");
					passField.setText("");
					try {
						dashboard.show_panel(dashboard.homePanel);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnDelete.setForeground(new Color(0, 128, 128));
		btnDelete.setFont(new Font("Dialog", Font.PLAIN, 23));
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setBounds(377, 378, 142, 46);
		add(btnDelete);
		
		JLabel lblStudentId = new JLabel("Student ID");
		lblStudentId.setFont(new Font("Dialog", Font.BOLD, 21));
		lblStudentId.setBounds(85, 114, 177, 32);
		add(lblStudentId);
		studentID = new JComboBox();
		studentID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					try {
					
					studentInfo = new connection().getInfos(studentID.getSelectedItem().toString());
					nameField.setText(studentInfo.get(0));
					lnameField.setText(studentInfo.get(1));
					userField.setText(studentInfo.get(2));
					passField.setText(studentInfo.get(3));
					
					nameField.setEditable(true);
					lnameField.setEditable(true);
					userField.setEditable(true);
					passField.setEditable(true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		studentID.setFont(new Font("Dialog", Font.PLAIN, 24));
		studentID.setBounds(272, 114, 247, 32);
		add(studentID);
		

	}
	
	public static void refreshID() {
		try {
			studentID.removeAllItems();
			ArrayList <String> StudentIds = new connection().studentID();
			for(String id : StudentIds)
			{
				studentID.addItem(id);
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
