package com.cfb.dp.chapter3;
/**
 * ��������3:����
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
		return beverage.getDescription() + "+����";
	}

	@Override
	public double cost() {
		return .20 + beverage.cost();
	}

}

