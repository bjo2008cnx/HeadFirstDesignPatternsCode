package com.cfb.dp.chapter6.command.simpleremote;
/**
 * 遥控器类型的实现类
 * @author fengbincao
 */
public class SimpleRemoteControl {

	// 遥控器插槽所持有的命令，而该命令控制着一个装置
	Command slot;
	
	public SimpleRemoteControl() {
		
	}
	
	/**
	 * 该方法用来设置插槽命令 ，如果客户端想修改控制命令的类型，
	 * 可以多次调用设置
	 * @param command
	 */
	public void setCommant(Command command) {
		this.slot = command;
	}
	
	public void buttonsWasPressed() {
		slot.execute();
	}
}
