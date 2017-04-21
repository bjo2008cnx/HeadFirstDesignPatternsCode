package com.cfb.dp.chapter8.iterator;
/**
 * 午餐店的菜单实现
 * 底层采用数组存储
 * @author fengbincao
 */
public class DinnerMenu {

	static final int MAX_ITEMS = 5;
	
	int numberOfItems = 0;
	
	MenuItem[] menuItems;
	
	public DinnerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		
		addItem("地三鲜",
				"(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
			
		addItem("虎皮鸡蛋",
				"Bacon with lettuce & tomato on whole wheat", false, 2.99);
			
		addItem("青椒炒肉",
				"Soup of the day, with a side of potato salad", false, 3.29);
			
		addItem("蛋花汤",
				"Steamed vegetables over brown rice", true, 3.99);
	}
	
	public void addItem(String name, String description,
            boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if(numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full!  Can't add item to menu");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems += 1;
		}
	}
	
	// 旧的方法去掉
//	public MenuItem[] getMenuItems() {
//		return menuItems;
//	}
	
	// 返回新的迭代器接口
	public Iterator createIterator() {
		return new DinnerMenuIterator(menuItems);
	}
}
