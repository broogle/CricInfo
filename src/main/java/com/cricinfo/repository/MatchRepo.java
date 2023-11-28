package com.cricinfo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricinfo.entities.Match;

public interface MatchRepo extends JpaRepository<Match, Integer> {

	Optional<Match> findByTeamHeading(String teamHeading);
}
