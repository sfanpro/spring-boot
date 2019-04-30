package com.goodteam.springboot.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	@Value("${coach.name}")
	private String coachName;

	@Value("${team.name}")
	private String teamName;

	// expose new endpoinnt for "teampoint"
	@GetMapping("/teaminfo")
	public String getTeamInfo() {
		return "Coach: " + coachName + ", Team name: " + teamName;
	}

	// expose "/" that return "Good Morning"
	@GetMapping("/")
	public String sayGoodMorning() {
		return "Good morning! Time on server is " + LocalDateTime.now();
	}

	// expose a new endpoint for "workout"
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Be happy!";
	}

	// expose a new endpoint for "fortune"
	@GetMapping("/fortune")
	public String getDailyFortune() {
		return "Today is your day of breakthrough!";
	}

}
