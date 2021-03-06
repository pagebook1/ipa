package activity;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutionException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

import database.connection;
import student.ActivityList;
import student.play_voice;
import student.record_voice;
import student.speect2text;
import student.text2speech;

public class Activity2 extends JPanel {

	/**
	 * Create the panel.
	 */
	int filename = random();
	private int random() {
		return new Random().nextInt(100000);
		
	}
	JComboBox comboBox;
	String[] data;
	String[] toSpeech = {"liberty","dull","give","joust","crevice","gauze","with","vowed","petal","but","work","chalice","friend","spikey","think","which"};
	JTextPane voicelabel;
	JLabel phonemtype;
	JLabel lblNewLabel_2;
	JTabbedPane tabbedPane;
	DefaultTableModel model;
	ArrayList <String> accuracy = new ArrayList<String>();
	ArrayList <String> pronoun = new ArrayList<String>();
	ArrayList <String> filenamelist = new ArrayList<String>();
	private JTable table;
	public Activity2() {
		
		setBackground(new Color(255, 255, 255));
		setBounds(0, 0, 769, 491);
		setLayout(null);
		
		 tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, -45, 769, 535);
		add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ACTIVITY 2");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 57));
		lblNewLabel.setBounds(10, 78, 744, 82);
		panel.add(lblNewLabel);
		
		JLabel lblVoiceAndVoiceless = new JLabel("VOICE AND VOICELESS");
		lblVoiceAndVoiceless.setHorizontalAlignment(SwingConstants.CENTER);
		lblVoiceAndVoiceless.setFont(new Font("Dialog", Font.BOLD, 57));
		lblVoiceAndVoiceless.setBounds(10, 192, 744, 82);
		panel.add(lblVoiceAndVoiceless);
		
