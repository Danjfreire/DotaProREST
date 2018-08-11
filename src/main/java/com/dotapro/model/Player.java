package com.dotapro.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Player {

	@Id
	private Long accountid;
	private Long steamid;
	private String name;
	private Long opendotateamid;
	private String last_match;
	
	public Long getAccount() {
		return accountid;
	}

	public void setAccount(Long acc_id) {
		this.accountid = acc_id;
	}

	public Long getSteamid() {
		return steamid;
	}

	public void setSteamid(Long steam_id) {
		this.steamid = steam_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAccountid() {
		return accountid;
	}

	public void setAccountid(Long accountid) {
		this.accountid = accountid;
	}

	public Long getOpendotateamid() {
		return opendotateamid;
	}

	public void setOpendotateamid(Long opendotateamid) {
		this.opendotateamid = opendotateamid;
	}

	public String getLast_match() {
		return last_match;
	}

	public void setLast_match(String last_match) {
		this.last_match = last_match;
	}

//	public Team getTeam() {
//		return team;
//	}
//
//	public void setTeam(Team team) {
//		this.team = team;
//	}
//	
//	
}
