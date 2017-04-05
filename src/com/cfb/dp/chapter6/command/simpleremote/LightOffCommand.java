package com.cfb.dp.chapter6.command.simpleremote;

/**
 * 实现的第二个命令
 * 关闭电灯
 * @author fengbincao
 */
public class LightOffCommand implements Command {
	
	Light light;
 
	public LightOffCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
		light.off();
	}
}