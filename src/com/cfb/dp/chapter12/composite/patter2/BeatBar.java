package com.cfb.dp.chapter12.composite.patter2;

import javax.swing.JProgressBar;

/**
 * 程序中自定义的进度条相关的View
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
