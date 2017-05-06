package com.cfb.dp.chapter10.statepattern3;

/**
 * 定义所有状态的接口
 * 这些方法直接影射到糖果机上可能发生的动作
 * 和之前代码里的一样
 * @author fengbincao
 */
public interface State {

	// 投币方法
	public void insertQuarter();
	
	// 退币方法
	public void ejectQuarter();
	
	// 旋转按钮方法
	public void turnCrank();
	
	// 出货方法
	public void dispense();
	
	// 重置糖果机的方法
	public void refill();
	
}
