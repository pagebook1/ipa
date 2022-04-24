package student;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;

public class home extends JPanel {

	/**
	 * Create the panel.
	 */
	static JPanel what_panel;
	static JPanel who_panel;
	static JPanel why_panel;
	static JPanel how_panel;
	static JPanel panel;
	public home() {
		setBackground(new Color(255, 255, 255));
		setBounds(0, 0, 769, 491);
		setVisible(true);
		setLayout(null);
		
		JLabel lblInternationalPhoneticAlphabet = new JLabel("International Phonetic Alphabet");
		lblInternationalPhoneticAlphabet.setForeground(Color.BLACK);
		lblInternationalPhoneticAlphabet.setFont(new Font("Dialog", Font.BOLD, 25));
		lblInternationalPhoneticAlphabet.setBounds(200, 70, 386, 60);
		add(lblInternationalPhoneticAlphabet);
		
		JLabel lblNewLabel = new JLabel("Overview");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel.setBounds(0, 0, 160, 60);
		add(lblNewLabel);
		
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
		txtpnPronouncelyIsTo.setText("\tPronouncely, is to help students acquire reading correctly and comprehensively. Hence, of the different intellectual capacity of one's learners. Furthermore it will improved the articulation of the students. This software contains four (4) lesson that integrates the whole idea in learning IPA as a tool in teaching or learning speaking.\r\n\r\n\tInstead, in line with the study, \"Integrating IPA in the Secondary English Curriculum: The Case of CHAMS L2 Learner,\" the software establishes accuracy as there are built-in audios, demonstrative videos, AI scoring, and utilizes the International Phonetic Alphabet transcriptions of words to visually represent how each phoneme, either consonants, vowels, or diphthongs, is pronounced according to its symbols.");
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
		txtpnTheStudentsOf.setText("\tThe students of Maryhill College of Teachers Education Major in English proudly presents the four future teachers that will make a change in teaching.\r\n\r\nMiss Kristine Claire Gabatin, a promising student  and the leader of the study entitled \u201CIntegrating IPA in Secondary English Curriculum: The Case of CHAMPS L2 Learners\u201D. Currently, a CTE Treasurer and an Senior Associate Editor in The Collis. \r\n\r\nMiss Lyka Castillo, an achiever who is also a member in the said study. Also, currently a secretary in Marian Peer Helpers.\r\n\r\nMiss Reisha Mae D. Garay, a dreamer who is also a member of the said study. On the other hand, currently a Secretary in CTE, Vice-President in Marian Peer Helper and Senior Managing in The Collis. \r\n\r\nMister Jayarr Rondina, a persistent learner who is also a member of the study. He is both studying and working for him to reach his promise to his parents.  \r\n");
		scrollPane_1.setViewportView(txtpnTheStudentsOf);
		
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
		txtpnItTakesTime.setText("\tIt takes time, practice, and exposure to master the concept of pronunciation. Before achieving one's speaking proficiency, it is important to be familiar with the idea of the proper mechanics of pronunciation, especially with English as a second language which requires an extensive teaching and learning process.\r\n\tWith this, Pronouncely becomes a supplementary tool in executing a pedagogy. This includes a series of games, discussions, and activities that are crafted to improve students' pronunciation while giving them knowledge of the different facets of phonology and phonetics. They will be introduced to the what, why, where, and how of speech production through the integration of the International Phonetics Alphabet (IPA).\r\n");
		txtpnItTakesTime.setFont(new Font("Dialog", Font.PLAIN, 20));
		scrollPane_2.setViewportView(txtpnItTakesTime);
		txtpnItTakesTime.setBackground(Color.WHITE);
		
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
		
		JScrollPane scrollPane_1_2 = new JScrollPane();
		scrollPane_1_2.setBounds(10, 143, 749, 337);
		how_panel.add(scrollPane_1_2);
		
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
