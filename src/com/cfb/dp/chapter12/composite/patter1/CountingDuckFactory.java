package com.cfb.dp.chapter12.composite.patter1;
/**
 * �ù������ر�������װ�ι���Ѽ������
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

