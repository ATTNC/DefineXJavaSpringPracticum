package com.tutuncu.abdullah.weatherapi.entity.forecastWeather;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Condition {

    private String text;
    private String icon;
    private int code;
}
