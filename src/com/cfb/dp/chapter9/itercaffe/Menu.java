package com.cfb.dp.chapter8.itercaffe;

import java.util.Iterator;

/**
 * ���еĲ˵�����Ҫʵ�ֵĽӿ�
 * @author fengbincao
 */
public interface Menu {
	// ����ʹ��java�������õĵ�����Iterator
	public Iterator<MenuItem> createIterator();
}
