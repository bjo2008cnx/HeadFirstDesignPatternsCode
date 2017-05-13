package com.cfb.dp.chapter11.proxypattern;

import java.lang.reflect.Proxy;
import java.util.HashMap;

public class MatchMakingTestDrive {

	HashMap<String, PersonBean> datingDB = new HashMap<String, PersonBean>();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MatchMakingTestDrive test = new MatchMakingTestDrive();
		test.drive();
	}

	public MatchMakingTestDrive() {
		initializeDatabase();
	}
	
	public void drive() {
		PersonBean joe = getPersonFromDatabase("Joe Javabean"); 
		
		PersonBean ownerProxy = getOwnerProxy(joe);
		System.out.println("Name is " + ownerProxy.getName());
		
		ownerProxy.setInterests("bowling, Go");
		System.out.println("通过owner proxy设置了自己的兴趣");
		
		try {
			ownerProxy.setHotOrNotRating(10);
		} catch (Exception e) {
			System.out.println("自己不能给自己打分");
		}
		
		System.out.println();
		
		PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
		System.out.println("Name is " + nonOwnerProxy.getName());
		try {
			nonOwnerProxy.setInterests("bowling, Go");
		} catch (Exception e) {
			System.out.println("不能通过non owner proxy设置兴趣");
		}
		nonOwnerProxy.setHotOrNotRating(3);
		System.out.println("Rating set from non owner proxy");
		System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
	}
	
	/**
	 * 返回自己访问自己时的代理
	 * @param person
	 * @return
	 */
	PersonBean getOwnerProxy(PersonBean person) {
		return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
				person.getClass().getInterfaces(), 
				new OwnerInvocationHandler(person));
	}
	
	/**
	 * 返回别人访问自己时的代理
	 * @param person
	 * @return
	 */
	PersonBean getNonOwnerProxy(PersonBean person) {
		return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
				person.getClass().getInterfaces(), 
				new NonOwnerInvocationHandler(person));
	}
	
	/**
	 * 根据名字得到对象Bean
	 * @param name
	 * @return
	 */
	PersonBean getPersonFromDatabase(String name) {
		return (PersonBean)datingDB.get(name);
	}
	
	/**
	 * 初始化所有的人的基本信息部分
	 */
	void initializeDatabase() {
		// 第一个人
		PersonBean joe = new PersonBeanImpl();
		joe.setName("Joe Javabean");
		joe.setInterests("cars, computers, music");
		joe.setHotOrNotRating(7);
		
		datingDB.put(joe.getName(), joe);
		
		// 第二个人
		PersonBean kelly = new PersonBeanImpl();
		kelly.setName("Kelly Klosure");
		kelly.setInterests("ebay, movies, music");
		kelly.setHotOrNotRating(6);
		
		datingDB.put(kelly.getName(), kelly);
	}
}
