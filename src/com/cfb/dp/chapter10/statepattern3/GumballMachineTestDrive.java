package com.cfb.dp.chapter10.statepattern3;

public class GumballMachineTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(10);
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println();
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println();
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println();
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println();
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println();
		
		System.out.println(gumballMachine);
	}

}
