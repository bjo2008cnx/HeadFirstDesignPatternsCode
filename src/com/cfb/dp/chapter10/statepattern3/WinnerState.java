package com.cfb.dp.chapter10.statepattern3;
/**
 * �����ӵ�Ӯ��ģʽ
 * �����ģʽ����һ�β��������ǹ�����
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
		System.out.println("��ϲ��������Ӯ��ģʽ");
		this.gumballMachine.releaseBall();
		
		if(gumballMachine.getCount() == 0) {
			// �����ϲ����ڸ����
			gumballMachine.setStatue(gumballMachine.getSoldOutState());
		} else {
			// �ٳ�һ���ǹ�
			this.gumballMachine.releaseBall();
			if(gumballMachine.getCount() > 0) {
				// �����Ͷ��״̬
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
