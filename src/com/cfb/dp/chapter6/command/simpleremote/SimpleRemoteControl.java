package com.cfb.dp.chapter6.command.simpleremote;
/**
 * ң�������͵�ʵ����
 * @author fengbincao
 */
public class SimpleRemoteControl {

	// ң������������е�����������������һ��װ��
	Command slot;
	
	public SimpleRemoteControl() {
		
	}
	
	/**
	 * �÷����������ò������ ������ͻ������޸Ŀ�����������ͣ�
	 * ���Զ�ε�������
	 * @param command
	 */
	public void setCommant(Command command) {
		this.slot = command;
	}
	
	public void buttonsWasPressed() {
		slot.execute();
	}
}
