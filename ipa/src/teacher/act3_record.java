package teacher;

import java.awt.Color;

import javax.swing.JPanel;

import database.connection;
import student.play_voice;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class act3_record extends JPanel {

	/**
	 * Create the panel.
	 */
	public act3_record() {
		setBackground(new Color(255, 255, 255));
		setBounds(0,0,769,490);
		setLayout(null);
		

		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(485, 188, 198, 35);
		add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(287, 279, 198, 35);
		add(comboBox_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox_1.removeAllItems();
				comboBox_2.removeAllItems();
				try {
					ArrayList<String> record_id;
					record_id = new connection().getAct3Records(comboBox.getSelectedItem().toString());
					for(String record:record_id)
					{
						comboBox_1.addItem(record);
					}
					
					ArrayList<String> attempts = new connection().getAct3Recording(comboBox_1.getSelectedItem().toString());
					for(String attempt:attempts)
					{
						comboBox_2.addItem(attempt);
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		comboBox.setBounds(80, 188, 198, 35);
		add(comboBox);
		
		JLabel lblNewLabel = new JLabel("ACTIVITY 3 RECORDS\r\n");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 28));
		lblNewLabel.setBounds(234, 67, 363, 24);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("PLAY");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new play_voice(comboBox_2.getSelectedItem().toString());
			}
		});
		btnNewButton.setBackground(new Color(0, 128, 128));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 17));
		btnNewButton.setBounds(288, 344, 198, 35);
		add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Student ID");
		lblNewLabel_1.setBounds(77, 150, 201, 27);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Attempt ID");
		lblNewLabel_1_1.setBounds(482, 150, 201, 27);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Poems Records");
		lblNewLabel_1_2.setBounds(284, 241, 201, 27);
		add(lblNewLabel_1_2);
		
		try {
			ArrayList<String> studentid = new connection().studentID();
			for(String id:studentid) {
				comboBox.addItem(id);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
