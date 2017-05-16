package com.cfb.dp.chapter12.composite.patter1;
/**
 * 新增加的一个装饰者，用来统计呱呱叫的次数的装饰类
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
	 * 获取所统计的次数
	 * @return
	 */
	public static int getNumberOfQuacke() {
		return numberOfQuacke;
	}
}
