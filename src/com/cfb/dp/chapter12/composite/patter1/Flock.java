package com.cfb.dp.chapter12.composite.patter1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 通过组合模式来对鸭子类型进行统一的管理
 * @author fengbincao
 */
public class Flock implements Quackable {

	ArrayList quackers = new ArrayList();
	
	public void add(Quackable quack) {
		quackers.add(quack);
	}
	
	@Override
	public void quack() {
		// 通过组合+迭代器的模式进行遍历管理
		Iterator iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable quackable = (Quackable) iterator.next();
			quackable.quack();
		}
	}

}
