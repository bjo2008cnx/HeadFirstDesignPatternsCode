package com.cfb.dp.chapter3;
/**
 * 基本饮料类型2：绿茶
 * @author fengbincao
 *
 */
public class GreenTea extends Drinks {

	public GreenTea() {
		description = "绿茶";
	}
	
	@Override
	public double cost() {
		return 1.05;
	}

}