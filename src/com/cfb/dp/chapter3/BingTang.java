package com.cfb.dp.chapter3;
/**
 * 调料类型1:冰糖
 * @author fengbincao
 *
 */
public class BingTang extends CondimentDecorator {

	// 持有一个被装饰者的引用，通过构造器来注入
	Drinks beverage;			
	
	public BingTang(Drinks beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + "+冰糖";
	}

	@Override
	public double cost() {
		return .15 + beverage.cost();
	}

}

