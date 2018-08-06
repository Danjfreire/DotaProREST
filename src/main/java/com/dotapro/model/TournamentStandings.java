package com.dotapro.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class TournamentStandings {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String place;
	private String prize;
	private String points;
	private Long team_id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "team")
	private Team team;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tournament_id")
	private Tournament tournament;

	public Team getTeam() {
		return team;
	}

	public Long getTeam_id() {
		return team_id;
	}

	public void setTeam_id(Long team_id) {
		this.team_id = team_id;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Tournament getTournament() {
		return tournament;
	}

	public void setTournament(Tournament tournament) {
		this.tournament = tournament;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getPrize() {
		return prize;
	}

	public void setPrize(String prize) {
		this.prize = prize;
	}

	public String getPoints() {
		return points;
	}

	public void setPoints(String points) {
		this.points = points;
	}

}
