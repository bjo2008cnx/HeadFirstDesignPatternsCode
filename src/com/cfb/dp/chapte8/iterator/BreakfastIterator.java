package com.cfb.dp.chapte8.iterator;

import java.util.ArrayList;

public class BreakfastIterator implements Iterator {

	ArrayList<MenuItem> menuItems;
	
	int positon = 0;
	
	public BreakfastIterator(ArrayList<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}
	
	@Override
	public boolean hasNext() {
		if(positon >= menuItems.size() || menuItems.get(positon) == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem menuItem = menuItems.get(positon);
		positon += 1;
		return menuItem;
	}

}
