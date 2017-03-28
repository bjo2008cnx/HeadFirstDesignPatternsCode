package com.cfb.dp.chapter4.abstractfactory;
/**
 * ԭ�Ϲ�������
 * ÿһ���������Ͷ������Լ�ʵ���������
 * @author fengbincao
 *
 */
public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClams();
}
