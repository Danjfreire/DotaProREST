package com.dotapro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dotapro.model.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {

	public Team findTeamById(Long id);
	public Team findTeamByOpendotaID(Long id);
}
