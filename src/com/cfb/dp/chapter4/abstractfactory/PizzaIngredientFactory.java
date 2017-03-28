package com.cfb.dp.chapter4.abstractfactory;
/**
 * 原料工厂方法
 * 每一个工厂类型都必须自己实现这个工厂
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
