package com.cfb.dp.chapter10.statepattern3;
/**
 * 卖糖果状态
 * @author fengbincao
 */
public class SoldState implements State {

	GumballMachine gumballMachine;
	
	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		// 当前状态下的不恰当动作
		System.out.println("Please wait, we're already giving you a gumball");
	}

	@Override
	public void ejectQuarter() {
		// 当前状态下的不恰当动作
		System.out.println("Sorry, you already turned the crank");
	}

	@Override
	public void turnCrank() {
		// 当前状态下的不恰当动作
		System.out.println("Turning twice doesn't get you another gumball!");
	}

	@Override
	public void dispense() {
		// 当前状态的核心操作
		this.gumballMachine.releaseBall();
		if(this.gumballMachine.getCount() > 0) {
			gumballMachine.setStatue(gumballMachine.getNoQuarterState());
		} else {
			gumballMachine.setStatue(gumballMachine.getSoldOutState());
		}
	}

	@Override
	public void refill() {
		// 当前状态下的不恰当动作
		
	}

	public String toString() {
		return "dispensing a gumball";
	}
}
