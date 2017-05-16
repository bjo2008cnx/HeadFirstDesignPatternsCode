package com.cfb.dp.chapter12.composite.patter1;

public class DcukSimulate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DcukSimulate dcukSimulate = new DcukSimulate();
		dcukSimulate.simulate();
	}

	void simulate() {
		Quackable mallardDuck = new MallardDuck();
		Quackable redHeadDuck = new RedHeadDuck();
		Quackable duckCall = new DuckCall();
		Quackable rubberDuck = new RubberDuck();
		
		System.out.println("Ä£ÄâÑ¼×Ó");
		
		simulate(mallardDuck);
		simulate(redHeadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
	}
	
	void simulate(Quackable quackable) {
		quackable.quack();
	}
}
