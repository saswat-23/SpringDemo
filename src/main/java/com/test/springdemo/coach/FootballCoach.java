package com.test.springdemo.coach;

import com.test.springdemo.fortune.IFortuneService;

public class FootballCoach implements ICoach {

IFortuneService fortuneService;
	
	public FootballCoach(IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public void getDailyWorkout() {
		System.out.println("Practice driblling ");
	}

	@Override
	public int getWorkoutDuration() {
		// TODO Auto-generated method stub
		return 35;
	}
	
	@Override
	public void getDailyFortune() {
		fortuneService.getDailyFortune();
	}

	@Override
	public void showCoachInfo() {
		System.out.println("No Info available at the moment for Football Coach..");
	}
}
