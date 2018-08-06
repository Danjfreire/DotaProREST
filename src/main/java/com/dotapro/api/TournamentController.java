package com.dotapro.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dotapro.model.Team;
import com.dotapro.model.Tournament;
import com.dotapro.model.TournamentStandings;
import com.dotapro.repository.TeamRepository;
import com.dotapro.repository.TournamentRepository;

@RestController
@RequestMapping("/tournaments")
public class TournamentController {
	
	@Autowired
	private TournamentRepository tournamentRepository;
	
	@Autowired
	private TeamRepository teamRepository;
	
	//Retorna uma lista com todos os campeonatos
	@GetMapping
	public List<Tournament> tournamentList(){
		return tournamentRepository.findAll();
	}
	
	//Cadastra um novo campeonato
	@PostMapping
	public Tournament newTournament(@RequestBody Tournament tournament) {
		List<TournamentStandings> standings = tournament.getStandings();
		for(TournamentStandings standing : standings) {
			standing.setTournament(tournament);
			Team team = teamRepository.findTeamById(standing.getTeam_id());
			standing.setTeam(team);
		}
		return tournamentRepository.save(tournament);
	}

	
}
