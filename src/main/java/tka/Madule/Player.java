package tka.Madule;

public class Player {
	private int playerId;
	private String name;
	private int age;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int playerId, String name, int age) {
		super();
		this.playerId = playerId;
		this.name = name;
		this.age = age;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", name=" + name + ", age=" + age + "]";
	}
	

}
