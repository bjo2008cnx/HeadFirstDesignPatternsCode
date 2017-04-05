package com.cfb.dp.chapter6.command.simpleremote;
/**
 * ʵ�ֵĵ�һ������
 * �򿪵��
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
