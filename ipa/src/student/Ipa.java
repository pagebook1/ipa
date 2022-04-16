package student;

import javax.sound.sampled.LineUnavailableException;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.Random;
import java.util.concurrent.ExecutionException;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Ipa extends JFrame {

	private JPanel contentPane;
	public static JFrame frame = new JFrame();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws LineUnavailableException 
	 */
	public Ipa() throws LineUnavailableException {
		int filename = new Random().nextInt(100000);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel text = new JLabel("Phonetics");
		text.setHorizontalAlignment(SwingConstants.CENTER);
		text.setFont(new Font("Tahoma", Font.PLAIN, 15));
		text.setBounds(403, 155, 304, 45);
		contentPane.add(text);
		
		JLabel accuracy = new JLabel("");
		accuracy.setBounds(64, 236, 158, 14);
		contentPane.add(accuracy);
		
		JLabel pronoun = new JLabel("");
		pronoun.setBounds(64, 265, 158, 14);
		contentPane.add(pronoun);
		
		JLabel complete = new JLabel("");
		complete.setBounds(64, 309, 158, 14);
		contentPane.add(complete);
		
		JLabel fluency = new JLabel("");
		fluency.setBounds(64, 340, 158, 14);
		contentPane.add(fluency);
		
		JLabel lblScore = new JLabel("Score");
		lblScore.setBounds(64, 211, 46, 14);
		contentPane.add(lblScore);
		
		JButton listen_btn = new JButton("Listen");
		listen_btn.setEnabled(false);
		listen_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new play_voice(filename+"_record.wav");
			}
		});
		listen_btn.setBounds(64, 135, 89, 23);
		contentPane.add(listen_btn);
		
		JButton record_btn = new JButton("Record");
		record_btn.setBounds(446, 268, 206, 55);
		record_btn.setBackground(Color.WHITE);
		record_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new record_voice(filename);
				try {
					new speect2text(filename + "_record.wav");
					accuracy.setText("Accuracy:" +speect2text.accuracy);
					pronoun.setText("Pronounciation: " +speect2text.pronoun);
					complete.setText("Completeness: " +speect2text.completeness);
					fluency.setText("Fluency" +speect2text.fluency);
					
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				listen_btn.setEnabled(true);
				}
		});
		contentPane.setLayout(null);
		contentPane.add(record_btn);
		
		JButton submitbtn = new JButton("Save");
		submitbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new database.connection().RecordInfo(filename+"_record.wav");
					JOptionPane.showMessageDialog(null, "Voice Record Saved!","Success",JOptionPane.INFORMATION_MESSAGE);
					setVisible(false);
					new dashboard().setVisible(true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		submitbtn.setBounds(427, 380, 89, 23);
		contentPane.add(submitbtn);
		
		JButton cancelbtn = new JButton("Cancel");
		cancelbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new dashboard().setVisible(true);
				
			}
		});
		cancelbtn.setBounds(567, 380, 89, 23);
		contentPane.add(cancelbtn);
		
		JButton play = new JButton("play");
		play.setBounds(406, 168, 89, 23);
		play.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				try {
					new text2speech("phonetics");
				} catch (InterruptedException | ExecutionException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			
		});
		contentPane.add(play);
		

		
	}
}
