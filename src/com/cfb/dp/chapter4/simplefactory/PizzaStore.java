package com.cfb.dp.chapter4.simplefactory;
/**
 * �����꣬ʹ�ù������������Ŀͻ���
 * @author fengbincao
 *
 */
public class PizzaStore {
	
	private SimplePizzaFactory factory;
	
	/**
	 * �ڴ���ʱע�빤����
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
