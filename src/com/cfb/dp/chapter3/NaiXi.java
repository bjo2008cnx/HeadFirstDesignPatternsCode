package com.cfb.dp.chapter3;
/**
 * 调料类型3:奶昔
 * @author fengbincao
 *
 */
public class NaiXi extends CondimentDecorator {

	Drinks beverage;
	
	public NaiXi(Drinks beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + "+奶昔";
	}

	@Override
	public double cost() {
		return .20 + beverage.cost();
	}

}

