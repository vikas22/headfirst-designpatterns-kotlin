/*
 * Copyright (c) 13/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.observer.inbuilt

import java.util.*

class ForecastDisplay: Observer, DisplayElement {
    private var currentPressure = 29.92f
    private var lastPressure: Float = 0.toFloat()
    private var subject: Observable? = null
    override fun update(o: Observable?, arg: Any?) {
        val weatherStation = o as? WeatherStation
        if(weatherStation != null) {
            lastPressure = currentPressure;
            currentPressure = weatherStation.pressure;
            display();
            display()
        }
    }

    constructor(subject: Observable) {
        this.subject = subject
        subject.addObserver(this)
    }

    override fun display() {
        print("Forecast: ");
        if (currentPressure > lastPressure) {
            println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            println("More of the same");
        } else if (currentPressure < lastPressure) {
            println("Watch out for cooler, rainy weather");
        }
    }
}