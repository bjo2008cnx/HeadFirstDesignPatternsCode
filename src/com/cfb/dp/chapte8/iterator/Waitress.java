package com.cfb.dp.chapte8.iterator;

public class Waitress {

	BreakfastMenu breakfastMenu;
	DinnerMenu dinnerMenu;
	
	public Waitress(BreakfastMenu breakfastMenu,DinnerMenu dinnerMenu) {
		this.breakfastMenu = breakfastMenu;
		this.dinnerMenu = dinnerMenu;
	}
	
	public void printMenu() {
		Iterator breakfastIterator = breakfastMenu.createIterator();
		Iterator dinnerIterator = dinnerMenu.createIterator();
		System.out.println("Ôç²Í²Ëµ¥");
		printlnMenu(breakfastIterator);
		System.out.println();
		System.out.println("Îç²Í²Ëµ¥");
		printlnMenu(dinnerIterator);
		System.out.println();
	}
	
	private void printlnMenu(Iterator iterator) {
		while(iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.println(menuItem.getName());
			System.out.println(menuItem.getPrice());
		}
	}
}
