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

import tka.Madule.Match;

import tka.Service.MatchService;
@RestController
@RequestMapping("/api")
public class MatchController {
	@Autowired
	MatchService matchservice;
	
	
	@PostMapping("/matchs")
	public String AddMatch(@RequestBody Match match) {
		String msg = matchservice.addmatch(match);
		return msg;
		
	}
	@GetMapping("/matchs/all")
	public List<Match> getAllMatch() {
		List<Match> Allmatch = matchservice.getAllMatch();
		
		return Allmatch;
		
	}
	@GetMapping("/match")
	public Object getMatchById(@RequestParam("id") int id) {
		Match match = matchservice.getMatchById(id);
		if(match!=null) {
			return match;
		}else {
			return "match not found";
		}
	}
		@DeleteMapping("/matchs/{id}")
			public String deleteMatch(@PathVariable int id) {
				return matchservice.deleteMatch(id);
			
		}
		@PutMapping("/matchs/{id}")
		public String updateMatch(@PathVariable int id,@RequestBody Match match) {
		  String msg = matchservice.updateMatch(id, match);
		    return msg;
		}

}
