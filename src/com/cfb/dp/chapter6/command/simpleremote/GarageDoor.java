package com.cfb.dp.chapter6.command.simpleremote;
/**
 * 厂商提供的第二个家电类型
 * @author fengbincao
 */
public class GarageDoor {

	public GarageDoor() {
	}
	
	// 出厂时自带的命令1
	public void up() {
		System.out.println("Garage Door is Open");
	}

	// 出厂时自带的命令2
	public void down() {
		System.out.println("Garage Door is Closed");
	}

	// 出厂时自带的命令3
	public void stop() {
		System.out.println("Garage Door is Stopped");
	}

	// 出厂时自带的命令4
	public void lightOn() {
		System.out.println("Garage light is on");
	}

	// 出厂时自带的命令5
	public void lightOff() {
		System.out.println("Garage light is off");
	}
}
