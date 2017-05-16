package com.cfb.dp.chapter12.composite.patter1;
/**
 * 鸭子类型2:红头鸭
 * @author fengbincao
 */
public class RedHeadDuck implements Quackable {

	@Override
	public void quack() {
		System.out.println("红头鸭 quack");
	}

}
