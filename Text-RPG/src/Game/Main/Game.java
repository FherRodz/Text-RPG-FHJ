package Game.Main;
import java.awt.Container;

import javax.swing.JFrame;

import Game.Level.States.GameComponent;
import Game.Level.States.State;

public class Game extends JFrame {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	State gameState = new State();
	public final int WIDTH = 700;
	public final int HEIGHT = 540;
	public JFrame gameFrame =  new JFrame();
	public Container con = gameFrame.getContentPane();

	public Game() {

		GameComponent myCom = new GameComponent();

		//Main Game Frame settings
		gameFrame.setTitle("Future Noir");
		gameFrame.setSize(WIDTH,HEIGHT);
		gameFrame.setLocation(400,220);
		gameFrame.setLayout(null);
		gameFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		gameFrame.getContentPane().add(myCom);
		gameFrame.setVisible(true);
	}

	//GETTERS & SETTERS
	public JFrame getGameFrame() {
		return gameFrame;
	}
	public void setGameFrame(JFrame gameFrame) {
		this.gameFrame = gameFrame;
	}
	public Container getCon() {
		return con;
	}
	public void setCon(Container con) {
		this.con = con;
	}
	public int getWIDTH() {
		return WIDTH;
	}
	public int getHEIGHT() {
		return HEIGHT;
	}

}

