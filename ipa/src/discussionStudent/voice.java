package discussionStudent;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import student.text2speech;

import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.concurrent.ExecutionException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class voice extends JPanel {

	/**
	 * Create the panel.
	 */
	JPanel panel;
	JPanel panel_1;
	JPanel panel_2;
	JPanel panel_3;
	JPanel panel_5;
	public voice() {
		setBackground(Color.WHITE);
		setBounds(0,0,769, 491);
		setLayout(null);
		
		 panel_5 = new JPanel();
		panel_5.setBounds(213, 0, 546, 492);
		add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("WHY IS THIS IMPORTANT");
		lblNewLabel_4.setFont(new Font("Dialog", Font.BOLD, 25));
		lblNewLabel_4.setBounds(0, 11, 536, 56);
		panel_5.add(lblNewLabel_4);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 78, 526, 385);
		panel_5.add(scrollPane_1);
		
		JTextPane txtpnThisSubtleDifference = new JTextPane();
		txtpnThisSubtleDifference.setEditable(false);
		txtpnThisSubtleDifference.setText("\tThis subtle difference can be troublesome for some individuals who struggle with telling the difference between the sounds (auditory discrimination). Educators need to understand the difference between voiced and unvoiced sounds because there are several students who struggle to notice the difference between these  sounds. This is especially the case for students who have poor phonemic awareness and students who are learning English as an additional language. \r\n\tIt is common for poor spellers to have errors in their spelling where they substitute a voiced sound for it\u2018s unvoiced pair or vice versa. For example, when asked to spell the word \u2017ball\u2018, the individual may spell \u2017pall\u2018 because they were not able to detect the subtle difference between the voiced /b/ and the unvoiced /p/. Someone looking at this spelling with only a basic understanding of phonics may think phonetically speaking this spelling of \u2017pall\u2018 for the word \u2017ball\u2018 does not make sense. However, with the understanding of the difference between voiced and unvoiced consonant sounds they would be able to determine that the speller struggled to differentiate between the voiced/unvoiced pair of b & p. \r\n \tWhen working with young students or individuals who struggle with the distinction between voiced and unvoiced sounds, it is helpful to explicitly teach and practice the difference between these sounds. In a classroom or small group setting, a teacher can introduce a pair of sounds at the beginning of the lesson and then discuss how the students can use their fingers to tell the difference between the voiced and the unvoiced sounds. \r\n\tOnce the students understand the difference between these sounds, they can ask the students to give a thumbs up for words that begin with a voiced sound and a thumbs down for words that begin with and unvoiced sound. In the beginning, the teacher should work with only one pair of sounds but as the students become more comfortable in the exercise they can practice with the different sounds. It is important to only focus on the beginning sound (onset) of a word when teaching the difference between voiced and unvoiced sounds. Typically voiced consonant sounds may have a weaker, unvoiced sound at the end of a word. This makes words flow together more easily and naturally when you speak (Smith, 2019)\r\n");
		txtpnThisSubtleDifference.setFont(new Font("Dialog", Font.PLAIN, 15));
		scrollPane_1.setViewportView(txtpnThisSubtleDifference);
		SimpleAttributeSet justify = new SimpleAttributeSet();
		StyleConstants.setAlignment(justify, StyleConstants.ALIGN_JUSTIFIED);
		StyledDocument doc2 = txtpnThisSubtleDifference.getStyledDocument();
		doc2.setParagraphAttributes(0, doc2.getLength(), justify, false);
		
		 panel_3 = new JPanel();
		panel_3.setBounds(213, 0, 546, 491);
		add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.BLUE);
		panel_4.setBounds(0, 0, 546, 38);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("VOICED");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(0, 0, 284, 38);
		panel_4.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("UNVOICED");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(294, 0, 242, 38);
		panel_4.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("/b/\r\n");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3.setBounds(10, 49, 103, 38);
		panel_3.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("[bill]");
		lblNewLabel_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					new text2speech("bill");
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ExecutionException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(121, 49, 103, 38);
		panel_3.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("/p/");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3_2.setBounds(294, 49, 103, 38);
		panel_3.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("[pill]");
		lblNewLabel_3_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					new text2speech("pill");
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ExecutionException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_3_3.setBounds(433, 49, 103, 38);
		panel_3.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("/d/\r\n");
		lblNewLabel_3_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_4.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3_4.setBounds(10, 110, 103, 38);
		panel_3.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("[done]");
		lblNewLabel_3_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					new text2speech("done");
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ExecutionException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_3_1_1.setBounds(121, 110, 103, 38);
		panel_3.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("/t/");
		lblNewLabel_3_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_1.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3_2_1.setBounds(294, 110, 103, 38);
		panel_3.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("[ton]");
		lblNewLabel_3_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					new text2speech("ton");
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ExecutionException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		lblNewLabel_3_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_3_3_1.setBounds(433, 110, 103, 38);
		panel_3.add(lblNewLabel_3_3_1);
		
		JLabel lblNewLabel_3_5 = new JLabel("/g/\r\n");
		lblNewLabel_3_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_5.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3_5.setBounds(10, 164, 103, 38);
		panel_3.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("[goat]");
		lblNewLabel_3_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					new text2speech("goat");
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ExecutionException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		lblNewLabel_3_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_2.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_3_1_2.setBounds(121, 164, 103, 38);
		panel_3.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_3_2_2 = new JLabel("/k/");
		lblNewLabel_3_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_2.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3_2_2.setBounds(294, 164, 103, 38);
		panel_3.add(lblNewLabel_3_2_2);
		
		JLabel lblNewLabel_3_3_2 = new JLabel("[coat]");
		lblNewLabel_3_3_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					new text2speech("coat");
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ExecutionException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		lblNewLabel_3_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3_2.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_3_3_2.setBounds(433, 164, 103, 38);
		panel_3.add(lblNewLabel_3_3_2);
		
		JLabel lblNewLabel_3_6 = new JLabel("/j/");
		lblNewLabel_3_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_6.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3_6.setBounds(10, 222, 103, 38);
		panel_3.add(lblNewLabel_3_6);
		
		JLabel lblNewLabel_3_1_3 = new JLabel("[jar]");
		lblNewLabel_3_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					new text2speech("jar");
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ExecutionException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		lblNewLabel_3_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_3.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_3_1_3.setBounds(121, 222, 103, 38);
		panel_3.add(lblNewLabel_3_1_3);
		
		JLabel lblNewLabel_3_2_3 = new JLabel("/ch/");
		lblNewLabel_3_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_3.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3_2_3.setBounds(294, 222, 103, 38);
		panel_3.add(lblNewLabel_3_2_3);
		
		JLabel lblNewLabel_3_3_3 = new JLabel("[char]");
		lblNewLabel_3_3_3.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					new text2speech("char");
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ExecutionException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		lblNewLabel_3_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3_3.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_3_3_3.setBounds(433, 222, 103, 38);
		panel_3.add(lblNewLabel_3_3_3);
		
		JLabel lblNewLabel_3_7 = new JLabel("/v/");
		lblNewLabel_3_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_7.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3_7.setBounds(10, 271, 103, 38);
		panel_3.add(lblNewLabel_3_7);
		
		JLabel lblNewLabel_3_1_4 = new JLabel("[vine]");
		lblNewLabel_3_1_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					new text2speech("vine");
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ExecutionException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		lblNewLabel_3_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_4.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_3_1_4.setBounds(121, 271, 103, 38);
		panel_3.add(lblNewLabel_3_1_4);
		
		JLabel lblNewLabel_3_2_4 = new JLabel("/f/");
		lblNewLabel_3_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_4.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3_2_4.setBounds(294, 271, 103, 38);
		panel_3.add(lblNewLabel_3_2_4);
		
		JLabel lblNewLabel_3_3_4 = new JLabel("[fine]");
		lblNewLabel_3_3_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					new text2speech("fine");
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ExecutionException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		lblNewLabel_3_3_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3_4.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_3_3_4.setBounds(433, 271, 103, 38);
		panel_3.add(lblNewLabel_3_3_4);
		
		JLabel lblNewLabel_3_8 = new JLabel("/z/");
		lblNewLabel_3_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_8.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3_8.setBounds(10, 320, 103, 38);
		panel_3.add(lblNewLabel_3_8);
		
		JLabel lblNewLabel_3_1_5 = new JLabel("[zoo]");
		lblNewLabel_3_1_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					new text2speech("zoo");
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ExecutionException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		lblNewLabel_3_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_5.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_3_1_5.setBounds(121, 320, 103, 38);
		panel_3.add(lblNewLabel_3_1_5);
		
		JLabel lblNewLabel_3_2_5 = new JLabel("/s/");
		lblNewLabel_3_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_5.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3_2_5.setBounds(294, 320, 103, 38);
		panel_3.add(lblNewLabel_3_2_5);
		
		JLabel lblNewLabel_3_3_5 = new JLabel("[sue]");
		lblNewLabel_3_3_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					new text2speech("sue");
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ExecutionException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		lblNewLabel_3_3_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3_5.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_3_3_5.setBounds(433, 320, 103, 38);
		panel_3.add(lblNewLabel_3_3_5);
		
		JLabel lblNewLabel_3_9 = new JLabel("/th/");
		lblNewLabel_3_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_9.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3_9.setBounds(10, 369, 103, 38);
		panel_3.add(lblNewLabel_3_9);
		
		JLabel lblNewLabel_3_1_6 = new JLabel("[them]");
		lblNewLabel_3_1_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					new text2speech("them");
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ExecutionException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		lblNewLabel_3_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_6.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_3_1_6.setBounds(121, 369, 103, 38);
		panel_3.add(lblNewLabel_3_1_6);
		
		JLabel lblNewLabel_3_2_6 = new JLabel("/th/");
		lblNewLabel_3_2_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_6.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3_2_6.setBounds(294, 369, 103, 38);
		panel_3.add(lblNewLabel_3_2_6);
		
		JLabel lblNewLabel_3_3_6 = new JLabel("[thin]");
		lblNewLabel_3_3_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					new text2speech("thin");
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ExecutionException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		lblNewLabel_3_3_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3_6.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_3_3_6.setBounds(433, 369, 103, 38);
		panel_3.add(lblNewLabel_3_3_6);
		
		JLabel lblNewLabel_3_10 = new JLabel("/w/");
		lblNewLabel_3_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_10.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3_10.setBounds(10, 418, 103, 38);
		panel_3.add(lblNewLabel_3_10);
		
		JLabel lblNewLabel_3_1_7 = new JLabel("[wail]");
		lblNewLabel_3_1_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					new text2speech("wail");
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ExecutionException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		lblNewLabel_3_1_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_7.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_3_1_7.setBounds(121, 418, 103, 38);
		panel_3.add(lblNewLabel_3_1_7);
		
		JLabel lblNewLabel_3_2_7 = new JLabel("/hw/");
		lblNewLabel_3_2_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_7.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3_2_7.setBounds(294, 418, 103, 38);
		panel_3.add(lblNewLabel_3_2_7);
		
		JLabel lblNewLabel_3_3_7 = new JLabel("[whale]");
		lblNewLabel_3_3_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					new text2speech("whale");
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ExecutionException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		lblNewLabel_3_3_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3_7.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_3_3_7.setBounds(433, 418, 103, 38);
		panel_3.add(lblNewLabel_3_3_7);
		
		 panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 217, 491);
		panel_2.setVisible(false);
		add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panels(panel_1);
			}
		});
		btnNewButton_1.setBounds(10, 458, 39, 23);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("2");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panels(panel_3);
			}
		});
		btnNewButton_1_1.setBounds(59, 458, 39, 23);
		panel_2.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("3");
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panels(panel_5);
			}
		});
		btnNewButton_1_2.setBounds(113, 458, 39, 23);
		panel_2.add(btnNewButton_1_2);
		
		 panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(213, 0, 546, 491);
		add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(17, 11, 519, 475);
		panel_1.add(scrollPane);
		
		JTextPane txtpnA = new JTextPane();
		txtpnA.setEditable(false);
		scrollPane.setViewportView(txtpnA);
		txtpnA.setContentType("text/html");
		txtpnA.setText("<body style=\"font-family:dialog\"align = justify>\r\n<center>\r\n<h1>VOICE AND VOICELESS SOUND</h1>\r\n</center>\r\n<p style=\"font-size:15;\"> &nbsp All sounds are either voiced or voiceless. <b><i>Voiced sounds</i></b> are those that make our vocal cords vibrate when they are produced. Voiceless sounds are produced from air passing through the mouth at different points.</p>\r\n<h1>Voiced sounds</h1>\r\n<p style=\"font-size:15;\"> &nbsp Technically speaking, a voiced sound is a strong sound in which the vocal cords vibrate. All vowel sounds and diphthongs are voiced sounds, but only some of the consonant sounds (/b/, /d/, /g/, /j/, /v/, /z/, /th/ as in that, and /w/ as in wail) are considered as such.</p>\r\n<h1>Unvoiced or voiceless sounds</h1>\r\n<p style=\"font-size:15;\"> &nbsp Are weak and the vocal cords do not vibrate. There are eight unvoiced consonant sounds (/p/, /t/, /k/, /ch/, /f/, /s/, /th/ as in thin, and /hw/ as in whale).\r\nIf you put your fingers over your Adam\u2018s Apple (larynx) when you pronounce voiced sounds in isolation, you should be able to feel your vocal cords vibrate. When you pronounce an unvoiced or voiceless sound, you should not be able to feel a vibration.\r\nVoiced sounds take a little more effort to produce compared to their unvoiced counterparts.</p>\r\n</body>");
		
		 panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 759, 491);
		add(panel);
		
		JLabel lblNewLabel = new JLabel("LEARNING OUTCOMES");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 25));
		lblNewLabel.setBounds(178, 102, 433, 48);
		panel.add(lblNewLabel);
		
		JTextPane txtpnAtTheEnd = new JTextPane();
		txtpnAtTheEnd.setText("At the end of the lesson, students are expected to:\r\n\r\n1. Know the difference between voiced and voiceless sounds.\r\n\r\n 2. Appreciate the essence of voiced and voiceless sounds in terms of comparing and discriminating phonemes.\r\n\r\n3. Practice voiced and voiceless sounds through the given word drills.\u00A0\u00A0\u00A0\r\n");
		txtpnAtTheEnd.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtpnAtTheEnd.setBounds(50, 167, 674, 240);
		panel.add(txtpnAtTheEnd);
		
		JButton btnNewButton = new JButton("PROCEED");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panels(panel_1);
				panel_2.setVisible(true);
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 25));
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBounds(473, 409, 191, 48);
		panel.add(btnNewButton);
		panels(panel);

	}
	
	public void panels(JPanel panelsss)
	{
		JPanel[] panelss = {panel,panel_1,panel_3,panel_5};
		for(JPanel panelist:panelss)
		{
			panelist.setVisible(false);
		}
		panelsss.setVisible(true);
	}

}
