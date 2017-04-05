package com.cfb.dp.chapter6.command.sample2;
/**
 * 出厂家电类型1：灯泡
 * @author fengbincao
 */
public class Light {

	String location = "";

	public Light(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + " light is on");
	}

	public void off() {
		System.out.println(location + " light is off");
	}
	
}
