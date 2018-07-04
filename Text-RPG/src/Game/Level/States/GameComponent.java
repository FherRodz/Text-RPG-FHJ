package Game.Level.States;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GameComponent extends JPanel{

	/**
	 * 
	 */


	private static final long serialVersionUID = 1L;
	State gameState = new State();
	
	//Game Assets
	JPanel buttonsPanel = new JPanel();
	JPanel titlePanel = new JPanel();
	JPanel readyTextPanel = new JPanel();
	JLabel titleLabel = new JLabel("Nuclear Noir");
	JButton startB = new JButton("START");
	JLabel readyText = new JLabel("Dusting Off Story...");
	
	//Game Fonts
	Font normalFont = new Font("Times New Roman", Font.PLAIN, 20);
	Font titleFont = new Font("Times New Roman", Font.ITALIC, 80);

	TitleScreenHandler tsHandler = new TitleScreenHandler();
	
	public GameComponent() {
		this.setBounds(10,10,665,485);
		this.setBackground(Color.BLACK);

		//Switches between game states
		switch(gameState.getCurrentState()) {
		//Title screen 
		case -1:
			doTitleScreen();

			break;
		case 0: 
			System.out.println("Doing getting ready screen");
		}
	}
	
	private void doTitleScreen() {
		
		this.setLayout(null);
		
		startB.setFont(normalFont);
		startB.setBackground(Color.BLACK);
		startB.setForeground(Color.WHITE);
		startB.addActionListener(tsHandler);
		
		buttonsPanel.setBounds(285,250,85,40);
		buttonsPanel.setBackground(Color.BLACK);
		buttonsPanel.add(startB);
		
		
		titleLabel.setFont(titleFont);
		
		titlePanel.setBounds(100,50,450,120);
		titlePanel.setBackground(Color.GRAY);
		titlePanel.add(titleLabel);

		this.add(titlePanel);
		this.add(buttonsPanel);
	}

	private void doGettingReady() {

		titlePanel.setVisible(false);	
		buttonsPanel.setVisible(false); 
		
		readyTextPanel.setBounds(255,200,160,65);
		readyTextPanel.setBackground(Color.BLACK);

		readyText.setBounds(350,570,100,50);
		readyText.setFont(normalFont);
		readyText.setForeground(Color.WHITE);
		
		readyTextPanel.add(readyText);
		this.add(readyTextPanel);
	}
	
	//Listener for the buttons
	public class TitleScreenHandler implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				gameState.setCurrentState(0);
				doGettingReady();
			}
	}

}
