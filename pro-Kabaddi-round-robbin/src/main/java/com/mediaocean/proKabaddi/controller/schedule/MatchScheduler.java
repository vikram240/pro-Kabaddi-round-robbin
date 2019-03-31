package com.mediaocean.proKabaddi.controller.schedule;

import java.util.List;
import java.util.Map;

import com.mediaocean.proKabaddi.common.Match;
import com.mediaocean.proKabaddi.common.Team;

public interface MatchScheduler {
	
	List<Match> generateSchedule(Map<Integer, Team> allTeams);
}
