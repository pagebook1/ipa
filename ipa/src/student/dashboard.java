package student;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.MouseInputAdapter;

import org.w3c.dom.events.MouseEvent;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.border.LineBorder;
import java.awt.Window.Type;

public class dashboard extends JFrame {
	JPanel content;
	private JPanel contentPane;
	ActivityList activityList;
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
		activityList.setLocation(0, 0);
		setType(Type.POPUP);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 720);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		panel.setBounds(0, 0, 275, 681);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(10, 11, 249, 262);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(dashboard.class.getResource("/assets/attachment_29200812.png")));
		
		JPanel homebtn = new JPanel();
		homebtn.setBorder(new LineBorder(new Color(95, 158, 160), 1, true));
		homebtn.setBackground(new Color(0, 128, 128));
		homebtn.addMouseListener(new PanelMouseAdapter(homebtn) {
			public void mouseClicked(java.awt.event.MouseEvent e)
			{
				
			}
		});
		homebtn.setBounds(10, 310, 249, 50);
		panel.add(homebtn);
		homebtn.setLayout(null);
		
		JLabel homelabel = new JLabel("HOME");
		homelabel.setBounds(97, 0, 152, 50);
		homelabel.setForeground(new Color(255, 255, 255));
		homelabel.setHorizontalAlignment(SwingConstants.LEFT);
		homelabel.setFont(new Font("Dialog", Font.BOLD, 24));
		homebtn.add(homelabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(dashboard.class.getResource("/assets/house.png")));
		lblNewLabel_1.setBounds(10, 0, 73, 50);
		homebtn.add(lblNewLabel_1);
		
		
		JPanel discussion = new JPanel();
		discussion.setBorder(new LineBorder(new Color(95, 158, 160)));
		discussion.setBackground(new Color(0, 128, 128));
		discussion.setBounds(10, 371, 249, 50);
		panel.add(discussion);
		discussion.setLayout(null);
		
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
		activitybtn.setBorder(new LineBorder(new Color(95, 158, 160), 1, true));
		activitybtn.setBackground(new Color(0, 128, 128));
		activitybtn.addMouseListener(new PanelMouseAdapter(activitybtn) {
			public void mouseClicked(java.awt.event.MouseEvent e)
			{
				activityList.setVisible(true);
				activityList.content.setVisible(true);
			}
		});
		activitybtn.setBounds(10, 432, 249, 50);
		panel.add(activitybtn);
		activitybtn.setLayout(null);
		
		JLabel vclabel = new JLabel("ACTIVITY");
		vclabel.setBounds(97, 0, 152, 50);
		vclabel.setHorizontalAlignment(SwingConstants.LEFT);
		vclabel.setForeground(Color.WHITE);
		vclabel.setFont(new Font("Dialog", Font.BOLD, 24));
		activitybtn.add(vclabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(dashboard.class.getResource("/assets/activity.png")));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(10, 0, 73, 50);
		activitybtn.add(lblNewLabel_1_1);
		
		JPanel quizbtn = new JPanel();
		quizbtn.setBorder(new LineBorder(new Color(95, 158, 160)));
		quizbtn.setBackground(new Color(0, 128, 128));
		quizbtn.setBounds(10, 498, 249, 50);
		quizbtn.addMouseListener(new PanelMouseAdapter(quizbtn));
		panel.add(quizbtn);
		quizbtn.setLayout(null);
		
		JLabel quizlabel = new JLabel("QUIZ");
		quizlabel.setBounds(97, 0, 152, 50);
		quizlabel.setHorizontalAlignment(SwingConstants.LEFT);
		quizlabel.setForeground(Color.WHITE);
		quizlabel.setFont(new Font("Dialog", Font.BOLD, 24));
		quizbtn.add(quizlabel);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon(dashboard.class.getResource("/assets/ideas.png")));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(10, 0, 73, 50);
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
		logoutbtn.setBounds(10, 559, 249, 50);
		panel.add(logoutbtn);
		logoutbtn.setLayout(null);
		
		JLabel logout = new JLabel("LOGOUT");
		logout.setBounds(97, 0, 152, 50);
		logout.setHorizontalAlignment(SwingConstants.LEFT);
		logout.setForeground(Color.WHITE);
		logout.setFont(new Font("Dialog", Font.BOLD, 24));
		logoutbtn.add(logout);
		
		JLabel lblNewLabel_1_3 = new JLabel("");
		lblNewLabel_1_3.setIcon(new ImageIcon(dashboard.class.getResource("/assets/logout.png")));
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setBounds(10, 0, 73, 50);
		logoutbtn.add(lblNewLabel_1_3);
		
		
		content = new JPanel();
		content.setBorder(null);
		content.setBackground(new Color(255, 255, 255));
		content.setBounds(285, 11, 769, 651);
		contentPane.add(content);
		content.setLayout(null);
		
		content.add(activityList);
		
		
		JButton lpabtn = new JButton("Voice Activity");
		lpabtn.setBounds(44, 38, 139, 62);
		content.add(lpabtn);
		lpabtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					new Ipa().setVisible(true);
					setVisible(false);
					
				} catch (LineUnavailableException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		showpanel(content);
	}
	
	public void showpanel(JPanel panel) {
		activityList.setVisible(false);
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
