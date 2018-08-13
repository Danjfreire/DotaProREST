package com.dotapro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dotapro.model.TournamentMatch;

public interface TournamentMatchRepository extends JpaRepository<TournamentMatch, Long>{

	public List<TournamentMatch> findTournamentMatchesByLeagueid(Long id);
}
