package com.cfb.dp.chapter3;
/**
 * 调料类型2:布丁
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
		return beverage.getDescription() + "+布丁";
	}

	@Override
	public double cost() {
		return .10 + beverage.cost();
	}

}
