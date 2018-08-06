package com.dotapro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dotapro.model.Tournament;

public interface TournamentRepository extends JpaRepository<Tournament, Long>{

}
