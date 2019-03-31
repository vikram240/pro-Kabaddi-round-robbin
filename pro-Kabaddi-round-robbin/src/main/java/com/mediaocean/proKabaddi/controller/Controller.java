package com.mediaocean.proKabaddi.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mediaocean.proKabaddi.common.Match;
import com.mediaocean.proKabaddi.common.Team;
import com.mediaocean.proKabaddi.common.dao.TeamDao;
import com.mediaocean.proKabaddi.common.dao.impl.TeamDaoImpl;
import com.mediaocean.proKabaddi.controller.schedule.MatchScheduler;
import com.mediaocean.proKabaddi.controller.schedule.impl.MatchSchedularImpl;

@RestController
public class Controller {

	TeamDao teamDao= new TeamDaoImpl();
	MatchScheduler matchScheduler= new MatchSchedularImpl();
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hi";
	}
	
	@GetMapping("/allTeams")
	public HashMap<Integer, Team> getAllTeams(){
		return (HashMap<Integer, Team>) (teamDao.getAllTeams());
	}
	
	@GetMapping("/schedule")
	public List<Match> getAllMatches(){
		return matchScheduler.generateSchedule(teamDao.getAllTeams());
	}
	
	
	@GetMapping("/scheduleDetails")
	public StringBuilder getAllMatches1(){
		List<Match> allMatches=matchScheduler.generateSchedule(teamDao.getAllTeams());
		
		StringBuilder schedule= new StringBuilder();
		schedule.append("     Team1   vs     Team2    --> Location  ---> Date \n ");
		schedule.append("\n");
		schedule.append("====================================================================================");
		schedule.append("\n");
		schedule.append(System.getProperty("line.separator"));
		for(Match m: allMatches) {
			schedule.append("     "+m.getFirstTeam().getName()+" vs "+m.getSecondTeam().getName()+" --> "+m.getLocation()+" ---> "+m.getDate()+"  ");
			schedule.append("\n");
		}
		System.out.println(schedule);
		
		return schedule;
	}
}
