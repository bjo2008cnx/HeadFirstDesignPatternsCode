package com.cfb.dp.chapter10.statepattern3;
/**
 * 待投币状态
 * @author fengbincao
 */
public class NoQuarterState implements State {

	GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		// 正常的进行投币
		System.out.println("You inserted a quarter");
		// 切换状态至有币状态
		gumballMachine.setStatue(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned, but there's no quarter");
	}

	@Override
	public void dispense() {
		System.out.println("You need to pay first");
	}

	@Override
	public void refill() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "waiting for quarter";
	}
}
