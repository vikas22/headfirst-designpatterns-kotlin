/*
 * Copyright (c) 13/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.observer.inbuilt

import com.headfirst.designpatterns.observer.custom.observers.Observer
import java.util.*


class WeatherStation: Observable() {
    var temp:Float = 0.0f
    var humidity:Float = 0.0f
    var pressure:Float = 0.0f
    var observerList:ArrayList<Observer> = ArrayList()


    fun setMeasurements(temp:Float, humidity:Float, pressure:Float) {
        this.temp = temp
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }

    fun measurementsChanged(){
        setChanged()
        notifyObservers()
    }
}