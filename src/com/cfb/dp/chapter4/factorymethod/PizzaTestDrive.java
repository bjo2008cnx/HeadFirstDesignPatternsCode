package com.cfb.dp.chapter4.factorymethod;
/**
 * 工厂方法的测试文件
 * @author Administrator
 *
 */
public class PizzaTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicageStore = new ChicagoPizzaStore();

		// 分别调用两个工厂创建需要的pizza类型
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = chicageStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
		
	}

}
