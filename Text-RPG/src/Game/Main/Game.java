package Game.Main;
import javax.swing.JFrame;

import Game.Level.States.GameComponent;
import Game.Level.States.StartMenu;
import Game.Level.States.State;

public class Game extends JFrame {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	State gameState = new State();
	public final int WIDTH = 700;
	public final int HEIGHT = 540;
	
	public Game() {
		
		JFrame gameFrame =  new JFrame();
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
}

