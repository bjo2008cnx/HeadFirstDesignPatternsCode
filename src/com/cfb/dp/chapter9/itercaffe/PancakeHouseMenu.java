package com.cfb.dp.chapter8.itercaffe;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * 第一个菜单类型，早餐店的菜单
 * @author fengbincao
 */
public class PancakeHouseMenu implements Menu {

	// 底层数据结构用ArrayList
	ArrayList<MenuItem> menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();
    
		addItem("K&B's Pancake Breakfast", 
			"Pancakes with scrambled eggs, and toast", 
			true,
			2.99);
 
		addItem("Regular Pancake Breakfast", 
			"Pancakes with fried eggs, sausage", 
			false,
			2.99);
 
		addItem("Blueberry Pancakes",
			"Pancakes made with fresh blueberries, and blueberry syrup",
			true,
			3.49);
 
		addItem("Waffles",
			"Waffles, with your choice of blueberries or strawberries",
			true,
			3.59);
	}

	public void addItem(String name, String description,
            boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	
	// 返回支持的迭代器集合
	@Override
	public Iterator<MenuItem> createIterator() {
		return menuItems.iterator();
	}

}
