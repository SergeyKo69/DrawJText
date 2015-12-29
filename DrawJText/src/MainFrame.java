import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame extends JFrame {
	public MainFrame(){
		setBounds(100,100,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel(new BorderLayout());
		panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		JTextField field = new JTextField(20);
		field.setBorder(BorderFactory.createLineBorder(Color.white));
		JButton button = new JButton("...");
		setLayout(new GridLayout(20,10));
		panel.add(field, BorderLayout.CENTER);
		panel.add(button, BorderLayout.LINE_END);
		add(panel);
	}
}
