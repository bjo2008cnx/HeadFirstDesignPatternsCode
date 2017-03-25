package com.cfb.dp.chapter3;
/**
 * ��������2:����
 * @author fengbincao
 *
 */
public class BuDing extends CondimentDecorator {

	Drinks beverage;
	
	public BuDing(Drinks beverage) {
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
