package com.cfb.dp.chapter6.command.simpleremote;
/**
 * ��GarageDoor�����ṩ�ĵ�һ������ʵ��
 * @author fengbincao
 */
public class GarageDoorOpenCommand implements Command {

	GarageDoor garageDoor;
	
	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		garageDoor.up();
	}

}
