package teacher;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
				dashboard.tabbedPane.setSelectedIndex(2);
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 21));
		btnNewButton.setBackground(new Color(0, 102, 102));
		btnNewButton.setBounds(41, 128, 314, 92);
		panel.add(btnNewButton);
		
		JButton btnMannerOfArticulation = new JButton("MANNER OF ARTICULATION");
		btnMannerOfArticulation.setForeground(Color.WHITE);
		btnMannerOfArticulation.setFont(new Font("Dialog", Font.BOLD, 21));
		btnMannerOfArticulation.setBackground(new Color(0, 102, 102));
		btnMannerOfArticulation.setBounds(347, 268, 324, 92);
		panel.add(btnMannerOfArticulation);

	}

}
