package com.cfb.dp.chapter6.command.simpleremote;

/**
 * ʵ�ֵĵڶ�������
 * �رյ��
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