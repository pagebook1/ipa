package quiz;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class quizlist extends JPanel {

	/**
	 * Create the panel.
	 */
	static JPanel quiz11panel;
	static JPanel quiz2panels;
	static JPanel quiz3panels;
	static JPanel quiz4panels;
	public static JPanel panel;
	public quizlist() {
		setBackground(Color.WHITE);
		setBounds(0,0,769, 491);
		setLayout(null);
		 
		  panel = new JPanel();
		 panel.setBackground(Color.WHITE);
		 panel.setBounds(0, 0, 769, 491);
		 add(panel);
		 panel.setLayout(null);
		 
		 JButton btnNewButton = new JButton("");
		 btnNewButton.setBorder(null);
		 btnNewButton.setIcon(new ImageIcon(quizlist.class.getResource("/assets/answer.png")));
		 btnNewButton.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		showpanel(quiz11panel);
//		 		quiz1panel.question_1.setVisible(true);
		 	}
		 });
		 btnNewButton.setForeground(Color.WHITE);
		 btnNewButton.setFont(new Font("Dialog", Font.BOLD, 35));
		 btnNewButton.setBackground(Color.WHITE);
		 btnNewButton.setBounds(68, 184, 154, 137);
		 panel.add(btnNewButton);
		 
		 JButton btnQuiz = new JButton("");
		 btnQuiz.setBorder(null);
		 btnQuiz.setIcon(new ImageIcon(quizlist.class.getResource("/assets/answer.png")));
		 btnQuiz.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		showpanel(quiz2panels);
//		 		quiz2panel.question_1.setVisible(true);
		 	}
		 });
		 btnQuiz.setForeground(Color.WHITE);
		 btnQuiz.setFont(new Font("Dialog", Font.BOLD, 35));
		 btnQuiz.setBackground(Color.WHITE);
		 btnQuiz.setBounds(232, 184, 154, 137);
		 panel.add(btnQuiz);
		 
		 JButton btnQuiz_1 = new JButton("");
		 btnQuiz_1.setBorder(null);
		 btnQuiz_1.setIcon(new ImageIcon(quizlist.class.getResource("/assets/answer.png")));
		 btnQuiz_1.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		showpanel(quiz3panels);
		 	}
		 });
		 btnQuiz_1.setForeground(Color.WHITE);
		 btnQuiz_1.setFont(new Font("Dialog", Font.BOLD, 35));
		 btnQuiz_1.setBackground(Color.WHITE);
		 btnQuiz_1.setBounds(396, 184, 154, 137);
		 panel.add(btnQuiz_1);
		 
		 JButton btnQuiz_2 = new JButton("");
		 btnQuiz_2.setBorder(null);
		 btnQuiz_2.setIcon(new ImageIcon(quizlist.class.getResource("/assets/answer.png")));
		 btnQuiz_2.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		showpanel(quiz4panels);
		 	}
		 });
		 btnQuiz_2.setForeground(Color.WHITE);
		 btnQuiz_2.setFont(new Font("Dialog", Font.BOLD, 35));
		 btnQuiz_2.setBackground(Color.WHITE);
		 btnQuiz_2.setBounds(560, 184, 154, 137);
		 panel.add(btnQuiz_2);
		
		 quiz11panel = new quiz1panel();
		quiz11panel.setBackground(Color.WHITE);
		quiz11panel.setBounds(0, 0, 769, 491);
		add(quiz11panel);
		
		quiz2panels = new quiz2panel();
		quiz2panels.setBackground(Color.WHITE);
		quiz2panels.setBounds(0, 0, 769, 491);
		add(quiz2panels);
		
		 quiz3panels = new quiz3panel();
		quiz3panels.setBackground(Color.WHITE);
		quiz3panels.setBounds(0, 0, 769, 491);
		add(quiz3panels);
		
		 quiz4panels = new quiz4panel();
		quiz4panels.setBackground(Color.WHITE);
		quiz4panels.setBounds(0, 0, 769, 491);
		add(quiz4panels);
		showpanel(panel);
		
		JLabel lblNewLabel = new JLabel("Quiz 1");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 128, 128));
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel.setBounds(68, 150, 154, 23);
		panel.add(lblNewLabel);
		
		JLabel lblQuiz = new JLabel("Quiz 2");
		lblQuiz.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuiz.setForeground(new Color(0, 128, 128));
		lblQuiz.setFont(new Font("Dialog", Font.BOLD, 15));
		lblQuiz.setBounds(232, 150, 154, 23);
		panel.add(lblQuiz);
		
		JLabel lblQuiz_1 = new JLabel("Quiz 3");
		lblQuiz_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuiz_1.setForeground(new Color(0, 128, 128));
		lblQuiz_1.setFont(new Font("Dialog", Font.BOLD, 15));
		lblQuiz_1.setBounds(396, 150, 154, 23);
		panel.add(lblQuiz_1);
		
		JLabel lblQuiz_2 = new JLabel("Quiz 4");
		lblQuiz_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuiz_2.setForeground(new Color(0, 128, 128));
		lblQuiz_2.setFont(new Font("Dialog", Font.BOLD, 15));
		lblQuiz_2.setBounds(560, 150, 154, 23);
		panel.add(lblQuiz_2);
		
		JTextPane txtpnSpeechOrgans = new JTextPane();
		txtpnSpeechOrgans.setForeground(new Color(0, 128, 128));
		txtpnSpeechOrgans.setText("Speech Organs");
		txtpnSpeechOrgans.setFont(new Font("Dialog", Font.BOLD, 15));
		txtpnSpeechOrgans.setBounds(92, 332, 130, 46);
		panel.add(txtpnSpeechOrgans);
		
		JTextPane txtpnVoicedAndVoiceless = new JTextPane();
		txtpnVoicedAndVoiceless.setForeground(new Color(0, 128, 128));
		txtpnVoicedAndVoiceless.setText("Voiced and Voiceless");
		txtpnVoicedAndVoiceless.setFont(new Font("Dialog", Font.BOLD, 15));
		txtpnVoicedAndVoiceless.setBounds(276, 332, 110, 46);
		panel.add(txtpnVoicedAndVoiceless);
		
		JTextPane txtpnDiphthongs_1 = new JTextPane();
		txtpnDiphthongs_1.setForeground(new Color(0, 128, 128));
		txtpnDiphthongs_1.setText("Place and Manner of Articulation");
		txtpnDiphthongs_1.setFont(new Font("Dialog", Font.BOLD, 15));
		txtpnDiphthongs_1.setBounds(406, 332, 144, 46);
		panel.add(txtpnDiphthongs_1);
		
		JTextPane txtpnDiphthongs = new JTextPane();
		txtpnDiphthongs.setForeground(new Color(0, 128, 128));
		txtpnDiphthongs.setText("Diphthongs");
		txtpnDiphthongs.setFont(new Font("Dialog", Font.BOLD, 15));
		txtpnDiphthongs.setBounds(604, 332, 110, 46);
		panel.add(txtpnDiphthongs);
	}
	public static void showpanel(JPanel panez)
	{
		JPanel[] panels = {panel,quiz11panel,quiz2panels,quiz3panels,quiz4panels};
		for(JPanel hide:panels)
		{
			hide.setVisible(false);
		}
		panez.setVisible(true);
	}
}
