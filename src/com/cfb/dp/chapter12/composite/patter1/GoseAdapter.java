package com.cfb.dp.chapter12.composite.patter1;
/**
 * 为鹅类型提供的适配器类
 * @author fengbincao
 */
public class GoseAdapter implements Quackable {

	Gose gose;
	
	public GoseAdapter(Gose gose) {
		this.gose = gose;
	}
	
	@Override
	public void quack() {
		// 委托给鹅类型本身的honk方法来执行
		gose.honk();
	}

}
