package com.cfb.dp.chapter10.statepattern1;
/**
 * �ɰ���ǹ���
 * ��ͨ��״̬ģʽʵ��
 * @author fengbincao
 */
public class GumballMachine {

	// �����ǹ���������״̬
	final static int SOLD_OUT = 0;
	final static int NO_QUARTER = 1;
	final static int HAS_QUARTER = 2;
	final static int SOLD = 3;
	
	// �����ʼ��״̬
	int state = SOLD_OUT;		
	int count = 0;
	
	public GumballMachine(int count) {
		this.count = count;
		if(count > 0) {
			state = NO_QUARTER;
		}
	}
	
	// �ӿڷ���1��Ͷ�Ҳ���
	public void insertQuarter() {
		switch (state) {
		case SOLD_OUT:
			System.out.println("You can't insert a quarter, the machine is sold out");
			break;
		case NO_QUARTER:
			// δͶ��״̬�½���Ͷ�Ҳ������ɹ�
			state = HAS_QUARTER;
			System.out.println("You inserted a quarter");
			break;
		case HAS_QUARTER:
			System.out.println("You can't insert another quarter");
			break;
		case SOLD:
			System.out.println("Please wait, we're already giving you a gumball");
			break;
		}
	}
	
	// �ӿڷ���2���˱Ҳ���
	public void ejectQuarter() {
		switch (state) {
		case SOLD_OUT:
			System.out.println("You can't eject, you haven't inserted a quarter yet");
			break;
		case NO_QUARTER:
			System.out.println("You haven't inserted a quarter");
			break;
		case HAS_QUARTER:
			// ���Գɹ��˱ң��ı�״̬
			System.out.println("Quarter returned");
			state = NO_QUARTER;
			break;
		case SOLD:
			// �����У��޷��˱�
			System.out.println("Sorry, you already turned the crank");
			break;
		}
	}
	
	// �ӿڷ���3��ת����ť����������
	public void turnCrank() {
		switch (state) {
		case SOLD_OUT:
			System.out.println("You turned, but there are no gumballs");
			break;
		case NO_QUARTER:
			System.out.println("You turned but there's no quarter");
			break;
		case HAS_QUARTER:
			// �бҲ������ɹ�����
			System.out.println("You turned...");
			state = SOLD;
			// ���ó����ķ���
			dispense();
			break;
		case SOLD:
			System.out.println("Turning twice doesn't get you another gumball!");
			break;
		}
	}
	
	// �ӿڷ���4����������
	public void dispense() {
		switch (state) {
		case SOLD_OUT:
			System.out.println("No gumball dispensed");
			break;
		case NO_QUARTER:
			System.out.println("You need to pay first");
			break;
		case HAS_QUARTER:
			System.out.println("No gumball dispensed");
			break;
		case SOLD:
			System.out.println("�ɹ��۳�һö�ǹ�");
			count -= 1;
			if (count == 0) {
				System.out.println("�ǹ�������!");
				state = SOLD_OUT;
			} else {
				// �������״̬
				state = NO_QUARTER;
			}
			break;
		}
	}
	
	/**
	 * init the machine by numGumBalls
	 * @param numGumBalls   the number of gumballs
	 */
	public void refill(int numGumBalls) {
		this.count = numGumBalls;
		state = NO_QUARTER;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004\n");
		result.append("�����: " + count + "���ǹ�");
		result.append("\nMachine is ");
		if (state == SOLD_OUT) {
			result.append("sold out");
		} else if (state == NO_QUARTER) {
			result.append("waiting for quarter");
		} else if (state == HAS_QUARTER) {
			result.append("waiting for turn of crank");
		} else if (state == SOLD) {
			result.append("delivering a gumball");
		}
		result.append("\n");
		return result.toString();
	}
}
