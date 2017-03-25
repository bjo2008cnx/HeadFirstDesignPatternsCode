package com.cfb.dp.chapter3;
/**
 * ��������4:����
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
		return beverage.getDescription() + "+����";
	}

	@Override
	public double cost() {
		return .10 + beverage.cost();
	}

}

