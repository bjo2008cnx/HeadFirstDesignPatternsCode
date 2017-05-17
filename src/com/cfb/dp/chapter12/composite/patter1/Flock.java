package com.cfb.dp.chapter12.composite.patter1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ͨ�����ģʽ����Ѽ�����ͽ���ͳһ�Ĺ���
 * @author fengbincao
 */
public class Flock implements Quackable {

	List<Quackable> quackers = new ArrayList<Quackable>();
	
	public void add(Quackable quack) {
		quackers.add(quack);
	}
	
	@Override
	public void quack() {
		// ͨ�����+��������ģʽ���б�������
		Iterator<Quackable> iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable quackable = iterator.next();
			quackable.quack();
		}
	}

}
