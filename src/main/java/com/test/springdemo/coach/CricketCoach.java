package com.test.springdemo.coach;

import com.test.springdemo.fortune.IFortuneService;

public class CricketCoach implements ICoach {

	IFortuneService fortuneService;
	
	String name;
	String emailId;
	Long contact;
	short age;
	

	@Override
	public void getDailyWorkout(){
		System.out.println("Practice spin bowling...");
	}

	@Override
	public int getWorkoutDuration() {
		return 40;
	}
	
	@Override
	public void getDailyFortune() {
		fortuneService.getDailyFortune();
	}
	
	public void setFortuneService(IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}

	public short getAge() {
		return age;
	}

	public void setAge(short age) {
		this.age = age;
	}

	public IFortuneService getFortuneService() {
		return fortuneService;
	}

	@Override
	public void showCoachInfo() {
		System.out.println("CricketCoach [name=" + name + ", emailId=" + emailId
				+ ", contact=" + contact + ", age=" + age + "]");
	}

	
	public void doInit() {
		System.out.println("[INITIALIZATION] doInit called... Can be used to initialize, calling custom business logics, setting up handles to resources such as db, socket, files, etc...");
	}
	
	public void doDestroy() {
		System.out.println("[DESTRUCTION] doDestroy called... Can be used to destroy, calling custom business logics, clearing up handles such as db, socket, files, etc...");
	}
}
