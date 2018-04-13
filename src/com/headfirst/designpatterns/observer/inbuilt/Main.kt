/*
 * Copyright (c) 13/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.observer.inbuilt

fun main(array: Array<String>){
    println("Observer pattern using inbuilt observable")
    val weatherStation = WeatherStation()
    val currentConditionDisplay = CurrentConditionDisplay(weatherStation)
    val forecastDisplay = ForecastDisplay(weatherStation)
    val staticDisplay= StaticDisplay(weatherStation)
    val heatIndexDisplay = HeatIndexDisplay(weatherStation)
    weatherStation.setMeasurements(80f, 65f, 30.4f)
    weatherStation.setMeasurements(82f, 70f, 29.2f)
    weatherStation.setMeasurements(78f, 90f, 39.2f)
}