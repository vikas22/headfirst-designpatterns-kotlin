/*
 * Copyright (c) 13/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.observer.custom

import com.headfirst.designpatterns.observer.custom.observers.CurrentConditionDisplay
import com.headfirst.designpatterns.observer.custom.observers.ForecastDisplay
import com.headfirst.designpatterns.observer.custom.observers.HeatIndexDisplay
import com.headfirst.designpatterns.observer.custom.observers.StaticDisplay
import com.headfirst.designpatterns.observer.custom.subject.WeatherStation

fun main(args:Array<String>){
    println("Observer pattern custom")
    val weatherStation = WeatherStation()
    val currentConditionDisplay = CurrentConditionDisplay(weatherStation)
    val forecastDisplay = ForecastDisplay(weatherStation)
    val staticDisplay= StaticDisplay(weatherStation)
    val heatIndexDisplay = HeatIndexDisplay(weatherStation)
    weatherStation.setMeasurements(80f, 65f, 30.4f)
    weatherStation.setMeasurements(82f, 70f, 29.2f)
    weatherStation.setMeasurements(78f, 90f, 39.2f)
}
