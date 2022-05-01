package discussions;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import student.ActivityList;

import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SpeechOrgans extends JPanel {

	/**
	 * Create the panel.
	 */
	public SpeechOrgans() {
		setBackground(Color.WHITE);
		setBounds(0,0,769, 490);
		setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setVisible(false);
		panel_1.setBounds(0, 0, 769, 490);
		add(panel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(216, 0, 543, 490);
		panel_1.add(scrollPane);
		
		JTextPane txtpnPartsOfThe = new JTextPane();
		txtpnPartsOfThe.setEditable(false);
		scrollPane.setViewportView(txtpnPartsOfThe);
		txtpnPartsOfThe.setContentType("text/html");
		txtpnPartsOfThe.setText("<center align=justify style=\"font-family:dialog\">\r\n<center>\r\n<h1> PARTS OF  THE SPEECH APPARATUS </h1>\r\n<h3>The phonetic apparatus consists of three groups of organs</h3>\r\n<img src=\""
		+new ImageIcon(ActivityList.class.getResource("/assets/organ of speech.png"))+"\" />\r\n<h1>Breathing Organs</h1>\r\n</center>\r\n<h1>Lungs</h1>\r\n<h3>The lungs are the largest organs of the human body and their main function is to allow inspiration and expiration of air. They are formed by connective tissues inside which are the bronchial tubes, which progressively branch off from the trachea. </h3>\r\n<h1> Bronchi</h1>\r\n<h3>The bronchi are the ducts that arise from the bifurcation of the trachea. Each of the bronchi is connected to one of the lungs. The air enters through the trachea and reaches the lungs through the bronchi, so that its role is very important.</h3>\r\n<h1>Windpipe</h1>\r\n<h3>The trachea is one of the most important elements  of  the respiratory system. It  is  the tube  that connects the nose and mouth with the lungs and bronchi. It is shaped like a tube and consists of a set of cartilaginous rings. It begins in the larynx and runs to the chest.</h3>\r\n<center>\r\n<h1>Phonation Organs</h1>\r\n</center>\r\n<h1>Larynx</h1>\r\n<h3>The larynx is a tubular organ formed by a total of six cartilage. Connect the pharynx with the trachea. This is the organ of phonation because the vocal cords are located in the larynx.</h3>\r\n<h1>Vocal Cords</h1>\r\n<h3>The vocal cords are the element of the phonological apparatus responsible for the production of the voice. Despite its name, the truth is that they have no rope shape, but are a set of folds. They are a total of four, divided into two large groups: true and false. The false ones do not participate in the production of sounds, while the true ones do. </h3>\r\n<h1>Resonators</h1>\r\n<h3>The resonators are responsible for the vibrations that come from the vocal cords which become sound.</h3>\r\n<center>\r\n<h1>Articulation Organs</h1>\r\n</center>\r\n<h1>Palate</h1>\r\n<h3>The palate is the upper wall of the oral cavity. It is divided into two parts: the bone palate and the veil of the palate. Its main function is to separate the oral cavity from the nostrils and its interaction with the tongue allows the articulation of sounds.</h3>\r\n<h1>Tongue</h1>\r\n<h3>The tongue is a mobile organ that is inside the mouth. It has a key role in numerous functions, such as mouth hydration, swallowing or language, among others. It is characterized by its cone shape. </h3>\r\n<h1>Teeth</h1>\r\n<h3>In the case of adults, they have a total of 32 teeth : 8 incisors, 4 canines, 8 premolars and 12 molars. It is interesting to know that not all adults have wisdom teeth since there is not always enough room for growth. </h3>\r\n<h1>Lips</h1>\r\n<h3> The lips are essential to carry out a large selection of functions, such as sucking or kissing, and others. </h3>\r\n<h1>Glottis</h1>\r\n<h3>The glottis is the narrowest part of what is called laryngeal light, a space limited by the vocal cords. Before the vibration of the vocal cords, the sound is transformed into voice or loudness. Thus, when they do not vibrate, dull sound is produced.</h3>\r\n</center>");
		
		JLabel lblNewLabel_1 = new JLabel("NOTES");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(21, 11, 165, 33);
		panel_1.add(lblNewLabel_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 58, 195, 421);
		panel_1.add(scrollPane_1);
		
		JTextPane textPane = new JTextPane();
		scrollPane_1.setViewportView(textPane);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 769, 490);
		add(panel);
		
		JButton btnNewButton = new JButton("START");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel_1.setVisible(true);
			}
		});
		btnNewButton.setVisible(true);
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 25));
		btnNewButton.setBounds(450, 435, 150, 50);
		panel.add(btnNewButton);
		
		JTextPane txtpnAtTheEnd = new JTextPane();
		txtpnAtTheEnd.setText("At the end of this lesson, the students must be able to:\r\n1. Identify the speech organs used in the speech production mechanism.\r\n\r\n2. Recognize the importance of the speech organs in the process of speech production.\r\n\r\n3. Label the different parts and functions of the speech apparatus.   \r\n");
		txtpnAtTheEnd.setFont(new Font("Dialog", Font.PLAIN, 25));
		txtpnAtTheEnd.setBounds(10, 117, 759, 312);
		panel.add(txtpnAtTheEnd);
		
		JLabel lblNewLabel = new JLabel("LEARNING OUTCOMES");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 25));
		lblNewLabel.setBounds(80, 0, 602, 81);
		panel.add(lblNewLabel);

	}
}
