package student;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import activity.Activity1;
import activity.Activity2;
import activity.Activity3;
import activity.Activity4;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ActivityList extends JPanel {
	Activity1 activity1;
	Activity2 activity2;
	Activity3 activity3;
	public static JTabbedPane tabbedPane;
	Activity4 activity4;
	/**
	 * Create the panel.
	 */
	public ActivityList() {
		activity1 = new Activity1("phonetics");
		activity2 = new	Activity2();
		activity3 = new Activity3();
		activity4 = new Activity4();
		setBackground(Color.WHITE);
		setBounds(0, 0, 769, 491);
		setLayout(null);
		
		 tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		 tabbedPane.setBackground(new Color(255, 255, 255));
		tabbedPane.setBounds(0, -43,769, 535);
		add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("New tab", null, panel, null);
		panel.setLayout(null);
		
		JButton activity3btn = new JButton("");
		activity3btn.setBorder(null);
		activity3btn.setIcon(new ImageIcon(ActivityList.class.getResource("/assets/person.png")));
		activity3btn.setForeground(new Color(255, 255, 255));
		activity3btn.setFont(new Font("Dialog", Font.BOLD, 21));
		activity3btn.setBackground(new Color(255, 255, 255));
		activity3btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		activity3btn.setBounds(36, 167, 165, 148);
		panel.add(activity3btn);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBorder(null);
		btnNewButton.setIcon(new ImageIcon(ActivityList.class.getResource("/assets/voice-message.png")));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 21));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		btnNewButton.setBounds(211, 167, 165, 149);
		panel.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setIcon(new ImageIcon(ActivityList.class.getResource("/assets/voice.png")));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Dialog", Font.BOLD, 21));
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(3);
			}
		});
		btnNewButton_2.setBounds(386, 167, 165, 148);
		panel.add(btnNewButton_2);
		
		JButton btnActivity4 = new JButton("");
		btnActivity4.setBorder(null);
		btnActivity4.setIcon(new ImageIcon(ActivityList.class.getResource("/assets/earphones.png")));
		btnActivity4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(4);
				
			}
		});
		btnActivity4.setForeground(Color.WHITE);
		btnActivity4.setFont(new Font("Dialog", Font.BOLD, 21));
		btnActivity4.setBackground(new Color(255, 255, 255));
		btnActivity4.setBounds(560, 167, 165, 148);
		panel.add(btnActivity4);
		
		JLabel lblNewLabel = new JLabel("ACTIVITY 1");
		lblNewLabel.setForeground(new Color(0, 128, 128));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel.setBounds(36, 118, 165, 38);
		panel.add(lblNewLabel);
		
		JLabel lblActivity = new JLabel("ACTIVITY 2");
		lblActivity.setForeground(new Color(0, 128, 128));
		lblActivity.setHorizontalAlignment(SwingConstants.CENTER);
		lblActivity.setFont(new Font("Dialog", Font.BOLD, 20));
		lblActivity.setBounds(211, 118, 165, 38);
		panel.add(lblActivity);
		
		JLabel lblActivity_1 = new JLabel("ACTIVITY 3");
		lblActivity_1.setForeground(new Color(0, 128, 128));
		lblActivity_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblActivity_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblActivity_1.setBounds(386, 118, 165, 38);
		panel.add(lblActivity_1);
		
		JLabel lblActivity_2 = new JLabel("ACTIVITY 4");
		lblActivity_2.setForeground(new Color(0, 128, 128));
		lblActivity_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblActivity_2.setFont(new Font("Dialog", Font.BOLD, 20));
		lblActivity_2.setBounds(560, 118, 165, 38);
		panel.add(lblActivity_2);
		
		tabbedPane.addTab("Activity 1", null,activity1,null);
		tabbedPane.addTab("Activity 2", null,activity2,null);
		tabbedPane.addTab("Activity 3", null,activity3,null);
		tabbedPane.addTab("New tab", null, activity4, null);
	}
}
