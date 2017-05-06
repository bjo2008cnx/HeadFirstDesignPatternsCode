package com.cfb.dp.chapter10.statepattern3;

/**
 * ��������״̬�Ľӿ�
 * ��Щ����ֱ��Ӱ�䵽�ǹ����Ͽ��ܷ����Ķ���
 * ��֮ǰ�������һ��
 * @author fengbincao
 */
public interface State {

	// Ͷ�ҷ���
	public void insertQuarter();
	
	// �˱ҷ���
	public void ejectQuarter();
	
	// ��ת��ť����
	public void turnCrank();
	
	// ��������
	public void dispense();
	
	// �����ǹ����ķ���
	public void refill();
	
}
