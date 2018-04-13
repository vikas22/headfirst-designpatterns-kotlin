/*
 * Copyright (c) 13/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.observer.custom.observers

import com.headfirst.designpatterns.observer.custom.subject.Subject

class CurrentConditionDisplay: Observer, DisplayElement {
    var temp:Float = 0.0f
    var humidity:Float = 0.0f
    var pressure:Float = 0.0f
    var subject: Subject? = null

    constructor(subject: Subject){
        this.subject = subject
        subject.registerObserver(this)
    }
    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        this.temp = temp
        this.humidity = humidity
        this.pressure = pressure
        display()
    }

    override fun display() {
        println("Current condition : $temp F degrees and $humidity% humidity")
    }
}