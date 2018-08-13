package com.dotapro.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TournamentMatch {

	@Id
	private Long matchid;
	private Long leagueid;

	public Long getMatchid() {
		return matchid;
	}

	public void setMatchid(Long matchid) {
		this.matchid = matchid;
	}

	public Long getLeagueid() {
		return leagueid;
	}

	public void setLeagueid(Long leagueid) {
		this.leagueid = leagueid;
	}

}
