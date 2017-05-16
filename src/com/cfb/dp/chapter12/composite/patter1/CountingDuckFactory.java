package com.cfb.dp.chapter12.composite.patter1;
/**
 * 该工厂返回被计数器装饰过的鸭子种族
 * @author fengbincao
 */
public class CountingDuckFactory extends AbstractDauckFactory {

	@Override
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}

	@Override
	public Quackable createRedHeadDuck() {
		return new QuackCounter(new RedHeadDuck());
	}

	@Override
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}

	@Override
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}

}

