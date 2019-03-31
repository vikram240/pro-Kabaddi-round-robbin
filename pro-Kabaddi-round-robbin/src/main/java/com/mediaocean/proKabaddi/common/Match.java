package com.mediaocean.proKabaddi.common;

import java.time.LocalDateTime;

public class Match {

	private Team firstTeam;
	private Team secondTeam;
	private String location;
	private LocalDateTime date;
	
	
	@Override
	public String toString() {
		return "Pro-Kabaddi Match information is  [" + firstTeam + ", vs " + secondTeam + ", at location=" + location + ", on date="
				+ date + "]";
	}
	
	public Match(Team firstTeam, Team secondTeam, String location, LocalDateTime date) {
		super();
		this.firstTeam = firstTeam;
		this.secondTeam = secondTeam;
		this.location = location;
		this.date = date;
	}
	
	public Match(Team firstTeam, Team secondTeam, String location) {
		super();
		this.firstTeam = firstTeam;
		this.secondTeam = secondTeam;
		this.location = location;
	}
	
	public Team getFirstTeam() {
		return firstTeam;
	}
	public void setFirstTeam(Team firstTeam) {
		this.firstTeam = firstTeam;
	}
	public Team getSecondTeam() {
		return secondTeam;
	}
	public void setSecondTeam(Team secondTeam) {
		this.secondTeam = secondTeam;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date2) {
		this.date = date2;
	}
	
	
}
