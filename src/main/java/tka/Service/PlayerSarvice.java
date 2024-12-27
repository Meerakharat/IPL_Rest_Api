package tka.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tka.Dao.PlayerDao;
import tka.Madule.Player;
@Service
public class PlayerSarvice {
	@Autowired
	PlayerDao playerDao;

	public String addplayer(Player player) {
		String msg = playerDao.addplayer(player);
		
		return msg;
		
	}
	public List<Player> getAllPlayer() {
		List<Player> allPlayers = playerDao.getAllPlayer();
		return allPlayers;
		
		
	}
	public Player getPlayerById(int id) {
		Player player = playerDao.getPlayerById(id);
		return player;
	}
	  public String deletePlayer(int id) {
		int status = playerDao.deletePlayer(id);
		if(status==0) {
			return "Player not found to delete";
		}else {
			return "Player deleted";
		}
	}
	public String updatePlayer(int id,Player player) {
		 int status =playerDao.updatePlayer(id,player);
		 if(status==0) {
		return "player not found";
		
	}else {
		return "player updated";
	}
	 
	}



}
