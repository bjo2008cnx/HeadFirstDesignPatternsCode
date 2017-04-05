package com.cfb.dp.chapter6.command.sample2;
/**
 * ������ȵ�����ߵ�λ������
 * @author fengbincao
 */
public class CeilingFanOnCommand implements Command {
	
	CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	public void execute() {
		ceilingFan.high();
	}
	
}