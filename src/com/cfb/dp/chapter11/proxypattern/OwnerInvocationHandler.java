package com.cfb.dp.chapter11.proxypattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * �Լ������Լ�ʱ�Ĵ���
 * @author fengbincao
 */
public class OwnerInvocationHandler implements InvocationHandler {

	PersonBean person;
	
	public OwnerInvocationHandler(PersonBean person) {
		this.person = person;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		try {
			if (method.getName().startsWith("get")) {
				return method.invoke(person, args);
			} else if(method.getName().equals("setHotOrNotRating")) {
				// �������Լ����Լ����
				throw new IllegalAccessException();
			} else if(method.getName().startsWith("set")) {
				// ������set�����Լ������Լ�����
				return method.invoke(person, args);
			}
		} catch (InvocationTargetException e) {
            e.printStackTrace();
        } 
		return null;
	}

}
