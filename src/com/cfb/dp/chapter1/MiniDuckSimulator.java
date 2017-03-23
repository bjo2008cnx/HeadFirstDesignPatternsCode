package com.cfb.dp.chapter1;
/**
 * ��Ѽ�ӵ���Ϊ���в��ԵĴ���
 * @author Administrator
 *
 */
public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		// ����ʹ��ģ��Ѽ
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}
