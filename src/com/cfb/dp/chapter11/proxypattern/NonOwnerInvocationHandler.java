package com.cfb.dp.chapter11.proxypattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 别人访问的代理控制
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
				// get方法永远可以访问
				return method.invoke(person, args);
   			} else if(method.getName().equals("setHotOrNotRating")) {
   				// 别人给自己打分是允许的
   				return method.invoke(person, args);
   			} else if(method.getName().startsWith("set")) {
   				//别人不能设置自己的基本信息
   				throw new IllegalAccessException();
   			}
		} catch (InvocationTargetException e) {
            e.printStackTrace();
        } 
		return null;
	}

}
