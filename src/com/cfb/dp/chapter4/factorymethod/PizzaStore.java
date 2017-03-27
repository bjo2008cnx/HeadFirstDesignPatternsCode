package com.cfb.dp.chapter4.factorymethod;
/**
 * 披萨工厂类型
 * @author Administrator
 *
 */
public abstract class PizzaStore {

	/**
	 * 现在实例化披萨的操作交给一个具体的方法去执行，
	 * 此方法就如同是一个工厂
	 * @param item
	 * @return
	 */
	abstract Pizza createPizza(String item);
	
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
