package com.cfb.dp.chapter11.proxypattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 自己调用自己时的代理
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
				// 不允许自己给自己打分
				throw new IllegalAccessException();
			} else if(method.getName().startsWith("set")) {
				// 其他的set方法自己可以自己设置
				return method.invoke(person, args);
			}
		} catch (InvocationTargetException e) {
            e.printStackTrace();
        } 
		return null;
	}

}
