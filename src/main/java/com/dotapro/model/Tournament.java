package com.dotapro.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public  class Tournament {

	@Id
	private int leagueid;
	private String tier;
	private String name;
	private String region;
	private String location;
	private String startDate;
	private String endDate;
	private String prizePool;
	private String points;
	private String logo;
	

	@OneToMany(cascade = CascadeType.ALL, mappedBy="tournament",targetEntity=TournamentStandings.class,fetch = FetchType.LAZY)
	private List<TournamentStandings> standings;
	
	public List<TournamentStandings> getStandings() {
		return standings;
	}
	
	public void setStandings(List<TournamentStandings> standings) {
		this.standings = standings;
	}

	public int getLeagueid() {
		return leagueid;
	}

	public void setLeagueid(int leagueid) {
		this.leagueid = leagueid;
	}

	public String getTier() {
		return tier;
	}

	public void setTier(String tier) {
		this.tier = tier;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getPrizePool() {
		return prizePool;
	}

	public void setPrizePool(String prizePool) {
		this.prizePool = prizePool;
	}

	public String getPoints() {
		return points;
	}

	public void setPoints(String points) {
		this.points = points;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	
	
	
}

