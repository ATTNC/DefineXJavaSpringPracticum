package com.tutuncu.abdullah.weatherapi.entity.forecastWeather;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;

@Getter
@Setter
public class ForecastDay {
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String date;
    private int date_epoch;
    private Day day;
    private Astro astro;
    private ArrayList<Hour> hour;
}
