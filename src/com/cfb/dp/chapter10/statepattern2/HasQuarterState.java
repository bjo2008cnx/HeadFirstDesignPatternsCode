package com.cfb.dp.chapter10.statepattern2;
/**
 * 有币状态
 * @author fengbincao
 */
public class HasQuarterState implements State {

	GumballMachine gumballMachine;
	
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		// 当前状态下的不恰当动作
		System.out.println("You can't insert another quarter");
	}

	@Override
	public void ejectQuarter() {
		// 退币操作，发生状态改变1
		System.out.println("Quarter returned");
		this.gumballMachine.setStatue(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		// 搬动按钮操作，发生状态改变2
		System.out.println("You turned...");
		this.gumballMachine.setStatue(gumballMachine.getSoldState());
	}

	@Override
	public void dispense() {
		// 当前状态下的不恰当动作
		System.out.println("No gumball dispensed");
	}

	@Override
	public void refill() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "waiting for turn of crank";
	}
}
