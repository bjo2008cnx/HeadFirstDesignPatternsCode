package com.cfb.dp.chapter4.factorymethod;
/**
 * 芝加哥分店的披萨工厂
 * 可以生产如下四种类型的披萨
 * @author Administrator
 *
 */
public class ChicagoPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
    	if (item.equals("cheese")) {
        		return new ChicagoStyleCheesePizza();
    	} else if (item.equals("veggie")) {
    	    	return new ChicagoStyleVeggiePizza();
    	} else if (item.equals("clam")) {
    	    	return new ChicagoStyleClamPizza();
    	} else if (item.equals("pepperoni")) {
        		return new ChicagoStylePepperoniPizza();
    	} else return null;
	}

}
