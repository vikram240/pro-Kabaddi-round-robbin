package com.mediaocean.proKabaddi.common.dao;

import java.util.Map;

import com.mediaocean.proKabaddi.common.Team;

public interface TeamDao {

	//To get the team from team id
	Team get(int id);
	
	Map<Integer, Team> getAllTeams();
}
