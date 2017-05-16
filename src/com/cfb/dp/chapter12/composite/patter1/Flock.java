package com.cfb.dp.chapter12.composite.patter1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ͨ�����ģʽ����Ѽ�����ͽ���ͳһ�Ĺ���
 * @author fengbincao
 */
public class Flock implements Quackable {

	ArrayList quackers = new ArrayList();
	
	public void add(Quackable quack) {
		quackers.add(quack);
	}
	
	@Override
	public void quack() {
		// ͨ�����+��������ģʽ���б�������
		Iterator iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable quackable = (Quackable) iterator.next();
			quackable.quack();
		}
	}

}
