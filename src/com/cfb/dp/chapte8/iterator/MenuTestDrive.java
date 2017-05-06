package com.cfb.dp.chapte8.iterator;

public class MenuTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BreakfastMenu breakfastMenu = new BreakfastMenu();
		DinnerMenu dinnerMenu = new DinnerMenu();
		
		Waitress waitress = new Waitress(breakfastMenu, dinnerMenu);
		waitress.printMenu();
	}

}
