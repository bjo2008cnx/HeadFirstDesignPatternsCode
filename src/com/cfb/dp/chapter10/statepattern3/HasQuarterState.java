package com.cfb.dp.chapter10.statepattern3;

import java.util.Random;

/**
 * 有币状态
 * 引入新的状态后，这里需要进行一定的变动
 * @author fengbincao
 */
public class HasQuarterState implements State {

	private Random randomWinner = new Random(System.currentTimeMillis());
	
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
		// 这里会触发，可能进入赢家模式
		System.out.println("You turned...");
		int number = randomWinner.nextInt(10);
		if(number == 1 && gumballMachine.getCount() > 1) {
			// 进入赢家模式
			this.gumballMachine.setStatue(gumballMachine.getWinnerState());
		} else {
			// 普通的卖出模式
			this.gumballMachine.setStatue(gumballMachine.getSoldState());
		}
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
