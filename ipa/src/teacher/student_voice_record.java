package teacher;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import database.connection;
import student.play_voice;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class student_voice_record extends JFrame {

	private JPanel contentPane;
	public static String StudentID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					student_voice_record frame = new student_voice_record();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public student_voice_record() throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel());
		comboBox.setBounds(240, 183, 288, 22);
		contentPane.add(comboBox);
		
		JButton playbtn = new JButton("Play");
		playbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new play_voice(comboBox.getSelectedItem().toString());
			}
		});
		playbtn.setBounds(330, 281, 89, 23);
		contentPane.add(playbtn);
		
		JComboBox student_id = new JComboBox();
		student_id.setModel(new DefaultComboBoxModel(new String[] {""}));
		student_id.setBounds(39, 183, 110, 22);
		for(String a:connection.studentID())
		{
			student_id.addItem(a);
		}
		student_id.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.print("h");
				comboBox.removeAllItems();
				StudentID = student_id.getSelectedItem().toString();
				try {
					for(String a:connection.listRecord())
					{
						comboBox.addItem(a);
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			
		});
		contentPane.add(student_id);
		
		JLabel lblNewLabel = new JLabel("Student ID");
		lblNewLabel.setBounds(39, 158, 89, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblVoiceRecord = new JLabel("Voice Record");
		lblVoiceRecord.setBounds(240, 158, 89, 14);
		contentPane.add(lblVoiceRecord);
		
	}
}
