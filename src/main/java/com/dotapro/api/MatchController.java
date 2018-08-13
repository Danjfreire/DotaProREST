package com.dotapro.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dotapro.model.TournamentMatch;
import com.dotapro.repository.TournamentMatchRepository;

@RestController
@RequestMapping("/matches")
public class MatchController {

	@Autowired
	private TournamentMatchRepository tournamentMatchRepository;
	
	@CrossOrigin
	@GetMapping(path="/{leagueid}")
	public List<TournamentMatch> getTournamentMatches(@PathVariable("leagueid")Long leagueid){
		return tournamentMatchRepository.findTournamentMatchesByLeagueid(leagueid);
	}
}
