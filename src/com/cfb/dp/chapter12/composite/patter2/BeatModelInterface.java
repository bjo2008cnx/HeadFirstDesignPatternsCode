package com.cfb.dp.chapter12.composite.patter2;
/**
 * ���Ŀ���Model��Ľӿڷ���
 * @author fengbincao
 */
public interface BeatModelInterface {

	// ���������õ�4���������£�
	
	// (1) ��ʼ������
	void initialize();
	
	// (2) ��
	void on();
	
	// (3) �ر�
	void off();
	  
	// (4) ֱ�����ý��ĵ�ֵ
    void setBPM(int bpm);
    
    // �����������View���ȡ״̬��Ϣ�ķ���,�����Գ�Ϊ�۲���
    int getBPM();
    
    // �۲������������֣�һ����ÿ�����ı仯�˶���õ�֪ͨ��һ����ֻ��BMP�仯�˲Żᱻ֪ͨ
    void registerObserver(BeatObserver o);
    
	void removeObserver(BeatObserver o);
  
	void registerObserver(BPMObserver o);
  
	void removeObserver(BPMObserver o);
}
