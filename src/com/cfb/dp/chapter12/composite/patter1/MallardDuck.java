package com.cfb.dp.chapter12.composite.patter1;
/**
 * 鸭子类型1:
 * @author fengbincao
 */
public class MallardDuck implements Quackable {

	@Override
	public void quack() {
		System.out.println("毛头鸭 quack");
	}

}
