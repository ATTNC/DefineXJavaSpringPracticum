package com.tutuncu.abdullah.weatherapi.entity.forecastWeather;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ForecastWeatherRoot {
    private Location location;
    private Current current;
    private Forecast forecast;
}
