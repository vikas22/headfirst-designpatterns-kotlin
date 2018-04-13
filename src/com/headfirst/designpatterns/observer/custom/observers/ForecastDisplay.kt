/*
 * Copyright (c) 13/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.observer.custom.observers

import com.headfirst.designpatterns.observer.custom.subject.Subject

class ForecastDisplay: Observer, DisplayElement {
    private var currentPressure = 29.92f
    private var lastPressure: Float = 0.toFloat()
    private var subject: Subject? = null
    constructor(subject: Subject) {
        this.subject = subject
        subject.registerObserver(this)
    }

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
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