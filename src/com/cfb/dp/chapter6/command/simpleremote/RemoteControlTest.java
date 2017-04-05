package com.cfb.dp.chapter6.command.simpleremote;
/**
 * 遥控器测试类代码
 * @author fengbincao
 */
public class RemoteControlTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		// 创建任务执行者
		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();
		
		// 定义所有类型的任务
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
		
		// setCommand
		remote.setCommant(lightOn);
		remote.buttonsWasPressed();
		
		// 任务执行
		remote.setCommant(lightOff);
		remote.buttonsWasPressed();
	}

}
