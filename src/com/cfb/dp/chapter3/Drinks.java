package com.cfb.dp.chapter3;
/**
 * ���������࣬�����������͵Ļ���
 * ��֪���������ͺ͵������Ͷ��̳��Ը���Drinks
 * @author fengbincao
 *
 */
public abstract class Drinks {
	
	String description = "Unknown Drinks";
	
	public String getDescription() {
		return description;
	}
	
	/**
	 * ÿһ���������Ͷ���Ҫʵ�ֵķ����������Լ��ļ۸�
	 * @return
	 */
	public abstract double cost();
}
