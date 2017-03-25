package com.cfb.dp.chapter3;
/**
 * 基本饮料类型4:咖啡
 * @author fengbincao
 *
 */
public class Caffe extends Drinks {

	public Caffe() {
		description = "咖啡";
	}
	
	@Override
	public double cost() {
		return 1.99;
	}

}