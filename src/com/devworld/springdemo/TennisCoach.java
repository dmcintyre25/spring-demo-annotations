package com.devworld.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	// Field Injection
	@Autowired
	@Qualifier("randomFortuneService")
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
