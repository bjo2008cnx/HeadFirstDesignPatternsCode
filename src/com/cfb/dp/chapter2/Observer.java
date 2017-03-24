package com.cfb.dp.chapter2;
/**
 * 观察者对象的接口
 * @author fengbincao
 */
public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
