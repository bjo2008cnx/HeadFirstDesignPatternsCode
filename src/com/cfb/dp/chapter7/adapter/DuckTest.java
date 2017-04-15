package com.cfb.dp.chapter7.adapter;
/**
 * �����ļ�
 * @author fengbincao
 */
public class DuckTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ѽ��
		MallardDuck duck = new MallardDuck();
		
		// ��
		WildTurkey turkey = new WildTurkey();
		
		Duck duckAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("The turkey says...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println();
		
		System.out.println("The duck says...");
		duck.quack();
		duck.fly();
		
		System.out.println();
		
		System.out.println("αװ��Ѽ��...");
		duckAdapter.quack();
		duckAdapter.fly();
	}

}
