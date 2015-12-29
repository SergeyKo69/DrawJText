import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public abstract class ChooseField extends JPanel implements ActionListener{
	public ChooseField(){
		setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		JTextField field = new JTextField();
		field.setBorder(BorderFactory.createLineBorder(Color.white));
		JButton button = new JButton("...");
		button.addActionListener(this);
		add(field, BorderLayout.CENTER);
		add(button, BorderLayout.LINE_END);
	}

	@Override
	abstract public void actionPerformed(ActionEvent e);
}
