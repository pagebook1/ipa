package teacher;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class DiscussionList extends JPanel {

	/**
	 * Create the panel.
	 */
	public DiscussionList() {
		setBackground(new Color(255, 255, 255));
		setBounds(0,0,769,691);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 764, 663);
		add(panel);
		
		JButton btnNewButton = new JButton("PLACE OF ARTICULATION");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dashboard.tabbedPane.setSelectedIndex(1);
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 21));
		btnNewButton.setBackground(new Color(0, 102, 102));
		btnNewButton.setBounds(46, 307, 314, 92);
		panel.add(btnNewButton);
		
		JButton btnMannerOfArticulation = new JButton("SPEECH ORGANS");
		btnMannerOfArticulation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dashboard.tabbedPane.setSelectedIndex(10);
			}
		});
		btnMannerOfArticulation.setForeground(Color.WHITE);
		btnMannerOfArticulation.setFont(new Font("Dialog", Font.BOLD, 21));
		btnMannerOfArticulation.setBackground(new Color(0, 102, 102));
		btnMannerOfArticulation.setBounds(46, 131, 324, 92);
		panel.add(btnMannerOfArticulation);
		
		JButton btnVoicedAndVoiceless = new JButton("VOICED AND VOICELESS");
		btnVoicedAndVoiceless.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dashboard.tabbedPane.setSelectedIndex(11);
			}
		});
		btnVoicedAndVoiceless.setForeground(Color.WHITE);
		btnVoicedAndVoiceless.setFont(new Font("Dialog", Font.BOLD, 21));
		btnVoicedAndVoiceless.setBackground(new Color(0, 102, 102));
		btnVoicedAndVoiceless.setBounds(385, 131, 324, 92);
		panel.add(btnVoicedAndVoiceless);

	}

}
