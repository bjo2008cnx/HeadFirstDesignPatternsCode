package com.cfb.dp.chapter6.command.simpleremote;
/**
 * 实现的第一个命令
 * 打开电灯
 * @author fengbincao
 */
public class LightOnCommand implements Command {

	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.on();
	}

}
