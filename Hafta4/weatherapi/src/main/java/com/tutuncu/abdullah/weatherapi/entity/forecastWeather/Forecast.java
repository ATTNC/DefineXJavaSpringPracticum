package com.tutuncu.abdullah.weatherapi.entity.forecastWeather;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Forecast {

    private ArrayList<ForecastDay> forecastDay;
}
