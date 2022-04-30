package teacher;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;

import database.connection;

public class act1_record extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 * @throws Exception 
	 */
	public act1_record() throws Exception {
		setBackground(new Color(255, 255, 255));
		setBounds(0,0,769,490);
		setLayout(null);
		
		JLabel name = new JLabel("");
		name.setBounds(10, 134, 69, 23);
		add(name);
		
		JLabel lname = new JLabel("");
		lname.setBounds(10, 168, 69, 23);
		add(lname);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(113, 115, 141, 33);
		add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(502, 115, 141, 33);
		add(comboBox_1);
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox_1.removeAllItems();
				ArrayList<String> record_id;
				try {
					record_id = new connection().getAct1AttemptID(comboBox.getSelectedItem().toString());
					for(String record:record_id)
					{
						comboBox_1.addItem(record);
					}
					ArrayList <String> userinfo = new connection().userInfo(comboBox.getSelectedItem().toString());
					name.setText(userinfo.get(0).toString());
					lname.setText(userinfo.get(1).toString());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				
				
			}
		});
		JLabel lblNewLabel = new JLabel("Student ID");
		lblNewLabel.setBounds(113, 90, 114, 14);
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
		JLabel lblAttemptId = new JLabel("Attempt ID");
		lblAttemptId.setBounds(502, 90, 114, 14);
		add(lblAttemptId);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(113, 172, 288, 239);
		add(scrollPane);
		
		table = new JTable();
		String[] columns = {"WORD", "ACCURACY"};
		DefaultTableModel model = new DefaultTableModel(columns,0);
		table.setModel(model);
		scrollPane.setViewportView(table);
		table.setRowSelectionAllowed(false);
		table.getTableHeader().setOpaque(false);
		table.getTableHeader().setBackground(new Color(32,136,203));
		table.getTableHeader().setForeground(new Color(255,255,255));
		table.setRowHeight(25);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(SystemColor.activeCaptionBorder);
		textPane.setEditable(false);
		textPane.setBounds(411, 175, 288, 236);
		add(textPane);
		
		JButton btnNewButton = new JButton("GET RECORDS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.setRowCount(0);
				textPane.setText("");
				try {
					ArrayList<String>records = new connection().getAct1Records(comboBox_1.getSelectedItem().toString());
					String[] toSpeech = {"floccinaucinihilipilification","supercalifragilisticexpialidocious","pseudopseudohypoparathyroidism","hippopotomonstrosesquippedaliophobia","pneumonoultramicroscopicsilicovolcanokoniosis"};
					
					for(int x = 0;x<records.size()-1;x++)
					{
						String[] rows = {toSpeech[x],records.get(x)};
						model.addRow(rows);
					}
					textPane.setText(records.get(records.size()-1));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(110, 422, 130, 23);
		add(btnNewButton);
		
		JLabel lblActivityRecords = new JLabel("ACTIVITY 1 RECORDS");
		lblActivityRecords.setFont(new Font("Dialog", Font.BOLD, 28));
		lblActivityRecords.setBounds(230, 29, 363, 24);
		add(lblActivityRecords);
		

		
	}
}
