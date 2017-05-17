package com.cfb.dp.chapter12.composite.patter2;

import javax.swing.JProgressBar;

/**
 * �������Զ���Ľ�������ص�View
 * @author fengbincao
 */
public class BeatBar extends JProgressBar implements Runnable { 
	
	private static final long serialVersionUID = 2L;
    JProgressBar progressBar;
	Thread thread;

	public BeatBar() {
		thread = new Thread(this);
		setMaximum(100);
		thread.start();
	}

	public void run() {
		for(;;) {
			int value = getValue();
			value = (int)(value * .75);
			setValue(value);
			repaint();
			try {
				Thread.sleep(50);
			} catch (Exception e) {};
		}
	}
}
