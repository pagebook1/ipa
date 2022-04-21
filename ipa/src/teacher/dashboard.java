package teacher;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTabbedPane;

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
	public dashboard() {
		try {
			rec =new act2_record();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 720);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47,79,79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 128, 128));
		panel.setBounds(0, 0, 275, 681);
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
		homebtn.setBounds(10, 310, 249, 50);
		panel.add(homebtn);
		
		JLabel homelabel = new JLabel("HOME");
		homelabel.setHorizontalAlignment(SwingConstants.LEFT);
		homelabel.setForeground(Color.WHITE);
		homelabel.setFont(new Font("Dialog", Font.BOLD, 24));
		homelabel.setBounds(97, 0, 152, 50);
		homebtn.add(homelabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(dashboard.class.getResource("/assets/house.png")));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 0, 73, 50);
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
		discussion.setBounds(10, 371, 249, 50);
		panel.add(discussion);
		
		JLabel lblDiscussion = new JLabel("DISCUSSION");
		lblDiscussion.setHorizontalAlignment(SwingConstants.LEFT);
		lblDiscussion.setForeground(Color.WHITE);
		lblDiscussion.setFont(new Font("Dialog", Font.BOLD, 24));
		lblDiscussion.setBounds(97, 0, 152, 50);
		discussion.add(lblDiscussion);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setIcon(new ImageIcon(dashboard.class.getResource("/assets/discuss.png")));
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setBounds(0, 0, 73, 50);
		discussion.add(lblNewLabel_1_1_1);
		
		JPanel activitybtn = new JPanel();
		activitybtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(5);
			}
		});
		activitybtn.setLayout(null);
		activitybtn.setBorder(new LineBorder(new Color(95, 158, 160), 1, true));
		activitybtn.setBackground(new Color(0, 128, 128));
		activitybtn.setBounds(10, 432, 249, 50);
		panel.add(activitybtn);
		
		JLabel vclabel = new JLabel("RECORDS");
		vclabel.setHorizontalAlignment(SwingConstants.LEFT);
		vclabel.setForeground(Color.WHITE);
		vclabel.setFont(new Font("Dialog", Font.BOLD, 24));
		vclabel.setBounds(97, 0, 152, 50);
		activitybtn.add(vclabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(dashboard.class.getResource("/assets/activity.png")));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(10, 0, 73, 50);
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
		logoutbtn.setBounds(10, 493, 249, 50);
		panel.add(logoutbtn);
		
		JLabel logout = new JLabel("LOGOUT");
		logout.setHorizontalAlignment(SwingConstants.LEFT);
		logout.setForeground(Color.WHITE);
		logout.setFont(new Font("Dialog", Font.BOLD, 24));
		logout.setBounds(97, 0, 152, 50);
		logoutbtn.add(logout);
		
		JLabel lblNewLabel_1_3 = new JLabel("");
		lblNewLabel_1_3.setIcon(new ImageIcon(dashboard.class.getResource("/assets/logout.png")));
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setBounds(10, 0, 73, 50);
		logoutbtn.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_2 = new JLabel("TEACHER PORTAL");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 21));
		lblNewLabel_2.setBounds(10, 243, 249, 43);
		panel.add(lblNewLabel_2);
		
		content = new JPanel();
		content.setBorder(null);
		content.setBackground(new Color(255, 255, 255));
		content.setBounds(285, 11, 769, 651);
		contentPane.add(content);
		content.setLayout(null);
		
		 tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0,-27,769, 718);
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
		tabbedPane.setSelectedIndex(0);
		
		JPanel recordlist = new JPanel();
		tabbedPane.addTab("New tab", null, recordlist, null);
		recordlist.setLayout(null);
		
		JButton btnNewButton = new JButton("ACTIVITY1");
		btnNewButton.setBounds(145, 139, 89, 23);
		recordlist.add(btnNewButton);
		
		JButton btnActivity = new JButton("ACTIVITY2");
		btnActivity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(3);
			}
		});
		btnActivity.setBounds(261, 139, 89, 23);
		recordlist.add(btnActivity);
		
		JButton btnActivity_1 = new JButton("ACTIVITY3");
		btnActivity_1.setBounds(399, 139, 89, 23);
		recordlist.add(btnActivity_1);
		
		JButton btnActivity_2 = new JButton("ACTIVITY4");
		btnActivity_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(4);
			}
		});
		btnActivity_2.setBounds(529, 139, 89, 23);
		recordlist.add(btnActivity_2);
	}

}
