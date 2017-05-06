package com.cfb.dp.chapter10.statepattern2;

public class GumballMachineTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(2);
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
		
		gumballMachine.refill(5);
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);

	}

}
