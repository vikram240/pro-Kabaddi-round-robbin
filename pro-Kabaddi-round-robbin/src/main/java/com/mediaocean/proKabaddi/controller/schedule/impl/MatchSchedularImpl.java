package com.mediaocean.proKabaddi.controller.schedule.impl;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.mediaocean.proKabaddi.common.Match;
import com.mediaocean.proKabaddi.common.Team;
import com.mediaocean.proKabaddi.controller.schedule.MatchScheduler;

public class MatchSchedularImpl implements MatchScheduler{

	@Override
	public List<Match> generateSchedule(Map<Integer, Team> allTeams) {
		// TODO Auto-generated method stub
		List<Team> allTeamsList= new ArrayList<>();
		for(Map.Entry<Integer, Team> entry: allTeams.entrySet()) {
			allTeamsList.add(entry.getValue());
		}
		
		List<Match> allMatches= getAllPossibleMatches(allTeamsList);
		List<Match> allMatchesWithDates= getDatesforMatches(allMatches);
		
		return allMatchesWithDates;
	}

	private List<Match> getAllPossibleMatches(List<Team> allTeams){
		List<Match> allMatches= new ArrayList<>();
		for(Team firstTeam: allTeams) {
			for(Team secondTeam: allTeams) {
				if(firstTeam!=secondTeam) {
					allMatches.add(new Match(firstTeam, secondTeam, firstTeam.getLocation()));
				}
			}
		}
		return allMatches;
	}
	
	private List<Match> getDatesforMatches(List<Match> matches){
		
	    LocalDateTime date=LocalDateTime.now();
	    
	    
	    	// Loop till one of the match date has not been scheduled
	 		while (isAnyMatchDateNull(matches)) {
	 			
	 			//already participated team id list
	 			List<Integer> participatedTeamIds = alreadyPlayedTeamList(matches, date.minusDays(1));

	 			Random random = new Random();
	 			Collections.swap(matches, random.nextInt(matches.size()), random.nextInt(matches.size()));
	 			
	 			for (Match match : matches) {
	 				if (match.getDate() == null &&
	 						!participatedTeamIds.contains(match.getFirstTeam().getId()) &&
	 						!participatedTeamIds.contains(match.getSecondTeam().getId())) {
	 					match.setDate(date);
	 					participatedTeamIds.add(match.getFirstTeam().getId());
	 					participatedTeamIds.add(match.getSecondTeam().getId());
	 				}
	 			}
	 			
	 			// Increment current date by 1 days
	 			date = date.plusDays(1);
	 		}
	    
	    /*while (isAnyMatchDateNull(matches)) {
	    	int id1 = 0,id2 = 0;
	    	for(int i=0; i< matches.size(); i++) {
	    		if(matches.get(i).getFirstTeam().getId()!=id1 &&
	    			matches.get(i).getFirstTeam().getId()!=id2 ) {
	    			matches.get(i).setDate(date);
	    			id1=matches.get(i).getFirstTeam().getId();
	    			id2=matches.get(i).getFirstTeam().getId();

	    			date= date.plusDays(1);
	    		}
	    	}
	    }*/
		
		return matches;
	}
	
	private boolean isAnyMatchDateNull(List<Match> matches) {
		for (Match match : matches) {
			if (match.getDate() == null) {
				return true;
			}
		}
		return false;
	}
	
	private List<Integer> alreadyPlayedTeamList(List<Match> matches, LocalDateTime date) {
		List<Integer> teamIds = new ArrayList<Integer>();
		for (Match match : matches) {
			if (match.getDate() != null) {
				if (date.equals(match.getDate())) {
					teamIds.add(match.getFirstTeam().getId());
					teamIds.add(match.getSecondTeam().getId());
				}
			}
		}
		return teamIds;
	}
}
