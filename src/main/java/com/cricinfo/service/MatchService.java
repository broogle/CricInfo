package com.cricinfo.service;

import java.util.List;
import java.util.Map;

import com.cricinfo.entities.Match;

public interface MatchService {

	List<Match> getAllMatches();
	
	List<Match> getLiveMatchScores();
	
	List<List<String>> getCWC2023PointTable();
}
