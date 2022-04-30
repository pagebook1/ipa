package teacher;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import discussions.*;

public class DiscussionList extends JPanel {

	/**
	 * Create the panel.
	 */
	static JPanel speech;
	static JPanel dipt;
	static JPanel place;
	static JPanel voice;
	static JPanel panel;
	public DiscussionList() {
		setBackground(new Color(255, 255, 255));
		setBounds(0,0,769,691);
		setLayout(null);
		
		 panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 764, 491);
		add(panel);
		
		JButton btnNewButton = new JButton("PLACE AND MANNER OF ARTICULATION");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				show_panel(place);
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton.setBackground(new Color(0, 102, 102));
		btnNewButton.setBounds(46, 307, 314, 92);
		panel.add(btnNewButton);
		
		JButton btnMannerOfArticulation = new JButton("SPEECH ORGANS");
		btnMannerOfArticulation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				show_panel(speech);
			}
		});
		btnMannerOfArticulation.setForeground(Color.WHITE);
		btnMannerOfArticulation.setFont(new Font("Dialog", Font.BOLD, 21));
		btnMannerOfArticulation.setBackground(new Color(0, 102, 102));
		btnMannerOfArticulation.setBounds(46, 131, 324, 92);
		panel.add(btnMannerOfArticulation);
		
		JButton btnVoicedAndVoiceless = new JButton("VOICED AND VOICELESS");
		btnVoicedAndVoiceless.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				show_panel(voice);
			}
		});
		btnVoicedAndVoiceless.setForeground(Color.WHITE);
		btnVoicedAndVoiceless.setFont(new Font("Dialog", Font.BOLD, 21));
		btnVoicedAndVoiceless.setBackground(new Color(0, 102, 102));
		btnVoicedAndVoiceless.setBounds(385, 131, 324, 92);
		panel.add(btnVoicedAndVoiceless);
		
		JButton dipthongs = new JButton("Dipthongs");
		dipthongs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				show_panel(dipt);
			}
		});
		dipthongs.setForeground(Color.WHITE);
		dipthongs.setFont(new Font("Dialog", Font.BOLD, 21));
		dipthongs.setBackground(new Color(0, 102, 102));
		dipthongs.setBounds(385, 307, 324, 92);
		panel.add(dipthongs);
		
		 speech = new SpeechOrgans();
		speech.setBounds(0, 0, 764, 491);
		add(speech);
		
		 dipt = new dipthongs();
		dipt.setBounds(0, 0, 764, 491);
		add(dipt);
		
		 place = new PlaceArticulation();
		place.setBounds(0, 0, 764, 491);
		add(place);
		
		 voice = new voice();
		voice.setBounds(0, 0, 764, 491);
		add(voice);
		show_panel(panel);
	}
	public static void show_panel(JPanel panels)
	{
		JPanel[] panelist = {panel,speech,dipt,place,voice};
		for(JPanel panelz:panelist)
		{
			panelz.setVisible(false);
		}
		panels.setVisible(true);
	}
}
