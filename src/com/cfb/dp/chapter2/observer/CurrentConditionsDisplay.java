package com.cfb.dp.chapter2.observer;

import java.util.Observable;
import java.util.Observer;
/**
 * ��һ���۲��ߣ�����ָ��temperature,humidity
 * @author fengbincao
 *
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

	// ֻ����������������
	private float temperature;
	private float humidity;
	
	Observable observable;
	
	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature 
				+ "F degrees and " + humidity + "% humidity");
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}

}
