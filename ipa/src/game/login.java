package game;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import database.connection;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JTextField password;
	private JButton loginbtn;
	static login frame = new login();
	public static ArrayList<String> infos;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JPanel panel_1;
	private JLabel lblNewLabel_3;
	private JPanel panel_2;
	private JPanel panel;

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
		setBounds(100, 100, 1079, 552);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		username = new JTextField();
		username.setBounds(706, 142, 281, 50);
		username.setColumns(10);
		
		password = new JTextField();
		password.setBounds(706, 218, 281, 55);
		password.setColumns(10);
		
		loginbtn = new JButton("LOG IN");
		loginbtn.setFont(new Font("Tahoma", Font.BOLD, 25));
		loginbtn.setForeground(Color.WHITE);
		loginbtn.setBackground(new Color(0, 128, 128));
		loginbtn.setBounds(706, 312, 281, 56);
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
					JOptionPane.showMessageDialog(null, "ERROR. TRY AGAIN","INVALID", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		contentPane.setLayout(null);
		contentPane.add(loginbtn);
		contentPane.add(password);
		contentPane.add(username);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(login.class.getResource("/assets/user.png")));
		lblNewLabel.setBounds(660, 132, 36, 71);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(login.class.getResource("/assets/lock.png")));
		lblNewLabel_1.setBounds(660, 218, 36, 50);
		contentPane.add(lblNewLabel_1);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(148, 0, 211));
		panel_1.setBounds(10, 23, 604, 465);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		lblNewLabel_3 = new JLabel("ALL HAIL!");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 33));
		lblNewLabel_3.setBounds(67, 30, 465, 55);
		panel_1.add(lblNewLabel_3);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 128, 128));
		panel_2.setBounds(197, 30, 199, 55);
		panel_1.add(panel_2);
		
		JTextPane txtpnToOurDearest = new JTextPane();
		txtpnToOurDearest.setContentType("text/html");
		txtpnToOurDearest.setFont(new Font("Dialog", Font.PLAIN, 25));
		txtpnToOurDearest.setText("<br><p style=\"font-size:30; font-family: 'Brush Script MT'\"align=\"justify\">\r\nTo our dearest teachers and students, we greet you with orace and happiness. Thank you for taking part in our strategy and being one of those who installed and tried Pronouncely. Feel free to delve into and explore this software. We hope that we can contribute to your pronunciation improvement with our plotted pedagigy. We claim for your success because it&rsquo;s ours too.</p>\r\n\r\n<p style=\"font-size:25;font-family:'Brush Script MT'\">Thank you and Enjoy!</p>");
		txtpnToOurDearest.setBounds(10, 63, 584, 391);
		panel_1.add(txtpnToOurDearest);
		
		panel = new JPanel();
		panel.setBackground(new Color(138, 43, 226));
		panel.setBounds(642, 56, 398, 387);
		contentPane.add(panel);
	}
}
