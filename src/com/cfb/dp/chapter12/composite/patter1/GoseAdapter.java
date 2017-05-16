package com.cfb.dp.chapter12.composite.patter1;
/**
 * Ϊ�������ṩ����������
 * @author fengbincao
 */
public class GoseAdapter implements Quackable {

	Gose gose;
	
	public GoseAdapter(Gose gose) {
		this.gose = gose;
	}
	
	@Override
	public void quack() {
		// ί�и������ͱ����honk������ִ��
		gose.honk();
	}

}
