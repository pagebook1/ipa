package discussions;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class dipthongs extends JPanel {

	/**
	 * Create the panel.
	 */
	JPanel page1;
	JPanel page2;
	JPanel page3;
	JPanel page4;
	JPanel page5;
	JPanel page6;
	public dipthongs() {
		setBackground(Color.WHITE);
		setBounds(0,0,769, 491);
		setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 769, 491);
		add(panel_1);
		panel_1.setLayout(null);
		panel_1.setVisible(false);
		
		 page6 = new JPanel();
		page6.setLayout(null);
		page6.setBounds(201, 0, 540, 491);
		panel_1.add(page6);
		
		JLabel lblNewLabel_4_1_1_1_1 = new JLabel("");
		lblNewLabel_4_1_1_1_1.setIcon(new ImageIcon(dipthongs.class.getResource("/assets/dipthongtypes2.png")));
		lblNewLabel_4_1_1_1_1.setBounds(10, 11, 520, 469);
		page6.add(lblNewLabel_4_1_1_1_1);
		
		 page5 = new JPanel();
		page5.setLayout(null);
		page5.setBounds(201, 0, 540, 491);
		panel_1.add(page5);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("");
		lblNewLabel_4_1_1_1.setIcon(new ImageIcon(dipthongs.class.getResource("/assets/dipthongtypess.png")));
		lblNewLabel_4_1_1_1.setBounds(10, 11, 520, 469);
		page5.add(lblNewLabel_4_1_1_1);
		
		 page4 = new JPanel();
		page4.setLayout(null);
		page4.setBounds(201, 0, 540, 491);
		panel_1.add(page4);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("");
		lblNewLabel_4_1_1.setIcon(new ImageIcon(dipthongs.class.getResource("/assets/dipthongexamples.png")));
		lblNewLabel_4_1_1.setBounds(10, 11, 520, 469);
		page4.add(lblNewLabel_4_1_1);
		
		 page3 = new JPanel();
		page3.setLayout(null);
		page3.setBounds(201, 0, 540, 491);
		panel_1.add(page3);
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setIcon(new ImageIcon(dipthongs.class.getResource("/assets/diphthongs.png")));
		lblNewLabel_4_1.setBounds(10, 11, 520, 469);
		page3.add(lblNewLabel_4_1);
		
		 page2 = new JPanel();
		page2.setLayout(null);
		page2.setBounds(201, 0, 540, 491);
		panel_1.add(page2);
		
		JLabel lblNewLabel_3 = new JLabel("VOWEL SOUND SPEECHDRILLS\r\n");
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 30));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(27, 28, 503, 50);
		page2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(dipthongs.class.getResource("/assets/speechdrills.png")));
		lblNewLabel_4.setBounds(10, 89, 520, 391);
		page2.add(lblNewLabel_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 198, 491);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("NOTES");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(0, 0, 188, 39);
		panel_2.add(lblNewLabel_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 39, 178, 389);
		panel_2.add(textPane);
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panels(page1);			
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnNewButton_1.setBounds(10, 431, 46, 23);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("2");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panels(page2);	
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnNewButton_1_1.setBounds(66, 430, 46, 23);
		panel_2.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("3");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panels(page3);	
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnNewButton_1_2.setBounds(122, 430, 46, 23);
		panel_2.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("4");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panels(page4);	
			}
		});
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnNewButton_1_3.setBounds(10, 457, 46, 23);
		panel_2.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("5");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panels(page5);	
			}
		});
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnNewButton_1_4.setBounds(66, 456, 46, 23);
		panel_2.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("6");
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panels(page6);	
			}
		});
		btnNewButton_1_5.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnNewButton_1_5.setBounds(122, 456, 46, 23);
		panel_2.add(btnNewButton_1_5);
		
		 page1 = new JPanel();
		page1.setBounds(201, 0, 540, 491);
		panel_1.add(page1);
		page1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setToolTipText("THE ENGLISH VOWELS\r\nA vowel is a permanent element in a syllable.\r\nIt is formed by allowing the passage of air from the lungs  through the mouth acting as a resonator without any  obstruction.\r\nThis passing of air causes the opening of the vocal bands, called  the glottis, to vibrate.\r\nVowels are, therefore, those sounds which are produced with  the vibration of air in the oral cavity.\r\nAll vowel sounds, then, are voiced oral sounds\r\n");
		scrollPane.setBounds(10, 11, 520, 182);
		page1.add(scrollPane);
		
		JTextPane txtpnTheEnglishVowels = new JTextPane();
		txtpnTheEnglishVowels.setEditable(false);
		txtpnTheEnglishVowels.setContentType("text/html");
		txtpnTheEnglishVowels.setText("<center><h1>THE ENGLISH VOWELS</h1></center>\r\n<h3 style=\"font-family:dialog\">\r\nA vowel is a permanent element in a syllable.\r\nIt is formed by allowing the passage of air from the lungs  through the mouth acting as a resonator without any  obstruction.\r\nThis passing of air causes the opening of the vocal bands, called  the glottis, to vibrate.\r\nVowels are, therefore, those sounds which are produced with  the vibration of air in the oral cavity.\r\nAll vowel sounds, then, are voiced oral sounds\r\n</h3>");
		txtpnTheEnglishVowels.setToolTipText("");
		scrollPane.setViewportView(txtpnTheEnglishVowels);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setToolTipText("The Vector Triangle \u2013 shows the relationship and differences of the vowels to one another  as well as their relative positions on the tongue.");
		lblNewLabel_2.setIcon(new ImageIcon(dipthongs.class.getResource("/assets/vector triangle.png")));
		lblNewLabel_2.setBounds(10, 203, 520, 277);
		page1.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 769, 491);
		add(panel);
		panel.setLayout(null);
		
		JTextPane txtpnAtTheEnd = new JTextPane();
		txtpnAtTheEnd.setBounds(115, 131, 538, 188);
		panel.add(txtpnAtTheEnd);
		txtpnAtTheEnd.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtpnAtTheEnd.setText("At the end of this lesson, the students must be able to:\r\n\t1. Define diphthongs in their own words\r\n\t2. Participate actively in the games, activities, and \r\n\tdiscussions of the lesson.\r\n\t3. Give various examples of words with diphthongs\r\n\t4. Extract the diphthongs used in nursery rhymes.\r\n\t5. Produce the English diphthongs  sounds correctly.");
		
		JLabel lblNewLabel = new JLabel("LEARNING OUTCOMES");
		lblNewLabel.setBounds(175, 57, 386, 45);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 35));
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("PROCEED");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(true);
				panel.setVisible(false);
				panels(page1);
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 25));
		btnNewButton.setBounds(264, 341, 282, 51);
		panel.add(btnNewButton);

	}
	public void panels(JPanel panel)
	{
		JPanel[] panels = {page1,page2,page3,page4,page5,page6};
		for(JPanel everypanel:panels)
		{
			everypanel.setVisible(false);
		}
		panel.setVisible(true);
	}
}
