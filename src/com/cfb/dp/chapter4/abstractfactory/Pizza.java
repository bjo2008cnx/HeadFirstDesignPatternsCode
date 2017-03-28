package com.cfb.dp.chapter4.abstractfactory;
/**
 * 抽象的披萨类型
 * @author fengbincao
 */
public abstract class Pizza {

	String name;
	
	// 做披萨所需要的六种原料类型
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	
	/**
	 * 准备的方法交给每个工厂自己去实现
	 */
	abstract void prepare();
	
	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

}
