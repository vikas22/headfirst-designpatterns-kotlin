/*
 * Copyright (c) 13/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.observer.custom.observers

import com.headfirst.designpatterns.observer.custom.subject.Subject

class StaticDisplay: Observer, DisplayElement {
    private var maxTemp = 0.0f
    private var minTemp = 200f
    private var tempSum = 0.0f
    private var numReadings: Int = 0
    private var subject: Subject? = null


    constructor(subject: Subject) {
        this.subject = subject
        subject.registerObserver(this)
    }
    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        tempSum += temperature;
        numReadings++;

        if (temperature > maxTemp) {
            maxTemp = temperature;
        }

        if (temperature < minTemp) {
            minTemp = temperature;
        }

        display();

    }

    override fun display() {
        println(("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp))
    }
}