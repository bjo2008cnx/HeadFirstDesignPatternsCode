package com.cfb.dp.chapter1;
/**
 * 对鸭子的行为进行测试的代码
 * @author Administrator
 *
 */
public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		// 测试使用模型鸭
		Duck model = new ModelDuck();
		model.performFly();
		// 运行时动态的改变行为
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}
