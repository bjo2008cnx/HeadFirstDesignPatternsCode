package com.cfb.dp.chapter10.statepattern3;

import java.util.Random;

/**
 * �б�״̬
 * �����µ�״̬��������Ҫ����һ���ı䶯
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
		// ����ᴥ�������ܽ���Ӯ��ģʽ
		System.out.println("You turned...");
		int number = randomWinner.nextInt(10);
		if(number == 1 && gumballMachine.getCount() > 1) {
			// ����Ӯ��ģʽ
			this.gumballMachine.setStatue(gumballMachine.getWinnerState());
		} else {
			// ��ͨ������ģʽ
			this.gumballMachine.setStatue(gumballMachine.getSoldState());
		}
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
