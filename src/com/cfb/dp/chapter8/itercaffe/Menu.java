package com.cfb.dp.chapter8.itercaffe;

import java.util.Iterator;

/**
 * 所有的菜单都需要实现的接口
 * @author fengbincao
 */
public interface Menu {
	// 这里使用java集合内置的迭代器Iterator
	public Iterator<MenuItem> createIterator();
}
