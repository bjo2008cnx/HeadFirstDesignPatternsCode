package com.cfb.dp.chapter4.factorymethod;
/**
 * ���������Ĳ����ļ�
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

		// �ֱ������������������Ҫ��pizza����
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = chicageStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
		
	}

}
