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
		System.out.println("ͨ��owner proxy�������Լ�����Ȥ");
		
		try {
			ownerProxy.setHotOrNotRating(10);
		} catch (Exception e) {
			System.out.println("�Լ����ܸ��Լ����");
		}
		
		System.out.println();
		
		PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
		System.out.println("Name is " + nonOwnerProxy.getName());
		try {
			nonOwnerProxy.setInterests("bowling, Go");
		} catch (Exception e) {
			System.out.println("����ͨ��non owner proxy������Ȥ");
		}
		nonOwnerProxy.setHotOrNotRating(3);
		System.out.println("Rating set from non owner proxy");
		System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
	}
	
	/**
	 * �����Լ������Լ�ʱ�Ĵ���
	 * @param person
	 * @return
	 */
	PersonBean getOwnerProxy(PersonBean person) {
		return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
				person.getClass().getInterfaces(), 
				new OwnerInvocationHandler(person));
	}
	
	/**
	 * ���ر��˷����Լ�ʱ�Ĵ���
	 * @param person
	 * @return
	 */
	PersonBean getNonOwnerProxy(PersonBean person) {
		return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
				person.getClass().getInterfaces(), 
				new NonOwnerInvocationHandler(person));
	}
	
	/**
	 * �������ֵõ�����Bean
	 * @param name
	 * @return
	 */
	PersonBean getPersonFromDatabase(String name) {
		return (PersonBean)datingDB.get(name);
	}
	
	/**
	 * ��ʼ�����е��˵Ļ�����Ϣ����
	 */
	void initializeDatabase() {
		// ��һ����
		PersonBean joe = new PersonBeanImpl();
		joe.setName("Joe Javabean");
		joe.setInterests("cars, computers, music");
		joe.setHotOrNotRating(7);
		
		datingDB.put(joe.getName(), joe);
		
		// �ڶ�����
		PersonBean kelly = new PersonBeanImpl();
		kelly.setName("Kelly Klosure");
		kelly.setInterests("ebay, movies, music");
		kelly.setHotOrNotRating(6);
		
		datingDB.put(kelly.getName(), kelly);
	}
}
