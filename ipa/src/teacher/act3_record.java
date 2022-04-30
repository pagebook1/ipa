package teacher;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import database.connection;

public class act3_record extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	DefaultTableModel model;
	public act3_record() {
		setBackground(new Color(255, 255, 255));
		setBounds(0,0,769,490);
		setLayout(null);
		
		JLabel name = new JLabel("");
		name.setBounds(326, 133, 98, 20);
		add(name);
		
		JLabel lname = new JLabel("");
		lname.setBounds(326, 163, 98, 25);
		add(lname);
		


		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(485, 153, 198, 35);
		add(comboBox_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox_1.removeAllItems();
				model.setRowCount(0);
				try {
					ArrayList<String> record_id;
					record_id = new connection().getAct3Records(comboBox.getSelectedItem().toString());
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
		comboBox.setBounds(80, 153, 198, 35);
		add(comboBox);
		
		JLabel lblNewLabel = new JLabel("ACTIVITY 3 RECORDS\r\n");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 28));
		lblNewLabel.setBounds(234, 67, 363, 24);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("GET RECORDS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.setRowCount(0);
				try {
					ArrayList<String[]> records = new connection().getAct3Recording(comboBox_1.getSelectedItem().toString());
					int i = 0;
					while(i < records.get(0).length)
					{
						String[] object = {records.get(0)[i],records.get(1)[i],records.get(2)[i]};
						model.addRow(object);
						i++;
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBackground(new Color(0, 128, 128));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 17));
		btnNewButton.setBounds(134, 430, 198, 35);
		add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Student ID");
		lblNewLabel_1.setBounds(77, 115, 201, 27);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Attempt ID");
		lblNewLabel_1_1.setBounds(485, 115, 201, 27);
		add(lblNewLabel_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(74, 213, 620, 200);
		add(scrollPane);

		table = new JTable();
		String[] columns = {"WORD", "ANSWER", "Pronounciation Score"};
		 model = new DefaultTableModel(columns,0);
		table.setModel(model);
		scrollPane.setViewportView(table);
		table.setRowSelectionAllowed(false);
		table.getTableHeader().setOpaque(false);
		table.getTableHeader().setBackground(new Color(32,136,203));
		table.getTableHeader().setForeground(new Color(255,255,255));
		table.setRowHeight(25);
		
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
