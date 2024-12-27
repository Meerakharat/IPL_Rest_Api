package tka.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tka.Madule.Team;
import tka.Service.Teamservice;

@RestController
public class TeamController {
	@Autowired
	Teamservice teamservice;
	private Team Team;
	
	@PostMapping("/api/teams")
	public String AddTeam(@RequestBody Team team) {
		String msg = teamservice.addteam(team);
		return msg;
		
	}
	@GetMapping("/api/teams/all")
	public List<Team> getAllTeam() {
		List<Team> Allteam = teamservice.getAllTeam();
		
		return Allteam;
		
	}
	@GetMapping("/api/team")
	public Object getTeamById(@RequestParam int id) {
		Team team = teamservice.getTeamById(id);
		if(team!=null) {
			return team;
		}else {
			return "team not found";
		}
	}
		@DeleteMapping("/api/teams")
			public String deleteTeam(@PathVariable int id) {
				return teamservice.deleteTeam(id);
			
		}
		@PutMapping("/api/teams/{id}")
		public String updateTeam(@PathVariable int id,@RequestBody Team team) {
		  String msg = teamservice.updateTeam(id, team);
		    return msg;
		}

		
	

}
