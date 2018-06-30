package Game.Main;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class GameFrame extends JFrame {

	
	public GameFrame() {
		JFrame gameFrame =  new JFrame();
		GameComponent myComp = new GameComponent();
		
		//Game Component settings
		
		//Game frame settings
		gameFrame.setTitle("BBC");
		gameFrame.setSize(500,500);
		gameFrame.setLocation(500,250);
		gameFrame.add(myComp);
		gameFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		gameFrame.setVisible(true);
	}
}
