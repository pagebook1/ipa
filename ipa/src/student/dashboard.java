package student;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import game.login;

public class dashboard extends JFrame {
	public JPanel content;
	private JPanel contentPane;
	public static ActivityList activityList;
	public static home Home;
	static dashboard frame =  new dashboard();
	

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
	public dashboard() {
		
		activityList = new ActivityList();
		activityList.tabbedPane.setSize(791, 528);
		activityList.setSize(769, 491);
		activityList.tabbedPane.setLocation(-10, -23);
		Home = new home();
		Home.setBounds(0, 0, 769, 491);
		activityList.setLocation(0, 0);
		setType(Type.POPUP);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1079, 552);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 275, 681);
		contentPane.add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setBackground(new Color(0, 128, 128));
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(24, 49, 224, 185);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(dashboard.class.getResource("/assets/logo1.jpg")));
		
		JPanel homebtn = new JPanel();
		homebtn.setBorder(new LineBorder(new Color(95, 158, 160), 1, true));
		homebtn.setBackground(new Color(0, 128, 128));
		homebtn.addMouseListener(new PanelMouseAdapter(homebtn) {
			public void mouseClicked(java.awt.event.MouseEvent e)
			{
				showpanel(Home);
			}
		});
		homebtn.setBounds(10, 310, 249, 29);
		panel.add(homebtn);
		homebtn.setLayout(null);
		
		JLabel homelabel = new JLabel("HOME");
		homelabel.setBounds(97, 0, 152, 29);
		homelabel.setForeground(new Color(255, 255, 255));
		homelabel.setHorizontalAlignment(SwingConstants.LEFT);
		homelabel.setFont(new Font("Dialog", Font.BOLD, 24));
		homebtn.add(homelabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(dashboard.class.getResource("/assets/house.png")));
		lblNewLabel_1.setBounds(10, 0, 73, 29);
		homebtn.add(lblNewLabel_1);
		
		
		JPanel discussion = new JPanel();
		discussion.setBorder(new LineBorder(new Color(95, 158, 160)));
		discussion.setBackground(new Color(0, 128, 128));
		discussion.setBounds(10, 350, 249, 29);
		panel.add(discussion);
		discussion.setLayout(null);
		
		JLabel lblDiscussion = new JLabel("DISCUSSION");
		lblDiscussion.setHorizontalAlignment(SwingConstants.LEFT);
		lblDiscussion.setForeground(Color.WHITE);
		lblDiscussion.setFont(new Font("Dialog", Font.BOLD, 24));
		lblDiscussion.setBounds(97, 0, 152, 29);
		discussion.add(lblDiscussion);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setIcon(new ImageIcon(dashboard.class.getResource("/assets/discuss.png")));
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setBounds(14, 0, 73, 29);
		discussion.add(lblNewLabel_1_1_1);
		
		
		JPanel activitybtn = new JPanel();
		activitybtn.setBorder(new LineBorder(new Color(95, 158, 160), 1, true));
		activitybtn.setBackground(new Color(0, 128, 128));
		activitybtn.addMouseListener(new PanelMouseAdapter(activitybtn) {
			public void mouseClicked(java.awt.event.MouseEvent e)
			{
				showpanel(activityList);
				ActivityList.tabbedPane.setSelectedIndex(0);
			}
		});
		activitybtn.setBounds(10, 390, 249, 29);
		panel.add(activitybtn);
		activitybtn.setLayout(null);
		
		JLabel vclabel = new JLabel("ACTIVITY");
		vclabel.setBounds(97, 0, 152, 29);
		vclabel.setHorizontalAlignment(SwingConstants.LEFT);
		vclabel.setForeground(Color.WHITE);
		vclabel.setFont(new Font("Dialog", Font.BOLD, 24));
		activitybtn.add(vclabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(dashboard.class.getResource("/assets/activity.png")));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(10, 0, 73, 29);
		activitybtn.add(lblNewLabel_1_1);
		
		JPanel quizbtn = new JPanel();
		quizbtn.setBorder(new LineBorder(new Color(95, 158, 160)));
		quizbtn.setBackground(new Color(0, 128, 128));
		quizbtn.setBounds(10, 430, 249, 29);
		quizbtn.addMouseListener(new PanelMouseAdapter(quizbtn));
		panel.add(quizbtn);
		quizbtn.setLayout(null);
		
		JLabel quizlabel = new JLabel("QUIZ");
		quizlabel.setBounds(97, 0, 152, 29);
		quizlabel.setHorizontalAlignment(SwingConstants.LEFT);
		quizlabel.setForeground(Color.WHITE);
		quizlabel.setFont(new Font("Dialog", Font.BOLD, 24));
		quizbtn.add(quizlabel);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon(dashboard.class.getResource("/assets/ideas.png")));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(10, 0, 73, 29);
		quizbtn.add(lblNewLabel_1_2);
		
		JPanel logoutbtn = new JPanel();
		logoutbtn.setBorder(new LineBorder(new Color(95, 158, 160)));
		logoutbtn.setBackground(new Color(0, 128, 128));
		logoutbtn.addMouseListener(new PanelMouseAdapter(logoutbtn) {
			public void mouseClicked(java.awt.event.MouseEvent e)
			{
				new game.login().setVisible(true);
				dashboard.this.dispose();
			}
		});
		logoutbtn.setBounds(10, 470, 249, 29);
		panel.add(logoutbtn);
		logoutbtn.setLayout(null);
		
		JLabel logout = new JLabel("LOGOUT");
		logout.setBounds(97, 0, 152, 29);
		logout.setHorizontalAlignment(SwingConstants.LEFT);
		logout.setForeground(Color.WHITE);
		logout.setFont(new Font("Dialog", Font.BOLD, 24));
		logoutbtn.add(logout);
		
		JLabel lblNewLabel_1_3 = new JLabel("");
		lblNewLabel_1_3.setIcon(new ImageIcon(dashboard.class.getResource("/assets/logout.png")));
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setBounds(10, 0, 73, 29);
		logoutbtn.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_2 = new JLabel("STUDENT'S DASHBOARD");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 21));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(10, 243, 265, 43);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setText("Hello " + login.infos.get(3)+ " " + login.infos.get(4));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(10, 11, 255, 21);
		panel.add(lblNewLabel_3);
		
		
		content = new JPanel();
		content.setBorder(null);
		content.setBackground(new Color(255, 255, 255));
		content.setBounds(285, 11, 769, 491);
		contentPane.add(content);
		content.setLayout(null);
		
		content.add(activityList);
		content.add(Home);
		
		showpanel(Home);
	}
	
	public static void showpanel(JPanel panel) {
		activityList.setVisible(false);
		Home.setVisible(false);
		
		panel.setVisible(true);
		
	}
	public class PanelMouseAdapter extends MouseAdapter{
		JPanel panel;
		public PanelMouseAdapter(JPanel panel)
		{
			this.panel = panel;
		}
		@Override
		public void mouseEntered(java.awt.event.MouseEvent e)
		{
			panel.setBackground(new Color(0, 150, 128));
		}
		@Override
		public void mouseExited(java.awt.event.MouseEvent e)
		{
			panel.setBackground(new Color(0, 128, 128));
		}
		@Override
		public void mousePressed(java.awt.event.MouseEvent e)
		{
			panel.setBackground(new Color(0, 250, 154));
		}
		@Override
		public void mouseReleased(java.awt.event.MouseEvent e)
		{
			panel.setBackground(new Color(0, 128, 128));
		}
		@Override
		public void mouseClicked(java.awt.event.MouseEvent e) {
		}
	}
}
