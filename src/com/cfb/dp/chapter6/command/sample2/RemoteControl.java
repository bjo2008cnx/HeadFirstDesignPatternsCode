package com.cfb.dp.chapter6.command.sample2;
/**
 * ң����ʵ����
 * @author fengbincao
 */
public class RemoteControl {

	Command[] onCommands;							// ����ť
	Command[] offCommands;							// �ذ�ť
	
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
	 * ��ָ��λ�ü��ؿ�������
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
