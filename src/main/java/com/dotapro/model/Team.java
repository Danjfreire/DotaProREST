package com.dotapro.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Team {

	@Id
	private Long id;
	private Long wins;
	private Long losses;
	private String name;
	private String tag;
	private String logo;

	
//	@OneToMany(fetch = FetchType.LAZY, mappedBy="team")
//	private List<Player> players;

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "team")
	private List<TournamentStandings> standings;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getWins() {
		return wins;
	}

	public void setWins(Long wins) {
		this.wins = wins;
	}

	public Long getLosses() {
		return losses;
	}

	public void setLosses(Long losses) {
		this.losses = losses;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public List<TournamentStandings> getStandings() {
		return standings;
	}

	public void setStandings(List<TournamentStandings> standings) {
		this.standings = standings;
	}
}
