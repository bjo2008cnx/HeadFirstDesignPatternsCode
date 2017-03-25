package com.cfb.dp.chapter3;
/**
 * 饮品商店，测试所有的饮料类型的供应
 * @author fengbincao
 *
 */
public class DrinkStore {

	public static void main(String[] args) {
		Drinks drink = new GreenTea();
		System.out.println(drink.getDescription() + ":价格$" + drink.cost());
		
		Drinks drink2 = new Caffe();
		drink2 = new BingTang(drink2);
		drink2 = new NaiXi(drink2);
		System.out.println(drink2.getDescription() + ":价格$" + drink2.cost());
		
		Drinks drink3 = new RedTea();
		drink3 = new NingMeng(drink3);
		System.out.println(drink3.getDescription() + ":价格$" + drink3.cost());
	}

}
