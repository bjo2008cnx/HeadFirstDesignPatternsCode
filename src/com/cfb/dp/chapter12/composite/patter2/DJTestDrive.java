package com.cfb.dp.chapter12.composite.patter2;

public class DJTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ����һ��Model��
		BeatModelInterface model = new BeatModel();
		// ����Moderl�㴴��������
		// ��ͼ���ɿ����������д�����
		ControllerInterface controller = new BeatController(model);
	}

}
