package com.cfb.dp.chapter10.statepattern1;
/**
 * 旧版的糖果机
 * 不通过状态模式实现
 * @author fengbincao
 */
public class GumballMachine {

	// 定义糖果机的四种状态
	final static int SOLD_OUT = 0;
	final static int NO_QUARTER = 1;
	final static int HAS_QUARTER = 2;
	final static int SOLD = 3;
	
	// 定义初始的状态
	int state = SOLD_OUT;		
	int count = 0;
	
	public GumballMachine(int count) {
		this.count = count;
		if(count > 0) {
			state = NO_QUARTER;
		}
	}
	
	// 接口方法1：投币操作
	public void insertQuarter() {
		switch (state) {
		case SOLD_OUT:
			System.out.println("You can't insert a quarter, the machine is sold out");
			break;
		case NO_QUARTER:
			// 未投币状态下进行投币操作，成功
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
	
	// 接口方法2：退币操作
	public void ejectQuarter() {
		switch (state) {
		case SOLD_OUT:
			System.out.println("You can't eject, you haven't inserted a quarter yet");
			break;
		case NO_QUARTER:
			System.out.println("You haven't inserted a quarter");
			break;
		case HAS_QUARTER:
			// 可以成功退币，改变状态
			System.out.println("Quarter returned");
			state = NO_QUARTER;
			break;
		case SOLD:
			// 出货中，无法退币
			System.out.println("Sorry, you already turned the crank");
			break;
		}
	}
	
	// 接口方法3：转动按钮，出货操作
	public void turnCrank() {
		switch (state) {
		case SOLD_OUT:
			System.out.println("You turned, but there are no gumballs");
			break;
		case NO_QUARTER:
			System.out.println("You turned but there's no quarter");
			break;
		case HAS_QUARTER:
			// 有币操作，成功出货
			System.out.println("You turned...");
			state = SOLD;
			// 调用出货的方法
			dispense();
			break;
		case SOLD:
			System.out.println("Turning twice doesn't get you another gumball!");
			break;
		}
	}
	
	// 接口方法4：出货操作
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
			System.out.println("成功售出一枚糖果");
			count -= 1;
			if (count == 0) {
				System.out.println("糖果卖完了!");
				state = SOLD_OUT;
			} else {
				// 进入待机状态
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
		result.append("库存数: " + count + "个糖果");
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
