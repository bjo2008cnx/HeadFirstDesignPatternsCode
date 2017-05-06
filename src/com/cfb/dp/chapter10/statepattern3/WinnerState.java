package com.cfb.dp.chapter10.statepattern3;
/**
 * 新增加的赢家模式
 * 进入该模式，会一次产生两个糖果出来
 * @author fengbincao
 */
public class WinnerState implements State {

	private GumballMachine gumballMachine;
	 
    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    
	@Override
	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a Gumball");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Please wait, we're already giving you a Gumball");
	}

	@Override
	public void turnCrank() {
		System.out.println("Turning again doesn't get you another gumball!");
	}

	@Override
	public void dispense() {
		System.out.println("恭喜您进入了赢家模式");
		this.gumballMachine.releaseBall();
		
		if(gumballMachine.getCount() == 0) {
			// 理论上不存在该情况
			gumballMachine.setStatue(gumballMachine.getSoldOutState());
		} else {
			// 再出一个糖果
			this.gumballMachine.releaseBall();
			if(gumballMachine.getCount() > 0) {
				// 进入待投币状态
				gumballMachine.setStatue(gumballMachine.getNoQuarterState());
			} else {
				System.out.println("Oops, out of gumballs!");
				gumballMachine.setStatue(gumballMachine.getSoldOutState());
			}
		}
		
	}

	@Override
	public void refill() {
		// TODO Auto-generated method stub
		
	}

	public String toString() {
		return "despensing two gumballs for your quarter, because YOU'RE A WINNER!";
	}
}
