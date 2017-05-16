package com.cfb.dp.chapter12.composite.patter1;
/**
 * �ù�������һ��û�б�װ�ι���Ѽ�ӵ�����
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
