package com.mediaocean.proKabaddi.common.dao.impl;

import java.util.HashMap;
import java.util.Map;

import com.mediaocean.proKabaddi.common.Team;
import com.mediaocean.proKabaddi.common.dao.TeamDao;

public class TeamDaoImpl implements TeamDao{
	
	Map<Integer, Team> allTeamMap = new HashMap<>();
	
	//TODO : Remove after db calls 
	private Map<Integer, Team> intializeTeams(){
		allTeamMap.put(1, prepareteam(1, "Puneri Paltan", "Pune"));
		allTeamMap.put(2, prepareteam(2, "U Mumba", "Mumba"));
		allTeamMap.put(3, prepareteam(3, "Patna Pirates", "Patna"));
		allTeamMap.put(4, prepareteam(4, "Bengaluru Bulls", "Bengalore"));
		allTeamMap.put(5, prepareteam(5, "Jaipur Pink Panthers", "Jaipur"));
		allTeamMap.put(6, prepareteam(6, "Telugu Titans", "Hydrabad"));
		return allTeamMap;
		
	}

	public Team prepareteam(int id,String name,String location) {
		Team team= new Team(id, name, location);
		return team;
		
	}
	
	@Override
	public Team get(int id) {
		// TODO Auto-generated method stub
		return allTeamMap.get(id);
	}

	@Override
	public Map<Integer, Team> getAllTeams() {
		// TODO Auto-generated method stub
		return intializeTeams();
	}
}
