package com.cfb.dp.chapter4.simplefactory;
/**
 * 披萨店，使用工厂进行生产的客户端
 * @author fengbincao
 *
 */
public class PizzaStore {
	
	private SimplePizzaFactory factory;
	
	/**
	 * 在创建时注入工厂类
	 * @param factory
	 */
	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		pizza = factory.createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}
}
