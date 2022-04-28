package activity;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

import database.connection;
import student.record_voice;
import student.speect2text;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class Activity3 extends JPanel {
	int filename = random();
	private int random() {
		return new Random().nextInt(100000);
	}
	/**
	 * Create the panel.
	 */
	JPanel panel_1;
	JPanel panel_2;
	JPanel panel_3;
	JPanel panel_4;
	JPanel panel_5;
	ArrayList<String>filenames = new ArrayList<String>();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	int i;
	JButton ar1;
	JButton ar2;
	JButton ar3;
	JButton ar4;
	JButton ar5;
	private JTextField textField_5;
	static String[] recordscore = new String[6];
	private JButton ar5_1;
	String[] word = new String[6];
	ArrayList<String[]> answers = new ArrayList<String[]>();
	ArrayList<String[]> recordScore = new ArrayList<String[]>();
	public Activity3() {
		for (int j = 0; j < recordscore.length; j++) {
			recordscore[j] ="0";
		}
		setBackground(new Color(255, 255, 255));
		setBounds(0, 0, 769, 491);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 769, 491);
		add(panel);
		panel.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(20, 140, 404, 218);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JTextPane txtpnwersquollBeginWith = new JTextPane();
		txtpnwersquollBeginWith.setContentType("text/html");
		txtpnwersquollBeginWith.setEditable(false);
		txtpnwersquollBeginWith.setText("<p>We&rsquo;ll begin with a <b><u>b&#594;ks</u></b>, and the plural is boxes,<br> But the plural of<b><u> &#594;ks</u></b> should be oxen, not oxes. <br>Then one fowl is a <b><u>gu&#720;s</u></b> but two are called geese, <br>Yet the plural of <b><u>ma&#650;s</u></b> should never be meese, <br>You may find a lone mouse or a whole nest of mice, <br>\r\nBut the plural of <b><u>ha&#650;s</u></b> is houses, not hice.</p>");
		txtpnwersquollBeginWith.setBounds(58, 31, 311, 157);
		panel_1.add(txtpnwersquollBeginWith);
		
		 panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(20, 140, 404, 218);
		panel.add(panel_3);
		
		JTextPane txtpnifThePlural_1 = new JTextPane();
		txtpnifThePlural_1.setContentType("text/html");
		txtpnifThePlural_1.setText("<p>If I speak of a <b><u>f&#650;t</b></u> and you show me your feet,<br>\r\nAnd I give you a <b><u>bu&#720;t</b></u> would a pair be called beet?<br>\r\nIf one is a <b><u>tu&#720;&#952;</b></u>, and a whole set are teeth,<br>\r\nWhy shouldn&rsquo;t the plural of <b><u>bu&#720;&eth;</b></u> be called beeth?</p>");
		txtpnifThePlural_1.setEditable(false);
		txtpnifThePlural_1.setBounds(59, 31, 311, 157);
		panel_3.add(txtpnifThePlural_1);
		
		 panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(20, 140, 404, 218);
		panel.add(panel_2);
		
		JTextPane txtpnifThePlural = new JTextPane();
		txtpnifThePlural.setContentType("text/html");
		txtpnifThePlural.setText("<p>If the plural of man is always called <b><u>m&#603;n,</b></u><br>\r\nWhy shouldn&rsquo;t the plural of pan be called <b><u>p&#603;n?</b></u><br>\r\nThe cow in the plural may be cows or<b><u> ka&#618;n,</b></u><br>\r\nBut a bow if repeated is never called <b><u>ba&#618;n,</b></u><br>\r\nAnd the plural of vow is vows, never <b><u>va&#618;n.</b></u></p>");
		txtpnifThePlural.setEditable(false);
		txtpnifThePlural.setBounds(59, 31, 311, 157);
		panel_2.add(txtpnifThePlural);
		
		 panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBounds(20, 140, 404, 218);
		panel.add(panel_4);
		
		JTextPane txtpnifTheSingularrsquos = new JTextPane();
		txtpnifTheSingularrsquos.setContentType("text/html");
		txtpnifTheSingularrsquos.setText("<p>If the singular&rsquo;s this and the plural is <b><u>&eth;i&#720;z</b></u>,<br>\r\nShould the plural of <b><u>k&#618;s</b></u> ever be nicknamed keese?<br>\r\nThen one may be that and three would be <b><u> &eth;&#601;&#650;z</b></u>,<br>\r\nYet hat in the plural would never be <b><u>h&#601;&#650;z</b></u>,<br>\r\nAnd the plural of <b><u>k&aelig;t </b></u> is cats, not cose.<br>\r\n</p>");
		txtpnifTheSingularrsquos.setEditable(false);
		txtpnifTheSingularrsquos.setBounds(59, 54, 311, 157);
		panel_4.add(txtpnifTheSingularrsquos);
		
		 panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 255));
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBounds(20, 140, 404, 218);
		panel.add(panel_5);
		
		JTextPane txtpnweSpeakOf = new JTextPane();
		txtpnweSpeakOf.setContentType("text/html");
		txtpnweSpeakOf.setText("<p>We speak of a brother, and also of\r\n<b><u>&#712;br&#603;&eth;r&#618;n</b></u><br>\r\nBut though we say mother, we never say <b><u>&#712;m&#652;&eth;&#601;</b></u>,<br>\r\nThen the masculine pronouns are he, his and <b><u>h&#618;m</b></u>,<br>\r\nBut imagine the feminine she, shis and <b><u>&#643;&#618;m</b></u>,</p>\r\n\r\n<p>So the English, I think, you all will <b><u>&#601;&#712;gri&#720;</b></u>,<br>\r\nIs the <b><u>&#712;kw&#618;&#601;r&#618;st<br>\r\n</p>");
		txtpnweSpeakOf.setEditable(false);
		txtpnweSpeakOf.setBounds(59, 31, 311, 157);
		panel_5.add(txtpnweSpeakOf);
		setVisible(true);
		showRecite(panel_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(0, 128, 128));
		panel_6.setBounds(10, 11, 749, 118);
		panel.add(panel_6);
		panel_6.setLayout(null);
		
		JTextPane txtpnInstructionsTheseStanzas = new JTextPane();
		txtpnInstructionsTheseStanzas.setEditable(false);
		txtpnInstructionsTheseStanzas.setOpaque(false);
		txtpnInstructionsTheseStanzas.setForeground(new Color(255, 255, 255));
		txtpnInstructionsTheseStanzas.setFont(new Font("Dialog", Font.BOLD, 15));
		txtpnInstructionsTheseStanzas.setText("Instructions: These stanzas are adopted from the poem \"English is the Queenest Language.\" Translate the IPA-transcribed words into their normal orthography and articulate each with conviction, taking note of the correct place and manner of articulation present in the various phonemes of the alphabet. Be cautious in your pronunciation, especially with those dynamic-sounding words.");
		txtpnInstructionsTheseStanzas.setBounds(10, 11, 729, 96);
		panel_6.add(txtpnInstructionsTheseStanzas);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(436, 140, 308, 327);
		panel.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Normal Orthography");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 147, 25);
		panel_7.add(lblNewLabel);
		
		textField = new JTextField("");
		textField.setBounds(10, 47, 175, 35);
		panel_7.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField("");
		textField_1.setColumns(10);
		textField_1.setBounds(10, 93, 175, 35);
		panel_7.add(textField_1);
		
		textField_2 = new JTextField("");
		textField_2.setColumns(10);
		textField_2.setBounds(10, 139, 175, 35);
		panel_7.add(textField_2);
		
		textField_3 = new JTextField("");
		textField_3.setColumns(10);
		textField_3.setBounds(10, 187, 175, 35);
		panel_7.add(textField_3);
		
		textField_4 = new JTextField("");
		textField_4.setColumns(10);
		textField_4.setBounds(10, 233, 175, 35);
		panel_7.add(textField_4);
		
		 ar1 = new JButton("ARTICULATE");
		 ar1.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
				new record_voice(filename);
				try {
					new speect2text(filename + "_record.wav",word[0]);
					recordscore[0]=speect2text.accuracy;
					ar1.setBackground(Color.green);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				filename = random();
		 	}
		 });
		ar1.setForeground(Color.WHITE);
		ar1.setBackground(Color.CYAN);
		ar1.setBounds(195, 47, 113, 29);
		panel_7.add(ar1);
		
		 ar2 = new JButton("ARTICULATE");
		 ar2.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
				new record_voice(filename);
				try {
					new speect2text(filename + "_record.wav",word[1]);
					recordscore[1]=speect2text.accuracy;
					ar2.setBackground(Color.green);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				filename = random();
		 	}
		 });
		ar2.setBackground(Color.CYAN);
		ar2.setForeground(Color.WHITE);
		ar2.setBounds(195, 93, 113, 29);
		panel_7.add(ar2);
		
		 ar3 = new JButton("ARTICULATE");
		 ar3.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		new record_voice(filename);
				try {
					new speect2text(filename + "_record.wav",word[2]);
					recordscore[2]=speect2text.accuracy;
					ar3.setBackground(Color.green);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				filename = random();
		 	}
		 });
		ar3.setBackground(Color.CYAN);
		ar3.setForeground(Color.WHITE);
		ar3.setBounds(195, 139, 113, 29);
		panel_7.add(ar3);
		
		 ar4 = new JButton("ARTICULATE");
		 ar4.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		new record_voice(filename);
				try {
					new speect2text(filename + "_record.wav",word[3]);
					recordscore[3]=speect2text.accuracy;
					ar4.setBackground(Color.green);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				filename = random();
		 	}
		 });
		ar4.setBackground(Color.CYAN);
		ar4.setForeground(Color.WHITE);
		ar4.setBounds(195, 190, 113, 29);
		panel_7.add(ar4);
		
		 ar5 = new JButton("ARTICULATE");
		 ar5.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		new record_voice(filename);
				try {
					new speect2text(filename + "_record.wav",word[4]);
					recordscore[4]=speect2text.accuracy;
					ar5.setBackground(Color.green);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				filename = random();
		 	}
		 });
		ar5.setBackground(Color.CYAN);
		ar5.setForeground(Color.WHITE);
		ar5.setBounds(195, 236, 113, 29);
		panel_7.add(ar5);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setVisible(false);
		textField_5.setBounds(10, 280, 175, 35);
		panel_7.add(textField_5);
		
		ar5_1 = new JButton("ARTICULATE");
		ar5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new record_voice(filename);
				try {
					new speect2text(filename + "_record.wav",word[5]);
					recordscore[5]=speect2text.accuracy;
					ar5_1.setBackground(Color.green);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				filename = random();
			}
		});
		ar5_1.setForeground(Color.WHITE);
		ar5_1.setBackground(Color.CYAN);
		ar5_1.setVisible(false);
		ar5_1.setBounds(195, 286, 113, 29);
		panel_7.add(ar5_1);
		word[0] = "box";
		word[1] = "ox";
		word[2] = "goose";
		word[3] = "mouse";
		word[4] = "house";
		
		
		JTextField[] a = {textField,textField_1,textField_2,textField_3,textField_4};
		JButton[] b = {ar1,ar2,ar3,ar4,ar5,ar5_1};
		 i = 1;
		 
		JButton nextbtn = new JButton("NEXT");
		nextbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				switch(i)
				{
				case 1:
					
					String[] answerField = {textField.getText().toString(),
							textField_1.getText().toString(),
							textField_2.getText().toString(),
							textField_3.getText().toString(),
							textField_4.getText().toString()}; 
					String[] scores1 = {recordscore[0],recordscore[1],recordscore[2],recordscore[3],recordscore[4]};
					answers.add(answerField);
					recordScore.add(scores1);
					for (int j = 0; j < recordscore.length; j++) {
						recordscore[j] ="0";
					}
					for(JTextField field:a)
					{
						field.setText("");
					}
					for (JButton btn:b){
						btn.setBackground(Color.cyan);
					}
//					for (int j = 0; j < recordscore.length; j++) {
//						recordscore[j] = "0";
//					}
					showRecite(panel_2);
					word[0] = "men";
					word[1] = "pen";
					word[2] = "kine";
					word[3] = "bine";
					word[4] = "vine";
					break;
				case 2:
					String[] scores11 = {recordscore[0],recordscore[1],recordscore[2],recordscore[3],recordscore[4]};
					String[] answerFields = {textField.getText().toString(),
							textField_1.getText().toString(),
							textField_2.getText().toString(),
							textField_3.getText().toString(),
							textField_4.getText().toString()}; 
					answers.add(answerFields);
					recordScore.add(scores11);
					
					for (int j = 0; j < recordscore.length; j++) {
						recordscore[j] ="0";
					}
					textField_4.setVisible(false);
					ar5.setVisible(false);
					for(JTextField field:a)
					{
						field.setText("");
					}
					for (JButton btn:b){
						btn.setBackground(Color.cyan);
					}
					showRecite(panel_3);
					word[0] = "foot";
					word[1] = "booth";
					word[2] = "tooth";
					word[3] = "booth";
					word[4] = "";
					break;
				case 3:
					String[] scores111 = {recordscore[0],recordscore[1],recordscore[2],recordscore[3]};
					String[] answerFieldss = {textField.getText().toString(),
							textField_1.getText().toString(),
							textField_2.getText().toString(),
							textField_3.getText().toString()}; 
					answers.add(answerFieldss);
					recordScore.add(scores111);
					for (int j = 0; j < recordscore.length; j++) {
						recordscore[j] ="0";
					}
					
					textField_4.setVisible(true);
					ar5.setVisible(true);
					for(JTextField field:a)
					{
						field.setText("");
					}
					for (JButton btn:b){
						btn.setBackground(Color.cyan);
					}
					showRecite(panel_4);
					word[0] = "these";
					word[1] = "kiss";
					word[2] = "those";
					word[3] = "hose";
					word[4] = "cat";
					break;
				case 4:
					String[] scores1111 = {recordscore[0],recordscore[1],recordscore[2],recordscore[3],recordscore[4]};
					String[] answerFieldsss = {textField.getText().toString(),
							textField_1.getText().toString(),
							textField_2.getText().toString(),
							textField_3.getText().toString(),
							textField_4.getText().toString()}; 
					answers.add(answerFieldsss);
					recordScore.add(scores1111);
					for (int j = 0; j < recordscore.length; j++) {
						recordscore[j] ="0";
					}
					textField_4.setVisible(true);
					textField_5.setVisible(true);
					ar5_1.setVisible(true);
					
					for(JTextField field:a)
					{
						field.setText("");
					}
					for (JButton btn:b){
						btn.setBackground(Color.cyan);
					}
					
					nextbtn.setText("Finish");
					showRecite(panel_5);
					word[0] = "Brethren";
					word[1] = "Mother";
					word[2] = "Him";
					word[3] = "Shim";
					word[4] = "Agree";
					word[5] = "queerest";
					break;
				case 5:
					String[] scores11111 = {recordscore[0],recordscore[1],recordscore[2],recordscore[3],recordscore[4],recordscore[5]};
					String[] answerFieldssss = {textField.getText().toString(),
							textField_1.getText().toString(),
							textField_2.getText().toString(),
							textField_3.getText().toString(),
							textField_4.getText().toString(),
							textField_5.getText().toString()}; 
					answers.add(answerFieldssss);
					recordScore.add(scores11111);
					
					String[][]words = {
								{
								"box",
								"ox",
								"goose",
								"mouse",
								"house",
								},
								{
								"men",
								"pen",
								"kine",
								"bine",
								"vine",
								},
								{
								"foot",
								"booth",
								"tooth",
								"booth",
								},
								{
								"these",
								"kiss",
								"those",
								"hose",
								"cat",
								},
								{
								"Brethren",
								"Mother",
								"Him",
								"Shim",
								"Agree",
								"queerest",
								},
								
							};
					for (int j = 0; j < recordscore.length; j++) {
						recordscore[j] ="0";
					}
					
					for(int i = 0;i<recordScore.size();i++)
					{
						for(int j = 0;j<recordScore.get(i).length;j++)
						{
							try {
								new connection().submitActivity3(words[i][j], answers.get(i)[j],recordScore.get(i)[j],filename+"_attempt");
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}
					JOptionPane.showMessageDialog(null, "ACTIVITY SUBMITTED");
					break;
				}
				System.out.print(i);
				i++;
			}
		});
		nextbtn.setForeground(Color.WHITE);
		nextbtn.setBackground(Color.CYAN);
		nextbtn.setBounds(311, 369, 113, 29);
		panel.add(nextbtn);
	}
	public void showRecite(JPanel panel)
	{
		JPanel[] arr = {panel_1,panel_2,panel_3,panel_4,panel_5};
		for(JPanel arrs:arr)
		{
			arrs.setVisible(false);
		}
		panel.setVisible(true);
	}
}
