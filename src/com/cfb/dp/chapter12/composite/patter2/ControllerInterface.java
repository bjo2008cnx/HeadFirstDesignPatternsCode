package com.cfb.dp.chapter12.composite.patter2;
/**
 * ���������ֵĽӿڷ���
 * ������ʵ�����ǲ���ģʽ��ʵ��
 * @author fengbincao
 */
public interface ControllerInterface {

	// ����������Ҫ�ṩ����ط����б�
	void start();
	void stop();
	void increaseBPM();
	void decreaseBPM();
 	void setBPM(int bpm);
 	
}
