package com.mixiaoxiao.weather;

import android.app.Application;

public class WeatherApplication extends Application {
	
	
	public static final boolean DEBUG = true;
	public static final boolean USE_SAMPLE_DATA = true;
	
	@Override
	public void onCreate() {
		super.onCreate();
	}
}
