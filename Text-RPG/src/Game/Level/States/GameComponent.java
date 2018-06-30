package Game.Level.States;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class GameComponent extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	State gameState = new State();
	StartMenu start = new StartMenu();
	JPanel buttonsPanel = new JPanel();
	JPanel titlePanel = new JPanel();
	public GameComponent() {
		this.setBounds(10,10,665,485);
		buttonsPanel.setBounds(280,250,85,35);
		buttonsPanel.setBackground(Color.GRAY);
		
		titlePanel.setBounds(100,50,450,120);
		titlePanel.setBackground(Color.GRAY);
		this.setBackground(Color.BLACK);
		switch(gameState.getCurrentState()) {
		case -1:
			this.setLayout(null);
			buttonsPanel.add(start.getButtons()[0]);
			titlePanel.add(start.getTitleLabel());
			this.add(titlePanel);
			this.add(buttonsPanel);
		}
	}

}
