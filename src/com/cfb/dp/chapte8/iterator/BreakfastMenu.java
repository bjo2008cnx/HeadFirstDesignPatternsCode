package com.cfb.dp.chapte8.iterator;

import java.util.ArrayList;

/**
 * ��͵�Ĳ˵�
 * �ײ����ArrayList
 * @author fengbincao
 */
public class BreakfastMenu {
	
	ArrayList<MenuItem> menuItems;
	
	public BreakfastMenu() {
		menuItems = new ArrayList<MenuItem>();

		addItem("�������", 
				"Pancakes with scrambled eggs, and toast", 
				true,
				2.99);
		
		addItem("���㳦", 
				"Pancakes with fried eggs, sausage", 
				false,
				2.99);
	 
		addItem("֥ʿ���",
				"Pancakes made with fresh blueberries",
				true,
				3.49);
	 
		addItem("����",
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
	
	// �����µĵ������ӿ�
	public Iterator createIterator() {
		return new BreakfastIterator(menuItems);
	}
}
