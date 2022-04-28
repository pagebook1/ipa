package student;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class home extends JPanel {

	/**
	 * Create the panel.
	 */
	static JPanel what_panel;
	static JPanel who_panel;
	static JPanel why_panel;
	static JPanel how_panel;
	public static JPanel panel;
	public home() {
		setBackground(new Color(255, 255, 255));
		setBounds(0, 0, 769, 491);
		setVisible(true);
		setLayout(null);
		 
		 JLabel lblInternationalPhoneticAlphabet = new JLabel("OVERVIEW");
		 lblInternationalPhoneticAlphabet.setHorizontalAlignment(SwingConstants.CENTER);
		 lblInternationalPhoneticAlphabet.setForeground(Color.BLACK);
		 lblInternationalPhoneticAlphabet.setFont(new Font("Dialog", Font.BOLD, 30));
		 lblInternationalPhoneticAlphabet.setBounds(0, 0, 769, 123);
		 add(lblInternationalPhoneticAlphabet);
		
		 panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 769, 491);
		add(panel);
		panel.setLayout(null);
		
		JButton lblWhat = new JButton("WHAT");
		lblWhat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_show(what_panel);
			}
		});
		lblWhat.setForeground(Color.GREEN);
		lblWhat.setFont(new Font("Dialog", Font.BOLD, 35));
		lblWhat.setBackground(Color.WHITE);
		lblWhat.setBounds(95, 120, 160, 60);
		panel.add(lblWhat);
		
		JButton lblWho = new JButton("WHO");
		lblWho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_show(who_panel);

			}
		});
		lblWho.setForeground(Color.GREEN);
		lblWho.setFont(new Font("Dialog", Font.BOLD, 35));
		lblWho.setBackground(Color.WHITE);
		lblWho.setBounds(157, 287, 160, 60);
		panel.add(lblWho);
		
		JButton lblWhy = new JButton("WHY");
		lblWhy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_show(why_panel);
			}
		});
		lblWhy.setForeground(Color.GREEN);
		lblWhy.setFont(new Font("Dialog", Font.BOLD, 35));
		lblWhy.setBackground(Color.WHITE);
		lblWhy.setBounds(497, 120, 160, 60);
		panel.add(lblWhy);
		
		JButton lblHow = new JButton("HOW");
		lblHow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_show(how_panel);
			}
		});
		lblHow.setForeground(Color.GREEN);
		lblHow.setFont(new Font("Dialog", Font.BOLD, 35));
		lblHow.setBackground(Color.WHITE);
		lblHow.setBounds(442, 287, 160, 60);
		panel.add(lblHow);
		
		 what_panel = new JPanel();
		 what_panel.setBackground(Color.WHITE);
		what_panel.setBounds(0, 0, 769, 491);
		add(what_panel);
		what_panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 143, 749, 337);
		what_panel.add(scrollPane);
		
		JTextPane txtpnPronouncelyIsTo = new JTextPane();
		txtpnPronouncelyIsTo.setEditable(false);
		txtpnPronouncelyIsTo.setFont(new Font("Dialog", Font.PLAIN, 20));
		StyledDocument doc = txtpnPronouncelyIsTo.getStyledDocument();
		SimpleAttributeSet justify = new SimpleAttributeSet();
		StyleConstants.setAlignment(justify, StyleConstants.ALIGN_JUSTIFIED);
		doc.setParagraphAttributes(0, doc.getLength(), justify, false);
		txtpnPronouncelyIsTo.setText("\t\tPronouncely is a computer-assisted online software which can be used by both teachers and learners to acquire English pronunciation. Equipped with the necessary things to consider in attaining proficiency in the said language, this steps away from the traditional way of teaching pronunciation, commonly referred to as drilling or the \"repeat after me\" method.\u00A0\r\n\r\n\t\tInstead, in line with the study, \"Integrating IPA in the Secondary English Curriculum: The Case of QNHS L2 Learner,\" the software establishes accuracy as there are built-in audios, demonstrative videos, AI scoring, and utilizes the International Phonetic Alphabet transcriptions of words to visually represent how each phoneme, either consonants, vowels, or diphthongs, is pronounced according to its symbols.\r\n\r\n\t\tThe study explores on the effectiveness of using IPA in teaching and learning pronunciation. The pedagogy involves teachers as facilitators and interlocutors in the class, while students are fully engaged in games, discussions, and activities aimed at improving the micro-skill of pronunciation. However, this research also touches on other macro-skills such as speaking, writing, listening, reading, and viewing as pronunciation is its core.");
		scrollPane.setViewportView(txtpnPronouncelyIsTo);
		
		JLabel lblNewLabel_1 = new JLabel("WHAT");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1.setBounds(600, 0, 123, 65);
		what_panel.add(lblNewLabel_1);
		
		 who_panel = new JPanel();
		who_panel.setLayout(null);
		who_panel.setBackground(Color.WHITE);
		who_panel.setBounds(0, 0, 769, 491);
		add(who_panel);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 143, 749, 337);
		who_panel.add(scrollPane_1);
		
		JTextPane txtpnTheStudentsOf = new JTextPane();
		txtpnTheStudentsOf.setFont(new Font("Dialog", Font.PLAIN, 20));
