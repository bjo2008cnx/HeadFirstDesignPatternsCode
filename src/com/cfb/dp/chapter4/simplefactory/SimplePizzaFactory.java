package com.cfb.dp.chapter4.simplefactory;
/**
 * 一个简单工厂模式的具体使用示例
 * @author fengbincao
 *
 */
public class SimplePizzaFactory {
	
	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
