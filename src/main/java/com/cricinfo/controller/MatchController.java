package com.cricinfo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricinfo.config.AppConstants;
import com.cricinfo.entities.Match;
import com.cricinfo.service.MatchService;

@RestController
@RequestMapping(AppConstants.MATCH)
public class MatchController {

	private MatchService matchService;

	public MatchController(MatchService matchService) {
		super();
		this.matchService = matchService;
	}

	@GetMapping(AppConstants.LIVE)
	public ResponseEntity<List<Match>> getLiveMatches() {

		return new ResponseEntity<>(this.matchService.getLiveMatchScores(), HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<Match>> getAllMatches() {

		return new ResponseEntity<>(this.matchService.getAllMatches(), HttpStatus.OK);
	}

	@GetMapping(AppConstants.POINTS_TABLE)
	public ResponseEntity<?> getPointTable() {

		return new ResponseEntity<>(this.matchService.getCWC2023PointTable(), HttpStatus.OK);
	}

}
