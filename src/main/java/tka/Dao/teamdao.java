package tka.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitterReturnValueHandler;

import tka.Madule.Team;

@Repository
public class teamdao {
	
	List<Team>teams = new ArrayList<Team>();
	public  teamdao() {
		teams.add(new Team(1,"mi","mumbai","sachin"));
		teams.add(new Team(1,"rcb","bongore","virat"));
	}
	public String addteam( Team team) {
		
		teams.add(team);
		return"added successfully";
	}		
  
   public List<Team> getAllTeam() {
	
	return teams;
  }
   public Team getTeamById(int id) {
	   for (Team team : teams) {
		if(team.getTeamId()==id) {
			
		
			return team;
	}
	   }
	return null;
	   
	   
   }
  
   

public int deleteTeam(int id) {
	 String msg="";
	   for (Team team : teams) {
		if(team.getTeamId()==id) {
			teams.remove(team);
			return 1;
		}
	
	
}
	return 0; 
}	

public int updateTeam(int id, Team team) {
	int status = deleteTeam(id);
	if(status==1) {
		teams.add(team);
		return 1;
	}else {
	return 0;
}
}
}
