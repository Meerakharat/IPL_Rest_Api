package tka.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import tka.Madule.Match;
@Repository
public class MatchDao {
	List<Match>matchs = new ArrayList<Match>();
	public  MatchDao() {
		matchs.add(new Match(101, "MI", "RCB", "11-3-23", "pune", "djyfjsdg"));
		
	}
	public String addmatch( Match match) {
		
		matchs.add(match);
		return"added successfully";
	}		
  
   public List<Match> getAllMatch() {
	
	return matchs;
  }
   public Match getMatchById(int id) {
	   for (Match match : matchs) {
		if(match.getMatchId()==id) {
			
			return match;
	}
	   }
	return null;
	      
   }
  
public int deleteMatch(int id) {
	 String msg="";
	   for (Match match : matchs) {
		if(match.getMatchId()==id) {
			matchs.remove(match);
			return 1;
		}
	
}
	return 0; 
}	

public int updateMatch(int id, Match match) {
	int status = deleteMatch(id);
	if(status==1) {
		matchs.add(match);
		return 1;
	}else {
	return 0;
}
}

}
