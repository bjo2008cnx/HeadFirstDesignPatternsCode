package com.cfb.dp.chapter10.statepattern3;
/**
 * ���ǹ�״̬
 * @author fengbincao
 */
public class SoldState implements State {

	GumballMachine gumballMachine;
	
	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		// ��ǰ״̬�µĲ�ǡ������
		System.out.println("Please wait, we're already giving you a gumball");
	}

	@Override
	public void ejectQuarter() {
		// ��ǰ״̬�µĲ�ǡ������
		System.out.println("Sorry, you already turned the crank");
	}

	@Override
	public void turnCrank() {
		// ��ǰ״̬�µĲ�ǡ������
		System.out.println("Turning twice doesn't get you another gumball!");
	}

	@Override
	public void dispense() {
		// ��ǰ״̬�ĺ��Ĳ���
		this.gumballMachine.releaseBall();
		if(this.gumballMachine.getCount() > 0) {
			gumballMachine.setStatue(gumballMachine.getNoQuarterState());
		} else {
			gumballMachine.setStatue(gumballMachine.getSoldOutState());
		}
	}

	@Override
	public void refill() {
		// ��ǰ״̬�µĲ�ǡ������
		
	}

	public String toString() {
		return "dispensing a gumball";
	}
}
