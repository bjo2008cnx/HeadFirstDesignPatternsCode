package com.cfb.dp.chapter12.composite.patter2;
/**
 * ���ʼ���������������
 * ͬ������Ҫʵ��BeatModelInterface�ӿڵķ���
 * @author fengbincao
 */
public class HeartAdapter implements BeatModelInterface {

	// ��Ҫ�������е�Model������
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
