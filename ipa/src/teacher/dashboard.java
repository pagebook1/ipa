package teacher;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class dashboard extends JFrame {

	private JPanel contentPane;
	static dashboard frame = new dashboard();
	JPanel content;
	DiscussionList discussionList;
	public static JTabbedPane tabbedPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	act2_record rec;
	act4_record rec1;
	act3_record rec3;
	createStudent createStudent;
	DeleteStudent deleteStudent;
	public dashboard() {
		try {
			rec =new act2_record();
			rec3 = new act3_record();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 551);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47,79,79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 128, 128));
		panel.setBounds(0, 0, 275, 512);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(dashboard.class.getResource("/assets/logo1.jpg")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(24, 49, 224, 185);
		panel.add(lblNewLabel);
		
		JPanel homebtn = new JPanel();
		homebtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		homebtn.setLayout(null);
		homebtn.setBorder(new LineBorder(new Color(95, 158, 160), 1, true));
		homebtn.setBackground(new Color(0, 128, 128));
		homebtn.setBounds(10, 310, 249, 29);
		panel.add(homebtn);
		
		JLabel homelabel = new JLabel("HOME");
		homelabel.setHorizontalAlignment(SwingConstants.LEFT);
		homelabel.setForeground(Color.WHITE);
		homelabel.setFont(new Font("Dialog", Font.BOLD, 24));
		homelabel.setBounds(97, 0, 152, 29);
		homebtn.add(homelabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(dashboard.class.getResource("/assets/house.png")));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 0, 73, 29);
		homebtn.add(lblNewLabel_1);
		
		JPanel discussion = new JPanel();
		discussion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(1);
				
			}
		});
		discussion.setLayout(null);
		discussion.setBorder(new LineBorder(new Color(95, 158, 160)));
		discussion.setBackground(new Color(0, 128, 128));
		discussion.setBounds(10, 350, 249, 25);
		panel.add(discussion);
		
		JLabel lblDiscussion = new JLabel("DISCUSSION");
		lblDiscussion.setHorizontalAlignment(SwingConstants.LEFT);
		lblDiscussion.setForeground(Color.WHITE);
		lblDiscussion.setFont(new Font("Dialog", Font.BOLD, 24));
		lblDiscussion.setBounds(97, 0, 152, 25);
		discussion.add(lblDiscussion);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setIcon(new ImageIcon(dashboard.class.getResource("/assets/discuss.png")));
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setBounds(10, 0, 73, 25);
		discussion.add(lblNewLabel_1_1_1);
		
		JPanel activitybtn = new JPanel();
		activitybtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(6);
			}
		});
		activitybtn.setLayout(null);
		activitybtn.setBorder(new LineBorder(new Color(95, 158, 160), 1, true));
		activitybtn.setBackground(new Color(0, 128, 128));
		activitybtn.setBounds(10, 386, 249, 29);
		panel.add(activitybtn);
		
		JLabel vclabel = new JLabel("RECORDS");
		vclabel.setHorizontalAlignment(SwingConstants.LEFT);
		vclabel.setForeground(Color.WHITE);
		vclabel.setFont(new Font("Dialog", Font.BOLD, 24));
		vclabel.setBounds(97, 0, 152, 29);
		activitybtn.add(vclabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(dashboard.class.getResource("/assets/activity.png")));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(10, 0, 73, 29);
		activitybtn.add(lblNewLabel_1_1);
		
		JPanel logoutbtn = new JPanel();
		logoutbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new game.login().setVisible(true);
				dashboard.this.dispose();
			}
		});
		logoutbtn.setLayout(null);
		logoutbtn.setBorder(new LineBorder(new Color(95, 158, 160)));
		logoutbtn.setBackground(new Color(0, 128, 128));
		logoutbtn.setBounds(10, 426, 249, 29);
		panel.add(logoutbtn);
		
		JLabel logout = new JLabel("LOGOUT");
		logout.setHorizontalAlignment(SwingConstants.LEFT);
		logout.setForeground(Color.WHITE);
		logout.setFont(new Font("Dialog", Font.BOLD, 24));
		logout.setBounds(97, 0, 152, 29);
		logoutbtn.add(logout);
		
		JLabel lblNewLabel_1_3 = new JLabel("");
		lblNewLabel_1_3.setIcon(new ImageIcon(dashboard.class.getResource("/assets/logout.png")));
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setBounds(10, 0, 73, 29);
		logoutbtn.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_2 = new JLabel("TEACHER'S PORTAL");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 21));
		lblNewLabel_2.setBounds(10, 243, 249, 43);
		panel.add(lblNewLabel_2);
		
		JPanel createStudent = new JPanel();
		createStudent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(8);
			}
		});
		createStudent.setLayout(null);
		createStudent.setBorder(new LineBorder(new Color(95, 158, 160)));
		createStudent.setBackground(new Color(0, 128, 128));
		createStudent.setBounds(10, 466, 249, 29);
		panel.add(createStudent);
		
		JLabel lblCreateStudent = new JLabel("CREATE STUDENT");
		lblCreateStudent.setHorizontalAlignment(SwingConstants.LEFT);
		lblCreateStudent.setForeground(Color.WHITE);
		lblCreateStudent.setFont(new Font("Dialog", Font.BOLD, 16));
		lblCreateStudent.setBounds(97, 0, 152, 29);
		createStudent.add(lblCreateStudent);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("");
		lblNewLabel_1_3_1.setIcon(new ImageIcon(dashboard.class.getResource("/assets/man.png")));
		lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1.setBounds(10, 0, 73, 29);
		createStudent.add(lblNewLabel_1_3_1);
		
		content = new JPanel();
		content.setBorder(null);
		content.setBackground(new Color(255, 255, 255));
		content.setBounds(285, 11, 769, 490);
		contentPane.add(content);
		content.setLayout(null);
		
		 tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0,-27,769, 517);
		content.add(tabbedPane);
		
		JPanel homePanel = new JPanel();
		homePanel.setBackground(new Color(255, 255, 255));
		discussionList = new DiscussionList();
		
		discussions.PlaceArticulation placeArticulation = new discussions.PlaceArticulation();
		try {
			rec1 = new act4_record();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		tabbedPane.add(homePanel);
		tabbedPane.add(discussionList);
		tabbedPane.add(placeArticulation);
		tabbedPane.add(rec);
		tabbedPane.add(rec1);
		tabbedPane.add(rec3);
		tabbedPane.setSelectedIndex(0);
		
		JPanel recordlist = new JPanel();
		tabbedPane.addTab("New tab", null, recordlist, null);
		recordlist.setLayout(null);
		
		JButton btnNewButton = new JButton("ACTIVITY 1");
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 18));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 128, 128));
		btnNewButton.setBounds(192, 139, 156, 48);
		recordlist.add(btnNewButton);
		
		JButton btnActivity = new JButton("ACTIVITY 2");
		btnActivity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(3);
			}
		});
		btnActivity.setFont(new Font("Dialog", Font.BOLD, 18));
		btnActivity.setForeground(new Color(255, 255, 255));
		btnActivity.setBackground(new Color(0, 128, 128));
		
		btnActivity.setBounds(387, 139, 156, 48);
		recordlist.add(btnActivity);
		
		JButton btnActivity_1 = new JButton("ACTIVITY 3");
		btnActivity_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(5);
				
			}
		});
		btnActivity_1.setBounds(192, 248, 156, 48);
		btnActivity_1.setFont(new Font("Dialog", Font.BOLD, 18));
		btnActivity_1.setForeground(new Color(255, 255, 255));
		btnActivity_1.setBackground(new Color(0, 128, 128));
		recordlist.add(btnActivity_1);
		
		JButton btnActivity_2 = new JButton("ACTIVITY 4");
		btnActivity_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(4);
			}
		});
		btnActivity_2.setFont(new Font("Dialog", Font.BOLD, 18));
		btnActivity_2.setForeground(new Color(255, 255, 255));
		btnActivity_2.setBackground(new Color(0, 128, 128));
		btnActivity_2.setBounds(387, 248, 156, 48);
		recordlist.add(btnActivity_2);
		createStudent = new createStudent();
		tabbedPane.addTab("New tab", null, createStudent, null);
		
		JPanel listCreateStudent = new JPanel();
		tabbedPane.addTab("New tab", null, listCreateStudent, null);
		listCreateStudent.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Create Student");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(7);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBackground(new Color(0, 128, 128));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(119, 172, 239, 73);
		listCreateStudent.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Delete/Update Student");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					DeleteStudent.refreshID();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				tabbedPane.setSelectedIndex(9);
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_1.setBackground(new Color(0, 128, 128));
		btnNewButton_1_1.setBounds(380, 172, 239, 73);
		listCreateStudent.add(btnNewButton_1_1);
		deleteStudent = new DeleteStudent();
		tabbedPane.addTab("New tab", null, new DeleteStudent(), null);
	}
}