//		txtpnTheStudentsOf.insertIcon());
		txtpnTheStudentsOf.setText("\r\n\t\tThe proponents of the study and this software are students from Maryhill College taking the degree program Bachelor of Secondary Education major in English. Inspired by how Linguistics works, the researchers chose to focus on the mechanics of Phonology and Phonetics as the ambiguity of English sounds is not confined to the 26 letters of the alphabet. Thus, seeking to thoroughly present each phoneme with its symbols that precisely show how it must be said, the researchers came up with the idea of integrating the International Phonetics Alphabet, both as a pedagogy and Pronouncely as an instrumental part in conducting the strategy of teaching and learning pronunciation.\r\n\t\tBehind all the work and endeavors for the study's progress and crafting of the software is the group of Ms. Kristine Claire A. Gabatin, Ms. Lyka Mae L. Castillo, Ms. Reisha Mae D. Garay, and Mr. Jayarr C. Rondina, who are also future teachers dedicated to improving learning English as a second language, especially in terms of speaking and pronunciation. Everything was keenly prepared and conceptualized from the flows, instructions, features, and functions to operate the games, discussions, and activities meant to achieve a set of lessons. The creative juices and critical content are from the minds, efforts, and hard work of this cream of the crop, exerting the best and most of their knowledge, skills, and time.\u00A0\r\n");
		scrollPane_1.setViewportView(txtpnTheStudentsOf);
		
		StyledDocument doc1 = txtpnTheStudentsOf.getStyledDocument();
		javax.swing.text.Style stylewho = doc1.addStyle("StyleName", null);
		 StyleConstants.setIcon(stylewho, new ImageIcon(home.class.getResource("/assets/who_imgss.png")));
		try {
			doc1.insertString(0, "invisible text", stylewho);
		} catch (BadLocationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		doc1.setParagraphAttributes(0, doc1.getLength(), justify, false);
		
		JLabel lblNewLabel_1_1 = new JLabel("WHO");
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(600, 0, 123, 65);
		who_panel.add(lblNewLabel_1_1);
		
		 why_panel = new JPanel();
		why_panel.setLayout(null);
		why_panel.setBackground(Color.WHITE);
		why_panel.setBounds(0, 0, 769, 491);
		add(why_panel);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 143, 749, 337);
		why_panel.add(scrollPane_2);
		
		JTextPane txtpnItTakesTime = new JTextPane();
		txtpnItTakesTime.setText("\t\tIt takes time, practice, and exposure to master the concept of pronunciation. Before achieving one's speaking proficiency, it is important to be familiar with the idea of the proper mechanics of pronunciation, especially with English as a second language which requires an extensive teaching and learning process.\r\n\t\tWith this, Pronouncely becomes a supplementary tool in executing a pedagogy. This includes a series of games, discussions, and activities that are crafted to improve students' pronunciation while giving them knowledge of the different facets of phonology and phonetics. They will be introduced to the what, why, where, and how of speech production through the integration of the International Phonetics Alphabet (IPA).\r\n");
		txtpnItTakesTime.setFont(new Font("Dialog", Font.PLAIN, 20));
		scrollPane_2.setViewportView(txtpnItTakesTime);
		txtpnItTakesTime.setBackground(Color.WHITE);
		StyledDocument doc2 = txtpnItTakesTime.getStyledDocument();
		doc2.setParagraphAttributes(0, doc2.getLength(), justify, false);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("WHY");
		lblNewLabel_1_1_1.setForeground(Color.RED);
		lblNewLabel_1_1_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(600, 0, 123, 65);
		why_panel.add(lblNewLabel_1_1_1);
		
		 how_panel = new JPanel();
		how_panel.setLayout(null);
		how_panel.setBackground(Color.WHITE);
		how_panel.setBounds(0, 0, 769, 491);
		add(how_panel);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 143, 749, 337);
		how_panel.add(scrollPane_3);
		
		JTextPane txtpnSimilarToA = new JTextPane();
		scrollPane_3.setViewportView(txtpnSimilarToA);
		txtpnSimilarToA.setText("\t\tSimilar to a PowerPoint presentation, each topic\u00A0consists of\u00A0a number of slides, which can be viewed by clicking the tabs on the top, allowing the facilitators to go to the\u00A0next or succeeding\u00A0slide. There are videos as well that can be played by tapping on the \"Watch\"\u00A0button to demonstrate the place and manner of articulation. The\u00A0sample\u00A0words in the table for each\u00A0phoneme\u00A0have\u00A0an\u00A0embedded\u00A0audio\u00A0that can be listened to\u00A0by pressing it.\u00A0Descriptions\u00A0will\u00A0pop\u00A0once you\u00A0hover over\u00A0a particular term/jargon for articulation.\u00A0\r\n\t\tThrough accessing the Records section, teachers will automatically keep track of the computed scores of the students in every activity they have accomplished. Their attempts/answers will appear in a table. As an interlocutor, teachers can process these and  playback the sent recording of the students. Each student's performance in the activities is well stored in a database, as the teacher just needs to click the arrows for the dropdown menu to respectively select the student's name and user IDs, along with their records.\u00A0\r\n\t\tFor the Create Student icon, this is where teachers can create an account for their students to enable them have access to their dashboards. filling out their basic profiles, such as the student's first and last name, user ID, and passwords, to get it ready for the learners and for teachers to secure those who are only enrolled or part of the session, making it exclusive.\u00A0\r\nTo exit the portal, click \"Log Out.\"");
		txtpnSimilarToA.setFont(new Font("Dialog", Font.PLAIN, 20));
		StyledDocument doc3 = txtpnSimilarToA.getStyledDocument();
		doc3.setParagraphAttributes(0, doc3.getLength(), justify, false);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("HOW");
		lblNewLabel_1_1_2.setForeground(Color.RED);
		lblNewLabel_1_1_2.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1_1_2.setBounds(600, 0, 123, 65);
		how_panel.add(lblNewLabel_1_1_2);

	}
	public static void panel_show(JPanel pane)
	{
		JPanel[] panels = {panel,who_panel,why_panel,how_panel,what_panel};
			for(JPanel panel:panels)
			{
				panel.setVisible(false);
			}
			pane.setVisible(true);
		
	}
}
