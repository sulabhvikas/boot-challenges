package com.train.samples.services;

import com.train.samples.models.Weather;
import com.train.samples.models.WeatherForecast;

public class WeatherService {
	
	// e.g. http://api.openweathermap.org/data/2.5/weather?q=London,uk&APPID=96c9189b4377490de31ea173a120bbc5
	private static final String CURRENT_WEATHER_URL =
			"http://api.openweathermap.org/data/2.5/weather?q={city},{country}&APPID={key}";

	// e.g. http://api.openweathermap.org/data/2.5/forecast/daily?q=London,UK&cnt=10&APPID=96c9189b4377490de31ea173a120bbc5
	private static final String FORECAST_WEATHER_URL =
			"http://api.openweathermap.org/data/2.5/forecast/daily?q={city},{country}&cnt= {days}&APPID={key}";

	public Weather getWeather(String country, String city) {
		// TODO Auto-generated method stub
		// Refer: https://openweathermap.org/current
		return null;
	}

	public WeatherForecast getWeatherForecast(String days, String country, String city) {
		// TODO Auto-generated method stub
		// Refer: https://openweathermap.org/forecast5
		return null;
	}

}
