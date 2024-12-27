package tka.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import tka.Dao.teamdao;
import tka.Madule.Team;

@Service
public class Teamservice {
	
	@Autowired
	teamdao teamdao;

	public String addteam(Team team) {
		String msg = teamdao.addteam(team);
		
		return msg;
		
	}
	public List<Team> getAllTeam() {
		List<Team> allteams = teamdao.getAllTeam();
		return allteams;
		
		
	}
	public Team getTeamById(int id) {
		Team team = teamdao.getTeamById(id);
		return team;
	}
	  public String deleteTeam(int id) {
		int status = teamdao.deleteTeam(id);
		if(status==0) {
			return "team not found to delete";
		}else {
			return "team deleted";
		}
	}
	public String updateTeam(int id,Team team) {
		 int status = teamdao.updateTeam(id,team);
		 if(status==0) {
		return "team not found";
		
	}else {
		return "team updated";
	}
	 
	}

}
