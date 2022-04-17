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
import java.util.Random;
import java.util.concurrent.ExecutionException;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class Activity1 extends JPanel {
	 int filename = random();
	 JLabel accuracy;
	 JLabel pronoun;
	 JLabel playrecordbtn;
	 JButton submitbtn;
	 JButton cancelbtn;
	/**
	 * Create the panel.
	 */
	
	private int random() {
		return new Random().nextInt(100000);
		
	}
	public Activity1(String text) {
//		activityList = new student.ActivityList();
		setForeground(new Color(255, 255, 255));
		setBorder(new LineBorder(new Color(95, 158, 160)));
		setBackground(new Color(255, 255, 255));
		setBounds(0, 0, 769, 651);
		setLayout(null);
		setVisible(true);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new record_voice(filename);
				try {
					new speect2text(filename + "_record.wav",text);
					accuracy.setText("Accuracy:" +speect2text.accuracy + "%");
					pronoun.setText("Pronounciation: " +speect2text.pronoun + "%");
					playrecordbtn.setVisible(true);
					submitbtn.setVisible(true);
					
					
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Activity1.class.getResource("/assets/mic.png")));
		lblNewLabel.setBounds(300, 294, 178, 169);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(text);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 24));
		lblNewLabel_1.setBounds(283, 156, 215, 56);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			
			public void mouseClicked(MouseEvent e) {
				try {
					new text2speech(text);
				} catch (InterruptedException | ExecutionException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			@Override
			public void mousePressed(MouseEvent e) {
				lblNewLabel_2.setIcon(new ImageIcon(Activity1.class.getResource("/assets/play-green.png")));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lblNewLabel_2.setIcon(new ImageIcon(Activity1.class.getResource("/assets/play.png")));
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon(Activity1.class.getResource("/assets/play.png")));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBounds(259, 156, 64, 56);
		add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 251, 227, 312);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Score");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_3.setBounds(83, 11, 58, 21);
		panel.add(lblNewLabel_3);
		
		 accuracy = new JLabel("Accuracy");
		accuracy.setHorizontalAlignment(SwingConstants.LEFT);
		accuracy.setFont(new Font("Dialog", Font.BOLD, 16));
		accuracy.setBounds(10, 72, 207, 21);
		panel.add(accuracy);
		 pronoun = new JLabel("Pronounciation");
		pronoun.setHorizontalAlignment(SwingConstants.LEFT);
		pronoun.setFont(new Font("Dialog", Font.BOLD, 16));
		pronoun.setBounds(10, 104, 207, 21);
		panel.add(pronoun);
		
		 playrecordbtn = new JLabel("");
		playrecordbtn.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				playrecordbtn.setIcon(new ImageIcon(Activity1.class.getResource("/assets/play-green.png")));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				playrecordbtn.setIcon(new ImageIcon(Activity1.class.getResource("/assets/play.png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				new play_voice(filename+"_record.wav");
			}
		});
		playrecordbtn.setIcon(new ImageIcon(Activity1.class.getResource("/assets/play-green.png")));
		playrecordbtn.setHorizontalAlignment(SwingConstants.LEFT);
		playrecordbtn.setBounds(77, 184, 64, 56);
		playrecordbtn.setVisible(false);
		panel.add(playrecordbtn);
		
		 submitbtn = new JButton("SUBMIT");
		submitbtn.setForeground(new Color(255, 255, 255));
		submitbtn.setBackground(new Color(0, 128, 128));
		submitbtn.setFont(new Font("Dialog", Font.BOLD, 11));
		submitbtn.setVisible(false);
		submitbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new database.connection().RecordInfo(filename+"_record.wav");
					JOptionPane.showMessageDialog(null, "Voice Record Saved!","Success",JOptionPane.INFORMATION_MESSAGE);
					ActivityList.tabbedPane.setSelectedIndex(0);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		submitbtn.setBounds(10, 278, 89, 23);
		panel.add(submitbtn);
		
		 cancelbtn = new JButton("CANCEL");
		 cancelbtn.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		new File(filename+"_record.wav").delete();
		 		ActivityList.tabbedPane.setSelectedIndex(0);
				random();		
				setVisible(false);
		 	}
		 });
		cancelbtn.setForeground(new Color(255, 255, 255));
		cancelbtn.setBackground(new Color(0, 128, 128));
		cancelbtn.setBounds(128, 278, 89, 23);
		panel.add(cancelbtn);
		setVisible(true);
	}
}
