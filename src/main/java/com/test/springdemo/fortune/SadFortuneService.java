package com.test.springdemo.fortune;

public class SadFortuneService implements IFortuneService {

	@Override
	public void getDailyFortune() {
		System.out.println("[BAD FORTUNE] Today is a bad day. Be careful with your performance!");
	}

}
