package activity;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;

import database.connection;
import student.record_voice;

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
	public Activity3() {
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
		panel_1.setBounds(192, 140, 404, 303);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JTextPane txtpnwersquollBeginWith = new JTextPane();
		txtpnwersquollBeginWith.setContentType("text/html");
		txtpnwersquollBeginWith.setEditable(false);
		txtpnwersquollBeginWith.setText("<p>We&rsquo;ll begin with a <b><u>b&#594;ks</u></b>, and the plural is boxes,<br> But the plural of<b><u> &#594;ks</u></b> should be oxen, not oxes. <br>Then one fowl is a <b><u>gu&#720;s</u></b> but two are called geese, <br>Yet the plural of <b><u>ma&#650;s</u></b> should never be meese, <br>You may find a lone mouse or a whole nest of mice, <br>\r\nBut the plural of <b><u>ha&#650;s</u></b> is houses, not hice.</p>");
		txtpnwersquollBeginWith.setBounds(59, 54, 311, 157);
		panel_1.add(txtpnwersquollBeginWith);
		
		JButton btnNewButton = new JButton("RECITE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				filenames.add(filename+"_record.wav");
				new record_voice(filename);
				filename = random();
				showRecite(panel_3);
			}
		});
		btnNewButton.setBackground(new Color(0, 128, 128));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(116, 222, 166, 43);
		panel_1.add(btnNewButton);
		
		 panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(192, 140, 404, 303);
		panel.add(panel_3);
		
		JButton btnNewButton_1_1 = new JButton("RECITE");
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				filenames.add(filename+"_record.wav");
				new record_voice(filename);
				filename = random();
				showRecite(panel_2);
			}
		});
		btnNewButton_1_1.setBackground(new Color(0, 128, 128));
		
		btnNewButton_1_1.setBounds(116, 222, 166, 43);
		panel_3.add(btnNewButton_1_1);
		
		JTextPane txtpnifThePlural_1 = new JTextPane();
		txtpnifThePlural_1.setContentType("text/html");
		txtpnifThePlural_1.setText("<p>If I speak of a <b><u>f&#650;t</b></u> and you show me your feet,<br>\r\nAnd I give you a <b><u>bu&#720;t</b></u> would a pair be called beet?<br>\r\nIf one is a <b><u>tu&#720;&#952;</b></u>, and a whole set are teeth,<br>\r\nWhy shouldn&rsquo;t the plural of <b><u>bu&#720;&eth;</b></u> be called beeth?</p>");
		txtpnifThePlural_1.setEditable(false);
		txtpnifThePlural_1.setBounds(59, 54, 311, 157);
		panel_3.add(txtpnifThePlural_1);
		
		 panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(192, 140, 404, 303);
		panel.add(panel_2);
		
		JButton btnNewButton_1 = new JButton("RECITE");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(0, 128, 128));
		btnNewButton_1.setBounds(116, 222, 166, 43);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				filenames.add(filename+"_record.wav");
				new record_voice(filename);
				filename = random();
				showRecite(panel_4);
			}
		});
		panel_2.add(btnNewButton_1);
		
		JTextPane txtpnifThePlural = new JTextPane();
		txtpnifThePlural.setContentType("text/html");
		txtpnifThePlural.setText("<p>If the plural of man is always called <b><u>m&#603;n,</b></u><br>\r\nWhy shouldn&rsquo;t the plural of pan be called <b><u>p&#603;n?</b></u><br>\r\nThe cow in the plural may be cows or<b><u> ka&#618;n,</b></u><br>\r\nBut a bow if repeated is never called <b><u>ba&#618;n,</b></u><br>\r\nAnd the plural of vow is vows, never <b><u>va&#618;n.</b></u></p>");
		txtpnifThePlural.setEditable(false);
		txtpnifThePlural.setBounds(59, 54, 311, 157);
		panel_2.add(txtpnifThePlural);
		
		 panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBounds(192, 140, 404, 303);
		panel.add(panel_4);
		
		JTextPane txtpnifTheSingularrsquos = new JTextPane();
		txtpnifTheSingularrsquos.setContentType("text/html");
		txtpnifTheSingularrsquos.setText("<p>If the singular&rsquo;s this and the plural is <b><u>&eth;i&#720;z</b></u>,<br>\r\nShould the plural of <b><u>k&#618;s</b></u> ever be nicknamed keese?<br>\r\nThen one may be that and three would be <b><u> &eth;&#601;&#650;z</b></u>,<br>\r\nYet hat in the plural would never be <b><u>h&#601;&#650;z</b></u>,<br>\r\nAnd the plural of <b><u>k&aelig;t </b></u> is cats, not cose.<br>\r\n</p>");
		txtpnifTheSingularrsquos.setEditable(false);
		txtpnifTheSingularrsquos.setBounds(59, 54, 311, 157);
		panel_4.add(txtpnifTheSingularrsquos);
		
		JButton btnNewButton_2 = new JButton("RECITE");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(new Color(0, 128, 128));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				filenames.add(filename+"_record.wav");
				new record_voice(filename);
				filename = random();
				showRecite(panel_5);
			}
		});
		btnNewButton_2.setBounds(116, 222, 166, 43);
		panel_4.add(btnNewButton_2);
		
		 panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 255));
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBounds(192, 140, 404, 303);
		panel.add(panel_5);
		
		JTextPane txtpnweSpeakOf = new JTextPane();
		txtpnweSpeakOf.setContentType("text/html");
		txtpnweSpeakOf.setText("<p>We speak of a brother, and also of\r\n<b><u>&#712;br&#603;&eth;r&#618;n</b></u><br>\r\nBut though we say mother, we never say <b><u>&#712;m&#652;&eth;&#601;</b></u>,<br>\r\nThen the masculine pronouns are he, his and <b><u>h&#618;m</b></u>,<br>\r\nBut imagine the feminine she, shis and <b><u>&#643;&#618;m</b></u>,</p>\r\n\r\n<p>So the English, I think, you all will <b><u>&#601;&#712;gri&#720;</b></u>,<br>\r\nIs the <b><u>&#712;kw&#618;&#601;r&#618;st<br>\r\n</p>");
		txtpnweSpeakOf.setEditable(false);
		txtpnweSpeakOf.setBounds(59, 54, 311, 157);
		panel_5.add(txtpnweSpeakOf);
		
		JButton btnNewButton_2_1 = new JButton("RECITE");
		btnNewButton_2_1.setForeground(Color.WHITE);
		btnNewButton_2_1.setBackground(new Color(0, 128, 128));
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				filenames.add(filename+"_record.wav");
				new record_voice(filename);
				filename = random();
				try {
					new connection().submitActivity3(filenames, random()+"_attempt");
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null,"Activity Finished!", "Congrats",JOptionPane.INFORMATION_MESSAGE);
				showRecite(panel_1);
				System.out.print(filenames);
				filenames.clear();
				student.ActivityList.tabbedPane.setSelectedIndex(0);
			}
		});
		btnNewButton_2_1.setBounds(116, 222, 166, 43);
		panel_5.add(btnNewButton_2_1);
		setVisible(true);
		showRecite(panel_1);
		
		JLabel label = new JLabel("New label");
		label.setBounds(47, 119, 46, 14);
		panel_1.add(label);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(0, 128, 128));
		panel_6.setBounds(10, 11, 749, 118);
		panel.add(panel_6);
		panel_6.setLayout(null);
		
		JTextPane txtpnInstructionsTheseStanzas = new JTextPane();
		txtpnInstructionsTheseStanzas.setEditable(false);
		txtpnInstructionsTheseStanzas.setOpaque(false);
		txtpnInstructionsTheseStanzas.setForeground(new Color(255, 255, 255));
		txtpnInstructionsTheseStanzas.setFont(new Font("Dialog", Font.BOLD, 17));
		txtpnInstructionsTheseStanzas.setText("Instructions: These stanzas are adopted from the poem \"English is the Queenest Language.\" Read and recite the poem with conviction, taking note of the correct place and manner of articulation present in the various phonemes of the alphabet. Be cautious in your pronunciation, especially with those dynamic-sounding words.");
		txtpnInstructionsTheseStanzas.setBounds(10, 11, 729, 96);
		panel_6.add(txtpnInstructionsTheseStanzas);
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
