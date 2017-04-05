package com.cfb.dp.chapter6.command.simpleremote;
/**
 * 对GarageDoor类型提供的第一个命令实现
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
