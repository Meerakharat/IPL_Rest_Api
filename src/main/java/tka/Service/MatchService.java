package tka.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tka.Dao.MatchDao;

import tka.Madule.Match;

@Service
public class MatchService {
	@Autowired
	MatchDao matchDao;

	public String addmatch(Match match) {
		String msg = matchDao.addmatch(match);
		
		return msg;
		
	}
	public List<Match> getAllMatch() {
		List<Match> allMatchs = matchDao.getAllMatch();
		return allMatchs;
			
	}
	public Match getMatchById(int id) {
		Match match = matchDao.getMatchById(id);
		return match;
	}
	  public String deleteMatch(int id) {
		int status = matchDao.deleteMatch(id);
		if(status==0) {
			return "Match not found to delete";
		}else {
			return "Match deleted";
		}
	}
	public String updateMatch(int id,Match match) {
		 int status =matchDao.updateMatch(id,match);
		 if(status==0) {
		return "match not found";
		
	}else {
		return "match updated";
	}
	 
	}

}



