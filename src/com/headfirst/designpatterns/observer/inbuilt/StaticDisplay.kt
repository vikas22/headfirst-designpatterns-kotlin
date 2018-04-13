/*
 * Copyright (c) 13/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.observer.inbuilt

import java.util.*

class StaticDisplay: Observer, DisplayElement {
    private var maxTemp = 0.0f
    private var minTemp = 200f
    private var tempSum = 0.0f
    private var numReadings: Int = 0
    private var subject: Observable? = null

    override fun update(o: Observable?, arg: Any?) {
        val weatherStation = o as? WeatherStation
        if(weatherStation != null) {
            tempSum += weatherStation.temp;
            numReadings++;

            if (weatherStation.temp > maxTemp) {
                maxTemp = weatherStation.temp;
            }

            if (weatherStation.temp < minTemp) {
                minTemp = weatherStation.temp;
            }

            display();
        }
    }

    constructor(subject: Observable) {
        this.subject = subject
        subject.addObserver(this)
    }

    override fun display() {
        println(("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp))
    }
}