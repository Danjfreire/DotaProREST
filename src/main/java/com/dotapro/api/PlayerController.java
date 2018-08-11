package com.dotapro.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dotapro.model.Player;
import com.dotapro.repository.PlayerRepository;

@RestController
@RequestMapping("/player")
public class PlayerController {

	@Autowired
	PlayerRepository playerRepository;
	
	//Retorna um player com ID específico
	@GetMapping(path="/{id}")
	public Player playerById(@PathVariable("id") Long id) {
		return playerRepository.findPlayerByAccountid(id);
	}
	
	//Retorna a lista de players de um time específico
	@GetMapping(path="/team/{id}")
	public List<Player> teamPlayers(@PathVariable("id") Long id){
		return playerRepository.findPlayerByopendotateamid(id);
	}
}
