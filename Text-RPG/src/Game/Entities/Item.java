package Game.Entities;

public class Item {
	protected int ID;
	protected String description;
	protected String vulnerability;
	protected String type;
	protected int size;
	protected int HP;
	
	public Item(int ID, String description, String vulnerability, String type, int size, int HP) {
		this.ID = ID;
		this.description = description;
		this.vulnerability = vulnerability;
		this.type = type;
		this.size = size;
		this.HP = HP;
	}

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

	public String getVulnerability() {
		return vulnerability;
	}

	public void setVulnerability(String vulnerability) {
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
