package activity;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

import database.connection;
import student.ActivityList;
import student.record_voice;

public class Activity4 extends JPanel {
	int filename = random();
	private int random() {
		return new Random().nextInt(100000);
		
	}
	/**
	 * Create the panel.
	 */
	
	JPanel rhyme1;
	JPanel rhyme2;
	JPanel rhyme3;
	JPanel rhyme4;
	JPanel rhyme5;
	JPanel rhyme6;
	int rhymeIndex;
	JButton next,prev;
	ArrayList <String>values;
	public Activity4() {
		setBackground(new Color(255, 255, 255));
		setBounds(0, 0, 769, 491);
		setLayout(null);
		setVisible(true);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(new Color(255, 255, 255));
		tabbedPane.setBounds(0, -24, 769, 525);
		add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("New tab", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(72, 209, 204));
		panel_2.setBounds(0, 0, 764, 106);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JTextPane txtpnInstructionsReadThe = new JTextPane();
		txtpnInstructionsReadThe.setEditable(false);
		txtpnInstructionsReadThe.setForeground(new Color(255, 255, 255));
		txtpnInstructionsReadThe.setOpaque(false);
		txtpnInstructionsReadThe.setFont(new Font("Dialog", Font.BOLD, 17));
		txtpnInstructionsReadThe.setText("Instructions: Read the following nursery rhymes and identify the words that contain a diphthong. Group the words according to their respective IPA symbols. Please take note that repetition of words is not allowed. Then, click the button to record yourself while reading them.");
		txtpnInstructionsReadThe.setBounds(0, 11, 764, 95);
		panel_2.add(txtpnInstructionsReadThe);

		
		JPanel layeredPane = new JPanel();
		layeredPane.setBounds(52, 131, 278, 259);
		panel.add(layeredPane);
		layeredPane.setLayout(null);
		
		 rhyme1 = new JPanel();
		rhyme1.setLayout(null);
		rhyme1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		rhyme1.setBackground(new Color(100, 149, 237));
		rhyme1.setBounds(0, 0, 278, 259);
		layeredPane.add(rhyme1);
		
		JTextPane txtpnOneEarTwo = new JTextPane();
		txtpnOneEarTwo.setForeground(new Color(255, 255, 255));
		txtpnOneEarTwo.setText("One ear, two ears, three ears,\r\nFour, five ears, six ears,\r\nSeven ears more.\r\n");
		txtpnOneEarTwo.setOpaque(false);
		txtpnOneEarTwo.setFont(new Font("Dialog", Font.BOLD, 21));
		txtpnOneEarTwo.setEditable(false);
		txtpnOneEarTwo.setBackground(SystemColor.controlDkShadow);
		txtpnOneEarTwo.setBounds(10, 74, 255, 120);
		rhyme1.add(txtpnOneEarTwo);
		
		 rhyme2 = new JPanel();
		rhyme2.setLayout(null);
		rhyme2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		rhyme2.setBackground(new Color(100, 149, 237));
		rhyme2.setBounds(0, 0, 278, 259);
		layeredPane.add(rhyme2);
		
		JTextPane txtpnOneEarTwo_1 = new JTextPane();
		txtpnOneEarTwo_1.setForeground(new Color(255, 255, 255));
		txtpnOneEarTwo_1.setText("One little, two little, three little deers,\r\nFour little, five little, six little deers,\r\nSeven little, eight little, nine little deers,\r\nTen little baby deers. ");
		txtpnOneEarTwo_1.setOpaque(false);
		txtpnOneEarTwo_1.setFont(new Font("Dialog", Font.BOLD, 21));
		txtpnOneEarTwo_1.setEditable(false);
		txtpnOneEarTwo_1.setBackground(SystemColor.controlDkShadow);
		txtpnOneEarTwo_1.setBounds(0, 0, 278, 259);
		rhyme2.add(txtpnOneEarTwo_1);
		
		 rhyme3 = new JPanel();
		rhyme3.setLayout(null);
		rhyme3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		rhyme3.setBackground(new Color(100, 149, 237));
		rhyme3.setBounds(0, 0, 278, 259);
		layeredPane.add(rhyme3);
		
		JTextPane txtpnOneEarTwo_2 = new JTextPane();
		txtpnOneEarTwo_2.setForeground(new Color(255, 255, 255));
		txtpnOneEarTwo_2.setText("How many coins? Ten.\r\nHow many loins? Ten.\r\nHow much foil? Ten, ten, ten! \r\n");
		txtpnOneEarTwo_2.setOpaque(false);
		txtpnOneEarTwo_2.setFont(new Font("Dialog", Font.BOLD, 21));
		txtpnOneEarTwo_2.setEditable(false);
		txtpnOneEarTwo_2.setBackground(new Color(255, 255, 255));
		txtpnOneEarTwo_2.setBounds(15, 45, 253, 130);
		rhyme3.add(txtpnOneEarTwo_2);
		
		 rhyme4 = new JPanel();
		rhyme4.setLayout(null);
		rhyme4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		rhyme4.setBackground(new Color(100, 149, 237));
		rhyme4.setBounds(0, 0, 278, 259);
		layeredPane.add(rhyme4);
		
		JTextPane txtpnOneEarTwo_3 = new JTextPane();
		txtpnOneEarTwo_3.setForeground(new Color(255, 255, 255));
		txtpnOneEarTwo_3.setText("Little cow, little cow.\r\nHow are you?\r\nLittle cow, little cow.\r\nWhat can you do?");
		txtpnOneEarTwo_3.setOpaque(false);
		txtpnOneEarTwo_3.setFont(new Font("Dialog", Font.BOLD, 21));
		txtpnOneEarTwo_3.setEditable(false);
		txtpnOneEarTwo_3.setBackground(new Color(255, 255, 255));
		txtpnOneEarTwo_3.setBounds(15, 40, 254, 118);
		rhyme4.add(txtpnOneEarTwo_3);
		
		 rhyme5 = new JPanel();
		rhyme5.setLayout(null);
		rhyme5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		rhyme5.setBackground(new Color(100, 149, 237));
		rhyme5.setBounds(0, 0, 278, 259);
		layeredPane.add(rhyme5);
		
		JTextPane txtpnOneEarTwo_4 = new JTextPane();
		txtpnOneEarTwo_4.setForeground(new Color(255, 255, 255));
		txtpnOneEarTwo_4.setText("Baby boy, baby boy,\r\nGive me a toy!\r\nBaby boy, baby boy,\r\nShare the joy! ? ");
		txtpnOneEarTwo_4.setOpaque(false);
		txtpnOneEarTwo_4.setFont(new Font("Dialog", Font.BOLD, 21));
		txtpnOneEarTwo_4.setEditable(false);
		txtpnOneEarTwo_4.setBackground(new Color(255, 255, 255));
		txtpnOneEarTwo_4.setBounds(10, 55, 255, 120);
		rhyme5.add(txtpnOneEarTwo_4);
		
		 rhyme6 = new JPanel();
		rhyme6.setLayout(null);
		rhyme6.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		rhyme6.setBackground(new Color(100, 149, 237));
		rhyme6.setBounds(0, 0, 278, 259);
		layeredPane.add(rhyme6);
		
		JTextPane txtpnOneEarTwo_5 = new JTextPane();
		txtpnOneEarTwo_5.setForeground(new Color(255, 255, 255));
		txtpnOneEarTwo_5.setText("I am a mouse.\r\nI don\u2019t have a house.\r\nI have a tail.\r\nI can chew through mail.");
		txtpnOneEarTwo_5.setOpaque(false);
		txtpnOneEarTwo_5.setFont(new Font("Dialog", Font.BOLD, 21));
		txtpnOneEarTwo_5.setEditable(false);
		txtpnOneEarTwo_5.setBackground(new Color(255, 255, 255));
		txtpnOneEarTwo_5.setBounds(10, 55, 255, 120);
		rhyme6.add(txtpnOneEarTwo_5);
		String[] columns = new String[] {"Diphthong IPA Keyword","Extracted Word"};
		DefaultTableModel model = new DefaultTableModel(columns,7);
		String[] item = {"Hello","High"};
		model.addRow(item);
		
		 rhymeIndex = 0;
		
		 prev = new JButton("PREV");
		 prev.setForeground(new Color(255, 255, 255));
		 prev.setFont(new Font("Tahoma", Font.BOLD, 15));
		 prev.setBackground(new Color(0, 128, 128));
		 prev.setEnabled(false);
		prev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rhymeIndex--;
				next.setEnabled(true);
				showRhymePanel(rhymeIndex);
				if(rhymeIndex<=0) {
					prev.setEnabled(false);
					
				}
				
			}
		});
		prev.setBounds(52, 410, 89, 23);
		panel.add(prev);
		
		 next = new JButton("NEXT");
		 next.setFont(new Font("Tahoma", Font.BOLD, 15));
		 next.setForeground(new Color(255, 255, 255));
		 next.setBackground(new Color(0, 128, 128));
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rhymeIndex++;
				prev.setEnabled(true);
				showRhymePanel(rhymeIndex);
				if(rhymeIndex>=5) {
					next.setEnabled(false);
				}
				
			}
		});
		values = new ArrayList <String>();
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(396, 131, 315, 259);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Diphthong IPA Symbol\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 11, 156, 25);
		panel_1.add(lblNewLabel);
		
		JLabel lblKeywords = new JLabel("Exracted Words");
		lblKeywords.setHorizontalAlignment(SwingConstants.CENTER);
		lblKeywords.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblKeywords.setBounds(159, 11, 156, 25);
		panel_1.add(lblKeywords);
		
		JLabel lblNewLabel_1 = new JLabel("/a\u026A/");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 52, 156, 25);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("/\u026A\u0259/");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 82, 156, 25);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("/\u028A\u0259/");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(10, 111, 156, 25);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("/e\u026A/");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(10, 140, 156, 25);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("/a\u028A/");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(10, 169, 156, 25);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("/e\u0259/");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(10, 197, 156, 25);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("/\u0254\u026A/");
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6_1.setBounds(10, 223, 156, 25);
		panel_1.add(lblNewLabel_6_1);
		
		JTextField get1 = new JTextField("");
		get1.setHorizontalAlignment(SwingConstants.CENTER);
		get1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		get1.setBounds(169, 52, 136, 25);
		panel_1.add(get1);
		
		JTextField get2 = new JTextField("");
		get2.setHorizontalAlignment(SwingConstants.CENTER);
		get2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		get2.setBounds(169, 82, 136, 25);
		panel_1.add(get2);
		
		JTextField get3 = new JTextField("");
		get3.setHorizontalAlignment(SwingConstants.CENTER);
		get3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		get3.setBounds(169, 111, 136, 25);
		panel_1.add(get3);
		
		JTextField get4 = new JTextField("");
		get4.setHorizontalAlignment(SwingConstants.CENTER);
		get4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		get4.setBounds(169, 140, 136, 25);
		panel_1.add(get4);
		
		JTextField get5 = new JTextField("");
		get5.setHorizontalAlignment(SwingConstants.CENTER);
		get5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		get5.setBounds(169, 169, 136, 25);
		panel_1.add(get5);
		
		JTextField get6 = new JTextField("");
		get6.setHorizontalAlignment(SwingConstants.CENTER);
		get6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		get6.setBounds(169, 197, 136, 25);
		panel_1.add(get6);
		
		JTextField get7 = new JTextField("");
		get7.setHorizontalAlignment(SwingConstants.CENTER);
		get7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		get7.setBounds(169, 223, 136, 25);
		panel_1.add(get7);
		showRhymePanel(rhymeIndex);
		next.setBounds(241, 410, 89, 23);
		panel.add(next);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = 0;
				JTextField[] fields= new JTextField[] {get1,get2,get3,get4,get5,get6,get7};
				while(x<=fields.length)
				{
					values.add(fields[0].getText());
					x++;
				}

				
				System.out.print(values);
				JOptionPane.showMessageDialog(null,"ACTIVITY SUMBITTED");
				setVisible(false);
				ActivityList.tabbedPane.setSelectedIndex(0);
				
				new connection();
				try {
					connection.submitActivity4(values, filename+"_record.wav",random()+"_attempt");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				values.clear();
				int z = 0;
				while(z<fields.length)
				{
					fields[z].setText("");		
					z++;
				}
				
				
				
				
		
			}
		});
		btnSubmit.setEnabled(false);
		btnSubmit.setBackground(new Color(255, 255, 255));
		btnSubmit.setForeground(new Color(0, 128, 128));
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSubmit.setBounds(560, 401, 118, 36);
		panel.add(btnSubmit);
	
		
		JButton btnRecord = new JButton("RECORD");
		btnRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new record_voice(filename);
				btnSubmit.setEnabled(true);
			}
		});
		btnRecord.setForeground(new Color(0, 128, 128));
		btnRecord.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRecord.setBackground(Color.WHITE);
		btnRecord.setBounds(432, 400, 118, 36);
		panel.add(btnRecord);
	}
	public void showRhymePanel(int index)
	{
		
		JPanel[] panels = {rhyme1,rhyme2,rhyme3,rhyme4,rhyme5,rhyme6};
		for(JPanel panelHide:panels)
		{
			panelHide.setVisible(false);
		}
		panels[index].setVisible(true);
//		rhyme1.setVisible(false);
//		rhyme2.setVisible(false);
//		rhyme3.setVisible(false);
//		rhyme4.setVisible(false);
//		rhyme5.setVisible(false);
//		rhyme6.setVisible(false);
//		rhyme7.setVisible(false);
//		panel.setVisible(true);
	}
}
