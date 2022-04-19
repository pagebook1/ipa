package discussions;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JTabbedPane;
import java.awt.Font;
import javax.swing.SwingConstants;

import student.play_voice;
import student.text2speech;

import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.ListSelectionModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.concurrent.ExecutionException;

import javax.swing.JSplitPane;
import java.awt.GridLayout;
import javax.swing.JTextField;

public class PlaceArticulation extends JPanel {

	/**
	 * Create the panel.
	 */
	public PlaceArticulation() {
		setBackground(new Color(255, 255, 255));
		setBounds(0,0,769, 651);
		setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 769, 651);
		add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("New tab", null, panel, null);
		panel.setLayout(null);
		
		JTextPane txtpnPlaceAndManner = new JTextPane();
		txtpnPlaceAndManner.setEditable(false);
		txtpnPlaceAndManner.setFont(new Font("Dialog", Font.BOLD, 70));
		txtpnPlaceAndManner.setText("Place and Manner \r\nof Articulation");
		txtpnPlaceAndManner.setBounds(177, 113, 415, 344);
		panel.add(txtpnPlaceAndManner);
		
		JPanel phenomtable = new JPanel();
		phenomtable.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, phenomtable, null);
		phenomtable.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(220, 222, 222)), "PHONETIC SYMBOL", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(79, 86, 99)));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(51, 67, 127, 510);
		phenomtable.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("/p/");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 55, 107, 54);
		panel_3.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("/b/");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 137, 107, 54);
		panel_3.add(lblNewLabel_2);
		
		JLabel lbld = new JLabel("/d/");
		lbld.setHorizontalAlignment(SwingConstants.CENTER);
		lbld.setBounds(10, 216, 107, 54);
		panel_3.add(lbld);
		
		JLabel lblNewLabel_2_1 = new JLabel("/t/");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(10, 298, 107, 54);
		panel_3.add(lblNewLabel_2_1);
		
		JLabel lblk = new JLabel("/k/");
		lblk.setHorizontalAlignment(SwingConstants.CENTER);
		lblk.setBounds(10, 384, 107, 54);
		panel_3.add(lblk);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(220, 222, 222)), "EXAMPLE", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(79, 86, 99)));
		panel_3_1.setBackground(Color.WHITE);
		panel_3_1.setBounds(183, 67, 127, 510);
		phenomtable.add(panel_3_1);
		panel_3_1.setLayout(null);
		
		JTextPane txtpnPursepsRap = new JTextPane();
		txtpnPursepsRap.setContentType("text/html");
		txtpnPursepsRap.setEditable(false);
		btnClick(txtpnPursepsRap,"purse");
		txtpnPursepsRap.setText("\r\n<b>p</b>urse \r\n/<b>p</b>ɜːs/\r\n");
		txtpnPursepsRap.setBounds(10, 43, 107, 37);
		panel_3_1.add(txtpnPursepsRap);
		
		JTextPane txtpnRaprp = new JTextPane();
		txtpnRaprp.setContentType("text/html");
		
		txtpnRaprp.setText("ra<b>p</b>\r\n/ræ<b>p</b>/\r\n");
		txtpnRaprp.setEditable(false);
		btnClick(txtpnRaprp,"rap");
		txtpnRaprp.setBounds(10, 77, 107, 37);
		panel_3_1.add(txtpnRaprp);
		
		JTextPane txtpnRaprp_1 = new JTextPane();
		txtpnRaprp_1.setContentType("text/html");
		txtpnRaprp_1.setText("ca<b>b</b>\r\n/kæ<b>b</b>/\r\n");
		txtpnRaprp_1.setEditable(false);
		btnClick(txtpnRaprp_1,"cab");
		txtpnRaprp_1.setBounds(10, 159, 107, 37);
		panel_3_1.add(txtpnRaprp_1);
		
		JTextPane txtpnPursepsRap_1 = new JTextPane();
		txtpnPursepsRap_1.setContentType("text/html");
		txtpnPursepsRap_1.setText("<b>b</b>ack \r\n/<b>b</b>æk/\r\n");
		txtpnPursepsRap_1.setEditable(false);
		btnClick(txtpnPursepsRap_1,"back");
		txtpnPursepsRap_1.setBounds(10, 125, 107, 37);
		panel_3_1.add(txtpnPursepsRap_1);
		
		JTextPane txtpnDipdp = new JTextPane();
		txtpnDipdp.setContentType("text/html");
		txtpnDipdp.setText("<b>d</b>ip \r\n/<b>d</b>ɪp/\r\n");
		txtpnDipdp.setEditable(false);
		btnClick(txtpnDipdp,"dip");
		txtpnDipdp.setBounds(10, 207, 107, 37);
		panel_3_1.add(txtpnDipdp);
		
		JTextPane txtpnPursepsRap_1_1 = new JTextPane();
		txtpnPursepsRap_1_1.setContentType("text/html");
		txtpnPursepsRap_1_1.setText("<b>t</b>ab \r\n/<b>t</b>æb/\r\n");
		txtpnPursepsRap_1_1.setEditable(false);
		btnClick(txtpnPursepsRap_1_1,"tab");
		txtpnPursepsRap_1_1.setBounds(10, 289, 107, 37);
		panel_3_1.add(txtpnPursepsRap_1_1);
		
		JTextPane txtpnBadbd = new JTextPane();
		txtpnBadbd.setContentType("text/html");
		txtpnBadbd.setText("ba<b>d</b>\r\n/bæ<b>d</b>/\r\n");
		txtpnBadbd.setEditable(false);
		btnClick(txtpnBadbd,"bad");
		txtpnBadbd.setBounds(10, 241, 107, 37);
		panel_3_1.add(txtpnBadbd);
		
		JTextPane txtpnRaprp_1_1 = new JTextPane();
		txtpnRaprp_1_1.setContentType("text/html");
		txtpnRaprp_1_1.setText("ra<b>t</b>\r\n/ræ<b>t</b>/\r\n");
		txtpnRaprp_1_1.setEditable(false);
		btnClick(txtpnRaprp_1_1,"rat");
		txtpnRaprp_1_1.setBounds(10, 323, 107, 37);
		panel_3_1.add(txtpnRaprp_1_1);
		
		JTextPane txtpnKitekat = new JTextPane();
		txtpnKitekat.setContentType("text/html");
		txtpnKitekat.setText("<b>k</b>ite\r\n/<b>k</b>aɪt/\r\n");
		txtpnKitekat.setEditable(false);
		btnClick(txtpnKitekat,"kite");
		txtpnKitekat.setBounds(10, 371, 107, 37);
		panel_3_1.add(txtpnKitekat);
		
		JTextPane txtpnBackbk = new JTextPane();
		txtpnBackbk.setContentType("text/html");
		txtpnBackbk.setText("bac<b>k</b>\r\n/bæ<b>k</b>/\r\n");
		txtpnBackbk.setEditable(false);
		btnClick(txtpnBackbk,"back");
		txtpnBackbk.setBounds(10, 405, 107, 37);
		panel_3_1.add(txtpnBackbk);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(220, 222, 222)), "PLACE OF ARTICULATION", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(79, 86, 99)));
		panel_3_2.setBackground(Color.WHITE);
		panel_3_2.setBounds(316, 67, 127, 510);
		phenomtable.add(panel_3_2);
		panel_3_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Bilabial");
		lblNewLabel_3.setToolTipText("souds are made with both lips. Bilabial consonants occur when you block/constrict airflow out of the mouth by bringing your lips together.");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(10, 41, 107, 54);
		panel_3_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Bilabial");
		lblNewLabel_3_1.setToolTipText("souds are made with both lips. Bilabial consonants occur when you block/constrict airflow out of the mouth by bringing your lips together.");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(10, 134, 107, 54);
		panel_3_2.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Alveolar");
		lblNewLabel_3_1_1.setToolTipText("the alveolar ridge is where your teeth meet your gums. You create alveolar consonants when you raise your tongue to the alveolar ridge to block or constrict airflow.");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setBounds(10, 295, 107, 54);
		panel_3_2.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Alveolar");
		lblNewLabel_3_2.setToolTipText("the alveolar ridge is where your teeth meet your gums. You create alveolar consonants when you raise your tongue to the alveolar ridge to block or constrict airflow.");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setBounds(10, 210, 107, 54);
		panel_3_2.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Velar");
		lblNewLabel_3_3.setToolTipText("behind your hard palate you have the velum or soft palate. Unlike the bony hard palate in front of it, mucousy tissue. You make velar consonants when you raise the back of your tongue to the velum to block or restrict airflow.");
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setBounds(10, 384, 107, 54);
		panel_3_2.add(lblNewLabel_3_3);
		
		JPanel panel_3_3 = new JPanel();
		panel_3_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(220, 222, 222)), "MANNER OF ARTICULATION", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(79, 86, 99)));
		panel_3_3.setBackground(Color.WHITE);
		panel_3_3.setBounds(453, 67, 127, 510);
		phenomtable.add(panel_3_3);
		panel_3_3.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("(Oral) Stop");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(10, 41, 107, 54);
		panel_3_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("(Oral) Stop");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setBounds(10, 129, 107, 54);
		panel_3_3.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("(Oral) Stop");
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2.setBounds(10, 208, 107, 54);
		panel_3_3.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("(Oral) Stop");
		lblNewLabel_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1.setBounds(10, 296, 107, 54);
		panel_3_3.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("(Oral) Stop");
		lblNewLabel_4_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1_1.setBounds(10, 382, 107, 54);
		panel_3_3.add(lblNewLabel_4_1_1_1);
		
		JPanel panel_3_4 = new JPanel();
		panel_3_4.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(220, 222, 222)), "VIDEO", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(79, 86, 99)));
		panel_3_4.setBackground(Color.WHITE);
		panel_3_4.setBounds(590, 67, 127, 510);
		phenomtable.add(panel_3_4);
		panel_3_4.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("WATCH");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new embedVideo("https://drive.google.com/file/d/1PXTUic_gJP9LIhIPxLlu_BVMqUVbLj9m/preview");
			}
		});
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBounds(10, 55, 107, 33);
		panel_3_4.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("WATCH");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new embedVideo("https://drive.google.com/file/d/1NmA6miwwdlJThJCmy_GOFFK2IIRvG6Ow/preview");
			}
		});
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setBackground(Color.GREEN);
		btnNewButton_1_1.setBounds(10, 139, 107, 33);
		panel_3_4.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("WATCH");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new embedVideo("https://drive.google.com/file/d/1O-4y4EmGqyzYm3NUNi9A1a91uTd2CRSO/preview");
			}
		});
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.setBackground(Color.GREEN);
		btnNewButton_1_2.setBounds(10, 223, 107, 33);
		panel_3_4.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_1_1 = new JButton("WATCH");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new embedVideo("https://drive.google.com/file/d/1wGZTaxDxe0TxXJbHJF7EMxp6dffpz3V2/preview");
			}
		});
		btnNewButton_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1.setBackground(Color.GREEN);
		btnNewButton_1_1_1.setBounds(10, 307, 107, 33);
		panel_3_4.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_2_1 = new JButton("WATCH");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new embedVideo("https://drive.google.com/file/d/1bPcvjR1YcffOSED1bi2hsjfAyeDKqypc/preview");
			}
		});
		btnNewButton_1_2_1.setForeground(Color.WHITE);
		btnNewButton_1_2_1.setBackground(Color.GREEN);
		btnNewButton_1_2_1.setBounds(10, 394, 107, 33);
		panel_3_4.add(btnNewButton_1_2_1);
		
		JPanel phenomtable_1 = new JPanel();
		phenomtable_1.setLayout(null);
		phenomtable_1.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, phenomtable_1, null);
		
		JPanel panel_3_5 = new JPanel();
		panel_3_5.setLayout(null);
		panel_3_5.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(220, 222, 222)), "PHONETIC SYMBOL", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(79, 86, 99)));
		panel_3_5.setBackground(Color.WHITE);
		panel_3_5.setBounds(51, 67, 127, 510);
		phenomtable_1.add(panel_3_5);
		
		JLabel lblk_2 = new JLabel("/g/");
		lblk_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblk_2.setBounds(10, 55, 107, 54);
		panel_3_5.add(lblk_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("/f/");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setBounds(10, 137, 107, 54);
		panel_3_5.add(lblNewLabel_2_2);
		
		JLabel lblv = new JLabel("/v/");
		lblv.setHorizontalAlignment(SwingConstants.CENTER);
		lblv.setBounds(10, 216, 107, 54);
		panel_3_5.add(lblv);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("/ɵ/");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setBounds(10, 298, 107, 54);
		panel_3_5.add(lblNewLabel_2_1_1);
		
		JLabel lblk_1 = new JLabel("/ð/");
		lblk_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblk_1.setBounds(10, 384, 107, 54);
		panel_3_5.add(lblk_1);
		
		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setLayout(null);
		panel_3_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(220, 222, 222)), "EXAMPLE", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(79, 86, 99)));
		panel_3_1_1.setBackground(Color.WHITE);
		panel_3_1_1.setBounds(183, 67, 127, 510);
		phenomtable_1.add(panel_3_1_1);
		
		JTextPane txtpnGoodgd = new JTextPane();
		txtpnGoodgd.setContentType("text/html");
		txtpnGoodgd.setText("<b>g</b>ood \r\n/<b>g</b>ʊd/\r\n");
		btnClick(txtpnGoodgd,"good");
		txtpnGoodgd.setEditable(false);
		txtpnGoodgd.setBounds(10, 43, 107, 37);
		panel_3_1_1.add(txtpnGoodgd);
		
		JTextPane txtpnBugbg = new JTextPane();
		txtpnBugbg.setContentType("text/html");
		txtpnBugbg.setText("bu<b>g</b>\r\n/bʌ<b>g</b>/\r\n");
		txtpnBugbg.setEditable(false);
		btnClick(txtpnBugbg,"bug");
		txtpnBugbg.setBounds(10, 77, 107, 37);
		panel_3_1_1.add(txtpnBugbg);
		
		JTextPane txtpnRaprp_1_2 = new JTextPane();
		txtpnRaprp_1_2.setContentType("text/html");
		txtpnRaprp_1_2.setText("<b>f</b>all\r\n/<b>f</b>ɔːl/\r\n");
		txtpnRaprp_1_2.setEditable(false);
		btnClick(txtpnRaprp_1_2,"fall");
		txtpnRaprp_1_2.setBounds(10, 159, 107, 37);
		panel_3_1_1.add(txtpnRaprp_1_2);
		
		JTextPane txtpnPursepsRap_1_2 = new JTextPane();
		txtpnPursepsRap_1_2.setContentType("text/html");
		txtpnPursepsRap_1_2.setText("<b>f</b>rom \r\n/<b>f</b>rɒm/\r\n");
		txtpnPursepsRap_1_2.setEditable(false);
		btnClick(txtpnPursepsRap_1_2,"from");
		txtpnPursepsRap_1_2.setBounds(10, 125, 107, 37);
		panel_3_1_1.add(txtpnPursepsRap_1_2);
		
		JTextPane txtpnVinevan = new JTextPane();
		txtpnVinevan.setContentType("text/html");
		txtpnVinevan.setText("<b>v</b>ine \r\n/<b>v</b>aɪn/\r\n");
		txtpnVinevan.setEditable(false);
		btnClick(txtpnVinevan,"vine");
		txtpnVinevan.setBounds(10, 207, 107, 37);
		panel_3_1_1.add(txtpnVinevan);
		
		JTextPane txtpnPursepsRap_1_1_1 = new JTextPane();
		txtpnPursepsRap_1_1_1.setContentType("text/html");
		txtpnPursepsRap_1_1_1.setText("<b>th</b>e \r\n/<b>ð</b>iː/\r\n");
		txtpnPursepsRap_1_1_1.setEditable(false);
		btnClick(txtpnPursepsRap_1_1_1,"the");
		txtpnPursepsRap_1_1_1.setBounds(10, 390, 107, 37);
		panel_3_1_1.add(txtpnPursepsRap_1_1_1);
		
		JTextPane txtpnHavehv = new JTextPane();
		txtpnHavehv.setContentType("text/html");
		txtpnHavehv.setText("<b>h</b>ave\r\n/<b>h</b>æv/\r\n");
		txtpnHavehv.setEditable(false);
		btnClick(txtpnHavehv,"have");
		txtpnHavehv.setBounds(10, 241, 107, 37);
		panel_3_1_1.add(txtpnHavehv);
		
		JTextPane txtpnThickk = new JTextPane();
		txtpnThickk.setContentType("text/html");
		txtpnThickk.setText("<b>th</b>ick \r\n/<b>θ</b>ɪk/\r\n");
		txtpnThickk.setEditable(false);
		btnClick(txtpnThickk,"thick");
		txtpnThickk.setBounds(10, 307, 107, 37);
		panel_3_1_1.add(txtpnThickk);
		
		JTextPane txtpnBathb = new JTextPane();
		txtpnBathb.setContentType("text/html");
		txtpnBathb.setText("ba<b>th</b>\r\n/bɑː<b>θ</b>/\r\n");
		txtpnBathb.setEditable(false);
		btnClick(txtpnBathb,"bath");
		txtpnBathb.setBounds(10, 342, 107, 37);
		panel_3_1_1.add(txtpnBathb);
		
		JTextPane txtpnRaprp_1_1_1 = new JTextPane();
		txtpnRaprp_1_1_1.setContentType("text/html");
		txtpnRaprp_1_1_1.setBounds(10, 424, 107, 37);
		panel_3_1_1.add(txtpnRaprp_1_1_1);
		txtpnRaprp_1_1_1.setText("ra<b>th</b>er\r\n/ˈrɑː<b>ð</b>ə/\r\n");
		txtpnRaprp_1_1_1.setEditable(false);
		btnClick(txtpnRaprp_1_1_1,"rather");
		
		JPanel panel_3_2_1 = new JPanel();
		panel_3_2_1.setLayout(null);
		panel_3_2_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(220, 222, 222)), "PLACE OF ARTICULATION", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(79, 86, 99)));
		panel_3_2_1.setBackground(Color.WHITE);
		panel_3_2_1.setBounds(316, 67, 127, 510);
		phenomtable_1.add(panel_3_2_1);
		
		JLabel lblNewLabel_3_4 = new JLabel("Velar\r\n");
		lblNewLabel_3_4.setToolTipText("behind your hard palate you have the velum or soft palate. Unlike the bony hard palate in front of it, mucousy tissue. You make velar consonants when you raise the back of your tongue to the velum to block or restrict airflow.");
		lblNewLabel_3_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_4.setBounds(10, 41, 107, 54);
		panel_3_2_1.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Labio-dental");
		lblNewLabel_3_1_2.setToolTipText("consonants occur when you block/constrict airflow by curling your lower lip back and raising it to touch your upper row of teeth.");
		lblNewLabel_3_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_2.setBounds(10, 134, 107, 54);
		panel_3_2_1.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Dental/Interdental");
		lblNewLabel_3_1_1_1.setToolTipText("are made with the tip of the tongue against the upper front teeth. Dental consonants occur when you block/constrict airflow by placing your slimy tongue against your upper teeth.");
		lblNewLabel_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_1.setBounds(10, 295, 107, 54);
		panel_3_2_1.add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Labio-dental");
		lblNewLabel_3_2_1.setToolTipText("consonants occur when you block/constrict airflow by curling your lower lip back and raising it to touch your upper row of teeth.");
		lblNewLabel_3_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_1.setBounds(10, 210, 107, 54);
		panel_3_2_1.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("Dental/Interdental");
		lblNewLabel_3_3_1.setToolTipText("are made with the tip of the tongue against the upper front teeth. Dental consonants occur when you block/constrict airflow by placing your slimy tongue against your upper teeth.");
		lblNewLabel_3_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3_1.setBounds(10, 384, 107, 54);
		panel_3_2_1.add(lblNewLabel_3_3_1);
		
		JPanel panel_3_3_1 = new JPanel();
		panel_3_3_1.setLayout(null);
		panel_3_3_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(220, 222, 222)), "MANNER OF ARTICULATION", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(79, 86, 99)));
		panel_3_3_1.setBackground(Color.WHITE);
		panel_3_3_1.setBounds(453, 67, 127, 510);
		phenomtable_1.add(panel_3_3_1);
		
		JLabel lblNewLabel_4_3 = new JLabel("(Oral) Stop");
		lblNewLabel_4_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_3.setBounds(10, 41, 107, 54);
		panel_3_3_1.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("Fricative");
		lblNewLabel_4_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_2.setBounds(10, 129, 107, 54);
		panel_3_3_1.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_2_1 = new JLabel("Fricative");
		lblNewLabel_4_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2_1.setBounds(10, 208, 107, 54);
		panel_3_3_1.add(lblNewLabel_4_2_1);
		
		JLabel lblNewLabel_4_1_1_2 = new JLabel("Fricative");
		lblNewLabel_4_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1_2.setBounds(10, 296, 107, 54);
		panel_3_3_1.add(lblNewLabel_4_1_1_2);
		
		JLabel lblNewLabel_4_1_1_1_1 = new JLabel("Fricative");
		lblNewLabel_4_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1_1_1.setBounds(10, 382, 107, 54);
		panel_3_3_1.add(lblNewLabel_4_1_1_1_1);
		
		JPanel panel_3_4_1 = new JPanel();
		panel_3_4_1.setLayout(null);
		panel_3_4_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(220, 222, 222)), "VIDEO", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(79, 86, 99)));
		panel_3_4_1.setBackground(Color.WHITE);
		panel_3_4_1.setBounds(590, 67, 127, 510);
		phenomtable_1.add(panel_3_4_1);
		
		JButton btnNewButton_1_3 = new JButton("WATCH");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new embedVideo("https://drive.google.com/file/d/1YtwNrLOzUMyXjt9kkDywIvDQrKDuHTA0/preview");
			}
		});
		btnNewButton_1_3.setForeground(Color.WHITE);
		btnNewButton_1_3.setBackground(Color.GREEN);
		btnNewButton_1_3.setBounds(10, 55, 107, 33);
		panel_3_4_1.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_1_2 = new JButton("WATCH");
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new embedVideo("https://drive.google.com/file/d/1B2Xd93YghY9plTrpv7rvfQ6mYAbzGvsm/preview");
			}
		});
		btnNewButton_1_1_2.setForeground(Color.WHITE);
		btnNewButton_1_1_2.setBackground(Color.GREEN);
		btnNewButton_1_1_2.setBounds(10, 139, 107, 33);
		panel_3_4_1.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1_2_2 = new JButton("WATCH");
		btnNewButton_1_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new embedVideo("https://drive.google.com/file/d/1B-NtrjmgU1SffGYyIOv9QIv5-dvJ2mWI/preview");
			}
		});
		btnNewButton_1_2_2.setForeground(Color.WHITE);
		btnNewButton_1_2_2.setBackground(Color.GREEN);
		btnNewButton_1_2_2.setBounds(10, 223, 107, 33);
		panel_3_4_1.add(btnNewButton_1_2_2);
		
		JButton btnNewButton_1_1_1_1 = new JButton("WATCH");
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new embedVideo("https://drive.google.com/file/d/19KnXKmihWjJM7qtv3-PzrbvLqLrWiHTh/preview");
			}
		});
		btnNewButton_1_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1_1.setBackground(Color.GREEN);
		btnNewButton_1_1_1_1.setBounds(10, 307, 107, 33);
		panel_3_4_1.add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_1_2_1_1 = new JButton("WATCH");
		btnNewButton_1_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new embedVideo("https://drive.google.com/file/d/1ae5P2sAWSySzPAOeGHEBe4Ye0qWmq2_w/preview");
			}
		});
		btnNewButton_1_2_1_1.setForeground(Color.WHITE);
		btnNewButton_1_2_1_1.setBackground(Color.GREEN);
		btnNewButton_1_2_1_1.setBounds(10, 394, 107, 33);
		panel_3_4_1.add(btnNewButton_1_2_1_1);
		
		JPanel phenomtable_1_1 = new JPanel();
		phenomtable_1_1.setLayout(null);
		phenomtable_1_1.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, phenomtable_1_1, null);
		
		JPanel panel_3_5_1 = new JPanel();
		panel_3_5_1.setLayout(null);
		panel_3_5_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(220, 222, 222)), "PHONETIC SYMBOL", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(79, 86, 99)));
		panel_3_5_1.setBackground(Color.WHITE);
		panel_3_5_1.setBounds(51, 67, 127, 510);
		phenomtable_1_1.add(panel_3_5_1);
		
		JLabel lblk_2_1 = new JLabel("/s/\r\n");
		lblk_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblk_2_1.setBounds(10, 55, 107, 54);
		panel_3_5_1.add(lblk_2_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("/z/");
		lblNewLabel_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1.setBounds(10, 137, 107, 54);
		panel_3_5_1.add(lblNewLabel_2_2_1);
		
		JLabel lblv_1 = new JLabel("/ʃ/");
		lblv_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblv_1.setBounds(10, 216, 107, 54);
		panel_3_5_1.add(lblv_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("/ʒ/");
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1.setBounds(10, 298, 107, 54);
		panel_3_5_1.add(lblNewLabel_2_1_1_1);
		
		JLabel lblk_1_1 = new JLabel("/h/");
		lblk_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblk_1_1.setBounds(10, 384, 107, 54);
		panel_3_5_1.add(lblk_1_1);
		
		JPanel panel_3_1_1_1 = new JPanel();
		panel_3_1_1_1.setLayout(null);
		panel_3_1_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(220, 222, 222)), "EXAMPLE", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(79, 86, 99)));
		panel_3_1_1_1.setBackground(Color.WHITE);
		panel_3_1_1_1.setBounds(183, 67, 127, 510);
		phenomtable_1_1.add(panel_3_1_1_1);
		
		JTextPane txtpnSuitsjut = new JTextPane();
		txtpnSuitsjut.setContentType("text/html");
		txtpnSuitsjut.setText("<b>s</b>uit \r\n/<b>s</b>juːt/\r\n");
		btnClick(txtpnSuitsjut,"suit");
		txtpnSuitsjut.setEditable(false);
		txtpnSuitsjut.setBounds(10, 43, 107, 37);
		panel_3_1_1_1.add(txtpnSuitsjut);
		
		JTextPane txtpnBusbs = new JTextPane();
		txtpnBusbs.setContentType("text/html");
		txtpnBusbs.setText("bu<b>s</b>\r\n/bʌ<b>s</b>/\r\n");
		txtpnBusbs.setEditable(false);
		btnClick(txtpnBusbs,"bus");
		txtpnBusbs.setBounds(10, 77, 107, 37);
		panel_3_1_1_1.add(txtpnBusbs);
		
		JTextPane txtpnRaprp_1_2_1 = new JTextPane();
		txtpnRaprp_1_2_1.setContentType("text/html");
		txtpnRaprp_1_2_1.setText("ja<b>zz</b>\r\n/ʤæ<b>z</b>/\r\n");
		txtpnRaprp_1_2_1.setEditable(false);
		btnClick(txtpnRaprp_1_2_1,"jazz");
		txtpnRaprp_1_2_1.setBounds(10, 159, 107, 37);
		panel_3_1_1_1.add(txtpnRaprp_1_2_1);
		
		JTextPane txtpnPursepsRap_1_2_1 = new JTextPane();
		txtpnPursepsRap_1_2_1.setContentType("text/html");
		txtpnPursepsRap_1_2_1.setText("<b>z</b>it \r\n/<b>z</b>it/\r\n");
		txtpnPursepsRap_1_2_1.setEditable(false);
		btnClick(txtpnPursepsRap_1_2_1,"zit");
		txtpnPursepsRap_1_2_1.setBounds(10, 125, 107, 37);
		panel_3_1_1_1.add(txtpnPursepsRap_1_2_1);
		
		JTextPane txtpnShott = new JTextPane();
		txtpnShott.setContentType("text/html");
		txtpnShott.setText("<b>sh</b>ot \r\n/<b>ʃ</b>ɒt/\r\n");
		txtpnShott.setEditable(false);
		btnClick(txtpnShott,"shot");
		txtpnShott.setBounds(10, 207, 107, 37);
		panel_3_1_1_1.add(txtpnShott);
		
		JTextPane txtpnPursepsRap_1_1_1_1 = new JTextPane();
		txtpnPursepsRap_1_1_1_1.setContentType("text/html");
		txtpnPursepsRap_1_1_1_1.setText("<b>h</b>elp\r\n/<b>h</b>ɛlp/\r\n");
		txtpnPursepsRap_1_1_1_1.setEditable(false);
		btnClick(txtpnPursepsRap_1_1_1_1,"help");
		txtpnPursepsRap_1_1_1_1.setBounds(10, 401, 107, 37);
		panel_3_1_1_1.add(txtpnPursepsRap_1_1_1_1);
		
		JTextPane txtpnHushh = new JTextPane();
		txtpnHushh.setContentType("text/html");
		txtpnHushh.setText("hu<b>sh</b>\r\n/hʌ<b>ʃ</b>/\r\n");
		txtpnHushh.setEditable(false);
		btnClick(txtpnHushh,"hush");
		txtpnHushh.setBounds(10, 241, 107, 37);
		panel_3_1_1_1.add(txtpnHushh);
		
		JTextPane txtpnGenrer = new JTextPane();
		txtpnGenrer.setContentType("text/html");
		txtpnGenrer.setText("<b>g</b>enre \r\n/<b>ʒ</b>ɑːŋrə/\r\n");
		txtpnGenrer.setEditable(false);
		btnClick(txtpnGenrer,"genre");
		txtpnGenrer.setBounds(10, 307, 107, 37);
		panel_3_1_1_1.add(txtpnGenrer);
		
		JTextPane txtpnGaragegr = new JTextPane();
		txtpnGaragegr.setContentType("text/html");
		txtpnGaragegr.setText("<b>g</b>arage \r\n/ˈgærɑː<b>ʒ</b>/\r\n");
		txtpnGaragegr.setEditable(false);
		btnClick(txtpnGaragegr,"garage");
		txtpnGaragegr.setBounds(10, 342, 107, 37);
		panel_3_1_1_1.add(txtpnGaragegr);
		
		JPanel panel_3_2_1_1 = new JPanel();
		panel_3_2_1_1.setLayout(null);
		panel_3_2_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(220, 222, 222)), "PLACE OF ARTICULATION", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(79, 86, 99)));
		panel_3_2_1_1.setBackground(Color.WHITE);
		panel_3_2_1_1.setBounds(316, 67, 127, 510);
		phenomtable_1_1.add(panel_3_2_1_1);
		
		JLabel lblNewLabel_3_4_1 = new JLabel("Alveolar");
		lblNewLabel_3_4_1.setToolTipText("the alveolar ridge is where your teeth meet your gums. You create alveolar consonants when you raise your tongue to the alveolar ridge to block or constrict airflow.");
		lblNewLabel_3_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_4_1.setBounds(10, 41, 107, 54);
		panel_3_2_1_1.add(lblNewLabel_3_4_1);
		
		JLabel lblNewLabel_3_1_2_1 = new JLabel("Alveolar");
		lblNewLabel_3_1_2_1.setToolTipText("the alveolar ridge is where your teeth meet your gums. You create alveolar consonants when you raise your tongue to the alveolar ridge to block or constrict airflow.");
		lblNewLabel_3_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_2_1.setBounds(10, 134, 107, 54);
		panel_3_2_1_1.add(lblNewLabel_3_1_2_1);
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("Post-alveolar ");
		lblNewLabel_3_1_1_1_1.setToolTipText("sounds involving the blade of the tongue and the area just behind the alveolar ridge.");
		lblNewLabel_3_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_1_1.setBounds(10, 295, 107, 54);
		panel_3_2_1_1.add(lblNewLabel_3_1_1_1_1);
		
		JLabel lblNewLabel_3_2_1_1 = new JLabel("Post-alveolar");
		lblNewLabel_3_2_1_1.setToolTipText("sounds involving the blade of the tongue and the area just behind the alveolar ridge.");
		lblNewLabel_3_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_1_1.setBounds(10, 210, 107, 54);
		panel_3_2_1_1.add(lblNewLabel_3_2_1_1);
		
		JLabel lblNewLabel_3_3_1_1 = new JLabel("Glottal");
		lblNewLabel_3_3_1_1.setToolTipText("at the larynx (the glottis is the space between the vocal folds). Locate the glottis (the vocal folds) in the diagram, below. A glottal stop is a speech sound articulated by a momentary, complete closing of the glottis in the back of the throat. ");
		lblNewLabel_3_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3_1_1.setBounds(10, 384, 107, 54);
		panel_3_2_1_1.add(lblNewLabel_3_3_1_1);
		
		JPanel panel_3_3_1_1 = new JPanel();
		panel_3_3_1_1.setLayout(null);
		panel_3_3_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(220, 222, 222)), "MANNER OF ARTICULATION", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(79, 86, 99)));
		panel_3_3_1_1.setBackground(Color.WHITE);
		panel_3_3_1_1.setBounds(453, 67, 127, 510);
		phenomtable_1_1.add(panel_3_3_1_1);
		
		JLabel lblNewLabel_4_3_1 = new JLabel("Fricative");
		lblNewLabel_4_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_3_1.setBounds(10, 41, 107, 54);
		panel_3_3_1_1.add(lblNewLabel_4_3_1);
		
		JLabel lblNewLabel_4_1_2_1 = new JLabel("Fricative");
		lblNewLabel_4_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_2_1.setBounds(10, 129, 107, 54);
		panel_3_3_1_1.add(lblNewLabel_4_1_2_1);
		
		JLabel lblNewLabel_4_2_1_1 = new JLabel("Fricative");
		lblNewLabel_4_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2_1_1.setBounds(10, 208, 107, 54);
		panel_3_3_1_1.add(lblNewLabel_4_2_1_1);
		
		JLabel lblNewLabel_4_1_1_2_1 = new JLabel("Fricative");
		lblNewLabel_4_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1_2_1.setBounds(10, 296, 107, 54);
		panel_3_3_1_1.add(lblNewLabel_4_1_1_2_1);
		
		JLabel lblNewLabel_4_1_1_1_1_1 = new JLabel("Fricative");
		lblNewLabel_4_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1_1_1_1.setBounds(10, 382, 107, 54);
		panel_3_3_1_1.add(lblNewLabel_4_1_1_1_1_1);
		
		JPanel panel_3_4_1_1 = new JPanel();
		panel_3_4_1_1.setLayout(null);
		panel_3_4_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(220, 222, 222)), "VIDEO", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(79, 86, 99)));
		panel_3_4_1_1.setBackground(Color.WHITE);
		panel_3_4_1_1.setBounds(590, 67, 127, 510);
		phenomtable_1_1.add(panel_3_4_1_1);
		
		JButton btnNewButton_1_3_1 = new JButton("WATCH");
		btnNewButton_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new embedVideo("https://drive.google.com/file/d/1lR_l4MlitDF6wCNumLSNS2IZeheMxWX7/preview?usp=sharing");
			}
		});
		btnNewButton_1_3_1.setForeground(Color.WHITE);
		btnNewButton_1_3_1.setBackground(Color.GREEN);
		btnNewButton_1_3_1.setBounds(10, 55, 107, 33);
		panel_3_4_1_1.add(btnNewButton_1_3_1);
		
		JButton btnNewButton_1_1_2_1 = new JButton("WATCH");
		btnNewButton_1_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new embedVideo("https://drive.google.com/file/d/19B2PFeSPwU8JslOoMSEsTsKKasuTNFS3/preview?usp=sharing");
			}
		});
		btnNewButton_1_1_2_1.setForeground(Color.WHITE);
		btnNewButton_1_1_2_1.setBackground(Color.GREEN);
		btnNewButton_1_1_2_1.setBounds(10, 139, 107, 33);
		panel_3_4_1_1.add(btnNewButton_1_1_2_1);
		
		JButton btnNewButton_1_2_2_1 = new JButton("WATCH");
		btnNewButton_1_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new embedVideo("https://drive.google.com/file/d/1VYXJg_dLFyYJ0BOCTVRnZjr5OxcaMu6M/preview?usp=sharing");
			}
		});
		btnNewButton_1_2_2_1.setForeground(Color.WHITE);
		btnNewButton_1_2_2_1.setBackground(Color.GREEN);
		btnNewButton_1_2_2_1.setBounds(10, 223, 107, 33);
		panel_3_4_1_1.add(btnNewButton_1_2_2_1);
		
		JButton btnNewButton_1_1_1_1_1 = new JButton("WATCH");
		btnNewButton_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new embedVideo("https://drive.google.com/file/d/1VYXJg_dLFyYJ0BOCTVRnZjr5OxcaMu6M/preview?usp=sharing");
			}
		});
		btnNewButton_1_1_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1_1_1.setBackground(Color.GREEN);
		btnNewButton_1_1_1_1_1.setBounds(10, 307, 107, 33);
		panel_3_4_1_1.add(btnNewButton_1_1_1_1_1);
		
		JButton btnNewButton_1_2_1_1_1 = new JButton("WATCH");
		btnNewButton_1_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new embedVideo("https://drive.google.com/file/d/1VYXJg_dLFyYJ0BOCTVRnZjr5OxcaMu6M/preview?usp=sharing");
			}
		});
		btnNewButton_1_2_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_2_1_1_1.setBackground(Color.GREEN);
		btnNewButton_1_2_1_1_1.setBounds(10, 394, 107, 33);
		panel_3_4_1_1.add(btnNewButton_1_2_1_1_1);
		
		JPanel phenomtable_1_1_1 = new JPanel();
		phenomtable_1_1_1.setLayout(null);
		phenomtable_1_1_1.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, phenomtable_1_1_1, null);
		
		JPanel panel_3_5_1_1 = new JPanel();
		panel_3_5_1_1.setLayout(null);
		panel_3_5_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(220, 222, 222)), "PHONETIC SYMBOL", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(79, 86, 99)));
		panel_3_5_1_1.setBackground(Color.WHITE);
		panel_3_5_1_1.setBounds(51, 67, 127, 510);
		phenomtable_1_1_1.add(panel_3_5_1_1);
		
		JLabel lblk_2_1_1 = new JLabel("/ʧ/");
		lblk_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblk_2_1_1.setBounds(10, 55, 107, 54);
		panel_3_5_1_1.add(lblk_2_1_1);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("/ʤ/");
		lblNewLabel_2_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1_1.setBounds(10, 137, 107, 54);
		panel_3_5_1_1.add(lblNewLabel_2_2_1_1);
		
		JLabel lblv_1_1 = new JLabel("/ɾ/");
		lblv_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblv_1_1.setBounds(10, 216, 107, 54);
		panel_3_5_1_1.add(lblv_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("/m/");
		lblNewLabel_2_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_1.setBounds(10, 298, 107, 54);
		panel_3_5_1_1.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblk_1_1_1 = new JLabel("/n/");
		lblk_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblk_1_1_1.setBounds(10, 384, 107, 54);
		panel_3_5_1_1.add(lblk_1_1_1);
		
		JPanel panel_3_1_1_1_1 = new JPanel();
		panel_3_1_1_1_1.setLayout(null);
		panel_3_1_1_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(220, 222, 222)), "EXAMPLE", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(79, 86, 99)));
		panel_3_1_1_1_1.setBackground(Color.WHITE);
		panel_3_1_1_1_1.setBounds(183, 67, 127, 510);
		phenomtable_1_1_1.add(panel_3_1_1_1_1);
		
		JTextPane txtpnChatt = new JTextPane();
		txtpnChatt.setContentType("text/html");
		txtpnChatt.setText("<b>ch</b>at  \r\n/<b>ʧ</b>æt/\r\n");
		txtpnChatt.setEditable(false);
		btnClick(txtpnChatt,"chat");
		txtpnChatt.setBounds(10, 43, 107, 37);
		panel_3_1_1_1_1.add(txtpnChatt);
		
		JTextPane txtpnSuchs = new JTextPane();
		txtpnSuchs.setContentType("text/html");
		txtpnSuchs.setText("su<b>ch </b>\r\n/sʌ<b>ʧ</b>/\r\n");
		txtpnSuchs.setEditable(false);
		btnClick(txtpnSuchs,"such");
		txtpnSuchs.setBounds(10, 77, 107, 37);
		panel_3_1_1_1_1.add(txtpnSuchs);
		
		JTextPane txtpnRaprp_1_2_1_1 = new JTextPane();
		txtpnRaprp_1_2_1_1.setContentType("text/html");
		txtpnRaprp_1_2_1_1.setText("hu<b>ge </b>\r\n/hjuː<b>ʤ</b>/\r\n");
		txtpnRaprp_1_2_1_1.setEditable(false);
		btnClick(txtpnRaprp_1_2_1_1,"huge");
		txtpnRaprp_1_2_1_1.setBounds(10, 159, 107, 37);
		panel_3_1_1_1_1.add(txtpnRaprp_1_2_1_1);
		
		JTextPane txtpnPursepsRap_1_2_1_1 = new JTextPane();
		txtpnPursepsRap_1_2_1_1.setContentType("text/html");
		txtpnPursepsRap_1_2_1_1.setText("<b>jo</b>ke \r\n/<b>ʤ</b>əʊk/\r\n");
		txtpnPursepsRap_1_2_1_1.setEditable(false);
		btnClick(txtpnPursepsRap_1_2_1_1,"joke");
		txtpnPursepsRap_1_2_1_1.setBounds(10, 125, 107, 37);
		panel_3_1_1_1_1.add(txtpnPursepsRap_1_2_1_1);
		
		JTextPane txtpnWrittenrn = new JTextPane();
		txtpnWrittenrn.setContentType("text/html");
		txtpnWrittenrn.setText("w<b>r</b>itten \r\n/ˈ<b>r</b>ɪɾn/ \r\n");
		txtpnWrittenrn.setEditable(false);
		btnClick(txtpnWrittenrn,"written");
		txtpnWrittenrn.setBounds(10, 207, 107, 37);
		panel_3_1_1_1_1.add(txtpnWrittenrn);
		
		JTextPane txtpnPursepsRap_1_1_1_1_1 = new JTextPane();
		txtpnPursepsRap_1_1_1_1_1.setContentType("text/html");
		txtpnPursepsRap_1_1_1_1_1.setText("<b>n</b>o\r\n/<b>n</b>əʊ/\r\n");
		txtpnPursepsRap_1_1_1_1_1.setEditable(false);
		btnClick(txtpnPursepsRap_1_1_1_1_1,"no");
		txtpnPursepsRap_1_1_1_1_1.setBounds(10, 390, 107, 37);
		panel_3_1_1_1_1.add(txtpnPursepsRap_1_1_1_1_1);
		
		JTextPane txtpnLetterlr = new JTextPane();
		txtpnLetterlr.setContentType("text/html");
		txtpnLetterlr.setText("le<b>tt</b>er \r\n/ˈlɛ<b>ɾ</b>ər/\r\n");
		txtpnLetterlr.setEditable(false);
		btnClick(txtpnLetterlr,"letter");
		txtpnLetterlr.setBounds(10, 241, 107, 37);
		panel_3_1_1_1_1.add(txtpnLetterlr);
		
		JTextPane txtpnMadmd = new JTextPane();
		txtpnMadmd.setContentType("text/html");
		txtpnMadmd.setText("<b>m</b>ad \r\n/<b>m</b>æd/\r\n");
		txtpnMadmd.setEditable(false);
		btnClick(txtpnMadmd,"mad");
		txtpnMadmd.setBounds(10, 307, 107, 37);
		panel_3_1_1_1_1.add(txtpnMadmd);
		
		JTextPane txtpnClamklm = new JTextPane();
		txtpnClamklm.setContentType("text/html");
		txtpnClamklm.setText("cla<b>m</b>\r\n/klæ<b>m</b>/\r\n");
		txtpnClamklm.setEditable(false);
		btnClick(txtpnClamklm,"clam");
		txtpnClamklm.setBounds(10, 342, 107, 37);
		panel_3_1_1_1_1.add(txtpnClamklm);
		
		JTextPane txtpnPursepsRap_1_1_1_1_1_1 = new JTextPane();
		txtpnPursepsRap_1_1_1_1_1_1.setContentType("text/html");
		txtpnPursepsRap_1_1_1_1_1_1.setText("ma<b>n</b> \r\n/mæ<b>n</b>/\r\n");
		txtpnPursepsRap_1_1_1_1_1_1.setEditable(false);
		btnClick(txtpnPursepsRap_1_1_1_1_1_1,"man");
		txtpnPursepsRap_1_1_1_1_1_1.setBounds(10, 427, 107, 37);
		panel_3_1_1_1_1.add(txtpnPursepsRap_1_1_1_1_1_1);
		
		JPanel panel_3_2_1_1_1 = new JPanel();
		panel_3_2_1_1_1.setLayout(null);
		panel_3_2_1_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(220, 222, 222)), "PLACE OF ARTICULATION", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(79, 86, 99)));
		panel_3_2_1_1_1.setBackground(Color.WHITE);
		panel_3_2_1_1_1.setBounds(316, 67, 127, 510);
		phenomtable_1_1_1.add(panel_3_2_1_1_1);
		
		JLabel lblNewLabel_3_4_1_1 = new JLabel("Post-alveolar");
		lblNewLabel_3_4_1_1.setToolTipText("sounds involving the blade of the tongue and the area just behind the alveolar ridge.");
		lblNewLabel_3_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_4_1_1.setBounds(10, 41, 107, 54);
		panel_3_2_1_1_1.add(lblNewLabel_3_4_1_1);
		
		JLabel lblNewLabel_3_1_2_1_1 = new JLabel("Post-alveolar");
		lblNewLabel_3_1_2_1_1.setToolTipText("sounds involving the blade of the tongue and the area just behind the alveolar ridge.");
		lblNewLabel_3_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_2_1_1.setBounds(10, 134, 107, 54);
		panel_3_2_1_1_1.add(lblNewLabel_3_1_2_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1_1 = new JLabel("Bilabial");
		lblNewLabel_3_1_1_1_1_1.setToolTipText("souds are made with both lips. Bilabial consonants occur when you block/constrict airflow out of the mouth by bringing your lips together.");
		lblNewLabel_3_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_1_1_1.setBounds(10, 295, 107, 54);
		panel_3_2_1_1_1.add(lblNewLabel_3_1_1_1_1_1);
		
		JLabel lblNewLabel_3_2_1_1_1 = new JLabel("Alveolar");
		lblNewLabel_3_2_1_1_1.setToolTipText("the alveolar ridge is where your teeth meet your gums. You create alveolar consonants when you raise your tongue to the alveolar ridge to block or constrict airflow.");
		lblNewLabel_3_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_1_1_1.setBounds(10, 210, 107, 54);
		panel_3_2_1_1_1.add(lblNewLabel_3_2_1_1_1);
		
		JLabel lblNewLabel_3_3_1_1_1 = new JLabel("Alveolar");
		lblNewLabel_3_3_1_1_1.setToolTipText("the alveolar ridge is where your teeth meet your gums. You create alveolar consonants when you raise your tongue to the alveolar ridge to block or constrict airflow.");
		lblNewLabel_3_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3_1_1_1.setBounds(10, 384, 107, 54);
		panel_3_2_1_1_1.add(lblNewLabel_3_3_1_1_1);
		
		JPanel panel_3_3_1_1_1 = new JPanel();
		panel_3_3_1_1_1.setLayout(null);
		panel_3_3_1_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(220, 222, 222)), "MANNER OF ARTICULATION", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(79, 86, 99)));
		panel_3_3_1_1_1.setBackground(Color.WHITE);
		panel_3_3_1_1_1.setBounds(453, 67, 127, 510);
		phenomtable_1_1_1.add(panel_3_3_1_1_1);
		
		JLabel lblNewLabel_4_3_1_1 = new JLabel("Affricate");
		lblNewLabel_4_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_3_1_1.setBounds(10, 41, 107, 54);
		panel_3_3_1_1_1.add(lblNewLabel_4_3_1_1);
		
		JLabel lblNewLabel_4_1_2_1_1 = new JLabel("Affricate");
		lblNewLabel_4_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_2_1_1.setBounds(10, 129, 107, 54);
		panel_3_3_1_1_1.add(lblNewLabel_4_1_2_1_1);
		
		JLabel lblNewLabel_4_2_1_1_1 = new JLabel("Tap or Flap");
		lblNewLabel_4_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2_1_1_1.setBounds(10, 208, 107, 54);
		panel_3_3_1_1_1.add(lblNewLabel_4_2_1_1_1);
		
		JLabel lblNewLabel_4_1_1_2_1_1 = new JLabel("(Nasal) Stop ");
		lblNewLabel_4_1_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1_2_1_1.setBounds(10, 296, 107, 54);
		panel_3_3_1_1_1.add(lblNewLabel_4_1_1_2_1_1);
		
		JLabel lblNewLabel_4_1_1_1_1_1_1 = new JLabel("(Nasal) Stop");
		lblNewLabel_4_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1_1_1_1_1.setBounds(10, 382, 107, 54);
		panel_3_3_1_1_1.add(lblNewLabel_4_1_1_1_1_1_1);
		
		JPanel panel_3_4_1_1_1 = new JPanel();
		panel_3_4_1_1_1.setLayout(null);
		panel_3_4_1_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(220, 222, 222)), "VIDEO", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(79, 86, 99)));
		panel_3_4_1_1_1.setBackground(Color.WHITE);
		panel_3_4_1_1_1.setBounds(590, 67, 127, 510);
		phenomtable_1_1_1.add(panel_3_4_1_1_1);
		
		JButton btnNewButton_1_3_1_1 = new JButton("WATCH");
		btnNewButton_1_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new embedVideo("https://drive.google.com/file/d/1VQ4zpEg418QrXmfgl4g5PGU4YLZL93AR/preview?usp=sharing");
			}
		});
		btnNewButton_1_3_1_1.setForeground(Color.WHITE);
		btnNewButton_1_3_1_1.setBackground(Color.GREEN);
		btnNewButton_1_3_1_1.setBounds(10, 55, 107, 33);
		panel_3_4_1_1_1.add(btnNewButton_1_3_1_1);
		
		JButton btnNewButton_1_1_2_1_1 = new JButton("WATCH");
		btnNewButton_1_1_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new embedVideo("https://drive.google.com/file/d/1ynwTRmvB5oGkrl1g_lS955Nyl6wmGmZc/view?usp=sharing");
			}
		});
		btnNewButton_1_1_2_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_2_1_1.setBackground(Color.GREEN);
		btnNewButton_1_1_2_1_1.setBounds(10, 139, 107, 33);
		panel_3_4_1_1_1.add(btnNewButton_1_1_2_1_1);
		
		JButton btnNewButton_1_2_2_1_1 = new JButton("WATCH");
		btnNewButton_1_2_2_1_1.setEnabled(false);
		btnNewButton_1_2_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				new embedVideo("");
			}
		});
		btnNewButton_1_2_2_1_1.setForeground(Color.WHITE);
		btnNewButton_1_2_2_1_1.setBackground(Color.GREEN);
		btnNewButton_1_2_2_1_1.setBounds(10, 223, 107, 33);
		panel_3_4_1_1_1.add(btnNewButton_1_2_2_1_1);
		
		JButton btnNewButton_1_1_1_1_1_1 = new JButton("WATCH");
		btnNewButton_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new embedVideo("https://drive.google.com/file/d/1u7Je1cH0rvr0yS9rrunwaHcZ6zCXYkYH/view?usp=sharing");
				
			}
		});
		btnNewButton_1_1_1_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1_1_1_1.setBackground(Color.GREEN);
		btnNewButton_1_1_1_1_1_1.setBounds(10, 307, 107, 33);
		panel_3_4_1_1_1.add(btnNewButton_1_1_1_1_1_1);
		
		JButton btnNewButton_1_2_1_1_1_1 = new JButton("WATCH");
		btnNewButton_1_2_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new embedVideo("https://drive.google.com/file/d/1DQJaj6HV1piaRUVeO302F2i-MkurHkfN/view?usp=sharing");
			}
		});
		btnNewButton_1_2_1_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_2_1_1_1_1.setBackground(Color.GREEN);
		btnNewButton_1_2_1_1_1_1.setBounds(10, 394, 107, 33);
		panel_3_4_1_1_1.add(btnNewButton_1_2_1_1_1_1);
		
		JPanel phenomtable_1_1_1_1 = new JPanel();
		phenomtable_1_1_1_1.setLayout(null);
		phenomtable_1_1_1_1.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, phenomtable_1_1_1_1, null);
		
		JPanel panel_3_5_1_1_1 = new JPanel();
		panel_3_5_1_1_1.setLayout(null);
		panel_3_5_1_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(220, 222, 222)), "PHONETIC SYMBOL", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(79, 86, 99)));
		panel_3_5_1_1_1.setBackground(Color.WHITE);
		panel_3_5_1_1_1.setBounds(51, 67, 127, 510);
		phenomtable_1_1_1_1.add(panel_3_5_1_1_1);
		
		JLabel lblk_2_1_1_1 = new JLabel("/ŋ/");
		lblk_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblk_2_1_1_1.setBounds(10, 55, 107, 54);
		panel_3_5_1_1_1.add(lblk_2_1_1_1);
		
		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("/l/");
		lblNewLabel_2_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1_1_1.setBounds(10, 137, 107, 54);
		panel_3_5_1_1_1.add(lblNewLabel_2_2_1_1_1);
		
		JLabel lblv_1_1_1 = new JLabel("/r/");
		lblv_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblv_1_1_1.setBounds(10, 216, 107, 54);
		panel_3_5_1_1_1.add(lblv_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("/w/");
		lblNewLabel_2_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_1_1.setBounds(10, 298, 107, 54);
		panel_3_5_1_1_1.add(lblNewLabel_2_1_1_1_1_1);
		
		JLabel lblk_1_1_1_1 = new JLabel("/j/");
		lblk_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblk_1_1_1_1.setBounds(10, 384, 107, 54);
		panel_3_5_1_1_1.add(lblk_1_1_1_1);
		
		JPanel panel_3_1_1_1_1_1 = new JPanel();
		panel_3_1_1_1_1_1.setLayout(null);
		panel_3_1_1_1_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(220, 222, 222)), "EXAMPLE", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(79, 86, 99)));
		panel_3_1_1_1_1_1.setBackground(Color.WHITE);
		panel_3_1_1_1_1_1.setBounds(183, 67, 127, 510);
		phenomtable_1_1_1_1.add(panel_3_1_1_1_1_1);
		
		JTextPane txtpnLongl = new JTextPane();
		txtpnLongl.setContentType("text/html");
		txtpnLongl.setText("lo<b>ng</b> \r\n/lɒ<b>ŋ</b>/\r\n");
		btnClick(txtpnLongl,"long");
		txtpnLongl.setEditable(false);
		txtpnLongl.setBounds(10, 59, 107, 37);
		panel_3_1_1_1_1_1.add(txtpnLongl);
		
		JTextPane txtpnRaprp_1_2_1_1_1 = new JTextPane();
		txtpnRaprp_1_2_1_1_1.setContentType("text/html");
		txtpnRaprp_1_2_1_1_1.setText("fu<b>ll</b>y \r\n/ˈfʊ<b>l</b>i/\r\n");
		txtpnRaprp_1_2_1_1_1.setEditable(false);
		btnClick(txtpnRaprp_1_2_1_1_1,"fully");
		txtpnRaprp_1_2_1_1_1.setBounds(10, 159, 107, 37);
		panel_3_1_1_1_1_1.add(txtpnRaprp_1_2_1_1_1);
		
		JTextPane txtpnPursepsRap_1_2_1_1_1 = new JTextPane();
		txtpnPursepsRap_1_2_1_1_1.setContentType("text/html");
		txtpnPursepsRap_1_2_1_1_1.setText("<b>l</b>uck \r\n/lʌk/\r\n");
		txtpnPursepsRap_1_2_1_1_1.setEditable(false);
		btnClick(txtpnPursepsRap_1_2_1_1_1,"luck");
		txtpnPursepsRap_1_2_1_1_1.setBounds(10, 125, 107, 37);
		panel_3_1_1_1_1_1.add(txtpnPursepsRap_1_2_1_1_1);
		
		JTextPane txtpnRakerek = new JTextPane();
		txtpnRakerek.setContentType("text/html");
		txtpnRakerek.setText("<b>r</b>ake \r\n/<b>r</b>eɪk/\r\n");
		txtpnRakerek.setEditable(false);
		btnClick(txtpnRakerek,"rake");
		txtpnRakerek.setBounds(10, 207, 107, 37);
		panel_3_1_1_1_1_1.add(txtpnRakerek);
		
		JTextPane txtpnPursepsRap_1_1_1_1_1_2 = new JTextPane();
		txtpnPursepsRap_1_1_1_1_1_2.setContentType("text/html");
		txtpnPursepsRap_1_1_1_1_1_2.setText("<b>y</b>awn \r\n/<b>j</b>ɔːn/\r\n");
		txtpnPursepsRap_1_1_1_1_1_2.setEditable(false);
		btnClick(txtpnPursepsRap_1_1_1_1_1_2,"yawn");
		txtpnPursepsRap_1_1_1_1_1_2.setBounds(10, 390, 107, 37);
		panel_3_1_1_1_1_1.add(txtpnPursepsRap_1_1_1_1_1_2);
		
		JTextPane txtpnCareker = new JTextPane();
		txtpnCareker.setContentType("text/html");
		txtpnCareker.setText("ca<b>r</b>e\r\n/keə<b>r</b>/\r\n");
		txtpnCareker.setEditable(false);
		btnClick(txtpnCareker,"care");
		txtpnCareker.setBounds(10, 241, 107, 37);
		panel_3_1_1_1_1_1.add(txtpnCareker);
		
		JTextPane txtpnWaxwks = new JTextPane();
		txtpnWaxwks.setContentType("text/html");
		txtpnWaxwks.setText("<b>w</b>ax\r\n/<b>w</b>æks/");
		txtpnWaxwks.setEditable(false);
		btnClick(txtpnWaxwks,"wax");
		txtpnWaxwks.setBounds(10, 307, 107, 37);
		panel_3_1_1_1_1_1.add(txtpnWaxwks);
		
		JTextPane txtpnDwelldwl = new JTextPane();
		txtpnDwelldwl.setContentType("text/html");
		txtpnDwelldwl.setText("<b>d</b>well \r\n/<b>d</b>wɛl/\r\n");
		txtpnDwelldwl.setEditable(false);
		btnClick(txtpnDwelldwl,"dwell");
		txtpnDwelldwl.setBounds(10, 342, 107, 37);
		panel_3_1_1_1_1_1.add(txtpnDwelldwl);
		
		JTextPane txtpnPursepsRap_1_1_1_1_1_1_1 = new JTextPane();
		txtpnPursepsRap_1_1_1_1_1_1_1.setContentType("text/html");
		txtpnPursepsRap_1_1_1_1_1_1_1.setText("you \r\n/juː/\r\n");
		btnClick(txtpnPursepsRap_1_1_1_1_1_1_1,"you");
		txtpnPursepsRap_1_1_1_1_1_1_1.setEditable(false);
		
		txtpnPursepsRap_1_1_1_1_1_1_1.setBounds(10, 427, 107, 37);
		panel_3_1_1_1_1_1.add(txtpnPursepsRap_1_1_1_1_1_1_1);
		
		JPanel panel_3_2_1_1_1_1 = new JPanel();
		panel_3_2_1_1_1_1.setLayout(null);
		panel_3_2_1_1_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(220, 222, 222)), "PLACE OF ARTICULATION", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(79, 86, 99)));
		panel_3_2_1_1_1_1.setBackground(Color.WHITE);
		panel_3_2_1_1_1_1.setBounds(316, 67, 127, 510);
		phenomtable_1_1_1_1.add(panel_3_2_1_1_1_1);
		
		JLabel lblNewLabel_3_4_1_1_1 = new JLabel("Velar");
		lblNewLabel_3_4_1_1_1.setToolTipText("behind your hard palate you have the velum or soft palate. Unlike the bony hard palate in front of it, mucousy tissue. You make velar consonants when you raise the back of your tongue to the velum to block or restrict airflow.");
		lblNewLabel_3_4_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_4_1_1_1.setBounds(10, 41, 107, 54);
		panel_3_2_1_1_1_1.add(lblNewLabel_3_4_1_1_1);
		
		JLabel lblNewLabel_3_1_2_1_1_1 = new JLabel("Alveolar");
		lblNewLabel_3_1_2_1_1_1.setToolTipText("the alveolar ridge is where your teeth meet your gums. You create alveolar consonants when you raise your tongue to the alveolar ridge to block or constrict airflow.");
		lblNewLabel_3_1_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_2_1_1_1.setBounds(10, 134, 107, 54);
		panel_3_2_1_1_1_1.add(lblNewLabel_3_1_2_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1 = new JLabel("Bilabial");
		lblNewLabel_3_1_1_1_1_1_1.setToolTipText("souds are made with both lips. Bilabial consonants occur when you block/constrict airflow out of the mouth by bringing your lips together.");
		lblNewLabel_3_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_1_1_1_1.setBounds(10, 295, 107, 54);
		panel_3_2_1_1_1_1.add(lblNewLabel_3_1_1_1_1_1_1);
		
		JLabel lblNewLabel_3_2_1_1_1_1 = new JLabel("Post-alveolar");
		lblNewLabel_3_2_1_1_1_1.setToolTipText("sounds involving the blade of the tongue and the area just behind the alveolar ridge.");
		lblNewLabel_3_2_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_1_1_1_1.setBounds(10, 210, 107, 54);
		panel_3_2_1_1_1_1.add(lblNewLabel_3_2_1_1_1_1);
		
		JLabel lblNewLabel_3_3_1_1_1_1 = new JLabel("Palatal");
		lblNewLabel_3_3_1_1_1_1.setToolTipText("sound involving the center of the hard palate and either the blade or the back of the tongue. ");
		lblNewLabel_3_3_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3_1_1_1_1.setBounds(10, 384, 107, 54);
		panel_3_2_1_1_1_1.add(lblNewLabel_3_3_1_1_1_1);
		
		JPanel panel_3_3_1_1_1_1 = new JPanel();
		panel_3_3_1_1_1_1.setLayout(null);
		panel_3_3_1_1_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(220, 222, 222)), "MANNER OF ARTICULATION", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(79, 86, 99)));
		panel_3_3_1_1_1_1.setBackground(Color.WHITE);
		panel_3_3_1_1_1_1.setBounds(453, 67, 127, 510);
		phenomtable_1_1_1_1.add(panel_3_3_1_1_1_1);
		
		JLabel lblNewLabel_4_3_1_1_1 = new JLabel("(Nasal) Stop");
		lblNewLabel_4_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_3_1_1_1.setBounds(10, 41, 107, 54);
		panel_3_3_1_1_1_1.add(lblNewLabel_4_3_1_1_1);
		
		JLabel lblNewLabel_4_1_2_1_1_1 = new JLabel("Lateral Approximant");
		lblNewLabel_4_1_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_2_1_1_1.setBounds(10, 129, 107, 54);
		panel_3_3_1_1_1_1.add(lblNewLabel_4_1_2_1_1_1);
		
		JLabel lblNewLabel_4_2_1_1_1_1 = new JLabel("Approximant");
		lblNewLabel_4_2_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2_1_1_1_1.setBounds(10, 208, 107, 54);
		panel_3_3_1_1_1_1.add(lblNewLabel_4_2_1_1_1_1);
		
		JLabel lblNewLabel_4_1_1_2_1_1_1 = new JLabel("Approximant");
		lblNewLabel_4_1_1_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1_2_1_1_1.setBounds(10, 296, 107, 54);
		panel_3_3_1_1_1_1.add(lblNewLabel_4_1_1_2_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1_1_1_1_1 = new JLabel("Approximant");
		lblNewLabel_4_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1_1_1_1_1_1.setBounds(10, 382, 107, 54);
		panel_3_3_1_1_1_1.add(lblNewLabel_4_1_1_1_1_1_1_1);
		
		JPanel panel_3_4_1_1_1_1 = new JPanel();
		panel_3_4_1_1_1_1.setLayout(null);
		panel_3_4_1_1_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(220, 222, 222)), "VIDEO", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(79, 86, 99)));
		panel_3_4_1_1_1_1.setBackground(Color.WHITE);
		panel_3_4_1_1_1_1.setBounds(590, 67, 127, 510);
		phenomtable_1_1_1_1.add(panel_3_4_1_1_1_1);
		
		JButton btnNewButton_1_3_1_1_1 = new JButton("WATCH");
		btnNewButton_1_3_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new embedVideo("https://drive.google.com/file/d/12qFj-BvXAb2sVb1qH3p_BEPUu0EG4QXD/preview?usp=sharing");
			}
		});
		btnNewButton_1_3_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_3_1_1_1.setBackground(Color.GREEN);
		btnNewButton_1_3_1_1_1.setBounds(10, 55, 107, 33);
		panel_3_4_1_1_1_1.add(btnNewButton_1_3_1_1_1);
		
		JButton btnNewButton_1_1_2_1_1_1 = new JButton("WATCH");
		btnNewButton_1_1_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new embedVideo("https://drive.google.com/file/d/1N7x-l768ULFfaARMcI0HBbtaQBTAwEk9/preview?usp=sharing");
			}
		});
		btnNewButton_1_1_2_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_2_1_1_1.setBackground(Color.GREEN);
		btnNewButton_1_1_2_1_1_1.setBounds(10, 139, 107, 33);
		panel_3_4_1_1_1_1.add(btnNewButton_1_1_2_1_1_1);
		
		JButton btnNewButton_1_2_2_1_1_1 = new JButton("WATCH");
		btnNewButton_1_2_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new embedVideo("https://drive.google.com/file/d/1dkJUE8OcrtCmUGW85mS7UKoPGkECgLkb/preview?usp=sharing");
			}
		});
		btnNewButton_1_2_2_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_2_2_1_1_1.setBackground(Color.GREEN);
		btnNewButton_1_2_2_1_1_1.setBounds(10, 223, 107, 33);
		panel_3_4_1_1_1_1.add(btnNewButton_1_2_2_1_1_1);
		
		JButton btnNewButton_1_1_1_1_1_1_1 = new JButton("WATCH");
		btnNewButton_1_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new embedVideo("https://drive.google.com/file/d/1-_9J-7cK_E1jp6-IzIzuVCJXa38uU6RO/preview?usp=sharing");
			}
		});
		btnNewButton_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1_1_1_1_1.setBackground(Color.GREEN);
		btnNewButton_1_1_1_1_1_1_1.setBounds(10, 307, 107, 33);
		panel_3_4_1_1_1_1.add(btnNewButton_1_1_1_1_1_1_1);
		
		JButton btnNewButton_1_2_1_1_1_1_1 = new JButton("WATCH");
		btnNewButton_1_2_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new embedVideo("https://drive.google.com/file/d/12LOOgUb40dn0XhM_DRKndsew71T_wl4l/preview?usp=sharing");
			}
		});
		btnNewButton_1_2_1_1_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_2_1_1_1_1_1.setBackground(Color.GREEN);
		btnNewButton_1_2_1_1_1_1_1.setBounds(10, 394, 107, 33);
		panel_3_4_1_1_1_1.add(btnNewButton_1_2_1_1_1_1_1);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("PLACE OF ARTICULATION");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 38));
		lblNewLabel_1.setBounds(10, 0, 528, 69);
		panel_1.add(lblNewLabel_1);
		
		JTextPane txtpnInArticulatoryPhonetics = new JTextPane();
		txtpnInArticulatoryPhonetics.setFont(new Font("Dialog", Font.PLAIN, 23));
		txtpnInArticulatoryPhonetics.setText("In articulatory phonetics, the place of articulation (also point of articulation) of a consonant is the point of contact where an obstruction occurs in the vocal tract between an articulatory gesture, an active articulator (typically some part of the tongue and uvula), and a passive location (typically some part of the roof of the mouth). Active Articulator are named so because they are flexible and move, and the Passive Articulator are called so because they are normally fixed and are the parts with which the Active Articulator makes contact. Along with the manner of articulation and the phonation, the place of articulation gives the consonant its distinctive sound.");
		txtpnInArticulatoryPhonetics.setBounds(34, 87, 679, 477);
		panel_1.add(txtpnInArticulatoryPhonetics);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
		panel_2.setLayout(null);
		
		JTextPane txtpnDentalinterdentalAre = new JTextPane();
		txtpnDentalinterdentalAre.setContentType("text/html");
		txtpnDentalinterdentalAre.setFont(new Font("Dialog", Font.PLAIN, 25));
		txtpnDentalinterdentalAre.setText("\r\n<p style=\"font-family:dialog;font-size:25;\"><b>Dental/Interdental </b> - are made with the tip of the tongue against the upper front teeth. Dental consonants occur when you block/constrict airflow by placing your slimy tongue against your upper teeth. <br><br>\r\nEnglish contains the following two labio-dental sounds<br>\r\n/O/ as is \u2015thick\u2016 and \u2015bath\u2016<br>\r\n/o/ as is \u2015the\u2016 and \u2015rather\u2016\r\n</p>\r\n");
		txtpnDentalinterdentalAre.setBounds(10, 86, 744, 303);
		panel_2.add(txtpnDentalinterdentalAre);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new embedVideo("https://drive.google.com/file/d/19KnXKmihWjJM7qtv3-PzrbvLqLrWiHTh/preview");
			}
		});
		btnNewButton.setBounds(250, 442, 89, 23);
		panel_2.add(btnNewButton);

	}
	public void btnClick(JTextPane txt,String text) {
		txt.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {	
				txt.setForeground(Color.GREEN);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				txt.setForeground(Color.BLACK);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					
					new text2speech(text);
				} catch (InterruptedException | ExecutionException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
	}
}
