package com.cfb.dp.chapter4.abstractfactory;
/**
 * �������������
 * @author fengbincao
 */
public abstract class Pizza {

	String name;
	
	// ����������Ҫ������ԭ������
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	
	/**
	 * ׼���ķ�������ÿ�������Լ�ȥʵ��
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
