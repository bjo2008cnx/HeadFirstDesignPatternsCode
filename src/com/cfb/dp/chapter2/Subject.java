package com.cfb.dp.chapter2;
/**
 * 主题Subject对象的接口
 * @author fengbincao
 */
public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver();
}
