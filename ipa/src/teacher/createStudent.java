package teacher;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;

import database.connection;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class createStudent extends JPanel {
	private JTextField nameField;
	private JTextField lnameField;
	private JTextField userField;
	private JTextField passField;
	private JComboBox textField_4;

	/**
	 * Create the panel.
	 */
	public createStudent() {
		setBackground(Color.WHITE);
		setBounds(0,0,769,691);
		setLayout(null);
		
		nameField = new JTextField();
		nameField.setFont(new Font("Dialog", Font.PLAIN, 24));
		nameField.setBounds(269, 88, 247, 28);
		add(nameField);
		nameField.setColumns(10);
		
		lnameField = new JTextField();
		lnameField.setFont(new Font("Dialog", Font.PLAIN, 24));
		lnameField.setColumns(10);
		lnameField.setBounds(269, 127, 247, 28);
		add(lnameField);
		
		userField = new JTextField();
		userField.setFont(new Font("Dialog", Font.PLAIN, 24));
		userField.setColumns(10);
		userField.setBounds(269, 166, 247, 28);
		add(userField);
		
		passField = new JTextField();
		passField.setFont(new Font("Dialog", Font.PLAIN, 24));
		passField.setColumns(10);
		passField.setBounds(269, 205, 247, 28);
		add(passField);
		
		textField_4 = new JComboBox();
		textField_4.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_4.setModel(new DefaultComboBoxModel(new String[] {"Student"}));
		textField_4.setBounds(269, 244, 247, 28);
		add(textField_4);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 21));
		lblNewLabel.setBounds(82, 88, 177, 28);
		add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Dialog", Font.BOLD, 21));
		lblLastName.setBounds(82, 128, 177, 28);
		add(lblLastName);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Dialog", Font.BOLD, 21));
		lblUsername.setBounds(82, 167, 177, 28);
		add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Dialog", Font.BOLD, 21));
		lblPassword.setBounds(82, 206, 177, 28);
		add(lblPassword);
		
		JLabel lblAccountType = new JLabel("Account Type");
		lblAccountType.setFont(new Font("Dialog", Font.BOLD, 21));
		lblAccountType.setBounds(82, 245, 177, 28);
		add(lblAccountType);
		
		JButton btnNewButton = new JButton("CREATE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					if(nameField.getText().equals("")|| lnameField.getText().equals("")||userField.getText().equals("") || passField.getText().equals(""))
					{
						JOptionPane.showMessageDialog(null,"COMPLETE THE FORM!");
					}
					else {
						new connection().create_User(nameField.getText(), lnameField.getText(), userField.getText(), passField.getText());
						JOptionPane.showMessageDialog(null,"User Created");
						nameField.setText("");
						lnameField.setText("");
						userField.setText("");
						passField.setText("");
						dashboard.tabbedPane.setSelectedIndex(0);
						
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
		btnNewButton.setBounds(272, 397, 244, 46);
		add(btnNewButton);
		

	}
}
