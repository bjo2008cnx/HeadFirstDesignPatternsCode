package com.cfb.dp.chapter8.composite;

import java.util.Iterator;

/**
 * �ͻ���ֻ���ݸö��󼴿���
 * @author fengbincao
 */
public abstract class MenuComponent {
	  
	// �������������������صĻ�������
	public void add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	
	public void remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	
	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}
  
	
	// ��������صĲ����������󲿷��Ǳ��˵���ʹ��
	public String getName() {
		throw new UnsupportedOperationException();
	}
	
	public String getDescription() {
		throw new UnsupportedOperationException();
	}
	
	public double getPrice() {
		throw new UnsupportedOperationException();
	}
	
	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}

	//public abstract Iterator<MenuComponent> createIterator();
 
	// �˵��Ͳ˵���
	public void print() {
		throw new UnsupportedOperationException();
	}
	
}