package com.cfb.dp.chapter8.composite;

import java.util.Iterator;

/**
 * 客户端只操纵该对象即可以
 * @author fengbincao
 */
public abstract class MenuComponent {
	  
	// 下面三个方法是组合相关的基本操作
	public void add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	
	public void remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	
	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}
  
	
	// 下面是相关的操作方法，大部分是被菜单项使用
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
 
	// 菜单和菜单项
	public void print() {
		throw new UnsupportedOperationException();
	}
	
}