package quiz;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class quiz1panel extends JPanel {

	/**
	 * Create the panel.
	 */
	public static JPanel question_1;
	JPanel question_2;
	JPanel question_3;
	JPanel question_4;
	JPanel question_5;
	JPanel result;
	DefaultTableModel model;
	int points = 0;
	private JTable table;
	private JTable table_1;
	String[] answers = {"Larynx","Tongue","Lungs","Vocal Cords","Resonators"};
	public quiz1panel() {
		ArrayList<String> score = new ArrayList<String>();
		setBackground(Color.WHITE);
		setBounds(0,0,769, 491);
		setLayout(null);
		ButtonGroup btngroup1 = new ButtonGroup();
		ButtonGroup btngroup2 = new ButtonGroup();
		ButtonGroup btngroup3 = new ButtonGroup();
		ButtonGroup btngroup4 = new ButtonGroup();
		ButtonGroup btngroup5 = new ButtonGroup();
		 
		  result = new JPanel();
		 result.setBackground(Color.WHITE);
		 result.setBounds(0, 47, 769, 444);
		 add(result);
		 result.setLayout(null);
		 
		 JLabel scorelbl = new JLabel();
		 scorelbl.setFont(new Font("Dialog", Font.BOLD, 25));
		 scorelbl.setBounds(203, 52, 379, 57);
		 result.add(scorelbl);
		 
		 JScrollPane scrollPane = new JScrollPane();
		 scrollPane.setBounds(125, 151, 500, 200);
		 result.add(scrollPane);
		 
		 table = new JTable();
		 String[] columns = new String[] {"YOUR ANSWER","CORRECT ANSWER"};
		 model = new DefaultTableModel(columns,0);
			table_1 = new JTable();
			table_1.setBackground(Color.WHITE);
			table_1.setRowSelectionAllowed(false);
			table_1.getTableHeader().setOpaque(false);
			table_1.getTableHeader().setBackground(new Color(32,136,203));
			table_1.getTableHeader().setForeground(new Color(255,255,255));
			table_1.setRowHeight(25);
			table_1.setModel(model);
		 scrollPane.setViewportView(table_1);
		 
		 JButton btnNewButton = new JButton("EXIT");
		 btnNewButton.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mouseClicked(MouseEvent e) {
		 		model.setRowCount(0);
		 		score.clear();
		 		points = 0;
		 		quizlist.showpanel(quizlist.panel);
		 		show_panels(question_1);
		 		btngroup1.clearSelection();
		 		btngroup2.clearSelection();
		 		btngroup3.clearSelection();
		 		btngroup4.clearSelection();
		 		btngroup5.clearSelection();
		 		
		 	}
		 });
		 btnNewButton.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 	}
		 });
		 btnNewButton.setBackground(new Color(0, 128, 128));
		 btnNewButton.setForeground(Color.WHITE);
		 btnNewButton.setFont(new Font("Dialog", Font.BOLD, 15));
		 btnNewButton.setBounds(278, 362, 200, 42);
		 result.add(btnNewButton);
		
		 question_5 = new JPanel();
		question_5.setLayout(null);
		question_5.setBackground(Color.WHITE);
		question_5.setBounds(0, 93, 769, 398);
		add(question_5);
		
		JRadioButton rdbtnAArticulationOrgans = new JRadioButton("A.\tArticulation Organs");
		rdbtnAArticulationOrgans.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score.add("Articulation Organs");
				scorelbl.setText("YOUR SCORE IS: " + points + "/5");
				show_panels(result);
				for(int x = 0; x < answers.length;x++)
				{
					String[] row = {score.get(x).toString(),answers[x].toString()};
					model.addRow(row);
				}
			}
		});
		rdbtnAArticulationOrgans.setFont(new Font("Dialog", Font.PLAIN, 10));
		rdbtnAArticulationOrgans.setBounds(88, 113, 140, 45);
		question_5.add(rdbtnAArticulationOrgans);
		
		JRadioButton rdbtnBLarynx_1 = new JRadioButton("B.\tLarynx");
		rdbtnBLarynx_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score.add("Larynx");
				show_panels(result);
				scorelbl.setText("YOUR SCORE IS: " + points + "/5");
				for(int x = 0; x < answers.length;x++)
				{
					String[] row = {score.get(x).toString(),answers[x].toString()};
					model.addRow(row);
				}
			}
		});
		rdbtnBLarynx_1.setFont(new Font("Dialog", Font.PLAIN, 13));
		rdbtnBLarynx_1.setBounds(88, 171, 140, 45);
		question_5.add(rdbtnBLarynx_1);
		
		JRadioButton rdbtnCResonators_1 = new JRadioButton("C.\tResonators");
		rdbtnCResonators_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score.add("Resonators");
				points++;
				scorelbl.setText("YOUR SCORE IS: " + points + "/5");
				show_panels(result);
				for(int x = 0; x < answers.length;x++)
				{
					String[] row = {score.get(x).toString(),answers[x].toString()};
					model.addRow(row);
				}
			}
		});
		rdbtnCResonators_1.setFont(new Font("Dialog", Font.PLAIN, 13));
		rdbtnCResonators_1.setBounds(88, 228, 140, 45);
		question_5.add(rdbtnCResonators_1);
		
		JRadioButton rdbtnDVocalCords_1 = new JRadioButton("D.\tVocal cords");
		rdbtnDVocalCords_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score.add("Vocal cords");
				show_panels(result);
				scorelbl.setText("YOUR SCORE IS: " + points + "/5");
				for(int x = 0; x < answers.length;x++)
				{
					String[] row = {score.get(x).toString(),answers[x].toString()};
					model.addRow(row);
				}
			}
		});
		rdbtnDVocalCords_1.setFont(new Font("Dialog", Font.PLAIN, 13));
		rdbtnDVocalCords_1.setBounds(88, 286, 140, 45);
		question_5.add(rdbtnDVocalCords_1);
		
		btngroup5.add(rdbtnBLarynx_1);
		btngroup5.add(rdbtnCResonators_1);
		btngroup5.add(rdbtnAArticulationOrgans);
		btngroup5.add(rdbtnDVocalCords_1);
		JTextPane txtpntheseAreResponsible = new JTextPane();
		txtpntheseAreResponsible.setEditable(false);
		txtpntheseAreResponsible.setText("5.These are responsible for the vibrations that come from the vocal cords becoming the sounds.  ");
		txtpntheseAreResponsible.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtpntheseAreResponsible.setBounds(52, 51, 707, 55);
		question_5.add(txtpntheseAreResponsible);
		
		 question_4 = new JPanel();
		question_4.setLayout(null);
		question_4.setBackground(Color.WHITE);
		question_4.setBounds(0, 93, 769, 398);
		add(question_4);
		
		JRadioButton rdbtnALarynx = new JRadioButton("A.\tLarynx");
		rdbtnALarynx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score.add("Larynx");
				show_panels(question_5);
				scorelbl.setText("YOUR SCORE IS: " + points + "/5");
			}
		});
		rdbtnALarynx.setFont(new Font("Dialog", Font.PLAIN, 13));
		rdbtnALarynx.setBounds(88, 113, 140, 45);
		question_4.add(rdbtnALarynx);
		
		JRadioButton rdbtnBPhonationOrgans = new JRadioButton("B.\tPhonation Organs");
		rdbtnBPhonationOrgans.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score.add("Phonation Organs");
				show_panels(question_5);
			}
		});
		rdbtnBPhonationOrgans.setFont(new Font("Dialog", Font.PLAIN, 13));
		rdbtnBPhonationOrgans.setBounds(88, 171, 140, 45);
		question_4.add(rdbtnBPhonationOrgans);
		
		JRadioButton rdbtnCResonators = new JRadioButton("C.\tResonators");
		rdbtnCResonators.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score.add("Resonators");
				show_panels(question_5);
			}
		});
		rdbtnCResonators.setFont(new Font("Dialog", Font.PLAIN, 13));
		rdbtnCResonators.setBounds(88, 228, 140, 45);
		question_4.add(rdbtnCResonators);
		
		JRadioButton rdbtnDVocalCords = new JRadioButton("D.\tVocal cords");
		rdbtnDVocalCords.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score.add("Vocal cords");
				points++;
				show_panels(question_5);
			}
		});
		rdbtnDVocalCords.setFont(new Font("Dialog", Font.PLAIN, 13));
		rdbtnDVocalCords.setBounds(88, 286, 140, 45);
		question_4.add(rdbtnDVocalCords);
		btngroup4.add(rdbtnALarynx);
		btngroup4.add(rdbtnBPhonationOrgans);
		btngroup4.add(rdbtnCResonators);
		btngroup4.add(rdbtnDVocalCords);
		
		JTextPane txtpnDespiteTheir = new JTextPane();
		txtpnDespiteTheir.setEditable(false);
		txtpnDespiteTheir.setText("4.Despite their name, the truth is that they have no rope shape, but are a set of folds that are a total of four, divided into two large groups known as the true and false. ");
		txtpnDespiteTheir.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtpnDespiteTheir.setBounds(52, 51, 707, 55);
		question_4.add(txtpnDespiteTheir);
		
		 question_3 = new JPanel();
		question_3.setLayout(null);
		question_3.setBackground(Color.WHITE);
		question_3.setBounds(0, 93, 769, 398);
		add(question_3);
		
		JRadioButton rdbtnALungs = new JRadioButton("A.\tLungs");
		rdbtnALungs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score.add("Lungs");
				points++;
				show_panels(question_4);
			}
		});
		rdbtnALungs.setFont(new Font("Dialog", Font.PLAIN, 13));
		rdbtnALungs.setBounds(88, 113, 140, 45);
		question_3.add(rdbtnALungs);
		
		JRadioButton rdbtnBBronchi = new JRadioButton("B.\tBronchi");
		rdbtnBBronchi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score.add("Bronchi");
				show_panels(question_4);
			}
		});
		rdbtnBBronchi.setFont(new Font("Dialog", Font.PLAIN, 13));
		rdbtnBBronchi.setBounds(88, 171, 140, 45);
		question_3.add(rdbtnBBronchi);
		
		JRadioButton rdbtnCGlottis = new JRadioButton("C.\tGlottis ");
		rdbtnCGlottis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score.add("Glottis");
				show_panels(question_4);
			}
		});
		rdbtnCGlottis.setFont(new Font("Dialog", Font.PLAIN, 13));
		rdbtnCGlottis.setBounds(88, 228, 140, 45);
		question_3.add(rdbtnCGlottis);
		
		JRadioButton rdbtnDWindpipe = new JRadioButton("D.\tWindpipe");
		rdbtnDWindpipe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score.add("Windpipe");
				show_panels(question_4);
			}
		});
		rdbtnDWindpipe.setFont(new Font("Dialog", Font.PLAIN, 13));
		rdbtnDWindpipe.setBounds(88, 286, 140, 45);
		question_3.add(rdbtnDWindpipe);
		
		btngroup3.add(rdbtnALungs);
		btngroup3.add(rdbtnBBronchi);
		btngroup3.add(rdbtnCGlottis);
		btngroup3.add(rdbtnDWindpipe);
		
		
		JTextPane txtpntheyAreThe = new JTextPane();
		txtpntheyAreThe.setEditable(false);
		txtpntheyAreThe.setText("3.They are the largest organs of the human body and their main function is to allow inspiration and expiration of air.");
		txtpntheyAreThe.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtpntheyAreThe.setBounds(52, 51, 707, 55);
		question_3.add(txtpntheyAreThe);
		JLabel lblNewLabel = new JLabel("Quiz 1: Speech Organs");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel.setBounds(26, 0, 232, 55);
		add(lblNewLabel);
		
		JLabel lblChooseTheLetter = new JLabel("Choose the letter of the correct answer. ");
		lblChooseTheLetter.setFont(new Font("Dialog", Font.BOLD, 15));
		lblChooseTheLetter.setBounds(52, 47, 287, 55);
		add(lblChooseTheLetter);
		
		 question_2 = new JPanel();
		question_2.setLayout(null);
		question_2.setBackground(Color.WHITE);
		question_2.setBounds(0, 93, 769, 398);
		add(question_2);
		
		JRadioButton rdbtnALips = new JRadioButton("A.\tLips");
		rdbtnALips.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score.add("Lips");
				show_panels(question_3);
			}
		});
		rdbtnALips.setFont(new Font("Dialog", Font.PLAIN, 13));
		rdbtnALips.setBounds(88, 113, 140, 45);
		question_2.add(rdbtnALips);
		
		JRadioButton rdbtnBPalate = new JRadioButton("B.\tPalate");
		rdbtnBPalate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score.add("Palate");
				show_panels(question_3);
			}
		});
		rdbtnBPalate.setFont(new Font("Dialog", Font.PLAIN, 13));
		rdbtnBPalate.setBounds(88, 171, 140, 45);
		question_2.add(rdbtnBPalate);
		
		JRadioButton rdbtnCTeeth = new JRadioButton("C.\tTeeth");
		rdbtnCTeeth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score.add("Teeth");
				show_panels(question_3);
			}
		});
		rdbtnCTeeth.setFont(new Font("Dialog", Font.PLAIN, 13));
		rdbtnCTeeth.setBounds(88, 228, 140, 45);
		question_2.add(rdbtnCTeeth);
		
		JRadioButton rdbtnDTongue = new JRadioButton("D.\tTongue");
		rdbtnDTongue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				points++;
				score.add("Tongue");
				show_panels(question_3);
			}
		});
		rdbtnDTongue.setFont(new Font("Dialog", Font.PLAIN, 13));
		rdbtnDTongue.setBounds(88, 286, 140, 45);
		question_2.add(rdbtnDTongue);
		
		btngroup2.add(rdbtnALips);
		btngroup2.add(rdbtnBPalate);
		btngroup2.add(rdbtnCTeeth);
		btngroup2.add(rdbtnDTongue);
		
		JTextPane txtpnItHas = new JTextPane();
		txtpnItHas.setEditable(false);
		txtpnItHas.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtpnItHas.setText("2.It has a key role in numerous functions, such as mouth hydration, swallowing, and language, among others. ");
		txtpnItHas.setBounds(52, 51, 707, 55);
		question_2.add(txtpnItHas);
		
		 question_1 = new JPanel();
		question_1.setBackground(Color.WHITE);
		question_1.setBounds(0, 93, 769, 398);
		add(question_1);
		question_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("1.\tIt is a tubular organ formed by a total of six cartilages. ");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(50, 11, 687, 93);
		question_1.add(lblNewLabel_1);
		
		JRadioButton rdbtnBronchi = new JRadioButton("A.\tBronchi");
		rdbtnBronchi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score.add("Bronchi");
				show_panels(question_2);
			}
		});
		rdbtnBronchi.setFont(new Font("Dialog", Font.PLAIN, 13));
		rdbtnBronchi.setBounds(88, 113, 140, 45);
		question_1.add(rdbtnBronchi);
		btngroup1.add(rdbtnBronchi);
		
		JRadioButton rdbtnBLarynx = new JRadioButton("B.\tLarynx");
		rdbtnBLarynx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				points++;
				score.add("Larynx");
				show_panels(question_2);
				
			}
		});
		rdbtnBLarynx.setFont(new Font("Dialog", Font.PLAIN, 13));
		rdbtnBLarynx.setBounds(88, 171, 140, 45);
		question_1.add(rdbtnBLarynx);
		btngroup1.add(rdbtnBLarynx);
		
		JRadioButton rdbtnCPharynx = new JRadioButton("C.\tPharynx ");
		rdbtnCPharynx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score.add("Pharynx");
				show_panels(question_2);
			}
		});
		rdbtnCPharynx.setFont(new Font("Dialog", Font.PLAIN, 13));
		rdbtnCPharynx.setBounds(88, 228, 140, 45);
		question_1.add(rdbtnCPharynx);
		btngroup1.add(rdbtnCPharynx);
		
		JRadioButton rdbtnDTrachea = new JRadioButton("D.\tTrachea");
		rdbtnDTrachea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score.add("Trachea");
				show_panels(question_2);
			}
		});
		rdbtnDTrachea.setFont(new Font("Dialog", Font.PLAIN, 13));
		rdbtnDTrachea.setBounds(88, 286, 140, 45);
		question_1.add(rdbtnDTrachea);
		btngroup1.add(rdbtnDTrachea);
		show_panels(question_1);

	}
	public void show_panels(JPanel panel)
	{
		JPanel[] panels = {result,question_1,question_2,question_3,question_4,question_5};
		for(JPanel hide:panels)
		{
			hide.setVisible(false);
		}
		panel.setVisible(true);
	}
}
