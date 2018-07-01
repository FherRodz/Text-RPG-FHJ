package Game.Level.States;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GameComponent extends JPanel{

	/**
	 * 
	 */


	private static final long serialVersionUID = 1L;
	State gameState = new State();
	StartMenu start = new StartMenu();
	JPanel buttonsPanel = new JPanel();
	JPanel titlePanel = new JPanel();
	JPanel readyTextPanel = new JPanel();
	JTextArea readyText;
	
	Font normalFont = new Font("Times New Roman", Font.PLAIN, 20);

	TitleScreenHandler tsHandler = new TitleScreenHandler();
	
	public GameComponent() {
		this.setBounds(10,10,665,485);
		this.setBackground(Color.BLACK);

		//Switches between game states
		switch(gameState.getCurrentState()) {
		case -1:
			this.setLayout(null);
			buttonsPanel.setBounds(285,250,85,40);
			buttonsPanel.setBackground(Color.BLACK);
			buttonsPanel.add(start.getButtons()[0]);
			start.getButtons()[0].addActionListener(tsHandler);
			
			
			titlePanel.setBounds(100,50,450,120);
			titlePanel.setBackground(Color.GRAY);
			titlePanel.add(start.getTitleLabel());

			this.add(titlePanel);
			this.add(buttonsPanel);
			break;
		case 0: 
											/////////////////////////
			titlePanel.setVisible(false);	/// THIS DOESNT WORK ////
			buttonsPanel.setVisible(false); /////////////////////////
			
			readyTextPanel.setBounds(350,570,100,50);
			readyTextPanel.setBackground(Color.GRAY);

			readyText = new JTextArea("Dusting off first Scene...");
			readyText.setBounds(350,570,100,50);
			//readyText.setFont(normalFont);
			
			readyTextPanel.add(readyText);
			this.add(readyTextPanel);
		}
	}
	
	//Listener for the buttons
	public class TitleScreenHandler implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				gameState.setCurrentState(0);
			}
	}

}
