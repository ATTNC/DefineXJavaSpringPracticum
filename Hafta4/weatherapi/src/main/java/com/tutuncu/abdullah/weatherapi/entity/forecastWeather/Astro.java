package com.tutuncu.abdullah.weatherapi.entity.forecastWeather;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Astro {

    private String sunrise;
    private String sunset;
    private String moonrise;
    private String moonset;
    private String moon_phase;
    private String moon_illumination;
}
