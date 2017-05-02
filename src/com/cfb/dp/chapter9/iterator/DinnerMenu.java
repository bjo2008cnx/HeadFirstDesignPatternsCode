package com.cfb.dp.chapter8.iterator;
/**
 * ��͵�Ĳ˵�ʵ��
 * �ײ��������洢
 * @author fengbincao
 */
public class DinnerMenu {

	static final int MAX_ITEMS = 5;
	
	int numberOfItems = 0;
	
	MenuItem[] menuItems;
	
	public DinnerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		
		addItem("������",
				"(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
			
		addItem("��Ƥ����",
				"Bacon with lettuce & tomato on whole wheat", false, 2.99);
			
		addItem("�ཷ����",
				"Soup of the day, with a side of potato salad", false, 3.29);
			
		addItem("������",
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
	
	// �ɵķ���ȥ��
//	public MenuItem[] getMenuItems() {
//		return menuItems;
//	}
	
	// �����µĵ������ӿ�
	public Iterator createIterator() {
		return new DinnerMenuIterator(menuItems);
	}
}
