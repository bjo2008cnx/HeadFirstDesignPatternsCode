package com.cfb.dp.chapter8.iterator;

public class DinnerMenuIterator implements Iterator {

	MenuItem[] menuItems;
	
	int positon = 0;
	
	// 构造器需要被传入一个菜单项的数组当参数
	public DinnerMenuIterator(MenuItem[] menuItems) {
		this.menuItems = menuItems;
	}
	
	@Override
	public boolean hasNext() {
		if(positon >= menuItems.length || menuItems[positon] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem menuItem = menuItems[positon];
		positon += 1;
		return menuItem;
	}

}
