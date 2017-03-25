package com.cfb.dp.chapter3;
/**
 * 抽象饮料类，所有饮料类型的基类
 * 须知，饮料类型和调料类型都继承自该类Drinks
 * @author fengbincao
 *
 */
public abstract class Drinks {
	
	String description = "Unknown Drinks";
	
	public String getDescription() {
		return description;
	}
	
	/**
	 * 每一种饮料类型都需要实现的方法，返回自己的价格
	 * @return
	 */
	public abstract double cost();
}
