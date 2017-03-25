package com.cfb.dp.chapter3;
/**
 * 基本饮料类型3：奶茶
 * @author fengbincao
 *
 */
public class MilkTea extends Drinks {

	public MilkTea() {
		description = "奶茶";
	}
	
	@Override
	public double cost() {
		return 0.99;
	}

}
