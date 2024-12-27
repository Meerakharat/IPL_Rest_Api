package tka.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tka.Madule.Player;
import tka.Service.PlayerSarvice;

@RestController
@RequestMapping("/api")
public class PlayerController {
	@Autowired
	PlayerSarvice playerservice;
	private Player Player;
	
	@PostMapping("/players")
	public String AddPlayer(@RequestBody Player player) {
		String msg = playerservice.addplayer(player);
		return msg;
		
	}
	@GetMapping("/players/all")
	public List<Player> getAllPlayer() {
		List<Player> Allplayer = playerservice.getAllPlayer();
		
		return Allplayer;
		
	}
	@GetMapping("/player/{id}")
	public Object getPlayerById(@RequestParam ("id") int id) {
		Player player = playerservice.getPlayerById(id);
		if(player!=null) {
			return player;
		}else {
			return "player not found";
		}
	}
		@DeleteMapping("/players/{id}")
			public String deletePlayer(@PathVariable int id) {
				return playerservice.deletePlayer(id);
			
		}
		@PutMapping("/players/{id}")
		public String updatePlayer(@PathVariable int id,@RequestBody Player player) {
		  String msg = playerservice.updatePlayer(id, player);
		    return msg;
		}

		
	


	}
