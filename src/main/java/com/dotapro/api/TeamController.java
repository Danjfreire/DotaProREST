package com.dotapro.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dotapro.model.Team;
import com.dotapro.repository.TeamRepository;

@RestController
@RequestMapping("/teams")
public class TeamController {

	@Autowired
	private TeamRepository teamRepository;
	
	//Retorna um time com ID específico
	@GetMapping(path="/{id}")
	public Team teamByid(@PathVariable("id") Long id){
		return teamRepository.findTeamById(id);
	}
	
}
