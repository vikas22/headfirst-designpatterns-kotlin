/*
 * Copyright (c) 13/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.observer.custom.observers

import com.headfirst.designpatterns.observer.custom.subject.Subject

class HeatIndexDisplay: Observer, DisplayElement {

    var heatIndex = 0.0f
    var subject: Subject? = null
    constructor(subject: Subject){
        this.subject = subject
        subject.registerObserver(this)
    }
    private fun computeHeatIndex(t: Float, rh: Float): Float {
        return (16.923 + 0.185212 * t + 5.37941 * rh - 0.100254 * t.toDouble() * rh.toDouble() +
                0.00941695 * (t * t) + 0.00728898 * (rh * rh) +
                0.000345372 * (t * t * rh) - 0.000814971 * (t * rh * rh) + 0.0000102102 * (t * t * rh * rh) - 0.000038646 * (t * t * t) + 0.0000291583 * (rh * rh * rh) + 0.00000142721 * (t * t * t * rh) +
                0.000000197483 * (t * rh * rh * rh) - 0.0000000218429 * (t * t * t * rh * rh) + 0.000000000843296 * (t * t * rh * rh * rh) - 0.0000000000481975 * (t * t * t * rh * rh * rh)).toFloat()
    }
    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        heatIndex = computeHeatIndex(temperature, humidity)
        display()
    }

    override fun display() {
        println("Heat index is $heatIndex")
    }
}