package com.cfb.dp.chapter12.composite.patter2;
/**
 * 一个具体的控制器的实现类
 * @author fengbincao
 */
public class BeatController implements ControllerInterface {

	// 持有Model层的引用
	BeatModelInterface model;
	
	// 持有View层的引用
	DJView view;
	
	public BeatController(BeatModelInterface model) {
		this.model = model;
		view = new DJView(this, model);
		
		// 初始化View的两个主窗体内容
		view.createView();
        view.createControls();
        
        view.disableStopMenuItem();
		view.enableStartMenuItem();
		
		// Model层的初始化操作
		model.initialize();
	}
	
	@Override
	public void start() {
		// 分别调用Model与View的相关方法
		model.on();
		view.disableStartMenuItem();
		view.enableStopMenuItem();
	}

	@Override
	public void stop() {
		// 分别调用Model与View的相关方法
		model.off();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
	}

	@Override
	public void increaseBPM() {
		int bpm = model.getBPM();
		// 改变Model层的数据，View层会通过观察者模式得到相应的通知改变
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
