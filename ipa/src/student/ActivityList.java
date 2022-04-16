package student;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.Font;
import javax.swing.SwingConstants;

import activity.*;
import student.dashboard.PanelMouseAdapter;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class ActivityList extends JPanel {

	/**
	 * Create the panel.
	 */
	
	Activity1 activity1;
	Activity2 activity2;
	Activity3 activity3;
	JPanel activity1btn = new JPanel();
	JPanel activity2btn = new JPanel();
	JPanel activity3btn = new JPanel();
	JPanel content = new JPanel();
	
	public ActivityList() {
		activity1 = new Activity1();
		activity2 = new Activity2();
		activity3 = new Activity3();
		
		
		setBackground(new Color(255, 255, 255));
		setBounds(0, 0, 769, 651);
		setLayout(null);
		add(content);
		
		add(activity1);
		add(activity2);
		add(activity3);
		
		showActivity(content);
		
		
		content.setBounds(0, 0, 769, 651);
		content.setLayout(null);
		
		
		activity1btn.setBackground(new Color(0, 128, 128));
		activity1btn.setBorder(new LineBorder(new Color(0, 0, 0)));
		activity1btn.setBounds(54, 59, 199, 77);
		activity1btn.addMouseListener(new PanelMouseAdapter(activity1btn) {
			public void mouseClicked(java.awt.event.MouseEvent e)
			{
				showActivity(activity1);
				content.setVisible(false);
			}
		});
		content.add(activity1btn);
		activity1btn.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Activity 1");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 199, 77);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 24));
		activity1btn.add(lblNewLabel);
		
		activity2btn.setBackground(new Color(0, 128, 128));
		activity2btn.setBorder(new LineBorder(new Color(0, 0, 0)));
		activity2btn.setLayout(null);
		activity2btn.setBounds(263, 59, 199, 77);
		activity2btn.addMouseListener(new PanelMouseAdapter(activity2btn) {
			public void mouseClicked(java.awt.event.MouseEvent e)
			{
				showActivity(activity2);
				content.setVisible(false);
			}
		});
		content.add(activity2btn);
		
		JLabel lblNewLabel_1_2 = new JLabel("Activity 2");
		lblNewLabel_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.BOLD, 24));
		lblNewLabel_1_2.setBounds(0, 0, 199, 77);
		activity2btn.add(lblNewLabel_1_2);
		
		activity3btn.setBackground(new Color(0, 128, 128));
		activity3btn.setBorder(new LineBorder(new Color(0, 0, 0)));
		activity3btn.setLayout(null);
		activity3btn.setBounds(472, 59, 199, 77);
		activity3btn.addMouseListener(new PanelMouseAdapter(activity3btn) {
			public void mouseClicked(java.awt.event.MouseEvent e)
			{
				showActivity(activity3);
				content.setVisible(false);
			}
		});
		content.add(activity3btn);
		
		JLabel lblNewLabel_1_3 = new JLabel("Activity 3");
		lblNewLabel_1_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Dialog", Font.BOLD, 24));
		lblNewLabel_1_3.setBounds(0, 0, 199, 77);
		activity3btn.add(lblNewLabel_1_3);

	}
	
	public void showActivity(JPanel panel) {
		activity1.setVisible(false);
		activity2.setVisible(false);
		activity3.setVisible(false);
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
