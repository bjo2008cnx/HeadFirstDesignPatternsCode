package com.cfb.dp.chapter3;
/**
 * ������������4:����
 * @author fengbincao
 *
 */
public class Caffe extends Drinks {

	public Caffe() {
		description = "����";
	}
	
	@Override
	public double cost() {
		return 1.99;
	}

}