package com.cfb.dp.chapter6.command.sample2;
/**
 * 关电风扇的命令
 * @author fengbincao
 */
public class CeilingFanOffCommand implements Command {

	CeilingFan ceilingFan;

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	public void execute() {
		ceilingFan.off();
	}
	
}
