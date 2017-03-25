package com.cfb.dp.chapter3;
/**
 * ��������1:����
 * @author fengbincao
 *
 */
public class BingTang extends CondimentDecorator {

	// ����һ����װ���ߵ����ã�ͨ����������ע��
	Drinks beverage;			
	
	public BingTang(Drinks beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + "+����";
	}

	@Override
	public double cost() {
		return .15 + beverage.cost();
	}

}

