package com.cfb.dp.chapter12.composite.patter2;
/**
 * ʵ�������ʼ�صĽӿڷ���
 * @author fengbincao
 */
public interface HeartModelInterface {

	// ��ȡ�������ʶ�����BMP��ʵ���Ͽ��������һ����������������ͨ��������ģʽ��������Ӧ��չʾ
	int getHeartRate();
	
	// ������صķ������仯
	void registerObserver(BeatObserver o);
	void removeObserver(BeatObserver o);
	void registerObserver(BPMObserver o);
	void removeObserver(BPMObserver o);
	
}
