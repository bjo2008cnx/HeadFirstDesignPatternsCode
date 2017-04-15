package com.cfb.dp.chapter7.adapter;
/**
 * 火鸡的具体实现类
 * @author fengbincao
 */
public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("火鸡gobble");
	}

	@Override
	public void fly() {
		System.out.println("I'm flying a short distance");
	}

}
