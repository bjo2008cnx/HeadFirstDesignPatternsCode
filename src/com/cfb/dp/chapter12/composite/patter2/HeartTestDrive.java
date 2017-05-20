package com.cfb.dp.chapter12.composite.patter2;

public class HeartTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HeartModel heartModel = new HeartModel();
		ControllerInterface model = new HeartController(heartModel);

	}

}
