package com.cfb.dp.chapter12.composite.patter1;

public abstract class AbstractDauckFactory {

	/**
	 * ���󹤳�����������һ��Ѽ�ӵ���
	 * @return
	 */
	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedHeadDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();
}
