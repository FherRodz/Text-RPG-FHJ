package Game.Level.States;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartMenu extends JPanel{

	Font titleFont = new Font("Times New Roman", Font.ITALIC, 80);
	Font normalFont = new Font("Times New Roman", Font.PLAIN, 20);

	
	JButton[] buttons = new JButton[1];
	JLabel titleLabel = new JLabel("Nuclear Noir");
	JButton startB = new JButton("START");
	
	public StartMenu() {
		startB.setFont(normalFont);
		startB.setBackground(Color.BLACK);
		startB.setForeground(Color.WHITE);
		titleLabel.setFont(titleFont);
		buttons[0]=startB;
		
	}

	//GETTERS & SETTERS
	public JButton[] getButtons() {
		return buttons;
	}

	public void setButtons(JButton[] buttons) {
		this.buttons = buttons;
	}

	public JLabel getTitleLabel() {
		return titleLabel;
	}

	public void setTitleLabel(JLabel titleLabel) {
		this.titleLabel = titleLabel;
	}

	public JButton getStartB() {
		return startB;
	}

	public void setStartB(JButton startB) {
		this.startB = startB;
	}

}
