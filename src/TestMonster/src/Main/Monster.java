package Main;

public class Monster {
	
	private String name;
	
	
	public Monster(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String attack() {
		return "!^_&^$@+%$* I don&#39;t know how to attack!";
	}


	@Override
	public String toString() {
		return "Monster [name=" + name + "]";
	}
	

}
