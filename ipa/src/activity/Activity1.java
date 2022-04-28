package activity;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import student.ActivityList;
import student.dashboard;
import student.play_voice;
import student.record_voice;
import student.speect2text;
import student.text2speech;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

import database.connection;

import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.SystemColor;

public class Activity1 extends JPanel {
	 int filename = random();
	/**
	 * Create the panel.
	 */
	
	private int random() {
		return new Random().nextInt(100000);
		
	}
	ArrayList <String> accuracy = new ArrayList<String>();
	ArrayList <String> pronoun = new ArrayList<String>();
	ArrayList <String> filenamelist = new ArrayList<String>();
	
	
	JPanel panel;
	JPanel panel2;
	JPanel panel3;
	JPanel panel4;
	JPanel panel5;
	JPanel part2;
	public Activity1(String text) {
//		activityList = new student.ActivityList();
		setForeground(new Color(255, 255, 255));
		setBorder(new LineBorder(new Color(95, 158, 160)));
		setBackground(new Color(255, 255, 255));
		setBounds(0, 0, 769, 491);
		setLayout(null);
		 panel5 = new JPanel();
		panel5.setLayout(null);
		panel5.setBackground(Color.WHITE);
		panel5.setBounds(0, 56, 769, 435);
		add(panel5);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("pneumonoultramicroscopicsilicovolcanokoniosis");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_1_1_1_1.setBounds(182, 59, 425, 64);
		panel5.add(lblNewLabel_1_1_1_1);
		
		JButton btnNewButton_2_1_1_1 = new JButton("Click to Listen\r\n");
		btnNewButton_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new text2speech("pneumonoultramicroscopicsilicovolcanokoniosis");
					
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ExecutionException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2_1_1_1.setForeground(Color.WHITE);
		btnNewButton_2_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnNewButton_2_1_1_1.setBackground(Color.GREEN);
		btnNewButton_2_1_1_1.setBounds(198, 187, 181, 49);
		panel5.add(btnNewButton_2_1_1_1);
		
		JButton btnNewButton_1_1_1_1_1 = new JButton("");
		btnNewButton_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new record_voice(filename);			
				try {
					new speect2text(filename + "_record.wav","pneumonoultramicroscopicsilicovolcanokoniosis");
					accuracy.add(speect2text.accuracy);
					pronoun.add(speect2text.pronoun);
					filenamelist.add(filename+"_record.wav");
					panel_show(part2);
				}
				catch(Exception e1)
				{
					
				}
			}
		});
		btnNewButton_1_1_1_1_1.setIcon(new ImageIcon(Activity1.class.getResource("/assets/mic.png")));
		btnNewButton_1_1_1_1_1.setOpaque(false);
		btnNewButton_1_1_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnNewButton_1_1_1_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1_1_1_1.setBounds(450, 134, 148, 137);
		panel5.add(btnNewButton_1_1_1_1_1);
		
		 panel4 = new JPanel();
		panel4.setLayout(null);
		panel4.setBackground(Color.WHITE);
		panel4.setBounds(0, 56, 769, 435);
		add(panel4);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("hippopotomonstrosesquippedaliophobia");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_1_1_1.setBounds(198, 59, 372, 64);
		panel4.add(lblNewLabel_1_1_1);
		
		JButton btnNewButton_2_1_1 = new JButton("Click to Listen\r\n");
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new text2speech("hippopotomonstrosesquippedaliophobia");
					
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ExecutionException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2_1_1.setForeground(Color.WHITE);
		btnNewButton_2_1_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnNewButton_2_1_1.setBackground(Color.GREEN);
		btnNewButton_2_1_1.setBounds(198, 187, 181, 49);
		panel4.add(btnNewButton_2_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("");
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new record_voice(filename);			
				try {
					new speect2text(filename + "_record.wav","hippopotomonstrosesquippedaliophobia");
					accuracy.add(speect2text.accuracy);
					pronoun.add(speect2text.pronoun);
					filenamelist.add(filename+"_record.wav");
					panel_show(panel5);
				}
				catch(Exception e1)
				{
					
				}
			}
		});
		btnNewButton_1_1_1_1.setIcon(new ImageIcon(Activity1.class.getResource("/assets/mic.png")));
		btnNewButton_1_1_1_1.setOpaque(false);
		btnNewButton_1_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnNewButton_1_1_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1_1_1.setBounds(450, 134, 148, 137);
		panel4.add(btnNewButton_1_1_1_1);
		
		 panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBackground(Color.WHITE);
		panel3.setBounds(0, 56, 769, 435);
		add(panel3);
		
		JLabel lblNewLabel_1_1 = new JLabel("pseudopseudohypoparathyroidism");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(218, 59, 350, 64);
		panel3.add(lblNewLabel_1_1);
		
		JButton btnNewButton_2_1 = new JButton("Click to Listen\r\n");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new text2speech("pseudopseudohypoparathyroidism");
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ExecutionException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2_1.setForeground(Color.WHITE);
		btnNewButton_2_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnNewButton_2_1.setBackground(Color.GREEN);
		btnNewButton_2_1.setBounds(198, 187, 181, 49);
		panel3.add(btnNewButton_2_1);
		
		JButton btnNewButton_1_1_1 = new JButton("");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new record_voice(filename);			
				try {
					new speect2text(filename + "_record.wav","pseudopseudohypoparathyroidism");
					accuracy.add(speect2text.accuracy);
					pronoun.add(speect2text.pronoun);
					filenamelist.add(filename+"_record.wav");
					
					panel_show(panel4);
				}
				catch(Exception e1)
				{
					
				}
				
			}
		});
		btnNewButton_1_1_1.setIcon(new ImageIcon(Activity1.class.getResource("/assets/mic.png")));
		btnNewButton_1_1_1.setOpaque(false);
		btnNewButton_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnNewButton_1_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1_1.setBounds(450, 134, 148, 137);
		panel3.add(btnNewButton_1_1_1);
		
		 panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBackground(Color.WHITE);
		panel2.setBounds(0, 56, 769, 435);
		add(panel2);
		
		JLabel lblNewLabel_1 = new JLabel("supercalifragilisticexpialidocious");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_1.setBounds(218, 59, 322, 64);
		panel2.add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("Click to Listen\r\n");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new text2speech("supercalifragilisticexpialidocious");
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ExecutionException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnNewButton_2.setBackground(Color.GREEN);
		btnNewButton_2.setBounds(198, 187, 181, 49);
		panel2.add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new record_voice(filename);			
				try {
					new speect2text(filename + "_record.wav","supercalifragilisticexpialidocious");
					accuracy.add(speect2text.accuracy);
					pronoun.add(speect2text.pronoun);
					filenamelist.add(filename+"_record.wav");
					panel_show(panel3);
				}
				catch(Exception e1)
				{
					
				}
			}
		});
		btnNewButton_1_1.setIcon(new ImageIcon(Activity1.class.getResource("/assets/mic.png")));
		btnNewButton_1_1.setOpaque(false);
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(450, 134, 148, 137);
		panel2.add(btnNewButton_1_1);
		
		 panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 56, 769, 435);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("floccinaucinihilipilification");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel.setBounds(218, 59, 322, 64);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Click to Listen\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new text2speech("floccinaucinihilipilification");
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ExecutionException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnNewButton.setBounds(198, 187, 181, 49);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new record_voice(filename);			
				try {
					new speect2text(filename + "_record.wav","floccinaucinihilipilification");
					accuracy.add(speect2text.accuracy);
					pronoun.add(speect2text.pronoun);
					filenamelist.add(filename+"_record.wav");
					panel_show(panel2);
				}
				catch(Exception e1)
				{
					
				}
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Activity1.class.getResource("/assets/mic.png")));
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(450, 134, 148, 137);
		panel.add(btnNewButton_1);
		
		 part2 = new JPanel();
		part2.setBackground(SystemColor.activeCaption);
		part2.setBounds(0, 0, 769, 491);
		add(part2);
		part2.setLayout(null);
		
		JTextPane lblNewLabel_2 = new JTextPane();
		lblNewLabel_2.setText("PART 2\r\nInstructions: Reflecting on the importance of the speech organs, what do you think is the function of each in the process of speech production? What metaphor best represents it? Explain your answers by typing your response inside the box provided.\r\n");
		lblNewLabel_2.setBounds(10, 0, 759, 57);
		part2.add(lblNewLabel_2);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(Color.WHITE);
		textPane.setBounds(68, 111, 644, 247);
		part2.add(textPane);
		
		JButton btnNewButton_3 = new JButton("SUBMIT");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new database.connection();
				
				try {
					connection.submitActivity1(random()+"_attempt", accuracy, textPane.getText().toString(), filenamelist.get(0));
					JOptionPane.showMessageDialog(null,"ACTIVITY SUMBITTED");
					accuracy.clear();
					filenamelist.clear();
					textPane.setText("");
					ActivityList.tabbedPane.setSelectedIndex(0);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_3.setFont(new Font("Dialog", Font.BOLD, 25));
		btnNewButton_3.setBackground(Color.GREEN);
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBounds(301, 369, 178, 44);
		part2.add(btnNewButton_3);
		
		JTextPane txtpnPartInstructions = new JTextPane();
		txtpnPartInstructions.setEditable(false);
		txtpnPartInstructions.setBackground(Color.WHITE);
		txtpnPartInstructions.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtpnPartInstructions.setText("PART 1\r\nInstructions: Listen to the audio recordings and try to utter what you have heard.\r\n");
		txtpnPartInstructions.setBounds(10, 11, 713, 48);
		add(txtpnPartInstructions);
		setVisible(true);
		setVisible(true);
		panel_show(panel);
	}
	
	public void panel_show(JPanel panelz)
	{
		JPanel[] panels = {panel,panel2,panel3,panel4,panel5,part2};
		for(JPanel hidepanel: panels)
		{
			hidepanel.setVisible(false);
		}
		panelz.setVisible(true);
	}
}
