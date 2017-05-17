package com.cfb.dp.chapter12.composite.patter2;
/**
 * 节拍控制Model层的接口方法
 * @author fengbincao
 */
public interface BeatModelInterface {

	// 控制器调用的4个方法如下：
	
	// (1) 初始化方法
	void initialize();
	
	// (2) 打开
	void on();
	
	// (3) 关闭
	void off();
	  
	// (4) 直接设置节拍的值
    void setBPM(int bpm);
    
    // 允许控制器和View层获取状态信息的方法,并可以成为观察者
    int getBPM();
    
    // 观察者类型有两种，一个是每个节拍变化了都会得到通知，一个是只有BMP变化了才会被通知
    void registerObserver(BeatObserver o);
    
	void removeObserver(BeatObserver o);
  
	void registerObserver(BPMObserver o);
  
	void removeObserver(BPMObserver o);
}
