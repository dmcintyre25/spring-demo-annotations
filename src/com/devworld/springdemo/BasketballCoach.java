package com.devworld.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Shoot 100 freethrows";
	}

	@Override
	public String getDailyFortune() {
	
		return "testing 2";
	}

}
