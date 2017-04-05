package com.cfb.dp.chapter6.command.sample2;
/**
 * 将电风扇调到最高档位的命令
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