/*
 * Copyright (c) 13/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.observer.inbuilt

import com.headfirst.designpatterns.observer.custom.subject.Subject
import java.util.*

class HeatIndexDisplay: Observer, DisplayElement {

    var heatIndex = 0.0f
    var subject: Observable? = null

    override fun update(o: Observable?, arg: Any?) {
        val weatherStation = o as? WeatherStation
        if (weatherStation != null) {
            heatIndex = computeHeatIndex(weatherStation.temp, weatherStation.humidity)
            display()
        }
    }

    constructor(subject: Observable){
        this.subject = subject
        subject.addObserver(this)
    }
    private fun computeHeatIndex(t: Float, rh: Float): Float {
        return (16.923 + 0.185212 * t + 5.37941 * rh - 0.100254 * t.toDouble() * rh.toDouble() +
                0.00941695 * (t * t) + 0.00728898 * (rh * rh) +
                0.000345372 * (t * t * rh) - 0.000814971 * (t * rh * rh) + 0.0000102102 * (t * t * rh * rh) - 0.000038646 * (t * t * t) + 0.0000291583 * (rh * rh * rh) + 0.00000142721 * (t * t * t * rh) +
                0.000000197483 * (t * rh * rh * rh) - 0.0000000218429 * (t * t * t * rh * rh) + 0.000000000843296 * (t * t * rh * rh * rh) - 0.0000000000481975 * (t * t * t * rh * rh * rh)).toFloat()
    }

    override fun display() {
        println("Heat index is $heatIndex")
    }
}