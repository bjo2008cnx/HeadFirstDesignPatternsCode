package com.cfb.dp.chapter6.command.sample2;
/**
 * 遥控器实现类
 * @author fengbincao
 */
public class RemoteControl {

	Command[] onCommands;							// 开按钮
	Command[] offCommands;							// 关按钮
	
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
 
		NoCommand noCommand = new NoCommand();
		
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	/**
	 * 给指定位置加载开关命令
	 * @param index
	 * @param onCommand
	 * @param offCommand
	 */
	public void setCommand(int index, Command onCommand, Command offCommand) {
		onCommands[index] = onCommand;
		offCommands[index] = offCommand;
	}
	
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
	}
 
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
	}
}
