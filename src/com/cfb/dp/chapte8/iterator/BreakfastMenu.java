package com.cfb.dp.chapte8.iterator;

import java.util.ArrayList;

/**
 * 早餐店的菜单
 * 底层采用ArrayList
 * @author fengbincao
 */
public class BreakfastMenu {
	
	ArrayList<MenuItem> menuItems;
	
	public BreakfastMenu() {
		menuItems = new ArrayList<MenuItem>();

		addItem("鸡蛋煎饼", 
				"Pancakes with scrambled eggs, and toast", 
				true,
				2.99);
		
		addItem("烤香肠", 
				"Pancakes with fried eggs, sausage", 
				false,
				2.99);
	 
		addItem("芝士面包",
				"Pancakes made with fresh blueberries",
				true,
				3.49);
	 
		addItem("包子",
				"Waffles, with your choice of blueberries or strawberries",
				true,
				3.59);
	}
	
	public void addItem(String name, String description,
            boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	
//	public ArrayList<MenuItem> getMenuItems() {
//		return menuItems;
//	}
	
	// 返回新的迭代器接口
	public Iterator createIterator() {
		return new BreakfastIterator(menuItems);
	}
}
