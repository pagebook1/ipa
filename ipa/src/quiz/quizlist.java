package quiz;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class quizlist extends JPanel {

	/**
	 * Create the panel.
	 */
	static JPanel quiz11panel = new quiz1panel();
	static JPanel quiz2panels = new quiz2panel();
	static JPanel quiz3panel;
	static JPanel quiz4panel;
	public static JPanel panel;
	public quizlist() {
		setBackground(Color.WHITE);
		setBounds(0,0,769, 491);
		setLayout(null);
		 
		  panel = new JPanel();
		 panel.setBackground(Color.WHITE);
		 panel.setBounds(0, 0, 769, 491);
		 add(panel);
		 panel.setLayout(null);
		 
		 JButton btnNewButton = new JButton("QUIZ 1\r\n");
		 btnNewButton.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		showpanel(quiz11panel);
//		 		quiz1panel.question_1.setVisible(true);
		 	}
		 });
		 btnNewButton.setForeground(Color.WHITE);
		 btnNewButton.setFont(new Font("Dialog", Font.BOLD, 35));
		 btnNewButton.setBackground(new Color(0, 128, 128));
		 btnNewButton.setBounds(128, 122, 225, 104);
		 panel.add(btnNewButton);
		 
		 JButton btnQuiz = new JButton("QUIZ 2");
		 btnQuiz.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		showpanel(quiz2panels);
//		 		quiz2panel.question_1.setVisible(true);
		 	}
		 });
		 btnQuiz.setForeground(Color.WHITE);
		 btnQuiz.setFont(new Font("Dialog", Font.BOLD, 35));
		 btnQuiz.setBackground(new Color(0, 128, 128));
		 btnQuiz.setBounds(384, 125, 225, 104);
		 panel.add(btnQuiz);
		 
		 JButton btnQuiz_1 = new JButton("QUIZ 3");
		 btnQuiz_1.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		showpanel(quiz3panel);
		 	}
		 });
		 btnQuiz_1.setForeground(Color.WHITE);
		 btnQuiz_1.setFont(new Font("Dialog", Font.BOLD, 35));
		 btnQuiz_1.setBackground(new Color(0, 128, 128));
		 btnQuiz_1.setBounds(124, 259, 225, 104);
		 panel.add(btnQuiz_1);
		 
		 JButton btnQuiz_2 = new JButton("QUIZ 4");
		 btnQuiz_2.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		showpanel(quiz4panel);
		 	}
		 });
		 btnQuiz_2.setForeground(Color.WHITE);
		 btnQuiz_2.setFont(new Font("Dialog", Font.BOLD, 35));
		 btnQuiz_2.setBackground(new Color(0, 128, 128));
		 btnQuiz_2.setBounds(387, 260, 225, 104);
		 panel.add(btnQuiz_2);
		
		 quiz11panel = new quiz1panel();
		quiz11panel.setBackground(Color.WHITE);
		quiz11panel.setBounds(0, 0, 769, 491);
		add(quiz11panel);
		
		quiz2panels = new quiz2panel();
		quiz2panels.setBackground(Color.WHITE);
		quiz2panels.setBounds(0, 0, 769, 491);
		add(quiz2panels);
		
		 quiz3panel = new JPanel();
		quiz3panel.setBackground(Color.WHITE);
		quiz3panel.setBounds(0, 0, 769, 491);
		add(quiz3panel);
		
		 quiz4panel = new JPanel();
		quiz4panel.setBackground(Color.WHITE);
		quiz4panel.setBounds(0, 0, 769, 491);
		add(quiz4panel);
		showpanel(panel);
	}
	public static void showpanel(JPanel panez)
	{
		JPanel[] panels = {panel,quiz11panel,quiz2panels,quiz3panel,quiz4panel};
		for(JPanel hide:panels)
		{
			hide.setVisible(false);
		}
		panez.setVisible(true);
	}
}
