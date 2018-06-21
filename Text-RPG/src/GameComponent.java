import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class GameComponent extends JPanel{

	
	
	JButton optionA = new JButton("option A");
	JButton optionB = new JButton("option B");
	JButton optionC = new JButton("option C");
	JButton optionD = new JButton("option C");
	
	public GameComponent() {
		this.setLayout(new BorderLayout());
		this.setBackground(Color.BLACK);
		JPanel buttPanel = new JPanel();
		JPanel textPanel = new JPanel();
		
		buttPanel.add(optionA);
		buttPanel.add(optionB);
		buttPanel.add(optionC);
		buttPanel.add(optionD);
		
		this.add(buttPanel, BorderLayout.SOUTH);

	}

}
