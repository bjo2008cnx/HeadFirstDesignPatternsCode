package com.cfb.dp.chapter6.command.simpleremote;
/**
 * �����ṩ�ĵڶ����ҵ�����
 * @author fengbincao
 */
public class GarageDoor {

	public GarageDoor() {
	}
	
	// ����ʱ�Դ�������1
	public void up() {
		System.out.println("Garage Door is Open");
	}

	// ����ʱ�Դ�������2
	public void down() {
		System.out.println("Garage Door is Closed");
	}

	// ����ʱ�Դ�������3
	public void stop() {
		System.out.println("Garage Door is Stopped");
	}

	// ����ʱ�Դ�������4
	public void lightOn() {
		System.out.println("Garage light is on");
	}

	// ����ʱ�Դ�������5
	public void lightOff() {
		System.out.println("Garage light is off");
	}
}
