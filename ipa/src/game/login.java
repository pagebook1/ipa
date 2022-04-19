package game;

import database.connection;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import student.dashboard;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JTextField password;
	private JButton loginbtn;
	static login frame = new login();
	public static ArrayList<String> infos;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					frame.setVisible(true);
					System.out.println();
					new connection().getConnection();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public login() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		username = new JTextField();
		username.setBounds(367, 213, 281, 50);
		username.setColumns(10);
		
		password = new JTextField();
		password.setBounds(367, 293, 281, 55);
		password.setColumns(10);
		
		loginbtn = new JButton("LOGIN");
		loginbtn.setFont(new Font("Tahoma", Font.BOLD, 25));
		loginbtn.setForeground(Color.WHITE);
		loginbtn.setBackground(Color.BLUE);
		loginbtn.setBounds(367, 413, 281, 56);
		loginbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = username.getText();
				String pass = password.getText();
				try {
					infos = connection.user(user, pass);
					if(infos.get(2).equalsIgnoreCase("student"))
					{
						new student.dashboard().setVisible(true);
						setVisible(false);
					}
					else if (infos.get(2).equalsIgnoreCase("teacher"))
					{
						new teacher.dashboard().setVisible(true);
						setVisible(false);
					}
					else {
						JOptionPane.showMessageDialog(null, "Wrong User/Pass Try again!","INVALID", JOptionPane.ERROR_MESSAGE);
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Wrong User/Pass Try again!","INVALID", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		contentPane.setLayout(null);
		contentPane.add(loginbtn);
		contentPane.add(password);
		contentPane.add(username);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(login.class.getResource("/assets/user.png")));
		lblNewLabel.setBounds(321, 203, 36, 71);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(login.class.getResource("/assets/lock.png")));
		lblNewLabel_1.setBounds(321, 293, 36, 50);
		contentPane.add(lblNewLabel_1);
	}
}
