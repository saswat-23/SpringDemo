package com.test.springdemo.coach;

import com.test.springdemo.fortune.IFortuneService;

public class BaseballCoach implements ICoach{

	IFortuneService fortuneService;
	
	public BaseballCoach(IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public void getDailyWorkout(){
		System.out.println("Practice baseball batting");
	}

	@Override
	public int getWorkoutDuration() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public void getDailyFortune() {
		fortuneService.getDailyFortune();
	}

	@Override
	public void showCoachInfo() {
		System.out.println("No Info available at the moment for Baseball Coach..");
	}
	
}
