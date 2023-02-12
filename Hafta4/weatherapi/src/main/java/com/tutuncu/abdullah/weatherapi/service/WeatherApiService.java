package com.tutuncu.abdullah.weatherapi.service;

import com.tutuncu.abdullah.weatherapi.entity.currentWeather.CurrentWeatherRoot;
import com.tutuncu.abdullah.weatherapi.entity.forecastWeather.ForecastWeatherRoot;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
@Slf4j
public class WeatherApiService {

    private static final String WeatherUrl = "http://api.weatherapi.com/v1/forecast.json?key=";
    private static final String historyWeatherUrl = "http://api.weatherapi.com/v1/history.json?key=";
    private final Logger logger = LoggerFactory.getLogger(WeatherApiService.class);
    private final RestTemplate restTemplate;
    private final String OpenWeatherMapUrl = "https://api.openweathermap.org/data/2.5/weather?q=";
    private final String openWeatherMapApiKey = "f77bb1214c9dec5c3cedfbe2c166cf38";
    private final String weatherApiKey = "1c92a2d4562b4f11992211355221504";

    public CurrentWeatherRoot getWeatherByCityName(String cityName) throws HttpMessageNotReadableException {

        logger.info("Requesting api.openweathermap.com weather for {}", cityName);

        CurrentWeatherRoot currentWeatherRoot = restTemplate.getForObject(OpenWeatherMapUrl + cityName + "&appid=" + openWeatherMapApiKey,
                CurrentWeatherRoot.class);

        return currentWeatherRoot;
    }

  public ForecastWeatherRoot getWeatherForecast(String cityName, Integer day) {

        logger.info("Requesting api.weatherapi.com {} days weather for {}", day, cityName);

        ForecastWeatherRoot forecastWeatherRoot = restTemplate.getForObject(WeatherUrl + weatherApiKey + "&q=" + cityName + "&days=" +
                day + "&aqi=no&alerts=no", ForecastWeatherRoot.class);

        return forecastWeatherRoot;
    }

   public ForecastWeatherRoot getWeatherHistory(String cityName, String dt) {
        logger.info("Requesting api.weatherapi.com {} date weather for {}", dt, cityName);

        ForecastWeatherRoot forecastWeatherRoot = restTemplate.getForObject(historyWeatherUrl + weatherApiKey + "&q=" + cityName +
                "&dt=" + dt + "&aqi=no&alerts=no", ForecastWeatherRoot.class);

        return forecastWeatherRoot;
    }


}

