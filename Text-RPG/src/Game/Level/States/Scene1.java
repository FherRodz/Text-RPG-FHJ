package Game.Level.States;

import Game.Entities.WoodenDoor;

public class Scene1 extends Level{

	public Scene1() {


		this.description = "With the wrath of a thousand gay ferrets, your asshole expands the size of the universe";

		WoodenDoor entranceD = new WoodenDoor();

		entranceD.setDescription("Huge, dark oak door. Seems to not have been opened in a long time.");
		entranceD.setSize(1);

	}


}
