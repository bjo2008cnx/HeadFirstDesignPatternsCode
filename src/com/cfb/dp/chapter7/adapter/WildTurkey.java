package com.cfb.dp.chapter7.adapter;
/**
 * �𼦵ľ���ʵ����
 * @author fengbincao
 */
public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("��gobble");
	}

	@Override
	public void fly() {
		System.out.println("I'm flying a short distance");
	}

}
