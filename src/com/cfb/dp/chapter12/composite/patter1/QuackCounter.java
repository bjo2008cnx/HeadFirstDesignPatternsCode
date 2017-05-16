package com.cfb.dp.chapter12.composite.patter1;
/**
 * �����ӵ�һ��װ���ߣ�����ͳ�����ɽеĴ�����װ����
 * @author fengbincao
 */
public class QuackCounter implements Quackable {

	static int numberOfQuacke;
	
	Quackable duck;
	
	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}
	
	@Override
	public void quack() {
		duck.quack();
		numberOfQuacke++;
	}

	/**
	 * ��ȡ��ͳ�ƵĴ���
	 * @return
	 */
	public static int getNumberOfQuacke() {
		return numberOfQuacke;
	}
}
