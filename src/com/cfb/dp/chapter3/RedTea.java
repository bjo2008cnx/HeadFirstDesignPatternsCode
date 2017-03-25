package com.cfb.dp.chapter3;
/**
 * 基本饮料类型1：红茶
 * @author fengbincao
 *
 */
public class RedTea extends Drinks {

	public RedTea() {
		description = "红茶";
	}
	
	@Override
	public double cost() {
		return 0.89;
	}

}
