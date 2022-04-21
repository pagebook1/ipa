package teacher;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import database.connection;
import student.play_voice;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class act2_record extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 * @throws Exception 
	 */
	public act2_record() throws Exception {
		setBackground(new Color(255, 255, 255));
		setBounds(0,0,769,691);
		setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(88, 115, 286, 57);
		add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(402, 115, 286, 57);
		add(comboBox_1);
		
		JLabel lblNewLabel = new JLabel("Student ID");
		lblNewLabel.setBounds(88, 90, 114, 14);
		add(lblNewLabel);
		
		try {
			ArrayList<String> studentid = new connection().studentID();
			for(String id:studentid) {
				comboBox.addItem(id);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<String> record_id = new connection().getAct2Records(comboBox.getSelectedItem().toString());
		for(String record:record_id)
		{
			comboBox_1.addItem(record);
		}
		
		JLabel lblAttemptId = new JLabel("Attempt ID");
		lblAttemptId.setBounds(402, 90, 114, 14);
		add(lblAttemptId);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(110, 231, 530, 239);
		add(scrollPane);
		
		table = new JTable();
		String[] columns = {"WORD", "ACCURACY", "PRONOUNCIATION"};
		DefaultTableModel model = new DefaultTableModel(columns,0);
		table.setModel(model);
		scrollPane.setViewportView(table);
		table.setRowSelectionAllowed(false);
		table.getTableHeader().setOpaque(false);
		table.getTableHeader().setBackground(new Color(32,136,203));
		table.getTableHeader().setForeground(new Color(255,255,255));
		table.setRowHeight(25);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setEnabled(false);
		comboBox_2.setBounds(418, 481, 154, 23);
		add(comboBox_2);
		
		JButton playbtn = new JButton("PLAY");
		playbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new play_voice(comboBox_2.getSelectedItem().toString());
			}
		});
		playbtn.setEnabled(false);
		playbtn.setBounds(571, 481, 71, 23);
		add(playbtn);

		
		JButton btnNewButton = new JButton("GET RECORDS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.setRowCount(0);
				try {
					ArrayList<ArrayList>records = new connection().getAct2Scores(comboBox_1.getSelectedItem().toString());
					String[] toSpeech = {"liberty","dull","give","joust","crevice","gauze","with","vowed","petal","but","work","chalice","friend","spikey","think","which"};
					int x = 0;
					for(Object record:records.get(0))
					{
							String[] row = {toSpeech[x],record.toString(),records.get(1).get(x).toString()};
							comboBox_2.addItem(records.get(2).get(x));
							model.addRow(row);
							x++;
					}
					comboBox_2.setEnabled(true);
					playbtn.setEnabled(true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(325, 535, 130, 23);
		add(btnNewButton);
		
	}
}