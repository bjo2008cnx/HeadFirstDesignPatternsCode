package com.cfb.dp.chapter10.statepattern3;

import com.cfb.dp.chapter10.statepattern3.HasQuarterState;
import com.cfb.dp.chapter10.statepattern3.NoQuarterState;
import com.cfb.dp.chapter10.statepattern3.SoldOutState;
import com.cfb.dp.chapter10.statepattern3.SoldState;
import com.cfb.dp.chapter10.statepattern3.State;
/**
 * 新的机器，
 * 增加了赢家模式
 * @author fengbincao
 */
public class GumballMachine {
	
	private State soldOutState;
	private State noQuarterState;
	private State hasQuarterState;
	private State soldState;
	private State winnerState;
	
	// 当前糖果机的状态
	private State currentState;
	private int count = 0;
	
	public GumballMachine(int numberGumballs) {
		
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
				
		this.count = numberGumballs;
		
		// 初始化当前的状态值
		if (numberGumballs > 0) {
			currentState = noQuarterState;
		} else {
			currentState = soldOutState;
		}
	}
	
	public void insertQuarter() {
		currentState.insertQuarter();
	}
	
	public void ejectQuarter() {
		currentState.ejectQuarter();
	}
	
	public void turnCrank() {
		currentState.turnCrank();
		currentState.dispense();
	}
	
	/**
	 * 机器售出糖果的操作
	 */
	public void releaseBall() {
		System.out.println("机器成功售出一枚糖果...");
		if (count != 0) {
			count = count - 1;
		}
	}
	
	public void refill(int count) {
		this.count += count;
		System.out.println("The gumball machine was just refilled; it's new count is: " + this.count);
		currentState.refill();
	}
	
	/**
	 * 切换糖果机至指定的状态
	 * @param state		指定状态值
	 */
	public void setStatue(State state) {
		this.currentState = state;
	}
	
	public State getState() {
        return currentState;
    }
	
	int getCount() {
		return count;
	}

	public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }
    
    public State getWinnerState() {
        return winnerState;
    }
    
    @Override
    public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + currentState + "\n");
		return result.toString();
	}
}
