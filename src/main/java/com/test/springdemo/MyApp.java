package com.test.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.springdemo.coach.ICoach;

public class MyApp {

	public static void main(String[] args) {
		
		// Use the default Java approach
//		useDefaultJavaConfig();
		
		
		// Use the Spring XML Config. approach
		useSpringXmlConfig();
		
		
		// Use the Spring Java Config. approach
//		useSpringJavaConfig();

	}
	
	
	static void useDefaultJavaConfig() {
		
		// Java Object Creation 
//		=======================
		//Baseball Coaching
//		BaseballCoach myCoach = new BaseballCoach();
//		myCoach.getDailyWorkout();
//		
//		//Cricket Coaching
//		CricketCoach myCoach2 = new CricketCoach();
//		myCoach2.getDailyWorkout();
//
//		//Football Coaching
//		FootballCoach myCoach3 = new FootballCoach();
//		myCoach3.getDailyWorkout();
		
		//Better Approach
//		ICoach coach = new BaseballCoach();
//		myCoach.getDailyWorkout();
	}

	
	static void useSpringXmlConfig() {
		
//		Spring Object Creation - XML Configuration
//		==========================================
		
		// 1. Create Spring Context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		// 2. Get the required bean from the Spring context
		ICoach coach = context.getBean("myCoach", ICoach.class);
		
		// 3. Perform the required operation on the bean
		coach.getDailyWorkout();
		System.out.println("For "+coach.getWorkoutDuration()+" mins");
		coach.getDailyFortune();
		coach.showCoachInfo();
		System.out.println("coach hash#: "+coach.hashCode());
		
		System.out.println("\n\n");
		// Create another coach object from the same context
		ICoach coach2 = context.getBean("myCoach", ICoach.class);
		System.out.println("coach2 hash#: "+coach2.hashCode());
		
		// Compare the hash of both the coach objects.
		System.out.println("coach == coach2? => "+coach.equals(coach2));
		
		// 4. Close the Spring Context
		context.close();
	}
	
	static void useSpringJavaConfig() {
		
//		Spring Object Creation - Java Configuration
//		==========================================
		
		
	}
	
}
