package Game.Entities;

public class Item {
	protected int ID;
	protected String description;
	protected int vulnerability;  //-1 = fire, 0 = water\\
	protected String type;  //-1 = static, 0 = usable\\
	protected int size;		//-1 = small, 0 = medium, 1 = large\\
	protected int HP;


	//GETTERS & SETTERS
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getVulnerability() {
		return vulnerability;
	}

	public void setVulnerability(int vulnerability) {
		this.vulnerability = vulnerability;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}
	
	
}
