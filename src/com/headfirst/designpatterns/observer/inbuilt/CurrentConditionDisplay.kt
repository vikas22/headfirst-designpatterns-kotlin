/*
 * Copyright (c) 13/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.observer.inbuilt

import java.util.*

class CurrentConditionDisplay: Observer, DisplayElement {
    override fun update(o: Observable?, arg: Any?) {
        val weatherStation = o as? WeatherStation
        if(weatherStation != null) {
            this.temp = weatherStation.temp
            this.humidity = weatherStation.humidity
            this.pressure = weatherStation.pressure
            display()
        }
    }

    var temp:Float = 0.0f
    var humidity:Float = 0.0f
    var pressure:Float = 0.0f
    var subject: Observable? = null

    constructor(subject: Observable){
        this.subject = subject
        subject.addObserver(this)
    }

    override fun display() {
        println("Current condition : $temp F degrees and $humidity% humidity")
    }
}