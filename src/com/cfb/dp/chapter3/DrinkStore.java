package com.cfb.dp.chapter3;
/**
 * ��Ʒ�̵꣬�������е��������͵Ĺ�Ӧ
 * @author fengbincao
 *
 */
public class DrinkStore {

	public static void main(String[] args) {
		Drinks drink = new GreenTea();
		System.out.println(drink.getDescription() + ":�۸�$" + drink.cost());
		
		Drinks drink2 = new Caffe();
		drink2 = new BingTang(drink2);
		drink2 = new NaiXi(drink2);
		System.out.println(drink2.getDescription() + ":�۸�$" + drink2.cost());
		
		Drinks drink3 = new RedTea();
		drink3 = new NingMeng(drink3);
		System.out.println(drink3.getDescription() + ":�۸�$" + drink3.cost());
	}

}
