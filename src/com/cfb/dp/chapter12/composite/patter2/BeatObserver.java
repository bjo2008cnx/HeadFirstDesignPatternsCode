package com.cfb.dp.chapter12.composite.patter2;
/**
 * 每一个节拍变化了之后都会被通知
 * @author fengbincao
 */
public interface BeatObserver {
	void updateBeat();
}
