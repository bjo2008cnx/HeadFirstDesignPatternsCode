package com.cfb.dp.chapter2;
/**
 * ����Subject����Ľӿ�
 * @author fengbincao
 */
public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver();
}
