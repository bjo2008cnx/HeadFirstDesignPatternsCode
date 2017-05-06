package com.cfb.dp.chapter10.statepattern1;

public class GumballMachineTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		GumballMachine gumballMachine = new GumballMachine(5);
		
		System.out.print(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		System.out.print(gumballMachine);
		
		// Õ∂±“‘ŸÕÀ±“≤‚ ‘
		gumballMachine.insertQuarter();
		gumballMachine.ejectQuarter();
		gumballMachine.turnCrank();
		
		System.out.print(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.ejectQuarter();
		
		System.out.print(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
		
	}

}
