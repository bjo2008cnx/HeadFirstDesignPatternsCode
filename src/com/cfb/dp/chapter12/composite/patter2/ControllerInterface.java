package com.cfb.dp.chapter12.composite.patter2;
/**
 * 控制器部分的接口方法
 * 控制器实际上是策略模式的实现
 * @author fengbincao
 */
public interface ControllerInterface {

	// 控制器中需要提供的相关方法列表
	void start();
	void stop();
	void increaseBPM();
	void decreaseBPM();
 	void setBPM(int bpm);
 	
}
