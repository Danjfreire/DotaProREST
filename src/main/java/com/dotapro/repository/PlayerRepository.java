package com.dotapro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dotapro.model.Player;

public interface PlayerRepository extends JpaRepository<Player, Long>{
	
	public Player findPlayerByAccountid(Long id);
	public List<Player> findPlayerByopendotateamid(Long id);
}
