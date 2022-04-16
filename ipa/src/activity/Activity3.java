package activity;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class Activity3 extends JPanel {

	/**
	 * Create the panel.
	 */
	public Activity3() {
		setBackground(new Color(255, 255, 255));
		setBounds(0, 0, 769, 651);
		setLayout(null);
		setVisible(true);
		
		JLabel lblActivity = new JLabel("activity3");
		lblActivity.setBounds(348, 259, 46, 14);
		add(lblActivity);
	}

}
