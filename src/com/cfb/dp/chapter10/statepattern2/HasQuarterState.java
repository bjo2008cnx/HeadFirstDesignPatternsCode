package com.cfb.dp.chapter10.statepattern2;
/**
 * �б�״̬
 * @author fengbincao
 */
public class HasQuarterState implements State {

	GumballMachine gumballMachine;
	
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		// ��ǰ״̬�µĲ�ǡ������
		System.out.println("You can't insert another quarter");
	}

	@Override
	public void ejectQuarter() {
		// �˱Ҳ���������״̬�ı�1
		System.out.println("Quarter returned");
		this.gumballMachine.setStatue(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		// �ᶯ��ť����������״̬�ı�2
		System.out.println("You turned...");
		this.gumballMachine.setStatue(gumballMachine.getSoldState());
	}

	@Override
	public void dispense() {
		// ��ǰ״̬�µĲ�ǡ������
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
