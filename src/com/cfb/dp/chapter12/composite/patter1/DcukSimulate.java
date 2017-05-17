package com.cfb.dp.chapter12.composite.patter1;

public class DcukSimulate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DcukSimulate dcukSimulate = new DcukSimulate();
		AbstractDauckFactory duckFactory = new CountingDuckFactory();
		dcukSimulate.simulate(duckFactory);
		AbstractDauckFactory duckFactory2 = new NormalDuckFactory();
		dcukSimulate.simulate(duckFactory2);
	}

	void simulate(AbstractDauckFactory duckFactory) {
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redHeadDuck = duckFactory.createRedHeadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck = new GoseAdapter(new Gose());
		
		Flock flowsOfDuck = new Flock();
		
		System.out.println("模拟鸭子");
		
		flowsOfDuck.add(mallardDuck);
		flowsOfDuck.add(redHeadDuck);
		flowsOfDuck.add(duckCall);
		flowsOfDuck.add(rubberDuck);
		flowsOfDuck.add(gooseDuck);
		
		simulate(flowsOfDuck);
//		simulate(redHeadDuck);
//		simulate(duckCall);
//		simulate(rubberDuck);
//		simulate(gooseDuck);
		
		System.out.println("统计出来叫的次数为：" + QuackCounter.getNumberOfQuacke());
	}
	
	void simulate(Quackable quackable) {
		quackable.quack();
	}
}
