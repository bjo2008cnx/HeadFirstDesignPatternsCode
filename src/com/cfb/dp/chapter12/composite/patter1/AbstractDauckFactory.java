package com.cfb.dp.chapter12.composite.patter1;

public abstract class AbstractDauckFactory {

	/**
	 * 抽象工厂，可以生产一个鸭子的族
	 * @return
	 */
	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedHeadDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();
}
