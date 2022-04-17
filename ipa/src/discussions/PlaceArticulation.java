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

import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.FlowLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.ListSelectionModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.concurrent.ExecutionException;

import javax.swing.JSplitPane;

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
		panel_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(220, 222, 222)), "GROUP", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(79, 86, 99)));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(51, 67, 132, 510);
		phenomtable.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblDentalinterdental = new JLabel("Dental/Interdental ");
		lblDentalinterdental.setHorizontalAlignment(SwingConstants.CENTER);
		lblDentalinterdental.setBackground(Color.WHITE);
		lblDentalinterdental.setBounds(10, 57, 112, 25);
		panel_3.add(lblDentalinterdental);
		
		JLabel lblDentalinterdental_1 = new JLabel("Labio-Dental");
		lblDentalinterdental_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDentalinterdental_1.setBackground(Color.WHITE);
		lblDentalinterdental_1.setBounds(10, 122, 112, 25);
		panel_3.add(lblDentalinterdental_1);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(220, 222, 222)), "DESCRIPTION", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(79, 86, 99)));
		panel_3_1.setBackground(Color.WHITE);
		panel_3_1.setBounds(182, 67, 392, 510);
		phenomtable.add(panel_3_1);
		
		JTextPane txtpnAreMadeWith = new JTextPane();
		txtpnAreMadeWith.setText("occur when you block/constrict airflow by placing your slimy tongue against your upper teeth. ");
		txtpnAreMadeWith.setBounds(10, 57, 372, 34);
		panel_3_1.add(txtpnAreMadeWith);
		
		JTextPane txtpnConsonantsOccurWhen = new JTextPane();
		txtpnConsonantsOccurWhen.setText("consonants occur when you block/constrict airflow by curling your lower lip back and raising it to touch your upper row of teeth. ");
		txtpnConsonantsOccurWhen.setBounds(10, 122, 372, 34);
		panel_3_1.add(txtpnConsonantsOccurWhen);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setLayout(null);
		panel_3_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(220, 222, 222)), "EXAMPLE", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(79, 86, 99)));
		panel_3_2.setBackground(Color.WHITE);
		panel_3_2.setBounds(575, 67, 132, 510);
		phenomtable.add(panel_3_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(10, 11, 47, 488);
		panel_3_2.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("/O/ ");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				new embedVideo("https://drive.google.com/file/d/19KnXKmihWjJM7qtv3-PzrbvLqLrWiHTh/preview");
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lblNewLabel.setForeground(Color.black);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				lblNewLabel.setForeground(Color.GREEN);
			}
		});
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 47, 46, 14);
		panel_4.add(lblNewLabel);
		
		JLabel lblo = new JLabel("/o/ ");
		lblo.setHorizontalAlignment(SwingConstants.CENTER);
		lblo.setBounds(0, 73, 46, 14);
		panel_4.add(lblo);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBackground(Color.WHITE);
		panel_4_1.setLayout(null);
		panel_4_1.setBounds(67, 11, 47, 488);
		panel_3_2.add(panel_4_1);
		
		JLabel lblThick = new JLabel("thick");
		lblThick.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					
					new student.text2speech(lblThick.getText());
				} catch (InterruptedException | ExecutionException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lblThick.setForeground(Color.black);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				lblThick.setForeground(Color.GREEN);
			}
		});
		lblThick.setHorizontalAlignment(SwingConstants.CENTER);
		lblThick.setBounds(0, 47, 46, 14);
		panel_4_1.add(lblThick);
		
		JLabel lblThe = new JLabel("the");
		lblThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblThe.setBounds(0, 73, 46, 14);
		panel_4_1.add(lblThe);
		
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
}
