package com.cfb.dp.chapter7.adapter;
/**
 * ��ͷѼ��������Ѽ������ʵ��
 * @author fengbincao
 */
public class MallardDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("��ͷѼQuack");
	}

	@Override
	public void fly() {
		System.out.println("��ͷѼ��I'm flying");
	}

}
