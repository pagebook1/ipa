package student;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class home extends JPanel {

	/**
	 * Create the panel.
	 */
	public home() {
		setBackground(new Color(255, 255, 255));
		setBounds(0, 0, 769, 651);
		setVisible(true);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Overview");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 35));
		lblNewLabel.setBounds(0, 0, 160, 60);
		add(lblNewLabel);
		
		JLabel lblWhat = new JLabel("WHAT");
		lblWhat.setFont(new Font("Dialog", Font.BOLD, 35));
		lblWhat.setBounds(94, 136, 160, 60);
		add(lblWhat);
		
		JLabel lblWho = new JLabel("WHO");
		lblWho.setFont(new Font("Dialog", Font.BOLD, 35));
		lblWho.setBounds(190, 303, 160, 60);
		add(lblWho);
		
		JLabel lblWhy = new JLabel("WHY");
		lblWhy.setFont(new Font("Dialog", Font.BOLD, 35));
		lblWhy.setBounds(496, 136, 160, 60);
		add(lblWhy);
		
		JLabel lblHow = new JLabel("HOW");
		lblHow.setFont(new Font("Dialog", Font.BOLD, 35));
		lblHow.setBounds(427, 303, 160, 60);
		add(lblHow);

	}

}
