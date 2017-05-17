package com.cfb.dp.chapter12.composite.patter2;
/**
 * һ������Ŀ�������ʵ����
 * @author fengbincao
 */
public class BeatController implements ControllerInterface {

	// ����Model�������
	BeatModelInterface model;
	
	// ����View�������
	DJView view;
	
	public BeatController(BeatModelInterface model) {
		this.model = model;
		view = new DJView(this, model);
		
		// ��ʼ��View����������������
		view.createView();
        view.createControls();
        
        view.disableStopMenuItem();
		view.enableStartMenuItem();
		
		// Model��ĳ�ʼ������
		model.initialize();
	}
	
	@Override
	public void start() {
		// �ֱ����Model��View����ط���
		model.on();
		view.disableStartMenuItem();
		view.enableStopMenuItem();
	}

	@Override
	public void stop() {
		// �ֱ����Model��View����ط���
		model.off();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
	}

	@Override
	public void increaseBPM() {
		int bpm = model.getBPM();
		// �ı�Model������ݣ�View���ͨ���۲���ģʽ�õ���Ӧ��֪ͨ�ı�
		model.setBPM(bpm + 1);
	}

	@Override
	public void decreaseBPM() {
		int bpm = model.getBPM();
        model.setBPM(bpm - 1);
	}

	@Override
	public void setBPM(int bpm) {
		model.setBPM(bpm);
	}

}
