package com.cfb.dp.chapter6.command.simpleremote;
/**
 * 电器厂提供的第一个类型的家电
 * @author fengbincao
 */
public class Light {

	public Light() {
		
	}
	
	/**
	 * 厂商提供的开方法
	 */
	public void on() {
		System.out.println("Light is on");
	}
	
	/**
	 * 厂商提供的关方法
	 */
	public void off() {
		System.out.println("Light is off");
	}
}
