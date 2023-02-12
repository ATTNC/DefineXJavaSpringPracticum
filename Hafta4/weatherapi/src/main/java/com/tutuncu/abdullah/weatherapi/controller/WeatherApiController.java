package com.tutuncu.abdullah.weatherapi.controller;

import com.tutuncu.abdullah.weatherapi.entity.currentWeather.CurrentWeatherRoot;
import com.tutuncu.abdullah.weatherapi.entity.forecastWeather.ForecastWeatherRoot;
import com.tutuncu.abdullah.weatherapi.service.WeatherApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/weather")
public class WeatherApiController {

    private final WeatherApiService weatherApiService;

    @GetMapping("/current/{cityName}")
    public ResponseEntity<CurrentWeatherRoot> getWeatherByCityName(@PathVariable String cityName) {

        return ResponseEntity.ok(weatherApiService.getWeatherByCityName(cityName));
    }

    @GetMapping("/forecast/{cityName}/{day}")
    public ResponseEntity<ForecastWeatherRoot> getWeatherForecast(@PathVariable String cityName, @PathVariable Integer day) {

        if (day == null) {
            throw new NullPointerException();
        }
        if (day < 0 || day > 10) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST);
        }

        return ResponseEntity.ok(weatherApiService.getWeatherForecast(cityName, day));

    }

    @GetMapping("/history/{cityName}/{dt}")
    public ResponseEntity<ForecastWeatherRoot> getWeatherHistory(@PathVariable String cityName, @PathVariable String dt) {

        return ResponseEntity.ok(weatherApiService.getWeatherHistory(cityName, dt));
    }
}
