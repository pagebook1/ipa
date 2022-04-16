package activity;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class Activity2 extends JPanel {

	/**
	 * Create the panel.
	 */
	public Activity2() {
		setBackground(new Color(255, 255, 255));
		setBounds(0, 0, 769, 651);
		setLayout(null);
		setVisible(true);
		
		JLabel lblActivity = new JLabel("activity2");
		lblActivity.setBounds(270, 234, 46, 14);
		add(lblActivity);
	}

}
