package com.devworld.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	// Field Injection
	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
	//Constructor Injection
	/*
	 * @Autowired public TennisCoach(FortuneService theFortuneService) {
	 * fortuneService = theFortuneService; }
	 */
	
	// default constructor
	public TennisCoach() {
		System.out.println(">> inside default constructor");
	}
	
	// init method
	
	@PostConstruct
	void doMyInitStuff() {
		System.out.println("Do my startup stuff");
	}
	
	// destroy method
	@PreDestroy
	void doMyCleanupStuff() {
		System.out.println("CLEANING UP");
	}
	
	// Setter Injection
	/*
	 * @Autowired public void setFortuneService(FortuneService theFortuneService) {
	 * fortuneService = theFortuneService; }
	 */
	
	// Method Injection	
	/*
	 * @Autowired public void doCrazyStuff(FortuneService theFortuneService) {
	 * fortuneService = theFortuneService; }
	 */
	
	
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
