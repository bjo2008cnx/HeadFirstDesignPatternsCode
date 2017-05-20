package com.cfb.dp.chapter12.composite.patter2;
/**
 * 心率监听器的适配器类
 * 同样的需要实现BeatModelInterface接口的方法
 * @author fengbincao
 */
public class HeartAdapter implements BeatModelInterface {

	// 需要持有现有的Model层数据
	HeartModelInterface heart;
	
	public HeartAdapter(HeartModelInterface heart) {
		this.heart = heart;
	}
	
	@Override
	public void initialize() {
		
	}

	@Override
	public void on() {
		
	}

	@Override
	public void off() {
		
	}

	@Override
	public void setBPM(int bpm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getBPM() {
		return heart.getHeartRate();
	}

	@Override
	public void registerObserver(BeatObserver o) {
		heart.registerObserver(o);
	}

	@Override
	public void removeObserver(BeatObserver o) {
		heart.removeObserver(o);
	}

	@Override
	public void registerObserver(BPMObserver o) {
		heart.registerObserver(o);
	}

	@Override
	public void removeObserver(BPMObserver o) {
		heart.removeObserver(o);
	}

}
