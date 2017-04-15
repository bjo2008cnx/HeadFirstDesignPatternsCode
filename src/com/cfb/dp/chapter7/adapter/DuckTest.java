package com.cfb.dp.chapter7.adapter;
/**
 * 测试文件
 * @author fengbincao
 */
public class DuckTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 鸭子
		MallardDuck duck = new MallardDuck();
		
		// 火鸡
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
		
		System.out.println("伪装的鸭子...");
		duckAdapter.quack();
		duckAdapter.fly();
	}

}
