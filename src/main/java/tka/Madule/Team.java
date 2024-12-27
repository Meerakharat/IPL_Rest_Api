package tka.Madule;

public class Team {
	private int teamId;
	private String name;
	private String city;
	private String cotch;
	
	
	public Team() {
		// TODO Auto-generated constructor stub
	}

	public Team(int teamId, String name, String city, String cotch) {
		super();
		this.teamId = teamId;
		this.name = name;
		this.city = city;
		this.cotch = cotch;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCotch() {
		return cotch;
	}

	public void setCotch(String cotch) {
		this.cotch = cotch;
	}

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", name=" + name + ", city=" + city + ", cotch=" + cotch + "]";
	}
	

}
