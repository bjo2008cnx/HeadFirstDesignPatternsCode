package com.cfb.dp.chapter12.composite.patter2;

public class DJTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 创建一个Model层
		BeatModelInterface model = new BeatModel();
		// 根据Moderl层创建控制器
		// 视图是由控制器来进行创建的
		ControllerInterface controller = new BeatController(model);
	}

}
