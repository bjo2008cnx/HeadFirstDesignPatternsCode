package com.cfb.dp.chapter6.command.simpleremote;
/**
 * ң�������������
 * @author fengbincao
 */
public class RemoteControlTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		// ��������ִ����
		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();
		
		// �����������͵�����
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
		
		// setCommand
		remote.setCommant(lightOn);
		remote.buttonsWasPressed();
		
		// ����ִ��
		remote.setCommant(lightOff);
		remote.buttonsWasPressed();
	}

}
