package com.cfb.dp.chapter11.proxypattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ���˷��ʵĴ������
 * @author fengbincao
 */
public class NonOwnerInvocationHandler implements InvocationHandler {

	PersonBean person;
	 
	public NonOwnerInvocationHandler(PersonBean person) {
		this.person = person;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		try {
			if (method.getName().startsWith("get")) {
				// get������Զ���Է���
				return method.invoke(person, args);
   			} else if(method.getName().equals("setHotOrNotRating")) {
   				// ���˸��Լ�����������
   				return method.invoke(person, args);
   			} else if(method.getName().startsWith("set")) {
   				//���˲��������Լ��Ļ�����Ϣ
   				throw new IllegalAccessException();
   			}
		} catch (InvocationTargetException e) {
            e.printStackTrace();
        } 
		return null;
	}

}
