package tka.Madule;

public class Match {
	private int matchId;
	private String teamOneName;
	private String teamTwoname;
	private String date;
	private String venue;
	private String result;
	
	public Match() {
		// TODO Auto-generated constructor stub
	}

	public Match(int matchId, String teamOneName, String teamTwoname, String date, String venue, String result) {
		super();
		this.matchId = matchId;
		this.teamOneName = teamOneName;
		this.teamTwoname = teamTwoname;
		this.date = date;
		this.venue = venue;
		this.result = result;
	}

	public int getMatchId() {
		return matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public String getTeamOneName() {
		return teamOneName;
	}

	public void setTeamOneName(String teamOneName) {
		this.teamOneName = teamOneName;
	}

	public String getTeamTwoname() {
		return teamTwoname;
	}

	public void setTeamTwoname(String teamTwoname) {
		this.teamTwoname = teamTwoname;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Match [matchId=" + matchId + ", teamOneName=" + teamOneName + ", teamTwoname=" + teamTwoname + ", date="
				+ date + ", venue=" + venue + ", result=" + result + "]";
	}
	

}