		JButton btnNewButton = new JButton("START");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
				
			}
		});
		btnNewButton.setBackground(new Color(0, 128, 128));
		btnNewButton.setForeground(new Color(255, 250, 250));
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 55));
		btnNewButton.setBounds(248, 323, 239, 82);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, panel_1, null);
		panel_1.setLayout(null);
		
		JTextPane txtpnReadAndPronounce = new JTextPane();
		txtpnReadAndPronounce.setEditable(false);
		txtpnReadAndPronounce.setFont(new Font("Dialog", Font.BOLD, 15));
		txtpnReadAndPronounce.setText("Instructions: Read and pronounce each word, emphasizing the underlined phonemes. Apply what you have learned from the lesson on voice and voiceless sounds. To key in your answers, click the mic icon and record yourself in a quiet place, making sure that your entries are clear and audible.");
		txtpnReadAndPronounce.setBounds(10, 11, 733, 69);
		panel_1.add(txtpnReadAndPronounce);
		
		 phonemtype = new JLabel("Voice Phonemes");
		phonemtype.setForeground(new Color(0, 128, 128));
		phonemtype.setFont(new Font("Dialog", Font.BOLD, 20));
		phonemtype.setBounds(10, 86, 215, 69);
		panel_1.add(phonemtype);
		
		 voicelabel = new JTextPane();
		 voicelabel.setEditable(false);
		 voicelabel.setContentType("text/html");
		voicelabel.setFont(new Font("Dialog", Font.BOLD, 25));
		voicelabel.setForeground(UIManager.getColor("CheckBox.darkShadow"));
		voicelabel.setText("<p style=\"font-family:dialog;font-size:25\"><b> li<u>b</u>erty<br>l\u026A<u>b</u>\u0259rti </b></p>");
		voicelabel.setBounds(295, 142, 93, 87);
		panel_1.add(voicelabel);
		
		 lblNewLabel_2 = new JLabel("");
		playSound("liberty",lblNewLabel_2);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBounds(221, 177, 64, 56);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		save(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon(Activity2.class.getResource("/assets/mic.png")));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(249, 242, 178, 169);
		panel_1.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("SKIP");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
				accuracy.add("0");
				pronoun.add("0");
				filenamelist.add("NO RECORD");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton_1.setBackground(new Color(0, 128, 128));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(539, 380, 109, 56);
		panel_1.add(btnNewButton_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, panel_1_1, null);
		
		JTextPane txtpnReadAndPronounce_1 = new JTextPane();
		txtpnReadAndPronounce_1.setText("Instructions: Read and pronounce each word, emphasizing the underlined phonemes. Apply what you have learned from the lesson on voice and voiceless sounds. To key in your answers, click the mic icon and record yourself in a quiet place, making sure that your entries are clear and audible.");
		txtpnReadAndPronounce_1.setFont(new Font("Dialog", Font.BOLD, 15));
		txtpnReadAndPronounce_1.setEditable(false);
		txtpnReadAndPronounce_1.setBounds(10, 11, 733, 69);
		panel_1_1.add(txtpnReadAndPronounce_1);
		
		JLabel phonemtype_1 = new JLabel("Voice Phonemes");
		phonemtype_1.setForeground(new Color(0, 128, 128));
		phonemtype_1.setFont(new Font("Dialog", Font.BOLD, 20));
		phonemtype_1.setBounds(10, 86, 215, 69);
		panel_1_1.add(phonemtype_1);
		
		JTextPane txtpnDullDl = new JTextPane();
		txtpnDullDl.setEditable(false);
		txtpnDullDl.setContentType("text/html");
		txtpnDullDl.setText("<p style=\"font-family:dialog;font-size:25\">\r\n\t<b> <u>d</u>ull \r\n\t\t<br><u>d</u>\u028Cl\r\n\t</b>\r\n</p>");
		txtpnDullDl.setForeground(SystemColor.controlDkShadow);
		txtpnDullDl.setFont(new Font("Dialog", Font.BOLD, 25));
		txtpnDullDl.setBounds(295, 148, 93, 87);
		panel_1_1.add(txtpnDullDl);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		playSound("dull",lblNewLabel_2_1);
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setBounds(221, 177, 64, 56);
		panel_1_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		save(lblNewLabel_3_1);
		lblNewLabel_3_1.setBounds(249, 242, 178, 169);
		panel_1_1.add(lblNewLabel_3_1);
		
		JButton btnNewButton_1_1 = new JButton("SKIP");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(3);
				accuracy.add("0");
				pronoun.add("0");
				filenamelist.add("NO RECORD");
			}
		});
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton_1_1.setBackground(new Color(0, 128, 128));
		btnNewButton_1_1.setBounds(539, 380, 109, 56);
		panel_1_1.add(btnNewButton_1_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, panel_1_1_1, null);
		
		JTextPane txtpnReadAndPronounce_1_1 = new JTextPane();
		txtpnReadAndPronounce_1_1.setText("Instructions: Read and pronounce each word, emphasizing the underlined phonemes. Apply what you have learned from the lesson on voice and voiceless sounds. To key in your answers, click the mic icon and record yourself in a quiet place, making sure that your entries are clear and audible.");
		txtpnReadAndPronounce_1_1.setFont(new Font("Dialog", Font.BOLD, 15));
		txtpnReadAndPronounce_1_1.setEditable(false);
		txtpnReadAndPronounce_1_1.setBounds(10, 11, 733, 69);
		panel_1_1_1.add(txtpnReadAndPronounce_1_1);
		
		JLabel phonemtype_1_1 = new JLabel("Voice Phonemes");
		phonemtype_1_1.setForeground(new Color(0, 128, 128));
		phonemtype_1_1.setFont(new Font("Dialog", Font.BOLD, 20));
		phonemtype_1_1.setBounds(10, 86, 215, 69);
		panel_1_1_1.add(phonemtype_1_1);
		
		JTextPane txtpnGivev = new JTextPane();
		txtpnGivev.setEditable(false);
		txtpnGivev.setContentType("text/html");
		txtpnGivev.setText("<p style=\"font-family:dialog;font-size:25\">\r\n\t<b> <u>g</u>ive\r\n\t\t<br><u>g</u>\u026Av\r\n\t</b>\r\n</p>");
		txtpnGivev.setForeground(SystemColor.controlDkShadow);
		txtpnGivev.setFont(new Font("Dialog", Font.BOLD, 25));
		txtpnGivev.setBounds(295, 142, 93, 97);
		panel_1_1_1.add(txtpnGivev);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		playSound("give",lblNewLabel_2_1_1);
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1.setBounds(221, 177, 64, 56);
		panel_1_1_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("");
		save(lblNewLabel_3_1_1);
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setBounds(249, 242, 178, 169);
		panel_1_1_1.add(lblNewLabel_3_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("SKIP");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(4);
				accuracy.add("0");
				pronoun.add("0");
				filenamelist.add("NO RECORD");
			}
		});
		btnNewButton_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton_1_1_1.setBackground(new Color(0, 128, 128));
		btnNewButton_1_1_1.setBounds(539, 380, 109, 56);
		panel_1_1_1.add(btnNewButton_1_1_1);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, panel_1_1_1_1, null);
		
		JTextPane txtpnReadAndPronounce_1_1_1 = new JTextPane();
		txtpnReadAndPronounce_1_1_1.setText("Instructions: Read and pronounce each word, emphasizing the underlined phonemes. Apply what you have learned from the lesson on voice and voiceless sounds. To key in your answers, click the mic icon and record yourself in a quiet place, making sure that your entries are clear and audible.");
		txtpnReadAndPronounce_1_1_1.setFont(new Font("Dialog", Font.BOLD, 15));
		txtpnReadAndPronounce_1_1_1.setEditable(false);
		txtpnReadAndPronounce_1_1_1.setBounds(10, 11, 733, 69);
		panel_1_1_1_1.add(txtpnReadAndPronounce_1_1_1);
		
		JLabel phonemtype_1_1_1 = new JLabel("Voice Phonemes");
		phonemtype_1_1_1.setForeground(new Color(0, 128, 128));
		phonemtype_1_1_1.setFont(new Font("Dialog", Font.BOLD, 20));
		phonemtype_1_1_1.setBounds(10, 86, 215, 69);
		panel_1_1_1_1.add(phonemtype_1_1_1);
		
		JTextPane txtpnJoustDast = new JTextPane();
		txtpnJoustDast.setEditable(false);
		txtpnJoustDast.setContentType("text/html");
		txtpnJoustDast.setText("<p style=\"font-family:dialog;font-size:25\">\r\n\t<b> <u>j</u>oust\r\n\t\t<br><u>d\u0292</u>a\u028Ast\r\n\t</b>\r\n</p>");
		txtpnJoustDast.setForeground(SystemColor.controlDkShadow);
		txtpnJoustDast.setFont(new Font("Dialog", Font.BOLD, 25));
		txtpnJoustDast.setBounds(295, 138, 93, 101);
		panel_1_1_1_1.add(txtpnJoustDast);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("");
		playSound("joust",lblNewLabel_2_1_1_1);
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1_1.setBounds(221, 177, 64, 56);
		panel_1_1_1_1.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("");
		save(lblNewLabel_3_1_1_1);
		lblNewLabel_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_1.setBounds(249, 242, 178, 169);
		panel_1_1_1_1.add(lblNewLabel_3_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("SKIP");
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(5);
				accuracy.add("0");
				pronoun.add("0");
				filenamelist.add("NO RECORD");
			}
		});
		btnNewButton_1_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton_1_1_1_1.setBackground(new Color(0, 128, 128));
		btnNewButton_1_1_1_1.setBounds(539, 380, 109, 56);
		panel_1_1_1_1.add(btnNewButton_1_1_1_1);
		
		JPanel panel_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, panel_1_1_1_1_1, null);
		
		JTextPane txtpnReadAndPronounce_1_1_1_1 = new JTextPane();
		txtpnReadAndPronounce_1_1_1_1.setText("Instructions: Read and pronounce each word, emphasizing the underlined phonemes. Apply what you have learned from the lesson on voice and voiceless sounds. To key in your answers, click the mic icon and record yourself in a quiet place, making sure that your entries are clear and audible.");
		txtpnReadAndPronounce_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 15));
		txtpnReadAndPronounce_1_1_1_1.setEditable(false);
		txtpnReadAndPronounce_1_1_1_1.setBounds(10, 11, 733, 69);
		panel_1_1_1_1_1.add(txtpnReadAndPronounce_1_1_1_1);
		
		JLabel phonemtype_1_1_1_1 = new JLabel("Voice Phonemes");
		phonemtype_1_1_1_1.setForeground(new Color(0, 128, 128));
		phonemtype_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 20));
		phonemtype_1_1_1_1.setBounds(10, 86, 215, 69);
		panel_1_1_1_1_1.add(phonemtype_1_1_1_1);
		
		JTextPane txtpnCrevicekrevs = new JTextPane();
		txtpnCrevicekrevs.setEditable(false);
		txtpnCrevicekrevs.setContentType("text/html");
		txtpnCrevicekrevs.setText("<p style=\"font-family:dialog;font-size:25\">\r\n\t<b>cre<u>v</u>ice\r\n\t\t<br>\r\n\t'kr<u>e</u>v\u026As\r\n\t</b>\r\n</p>");
		txtpnCrevicekrevs.setForeground(SystemColor.controlDkShadow);
		txtpnCrevicekrevs.setFont(new Font("Dialog", Font.BOLD, 25));
		txtpnCrevicekrevs.setBounds(295, 140, 132, 99);
		panel_1_1_1_1_1.add(txtpnCrevicekrevs);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("");
		playSound("crevice",lblNewLabel_2_1_1_1_1);
		lblNewLabel_2_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1_1_1.setBounds(221, 177, 64, 56);
		panel_1_1_1_1_1.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("");
		save(lblNewLabel_3_1_1_1_1);
		lblNewLabel_3_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_1_1.setBounds(249, 242, 178, 169);
		panel_1_1_1_1_1.add(lblNewLabel_3_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1_1 = new JButton("SKIP");
		btnNewButton_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(6);
				accuracy.add("0");
				pronoun.add("0");
				filenamelist.add("NO RECORD");
			}
		});
		btnNewButton_1_1_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton_1_1_1_1_1.setBackground(new Color(0, 128, 128));
		btnNewButton_1_1_1_1_1.setBounds(539, 380, 109, 56);
		panel_1_1_1_1_1.add(btnNewButton_1_1_1_1_1);
		
		JPanel panel_1_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1_1.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, panel_1_1_1_1_1_1, null);
		
		JTextPane txtpnReadAndPronounce_1_1_1_1_1 = new JTextPane();
		txtpnReadAndPronounce_1_1_1_1_1.setText("Instructions: Read and pronounce each word, emphasizing the underlined phonemes. Apply what you have learned from the lesson on voice and voiceless sounds. To key in your answers, click the mic icon and record yourself in a quiet place, making sure that your entries are clear and audible.");
		txtpnReadAndPronounce_1_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 15));
		txtpnReadAndPronounce_1_1_1_1_1.setEditable(false);
		txtpnReadAndPronounce_1_1_1_1_1.setBounds(10, 11, 733, 69);
		panel_1_1_1_1_1_1.add(txtpnReadAndPronounce_1_1_1_1_1);
		
		JLabel phonemtype_1_1_1_1_1 = new JLabel("Voice Phonemes");
		phonemtype_1_1_1_1_1.setForeground(new Color(0, 128, 128));
		phonemtype_1_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 20));
		phonemtype_1_1_1_1_1.setBounds(10, 86, 215, 69);
		panel_1_1_1_1_1_1.add(phonemtype_1_1_1_1_1);
		
		JTextPane txtpnGauzeGz = new JTextPane();
		txtpnGauzeGz.setEditable(false);
		txtpnGauzeGz.setContentType("text/html");
		txtpnGauzeGz.setText("<p style=\"font-family:dialog;font-size:25\">\r\n\t<b>gau<u>z</u>e \r\n\t\t<br>\r\n\tg\u0254\u02D0<u>z</u> \r\n\t</b>\r\n</p>");
		txtpnGauzeGz.setForeground(SystemColor.controlDkShadow);
		txtpnGauzeGz.setFont(new Font("Dialog", Font.BOLD, 25));
		txtpnGauzeGz.setBounds(295, 139, 93, 100);
		panel_1_1_1_1_1_1.add(txtpnGauzeGz);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("");
		playSound("gauze",lblNewLabel_2_1_1_1_1_1);
		lblNewLabel_2_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1_1_1_1.setBounds(221, 177, 64, 56);
		panel_1_1_1_1_1_1.add(lblNewLabel_2_1_1_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1_1 = new JLabel("");
		save(lblNewLabel_3_1_1_1_1_1);
		lblNewLabel_3_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_1_1_1.setBounds(249, 242, 178, 169);
		panel_1_1_1_1_1_1.add(lblNewLabel_3_1_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1_1_1 = new JButton("SKIP");
		btnNewButton_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(7);
				accuracy.add("0");
				pronoun.add("0");
				filenamelist.add("NO RECORD");
			}
		});
		btnNewButton_1_1_1_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton_1_1_1_1_1_1.setBackground(new Color(0, 128, 128));
		btnNewButton_1_1_1_1_1_1.setBounds(539, 380, 109, 56);
		panel_1_1_1_1_1_1.add(btnNewButton_1_1_1_1_1_1);
		
		JPanel panel_1_1_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, panel_1_1_1_1_1_1_1, null);
		
		JTextPane txtpnReadAndPronounce_1_1_1_1_1_1 = new JTextPane();
		txtpnReadAndPronounce_1_1_1_1_1_1.setText("Instructions: Read and pronounce each word, emphasizing the underlined phonemes. Apply what you have learned from the lesson on voice and voiceless sounds. To key in your answers, click the mic icon and record yourself in a quiet place, making sure that your entries are clear and audible.");
		txtpnReadAndPronounce_1_1_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 15));
		txtpnReadAndPronounce_1_1_1_1_1_1.setEditable(false);
		txtpnReadAndPronounce_1_1_1_1_1_1.setBounds(10, 11, 733, 69);
		panel_1_1_1_1_1_1_1.add(txtpnReadAndPronounce_1_1_1_1_1_1);
		
		JLabel phonemtype_1_1_1_1_1_1 = new JLabel("Voice Phonemes");
		phonemtype_1_1_1_1_1_1.setForeground(new Color(0, 128, 128));
		phonemtype_1_1_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 20));
		phonemtype_1_1_1_1_1_1.setBounds(10, 86, 215, 69);
		panel_1_1_1_1_1_1_1.add(phonemtype_1_1_1_1_1_1);
		
		JTextPane txtpnWithW = new JTextPane();
		txtpnWithW.setEditable(false);
		txtpnWithW.setContentType("text/html");
		txtpnWithW.setText("<p style=\"font-family:dialog;font-size:25\">\r\n\t<b>wi<u>th</u>\r\n\t\t<br>\r\n\tw\u026A<u>\u00F0</u>\r\n\t</b>\r\n</p>");
		txtpnWithW.setForeground(SystemColor.controlDkShadow);
		txtpnWithW.setFont(new Font("Dialog", Font.BOLD, 25));
		txtpnWithW.setBounds(295, 146, 93, 93);
		panel_1_1_1_1_1_1_1.add(txtpnWithW);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1 = new JLabel("");
		playSound("with",lblNewLabel_2_1_1_1_1_1_1);
		lblNewLabel_2_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1_1_1_1_1.setBounds(221, 177, 64, 56);
		panel_1_1_1_1_1_1_1.add(lblNewLabel_2_1_1_1_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1 = new JLabel("");
		save(lblNewLabel_3_1_1_1_1_1_1);
		lblNewLabel_3_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_1_1_1_1.setBounds(249, 242, 178, 169);
		panel_1_1_1_1_1_1_1.add(lblNewLabel_3_1_1_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1_1_1_1 = new JButton("SKIP");
		btnNewButton_1_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(8);
				accuracy.add("0");
				pronoun.add("0");
				filenamelist.add("NO RECORD");
			}
			
		});
		btnNewButton_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton_1_1_1_1_1_1_1.setBackground(new Color(0, 128, 128));
		btnNewButton_1_1_1_1_1_1_1.setBounds(539, 380, 109, 56);
		panel_1_1_1_1_1_1_1.add(btnNewButton_1_1_1_1_1_1_1);
		
		JPanel panel_1_1_1_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, panel_1_1_1_1_1_1_1_1, null);
		
		JTextPane txtpnReadAndPronounce_1_1_1_1_1_1_1 = new JTextPane();
		txtpnReadAndPronounce_1_1_1_1_1_1_1.setText("Instructions: Read and pronounce each word, emphasizing the underlined phonemes. Apply what you have learned from the lesson on voice and voiceless sounds. To key in your answers, click the mic icon and record yourself in a quiet place, making sure that your entries are clear and audible.");
		txtpnReadAndPronounce_1_1_1_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 15));
		txtpnReadAndPronounce_1_1_1_1_1_1_1.setEditable(false);
		txtpnReadAndPronounce_1_1_1_1_1_1_1.setBounds(10, 11, 733, 69);
		panel_1_1_1_1_1_1_1_1.add(txtpnReadAndPronounce_1_1_1_1_1_1_1);
		
		JLabel phonemtype_1_1_1_1_1_1_1 = new JLabel("Voice Phonemes");
		phonemtype_1_1_1_1_1_1_1.setForeground(new Color(0, 128, 128));
		phonemtype_1_1_1_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 20));
		phonemtype_1_1_1_1_1_1_1.setBounds(10, 86, 215, 69);
		panel_1_1_1_1_1_1_1_1.add(phonemtype_1_1_1_1_1_1_1);
		
		JTextPane txtpnVowedVaud = new JTextPane();
		txtpnVowedVaud.setEditable(false);
		txtpnVowedVaud.setContentType("text/html");
		txtpnVowedVaud.setText("<p style=\"font-family:dialog;font-size:25\">\r\n\t<b>vo<u>w</u>ed\r\n\t\t<br>\r\n\tva<u>u</u>d\r\n\t</b>\r\n</p>");
		txtpnVowedVaud.setForeground(SystemColor.controlDkShadow);
		txtpnVowedVaud.setFont(new Font("Dialog", Font.BOLD, 25));
		txtpnVowedVaud.setBounds(295, 146, 93, 93);
		panel_1_1_1_1_1_1_1_1.add(txtpnVowedVaud);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1 = new JLabel("");
		playSound("vowed",lblNewLabel_2_1_1_1_1_1_1_1);
		lblNewLabel_2_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1_1_1_1_1_1.setBounds(221, 177, 64, 56);
		panel_1_1_1_1_1_1_1_1.add(lblNewLabel_2_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1_1 = new JLabel("");
		save(lblNewLabel_3_1_1_1_1_1_1_1);
		lblNewLabel_3_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_1_1_1_1_1.setBounds(249, 242, 178, 169);
		panel_1_1_1_1_1_1_1_1.add(lblNewLabel_3_1_1_1_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1_1_1_1_1 = new JButton("SKIP");
		btnNewButton_1_1_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(9);
				accuracy.add("0");
				pronoun.add("0");
				filenamelist.add("NO RECORD");
			}
		});
		btnNewButton_1_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton_1_1_1_1_1_1_1_1.setBackground(new Color(0, 128, 128));
		btnNewButton_1_1_1_1_1_1_1_1.setBounds(539, 380, 109, 56);
		panel_1_1_1_1_1_1_1_1.add(btnNewButton_1_1_1_1_1_1_1_1);
		
		JPanel panel_1_1_1_1_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, panel_1_1_1_1_1_1_1_1_1, null);
		
		JTextPane txtpnReadAndPronounce_1_1_1_1_1_1_1_1 = new JTextPane();
		txtpnReadAndPronounce_1_1_1_1_1_1_1_1.setText("Instructions: Read and pronounce each word, emphasizing the underlined phonemes. Apply what you have learned from the lesson on voice and voiceless sounds. To key in your answers, click the mic icon and record yourself in a quiet place, making sure that your entries are clear and audible.");
		txtpnReadAndPronounce_1_1_1_1_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 15));
		txtpnReadAndPronounce_1_1_1_1_1_1_1_1.setEditable(false);
		txtpnReadAndPronounce_1_1_1_1_1_1_1_1.setBounds(10, 11, 733, 69);
		panel_1_1_1_1_1_1_1_1_1.add(txtpnReadAndPronounce_1_1_1_1_1_1_1_1);
		
		JLabel phonemtype_1_1_1_1_1_1_1_1 = new JLabel("Voiceless Phonemes");
		phonemtype_1_1_1_1_1_1_1_1.setForeground(new Color(0, 128, 128));
		phonemtype_1_1_1_1_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 20));
		phonemtype_1_1_1_1_1_1_1_1.setBounds(10, 86, 215, 69);
		panel_1_1_1_1_1_1_1_1_1.add(phonemtype_1_1_1_1_1_1_1_1);
		
		JTextPane txtpnPetalpetl = new JTextPane();
		txtpnPetalpetl.setEditable(false);
		txtpnPetalpetl.setContentType("text/html");
		txtpnPetalpetl.setText("<p style=\"font-family:dialog;font-size:25\">\r\n\t<b><u>p</u>etal\r\n\t\t<br>\r\n\t'<u>p</u>etl\r\n\t</b>\r\n</p>");
		txtpnPetalpetl.setForeground(SystemColor.controlDkShadow);
		txtpnPetalpetl.setFont(new Font("Dialog", Font.BOLD, 25));
		txtpnPetalpetl.setBounds(295, 142, 93, 97);
		panel_1_1_1_1_1_1_1_1_1.add(txtpnPetalpetl);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1 = new JLabel("");
		playSound("petal",lblNewLabel_2_1_1_1_1_1_1_1_1);
		lblNewLabel_2_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1_1_1_1_1_1_1.setBounds(221, 177, 64, 56);
		panel_1_1_1_1_1_1_1_1_1.add(lblNewLabel_2_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1_1_1 = new JLabel("");
		save(lblNewLabel_3_1_1_1_1_1_1_1_1);
		lblNewLabel_3_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_1_1_1_1_1_1.setBounds(249, 242, 178, 169);
		panel_1_1_1_1_1_1_1_1_1.add(lblNewLabel_3_1_1_1_1_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1_1_1_1_1_1 = new JButton("SKIP");
		btnNewButton_1_1_1_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(10);
				accuracy.add("0");
				pronoun.add("0");
				filenamelist.add("NO RECORD");
			}
		});
		btnNewButton_1_1_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton_1_1_1_1_1_1_1_1_1.setBackground(new Color(0, 128, 128));
		btnNewButton_1_1_1_1_1_1_1_1_1.setBounds(539, 380, 109, 56);
		panel_1_1_1_1_1_1_1_1_1.add(btnNewButton_1_1_1_1_1_1_1_1_1);
		
		JPanel panel_1_1_1_1_1_1_1_1_2 = new JPanel();
		panel_1_1_1_1_1_1_1_1_2.setLayout(null);
		panel_1_1_1_1_1_1_1_1_2.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, panel_1_1_1_1_1_1_1_1_2, null);
		
		JTextPane txtpnReadAndPronounce_1_1_1_1_1_1_1_2 = new JTextPane();
		txtpnReadAndPronounce_1_1_1_1_1_1_1_2.setText("Instructions: Read and pronounce each word, emphasizing the underlined phonemes. Apply what you have learned from the lesson on voice and voiceless sounds. To key in your answers, click the mic icon and record yourself in a quiet place, making sure that your entries are clear and audible.");
		txtpnReadAndPronounce_1_1_1_1_1_1_1_2.setFont(new Font("Dialog", Font.BOLD, 15));
		txtpnReadAndPronounce_1_1_1_1_1_1_1_2.setEditable(false);
		txtpnReadAndPronounce_1_1_1_1_1_1_1_2.setBounds(10, 11, 733, 69);
		panel_1_1_1_1_1_1_1_1_2.add(txtpnReadAndPronounce_1_1_1_1_1_1_1_2);
		
		JLabel phonemtype_1_1_1_1_1_1_1_2 = new JLabel("Voiceless Phonemes");
		phonemtype_1_1_1_1_1_1_1_2.setForeground(new Color(0, 128, 128));
		phonemtype_1_1_1_1_1_1_1_2.setFont(new Font("Dialog", Font.BOLD, 20));
		phonemtype_1_1_1_1_1_1_1_2.setBounds(10, 86, 215, 69);
		panel_1_1_1_1_1_1_1_1_2.add(phonemtype_1_1_1_1_1_1_1_2);
		
		JTextPane txtpnButBt = new JTextPane();
		txtpnButBt.setEditable(false);
		txtpnButBt.setContentType("text/html");
		txtpnButBt.setText("<p style=\"font-family:dialog;font-size:25\">\r\n\t<b>bu<u>t</u>\r\n\t\t<br>\r\n\tb\u0259<u>t</u>\r\n\t</b>\r\n</p>");
		txtpnButBt.setForeground(SystemColor.controlDkShadow);
		txtpnButBt.setFont(new Font("Dialog", Font.BOLD, 25));
		txtpnButBt.setBounds(295, 143, 93, 96);
		panel_1_1_1_1_1_1_1_1_2.add(txtpnButBt);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_2 = new JLabel("");
		playSound("but",lblNewLabel_2_1_1_1_1_1_1_1_2);
		lblNewLabel_2_1_1_1_1_1_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1_1_1_1_1_1_2.setBounds(221, 177, 64, 56);
		panel_1_1_1_1_1_1_1_1_2.add(lblNewLabel_2_1_1_1_1_1_1_1_2);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1_1_2 = new JLabel("");
		save(lblNewLabel_3_1_1_1_1_1_1_1_2);
		lblNewLabel_3_1_1_1_1_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_1_1_1_1_1_2.setBounds(249, 242, 178, 169);
		panel_1_1_1_1_1_1_1_1_2.add(lblNewLabel_3_1_1_1_1_1_1_1_2);
		
		JButton btnNewButton_1_1_1_1_1_1_1_1_2 = new JButton("SKIP");
		btnNewButton_1_1_1_1_1_1_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(11);
				accuracy.add("0");
				pronoun.add("0");
				filenamelist.add("NO RECORD");
			}
		});
		btnNewButton_1_1_1_1_1_1_1_1_2.setForeground(Color.WHITE);
		btnNewButton_1_1_1_1_1_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton_1_1_1_1_1_1_1_1_2.setBackground(new Color(0, 128, 128));
		btnNewButton_1_1_1_1_1_1_1_1_2.setBounds(539, 380, 109, 56);
		panel_1_1_1_1_1_1_1_1_2.add(btnNewButton_1_1_1_1_1_1_1_1_2);
		
		JPanel panel_1_1_1_1_1_1_1_1_3 = new JPanel();
		panel_1_1_1_1_1_1_1_1_3.setLayout(null);
		panel_1_1_1_1_1_1_1_1_3.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, panel_1_1_1_1_1_1_1_1_3, null);
		
		JTextPane txtpnReadAndPronounce_1_1_1_1_1_1_1_3 = new JTextPane();
		txtpnReadAndPronounce_1_1_1_1_1_1_1_3.setText("Instructions: Read and pronounce each word, emphasizing the underlined phonemes. Apply what you have learned from the lesson on voice and voiceless sounds. To key in your answers, click the mic icon and record yourself in a quiet place, making sure that your entries are clear and audible.");
		txtpnReadAndPronounce_1_1_1_1_1_1_1_3.setFont(new Font("Dialog", Font.BOLD, 15));
		txtpnReadAndPronounce_1_1_1_1_1_1_1_3.setEditable(false);
		txtpnReadAndPronounce_1_1_1_1_1_1_1_3.setBounds(10, 11, 733, 69);
		panel_1_1_1_1_1_1_1_1_3.add(txtpnReadAndPronounce_1_1_1_1_1_1_1_3);
		
		JLabel phonemtype_1_1_1_1_1_1_1_3 = new JLabel("Voiceless Phonemes");
		phonemtype_1_1_1_1_1_1_1_3.setForeground(new Color(0, 128, 128));
		phonemtype_1_1_1_1_1_1_1_3.setFont(new Font("Dialog", Font.BOLD, 20));
		phonemtype_1_1_1_1_1_1_1_3.setBounds(10, 86, 215, 69);
		panel_1_1_1_1_1_1_1_1_3.add(phonemtype_1_1_1_1_1_1_1_3);
		
		JTextPane txtpnWorkWrk = new JTextPane();
		txtpnWorkWrk.setEditable(false);
		txtpnWorkWrk.setContentType("text/html");
		txtpnWorkWrk.setText("<p style=\"font-family:dialog;font-size:25\">\r\n\t<b>wor<u>k</u>\r\n\t\t<br>\r\n\tw\u025C\u02D0r<u>k</u>\r\n\t</b>\r\n</p>");
		txtpnWorkWrk.setForeground(SystemColor.controlDkShadow);
		txtpnWorkWrk.setFont(new Font("Dialog", Font.BOLD, 25));
		txtpnWorkWrk.setBounds(295, 144, 93, 95);
		panel_1_1_1_1_1_1_1_1_3.add(txtpnWorkWrk);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_3 = new JLabel("");
		playSound("work",lblNewLabel_2_1_1_1_1_1_1_1_3);
		lblNewLabel_2_1_1_1_1_1_1_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1_1_1_1_1_1_3.setBounds(221, 177, 64, 56);
		panel_1_1_1_1_1_1_1_1_3.add(lblNewLabel_2_1_1_1_1_1_1_1_3);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1_1_3 = new JLabel("");
		save(lblNewLabel_3_1_1_1_1_1_1_1_3);
		lblNewLabel_3_1_1_1_1_1_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_1_1_1_1_1_3.setBounds(249, 242, 178, 169);
		panel_1_1_1_1_1_1_1_1_3.add(lblNewLabel_3_1_1_1_1_1_1_1_3);
		
		JButton btnNewButton_1_1_1_1_1_1_1_1_3 = new JButton("SKIP");
		btnNewButton_1_1_1_1_1_1_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(12);
				accuracy.add("0");
				pronoun.add("0");
				filenamelist.add("NO RECORD");
			}
		});
		btnNewButton_1_1_1_1_1_1_1_1_3.setForeground(Color.WHITE);
		btnNewButton_1_1_1_1_1_1_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton_1_1_1_1_1_1_1_1_3.setBackground(new Color(0, 128, 128));
		btnNewButton_1_1_1_1_1_1_1_1_3.setBounds(539, 380, 109, 56);
		panel_1_1_1_1_1_1_1_1_3.add(btnNewButton_1_1_1_1_1_1_1_1_3);
		
		JPanel panel_1_1_1_1_1_1_1_1_4 = new JPanel();
		panel_1_1_1_1_1_1_1_1_4.setLayout(null);
		panel_1_1_1_1_1_1_1_1_4.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, panel_1_1_1_1_1_1_1_1_4, null);
		
		JTextPane txtpnReadAndPronounce_1_1_1_1_1_1_1_4 = new JTextPane();
		txtpnReadAndPronounce_1_1_1_1_1_1_1_4.setText("Instructions: Read and pronounce each word, emphasizing the underlined phonemes. Apply what you have learned from the lesson on voice and voiceless sounds. To key in your answers, click the mic icon and record yourself in a quiet place, making sure that your entries are clear and audible.");
		txtpnReadAndPronounce_1_1_1_1_1_1_1_4.setFont(new Font("Dialog", Font.BOLD, 15));
		txtpnReadAndPronounce_1_1_1_1_1_1_1_4.setEditable(false);
		txtpnReadAndPronounce_1_1_1_1_1_1_1_4.setBounds(10, 11, 733, 69);
		panel_1_1_1_1_1_1_1_1_4.add(txtpnReadAndPronounce_1_1_1_1_1_1_1_4);
		
		JLabel phonemtype_1_1_1_1_1_1_1_4 = new JLabel("Voiceless Phonemes");
		phonemtype_1_1_1_1_1_1_1_4.setForeground(new Color(0, 128, 128));
		phonemtype_1_1_1_1_1_1_1_4.setFont(new Font("Dialog", Font.BOLD, 20));
		phonemtype_1_1_1_1_1_1_1_4.setBounds(10, 86, 215, 69);
		panel_1_1_1_1_1_1_1_1_4.add(phonemtype_1_1_1_1_1_1_1_4);
		
		JTextPane txtpnChalicetls = new JTextPane();
		txtpnChalicetls.setEditable(false);
		txtpnChalicetls.setContentType("text/html");
		txtpnChalicetls.setText("<p style=\"font-family:dialog;font-size:25\">\r\n\t<b><u>ch</u>alice\r\n\t\t<br>\r\n\t't<u>\u0283</u>\u00E6l\u026As\r\n\t</b>\r\n</p>");
		txtpnChalicetls.setForeground(SystemColor.controlDkShadow);
		txtpnChalicetls.setFont(new Font("Dialog", Font.BOLD, 25));
		txtpnChalicetls.setBounds(295, 152, 93, 87);
		panel_1_1_1_1_1_1_1_1_4.add(txtpnChalicetls);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_4 = new JLabel("");
		lblNewLabel_2_1_1_1_1_1_1_1_4.setHorizontalAlignment(SwingConstants.LEFT);
		playSound("chalice",lblNewLabel_2_1_1_1_1_1_1_1_4);
		lblNewLabel_2_1_1_1_1_1_1_1_4.setBounds(221, 177, 64, 56);
		panel_1_1_1_1_1_1_1_1_4.add(lblNewLabel_2_1_1_1_1_1_1_1_4);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1_1_4 = new JLabel("");
		save(lblNewLabel_3_1_1_1_1_1_1_1_4);
		lblNewLabel_3_1_1_1_1_1_1_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_1_1_1_1_1_4.setBounds(249, 242, 178, 169);
		panel_1_1_1_1_1_1_1_1_4.add(lblNewLabel_3_1_1_1_1_1_1_1_4);
		
		JButton btnNewButton_1_1_1_1_1_1_1_1_4 = new JButton("SKIP");
		btnNewButton_1_1_1_1_1_1_1_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(13);
				accuracy.add("0");
				pronoun.add("0");
				filenamelist.add("NO RECORD");
			}
		});
		btnNewButton_1_1_1_1_1_1_1_1_4.setForeground(Color.WHITE);
		btnNewButton_1_1_1_1_1_1_1_1_4.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton_1_1_1_1_1_1_1_1_4.setBackground(new Color(0, 128, 128));
		btnNewButton_1_1_1_1_1_1_1_1_4.setBounds(539, 380, 109, 56);
		panel_1_1_1_1_1_1_1_1_4.add(btnNewButton_1_1_1_1_1_1_1_1_4);
		
		JPanel panel_1_1_1_1_1_1_1_1_5 = new JPanel();
		panel_1_1_1_1_1_1_1_1_5.setLayout(null);
		panel_1_1_1_1_1_1_1_1_5.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, panel_1_1_1_1_1_1_1_1_5, null);
		
		JTextPane txtpnReadAndPronounce_1_1_1_1_1_1_1_5 = new JTextPane();
		txtpnReadAndPronounce_1_1_1_1_1_1_1_5.setText("Instructions: Read and pronounce each word, emphasizing the underlined phonemes. Apply what you have learned from the lesson on voice and voiceless sounds. To key in your answers, click the mic icon and record yourself in a quiet place, making sure that your entries are clear and audible.");
		txtpnReadAndPronounce_1_1_1_1_1_1_1_5.setFont(new Font("Dialog", Font.BOLD, 15));
		txtpnReadAndPronounce_1_1_1_1_1_1_1_5.setEditable(false);
		txtpnReadAndPronounce_1_1_1_1_1_1_1_5.setBounds(10, 11, 733, 69);
		panel_1_1_1_1_1_1_1_1_5.add(txtpnReadAndPronounce_1_1_1_1_1_1_1_5);
		
		JLabel phonemtype_1_1_1_1_1_1_1_5 = new JLabel("Voiceless Phonemes");
		phonemtype_1_1_1_1_1_1_1_5.setForeground(new Color(0, 128, 128));
		phonemtype_1_1_1_1_1_1_1_5.setFont(new Font("Dialog", Font.BOLD, 20));
		phonemtype_1_1_1_1_1_1_1_5.setBounds(10, 86, 215, 69);
		panel_1_1_1_1_1_1_1_1_5.add(phonemtype_1_1_1_1_1_1_1_5);
		
		JTextPane txtpnFriendFrnd = new JTextPane();
		txtpnFriendFrnd.setEditable(false);
		txtpnFriendFrnd.setContentType("text/html");
		txtpnFriendFrnd.setText("<p style=\"font-family:dialog;font-size:25\">\r\n\t<b><u>f</u>riend \r\n\t\t<br>\r\n\t<u>f</u>r\u025Bnd \r\n\t</b>\r\n</p>");
		txtpnFriendFrnd.setForeground(SystemColor.controlDkShadow);
		txtpnFriendFrnd.setFont(new Font("Dialog", Font.BOLD, 25));
		txtpnFriendFrnd.setBounds(295, 152, 93, 87);
		panel_1_1_1_1_1_1_1_1_5.add(txtpnFriendFrnd);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_5 = new JLabel("");
		playSound("friend",lblNewLabel_2_1_1_1_1_1_1_1_5);
		lblNewLabel_2_1_1_1_1_1_1_1_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1_1_1_1_1_1_5.setBounds(221, 177, 64, 56);
		panel_1_1_1_1_1_1_1_1_5.add(lblNewLabel_2_1_1_1_1_1_1_1_5);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1_1_5 = new JLabel("");
		save(lblNewLabel_3_1_1_1_1_1_1_1_5);
		lblNewLabel_3_1_1_1_1_1_1_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_1_1_1_1_1_5.setBounds(249, 242, 178, 169);
		panel_1_1_1_1_1_1_1_1_5.add(lblNewLabel_3_1_1_1_1_1_1_1_5);
		
		JButton btnNewButton_1_1_1_1_1_1_1_1_5 = new JButton("SKIP");
		btnNewButton_1_1_1_1_1_1_1_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(14);
				accuracy.add("0");
				pronoun.add("0");
				filenamelist.add("NO RECORD");
			}
		});
		btnNewButton_1_1_1_1_1_1_1_1_5.setForeground(Color.WHITE);
		btnNewButton_1_1_1_1_1_1_1_1_5.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton_1_1_1_1_1_1_1_1_5.setBackground(new Color(0, 128, 128));
		btnNewButton_1_1_1_1_1_1_1_1_5.setBounds(539, 380, 109, 56);
		panel_1_1_1_1_1_1_1_1_5.add(btnNewButton_1_1_1_1_1_1_1_1_5);
		
		JPanel panel_1_1_1_1_1_1_1_1_6 = new JPanel();
		panel_1_1_1_1_1_1_1_1_6.setLayout(null);
		panel_1_1_1_1_1_1_1_1_6.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, panel_1_1_1_1_1_1_1_1_6, null);
		
		JTextPane txtpnReadAndPronounce_1_1_1_1_1_1_1_6 = new JTextPane();
		txtpnReadAndPronounce_1_1_1_1_1_1_1_6.setText("Instructions: Read and pronounce each word, emphasizing the underlined phonemes. Apply what you have learned from the lesson on voice and voiceless sounds. To key in your answers, click the mic icon and record yourself in a quiet place, making sure that your entries are clear and audible.");
		txtpnReadAndPronounce_1_1_1_1_1_1_1_6.setFont(new Font("Dialog", Font.BOLD, 15));
		txtpnReadAndPronounce_1_1_1_1_1_1_1_6.setEditable(false);
		txtpnReadAndPronounce_1_1_1_1_1_1_1_6.setBounds(10, 11, 733, 69);
		panel_1_1_1_1_1_1_1_1_6.add(txtpnReadAndPronounce_1_1_1_1_1_1_1_6);
		
		JLabel phonemtype_1_1_1_1_1_1_1_6 = new JLabel("Voiceless Phonemes");
		phonemtype_1_1_1_1_1_1_1_6.setForeground(new Color(0, 128, 128));
		phonemtype_1_1_1_1_1_1_1_6.setFont(new Font("Dialog", Font.BOLD, 20));
		phonemtype_1_1_1_1_1_1_1_6.setBounds(10, 86, 215, 69);
		panel_1_1_1_1_1_1_1_1_6.add(phonemtype_1_1_1_1_1_1_1_6);
		
		JTextPane txtpnSpikeySpikey = new JTextPane();
		txtpnSpikeySpikey.setEditable(false);
		txtpnSpikeySpikey.setContentType("text/html");
		txtpnSpikeySpikey.setText("<p style=\"font-family:dialog;font-size:25\">\r\n\t<b><u>s</u>pikey\r\n\t\t<br>\r\n\t<u>s</u>pikey\r\n\t</b>\r\n</p>");
		txtpnSpikeySpikey.setForeground(SystemColor.controlDkShadow);
		txtpnSpikeySpikey.setFont(new Font("Dialog", Font.BOLD, 25));
		txtpnSpikeySpikey.setBounds(295, 144, 93, 95);
		panel_1_1_1_1_1_1_1_1_6.add(txtpnSpikeySpikey);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_6 = new JLabel("");
		playSound("spikey",lblNewLabel_2_1_1_1_1_1_1_1_6);
		lblNewLabel_2_1_1_1_1_1_1_1_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1_1_1_1_1_1_6.setBounds(221, 177, 64, 56);
		panel_1_1_1_1_1_1_1_1_6.add(lblNewLabel_2_1_1_1_1_1_1_1_6);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1_1_6 = new JLabel("");
		save(lblNewLabel_3_1_1_1_1_1_1_1_6);
		lblNewLabel_3_1_1_1_1_1_1_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_1_1_1_1_1_6.setBounds(249, 242, 178, 169);
		panel_1_1_1_1_1_1_1_1_6.add(lblNewLabel_3_1_1_1_1_1_1_1_6);
		
		JButton btnNewButton_1_1_1_1_1_1_1_1_6 = new JButton("SKIP");
		btnNewButton_1_1_1_1_1_1_1_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(15);
				accuracy.add("0");
				pronoun.add("0");
				filenamelist.add("NO RECORD");
			}
		});
		btnNewButton_1_1_1_1_1_1_1_1_6.setForeground(Color.WHITE);
		btnNewButton_1_1_1_1_1_1_1_1_6.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton_1_1_1_1_1_1_1_1_6.setBackground(new Color(0, 128, 128));
		btnNewButton_1_1_1_1_1_1_1_1_6.setBounds(539, 380, 109, 56);
		panel_1_1_1_1_1_1_1_1_6.add(btnNewButton_1_1_1_1_1_1_1_1_6);
		
		JPanel panel_1_1_1_1_1_1_1_1_7 = new JPanel();
		panel_1_1_1_1_1_1_1_1_7.setLayout(null);
		panel_1_1_1_1_1_1_1_1_7.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, panel_1_1_1_1_1_1_1_1_7, null);
		
		JTextPane txtpnReadAndPronounce_1_1_1_1_1_1_1_7 = new JTextPane();
		txtpnReadAndPronounce_1_1_1_1_1_1_1_7.setText("Instructions: Read and pronounce each word, emphasizing the underlined phonemes. Apply what you have learned from the lesson on voice and voiceless sounds. To key in your answers, click the mic icon and record yourself in a quiet place, making sure that your entries are clear and audible.");
		txtpnReadAndPronounce_1_1_1_1_1_1_1_7.setFont(new Font("Dialog", Font.BOLD, 15));
		txtpnReadAndPronounce_1_1_1_1_1_1_1_7.setEditable(false);
		txtpnReadAndPronounce_1_1_1_1_1_1_1_7.setBounds(10, 11, 733, 69);
		panel_1_1_1_1_1_1_1_1_7.add(txtpnReadAndPronounce_1_1_1_1_1_1_1_7);
		
		JLabel phonemtype_1_1_1_1_1_1_1_7 = new JLabel("Voiceless Phonemes");
		phonemtype_1_1_1_1_1_1_1_7.setForeground(new Color(0, 128, 128));
		phonemtype_1_1_1_1_1_1_1_7.setFont(new Font("Dialog", Font.BOLD, 20));
		phonemtype_1_1_1_1_1_1_1_7.setBounds(10, 86, 215, 69);
		panel_1_1_1_1_1_1_1_1_7.add(phonemtype_1_1_1_1_1_1_1_7);
		
		JTextPane txtpnThinkk = new JTextPane();
		txtpnThinkk.setEditable(false);
		txtpnThinkk.setContentType("text/html");
		txtpnThinkk.setText("<p style=\"font-family:dialog;font-size:25\">\r\n\t<b><u>th</u>ink\r\n\t\t<br>\r\n\t<u>\u03B8</u>\u026A\u014Bk\r\n\t</b>\r\n</p>");
		txtpnThinkk.setForeground(SystemColor.controlDkShadow);
		txtpnThinkk.setFont(new Font("Dialog", Font.BOLD, 25));
		txtpnThinkk.setBounds(295, 152, 93, 87);
		panel_1_1_1_1_1_1_1_1_7.add(txtpnThinkk);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_7 = new JLabel("");
		playSound("think",lblNewLabel_2_1_1_1_1_1_1_1_7);
		lblNewLabel_2_1_1_1_1_1_1_1_7.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1_1_1_1_1_1_7.setBounds(221, 177, 64, 56);
		panel_1_1_1_1_1_1_1_1_7.add(lblNewLabel_2_1_1_1_1_1_1_1_7);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1_1_7 = new JLabel("");
		save(lblNewLabel_3_1_1_1_1_1_1_1_7);
		lblNewLabel_3_1_1_1_1_1_1_1_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_1_1_1_1_1_7.setBounds(249, 242, 178, 169);
		panel_1_1_1_1_1_1_1_1_7.add(lblNewLabel_3_1_1_1_1_1_1_1_7);
		
		JButton btnNewButton_1_1_1_1_1_1_1_1_7 = new JButton("SKIP");
		btnNewButton_1_1_1_1_1_1_1_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(16);
				accuracy.add("0");
				pronoun.add("0");
				filenamelist.add("NO RECORD");
			}
		});
		btnNewButton_1_1_1_1_1_1_1_1_7.setForeground(Color.WHITE);
		btnNewButton_1_1_1_1_1_1_1_1_7.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton_1_1_1_1_1_1_1_1_7.setBackground(new Color(0, 128, 128));
		btnNewButton_1_1_1_1_1_1_1_1_7.setBounds(539, 380, 109, 56);
		panel_1_1_1_1_1_1_1_1_7.add(btnNewButton_1_1_1_1_1_1_1_1_7);
		
		JPanel panel_1_1_1_1_1_1_1_1_8 = new JPanel();
		panel_1_1_1_1_1_1_1_1_8.setLayout(null);
		panel_1_1_1_1_1_1_1_1_8.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, panel_1_1_1_1_1_1_1_1_8, null);
		
		JTextPane txtpnReadAndPronounce_1_1_1_1_1_1_1_8 = new JTextPane();
		txtpnReadAndPronounce_1_1_1_1_1_1_1_8.setText("Instructions: Read and pronounce each word, emphasizing the underlined phonemes. Apply what you have learned from the lesson on voice and voiceless sounds. To key in your answers, click the mic icon and record yourself in a quiet place, making sure that your entries are clear and audible.");
		txtpnReadAndPronounce_1_1_1_1_1_1_1_8.setFont(new Font("Dialog", Font.BOLD, 15));
		txtpnReadAndPronounce_1_1_1_1_1_1_1_8.setEditable(false);
		txtpnReadAndPronounce_1_1_1_1_1_1_1_8.setBounds(10, 11, 733, 69);
		panel_1_1_1_1_1_1_1_1_8.add(txtpnReadAndPronounce_1_1_1_1_1_1_1_8);
		
		JLabel phonemtype_1_1_1_1_1_1_1_8 = new JLabel("Voiceless Phonemes");
		phonemtype_1_1_1_1_1_1_1_8.setForeground(new Color(0, 128, 128));
		phonemtype_1_1_1_1_1_1_1_8.setFont(new Font("Dialog", Font.BOLD, 20));
		phonemtype_1_1_1_1_1_1_1_8.setBounds(10, 86, 215, 69);
		panel_1_1_1_1_1_1_1_1_8.add(phonemtype_1_1_1_1_1_1_1_8);
		
		JTextPane txtpnWhichW = new JTextPane();
		txtpnWhichW.setEditable(false);
		txtpnWhichW.setContentType("text/html");
		txtpnWhichW.setText("<p style=\"font-family:dialog;font-size:25\">\r\n\t<b><u>wh</u>ich\r\n\t\t<br>\r\n\t<u>w</u>\u026A\u02A7\r\n\t</b>\r\n</p>");
		txtpnWhichW.setForeground(SystemColor.controlDkShadow);
		txtpnWhichW.setFont(new Font("Dialog", Font.BOLD, 25));
		txtpnWhichW.setBounds(295, 143, 93, 96);
		panel_1_1_1_1_1_1_1_1_8.add(txtpnWhichW);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_8 = new JLabel("");
		playSound("which",lblNewLabel_2_1_1_1_1_1_1_1_8);
		lblNewLabel_2_1_1_1_1_1_1_1_8.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1_1_1_1_1_1_8.setBounds(221, 177, 64, 56);
		panel_1_1_1_1_1_1_1_1_8.add(lblNewLabel_2_1_1_1_1_1_1_1_8);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1_1_8 = new JLabel("");
		save(lblNewLabel_3_1_1_1_1_1_1_1_8);
		lblNewLabel_3_1_1_1_1_1_1_1_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_1_1_1_1_1_8.setBounds(249, 242, 178, 169);
		panel_1_1_1_1_1_1_1_1_8.add(lblNewLabel_3_1_1_1_1_1_1_1_8);
		
		JButton btnNewButton_1_1_1_1_1_1_1_1_8 = new JButton("SKIP");
		btnNewButton_1_1_1_1_1_1_1_1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(17);
				accuracy.add("0");
				pronoun.add("0");
				filenamelist.add("NO RECORD");
				
				if(accuracy.size() == 16 || tabbedPane.getSelectedIndex() == 17) {
					int table_size = 0;
					while(table_size<accuracy.size())
					{
						
						String[] item = {toSpeech[table_size],accuracy.get(table_size)+"%",pronoun.get(table_size)+"%"};
						model.addRow(item);
						table_size++;
					}
				}
				
			}
		});
		btnNewButton_1_1_1_1_1_1_1_1_8.setForeground(Color.WHITE);
		btnNewButton_1_1_1_1_1_1_1_1_8.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton_1_1_1_1_1_1_1_1_8.setBackground(new Color(0, 128, 128));
		btnNewButton_1_1_1_1_1_1_1_1_8.setBounds(539, 380, 109, 56);
		panel_1_1_1_1_1_1_1_1_8.add(btnNewButton_1_1_1_1_1_1_1_1_8);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("SCORES");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Dialog", Font.BOLD, 25));
		lblNewLabel_4.setBounds(320, 11, 164, 71);
		panel_2.add(lblNewLabel_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(132, 125, 530, 223);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setRowSelectionAllowed(false);
		table.getTableHeader().setOpaque(false);
		table.getTableHeader().setBackground(new Color(32,136,203));
		table.getTableHeader().setForeground(new Color(255,255,255));
		table.setRowHeight(25);
		
		scrollPane.setViewportView(table);
			setVisible(true);
		String[] columns = new String[] {"WORD", "ACCURACY", "PRONOUNCIATION"};
		 model = new DefaultTableModel(columns,0);
		table.setModel(model);
		
		 comboBox = new JComboBox();
		comboBox.setBounds(367, 358, 280, 32);
		panel_2.add(comboBox);
		
		JLabel lblNewLabel_4_1 = new JLabel("RECORDINGS");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_4_1.setBounds(176, 359, 164, 32);
		panel_2.add(lblNewLabel_4_1);
		
		JButton btnNewButton_2 = new JButton("PLAY");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				new play_voice(comboBox.getSelectedItem().toString());
			}
		});
		btnNewButton_2.setBackground(new Color(0, 128, 128));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBounds(555, 401, 89, 23);
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("SUBMIT");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = 0;
				while(x<accuracy.size()) {
					new database.connection();
					try {
						connection.submitActivity2(filename+"_attempt",x+1,accuracy.get(x),pronoun.get(x),filenamelist.get(x));
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					x++;
				}
				JOptionPane.showMessageDialog(null,"ACTIVITY SUMBITTED");
				comboBox.removeAllItems();				
				accuracy.clear();
				filenamelist.clear();
				pronoun.clear();
				model.setRowCount(0);
				ActivityList.tabbedPane.setSelectedIndex(0);
				
			}
		});
		btnNewButton_3.setFont(new Font("Dialog", Font.BOLD, 20));
		btnNewButton_3.setBackground(new Color(0, 128, 128));
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBounds(132, 402, 121, 35);
		panel_2.add(btnNewButton_3);
		
		
	}
	
	public void save(JLabel label) {
		label.setIcon(new ImageIcon(Activity2.class.getResource("/assets/mic.png")));
		label.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				new record_voice(filename);			
				try {
					new speect2text(filename + "_record.wav",toSpeech[accuracy.size()]);
					accuracy.add(speect2text.accuracy);
					pronoun.add(speect2text.pronoun);
					filenamelist.add(filename+"_record.wav");
					comboBox.addItem(filename+"_record.wav");
					tabbedPane.setSelectedIndex(accuracy.size()+1);	
					System.out.print(tabbedPane.getSelectedIndex());
					filename = random();
					if(accuracy.size() == 16 || tabbedPane.getSelectedIndex() == 17) {
						int table_size = 0;
						while(table_size<accuracy.size())
						{
							
							String[] item = {toSpeech[table_size],accuracy.get(table_size)+"%",pronoun.get(table_size)+"%"};
							model.addRow(item);
							table_size++;
						}
					}
					
					
					
				} catch (InterruptedException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		});
	}
	public void playSound(String text,JLabel label)
	{
		label.setIcon(new ImageIcon(Activity2.class.getResource("/assets/play.png")));
		label.addMouseListener(new MouseAdapter() {
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
				label.setIcon(new ImageIcon(Activity2.class.getResource("/assets/play-green.png")));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				label.setIcon(new ImageIcon(Activity2.class.getResource("/assets/play.png")));
			}
		});
	}
}
