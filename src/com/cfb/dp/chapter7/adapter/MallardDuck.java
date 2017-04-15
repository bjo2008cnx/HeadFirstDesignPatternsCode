package com.cfb.dp.chapter7.adapter;
/**
 * 绿头鸭，真正的鸭子子类实现
 * @author fengbincao
 */
public class MallardDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("绿头鸭Quack");
	}

	@Override
	public void fly() {
		System.out.println("绿头鸭：I'm flying");
	}

}
