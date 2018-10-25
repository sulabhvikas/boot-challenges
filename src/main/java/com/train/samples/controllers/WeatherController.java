package com.train.samples.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.train.samples.models.Weather;
import com.train.samples.models.WeatherForecast;
import com.train.samples.services.WeatherService;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

	private final WeatherService weatherService;

	public WeatherController(WeatherService weatherService) {
		this.weatherService = weatherService;
	}

	@RequestMapping("/current/{country}/{city}")
	public Weather getWeather(@PathVariable String country,
			@PathVariable String city) {
		return this.weatherService.getWeather(country, city);
	}

	@RequestMapping("/forecast/{days}/{country}/{city}")
	public WeatherForecast getWeatherForecast(@PathVariable String days, @PathVariable String country,
			@PathVariable String city) {
		
		return this.weatherService.getWeatherForecast(days, country, city);

	}

}
