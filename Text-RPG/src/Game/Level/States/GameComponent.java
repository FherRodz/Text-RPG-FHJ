package Game.Level.States;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.Timer;

import Game.Main.Game;

public class GameComponent extends JPanel{

	/**
	 * 
	 */


	private static final long serialVersionUID = 1L;
	State gameState = new State();

	//Game Assets
	private JPanel buttonsPanel = new JPanel();
	private JPanel titlePanel = new JPanel();
	private JPanel readyTextPanel = new JPanel();
	private JPanel mainGamePanel = new JPanel();
	private JLabel titleLabel = new JLabel("Nuclear Noir");
	private JLabel readyText = new JLabel("Dusting Off Story...");
	private JButton startB = new JButton("START");
	private JTextArea mainTextArea = new JTextArea();
	private Timer timer;
	private int delay = 1000;
	private int timeCounter = 5;
	
	
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

	public void doGettingReady() {

		titlePanel.setVisible(false);	
		buttonsPanel.setVisible(false); 

		readyTextPanel.setBounds(255,200,160,65);
		readyTextPanel.setBackground(Color.BLUE);

		readyText.setBounds(350,570,100,50);
		readyText.setFont(normalFont);
		readyText.setForeground(Color.WHITE);

		readyTextPanel.add(readyText);
		this.add(readyTextPanel);
		
        timer = new Timer(delay, timerAction);
        timer.setInitialDelay(0);
        timer.start();
	}


	public void doScene1() {
		readyTextPanel.setVisible(false);
		readyText.setVisible(false);
		System.out.println("ready");
		
		mainGamePanel.setBounds(100,50,450,220);
		mainGamePanel.setBackground(Color.GRAY);
		
		this.add(mainGamePanel);
		
	}


	//Timer action listener
	ActionListener timerAction = new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			if(timeCounter == 0) {
				timer.stop();
				doScene1();
			}
			else {timeCounter --;}
		}
	};

	//Listener for the start button
	public class TitleScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			gameState.setCurrentState(0);
			doGettingReady();
		}
	}

}
