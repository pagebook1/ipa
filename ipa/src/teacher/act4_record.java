package teacher;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import database.connection;
import student.play_voice;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;

public class act4_record extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 * @throws Exception 
	 */
	public act4_record() throws Exception {
		setBounds(0,0,769,691);
		setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(97, 133, 286, 57);
		add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(411, 133, 286, 57);
		add(comboBox_1);
		
		ArrayList<String> studentid = new connection().studentID();
		for(String studentID: studentid)
		{
			comboBox.addItem(studentID);
		}
		
		ArrayList<String> record_id = new connection().getAct4Records(comboBox.getSelectedItem().toString());
		for(String record:record_id)
		{
			comboBox_1.addItem(record);
		}
		
		JLabel lblNewLabel = new JLabel("Student ID");
		lblNewLabel.setBounds(97, 108, 114, 14);
		add(lblNewLabel);
		
		JLabel lblAttemptId = new JLabel("Attempt ID");
		lblAttemptId.setBounds(411, 108, 114, 14);
		add(lblAttemptId);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(107, 201, 525, 293);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		String[] columns = {"IPA SYMBOL","Extracted Words"};
		DefaultTableModel model = new DefaultTableModel(columns,0);
		table.setModel(model);
		scrollPane.setViewportView(table);
		table.setRowSelectionAllowed(false);
		table.getTableHeader().setOpaque(false);
		table.getTableHeader().setBackground(new Color(32,136,203));
		table.getTableHeader().setForeground(new Color(255,255,255));
		table.setRowHeight(25);
		
		JButton playbtn = new JButton("PLAY");
		playbtn.setBounds(519, 500, 71, 23);
		add(playbtn);
		
		JButton btnNewButton = new JButton("GET RECORDS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					model.setRowCount(0);
					ArrayList<String>records = new connection().getAct4Scores(comboBox_1.getSelectedItem().toString());
					String[] list = {"1","2","3","4","5","6","7"};
					
					int x = 0;
					while(x < records.size()-1)
					{
						String[] data = {x+"",records.get(x)};
						model.addRow(data);
						x++;
					}
					playbtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							new play_voice(records.get(7));
						}
					});
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(334, 553, 130, 23);
		add(btnNewButton);

	}

}
