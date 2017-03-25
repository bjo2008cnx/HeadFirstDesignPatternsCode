package com.cfb.dp.chapter3;
/**
 * 调料类型4:柠檬
 * @author fengbincao
 *
 */
public class NingMeng extends CondimentDecorator {

	Drinks beverage;
	
	public NingMeng(Drinks beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + "+柠檬";
	}

	@Override
	public double cost() {
		return .10 + beverage.cost();
	}

}

