package com.test.springdemo.fortune;

public class HappyFortuneService implements IFortuneService {

	@Override
	public void getDailyFortune() {
		System.out.println("[GOOD FORTUNE] Today is a lucky day. You will succeed.");
	}

}
