package student;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;

import activity.*;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ActivityList extends JPanel {
	Activity1 activity1;
	Activity1 activity2;
	Activity1 activity3;
	public static JTabbedPane tabbedPane;
	/**
	 * Create the panel.
	 */
	public ActivityList() {
		activity1 = new Activity1("phonetics");
		activity2 = new Activity1("indigo");
		activity3 = new Activity1("computerist");
		
		setBackground(Color.WHITE);
		setBounds(0, 0, 769, 651);
		setLayout(null);
		
		 tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, -43,769, 694);
		add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("New tab", null, panel, null);
		panel.setLayout(null);
		
		JButton activity3btn = new JButton("ACTIVITY 1");
		activity3btn.setForeground(new Color(255, 255, 255));
		activity3btn.setFont(new Font("Dialog", Font.BOLD, 21));
		activity3btn.setBackground(new Color(85, 107, 47));
		activity3btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		activity3btn.setBounds(56, 140, 215, 79);
		panel.add(activity3btn);
		
		JButton btnNewButton = new JButton("ACTIVITY 2");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 21));
		btnNewButton.setBackground(new Color(85, 107, 47));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		btnNewButton.setBounds(286, 140, 215, 79);
		panel.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("ACTIVITY 3");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Dialog", Font.BOLD, 21));
		btnNewButton_2.setBackground(new Color(85, 107, 47));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(3);
			}
		});
		btnNewButton_2.setBounds(510, 140, 215, 79);
		panel.add(btnNewButton_2);
		
		tabbedPane.addTab("Activity 1", null,activity1,null);
		tabbedPane.addTab("Activity 2", null,activity2,null);
		tabbedPane.addTab("Activity 3", null,activity3,null);
	}
}
