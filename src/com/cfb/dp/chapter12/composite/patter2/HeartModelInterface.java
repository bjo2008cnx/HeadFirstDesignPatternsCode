package com.cfb.dp.chapter12.composite.patter2;
/**
 * 实现新心率监控的接口方法
 * @author fengbincao
 */
public interface HeartModelInterface {

	// 获取的是心率而不是BMP，实际上可以想象成一个方法，后续我们通过适配器模式来进行相应的展示
	int getHeartRate();
	
	// 监听相关的方法不变化
	void registerObserver(BeatObserver o);
	void removeObserver(BeatObserver o);
	void registerObserver(BPMObserver o);
	void removeObserver(BPMObserver o);
	
}
