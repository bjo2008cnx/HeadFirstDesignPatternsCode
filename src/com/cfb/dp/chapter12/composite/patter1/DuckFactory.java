package com.cfb.dp.chapter12.composite.patter1;
/**
 * 该工厂生成一个没有被装饰过的鸭子的种族
 * @author fengbincao
 */
public class DuckFactory extends AbstractDauckFactory {

	@Override
	public Quackable createMallardDuck() {
		return new MallardDuck();
	}

	@Override
	public Quackable createRedHeadDuck() {
		return new RedHeadDuck();
	}

	@Override
	public Quackable createDuckCall() {
		return new DuckCall();
	}

	@Override
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}

}
