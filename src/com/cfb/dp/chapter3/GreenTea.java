package com.cfb.dp.chapter3;
/**
 * ������������2���̲�
 * @author fengbincao
 *
 */
public class GreenTea extends Drinks {

	public GreenTea() {
		description = "�̲�";
	}
	
	@Override
	public double cost() {
		return 1.05;
	}

}