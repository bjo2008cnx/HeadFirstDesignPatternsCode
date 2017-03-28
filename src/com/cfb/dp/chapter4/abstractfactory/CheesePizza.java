package com.cfb.dp.chapter4.abstractfactory;

public class CheesePizza extends Pizza {

	PizzaIngredientFactory mPizzaIngredientFactory;
	

	public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.mPizzaIngredientFactory = pizzaIngredientFactory;
	}
	
	@Override
	void prepare() {
		System.out.println("Preparing " + name);
		dough = mPizzaIngredientFactory.createDough();
		sauce = mPizzaIngredientFactory.createSauce();
		cheese = mPizzaIngredientFactory.createCheese();
	}

}
