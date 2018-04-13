/*
 * Copyright (c) 13/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.observer.custom.subject

import com.headfirst.designpatterns.observer.custom.observers.Observer


class WeatherStation: Subject {
    var temp:Float = 0.0f
    var humidity:Float = 0.0f
    var pressure:Float = 0.0f
    var observerList:ArrayList<Observer> = ArrayList()
    override fun registerObserver(observer: Observer) {
        observerList.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        val index = observerList.indexOf(observer)
        if(index != -1)
            observerList.removeAt(index)
    }

    override fun notifyObserver() {
        for(observer in observerList){
            observer.update(temperature = temp, humidity = humidity, pressure = pressure)
        }
    }

    fun setMeasurements(temp:Float, humidity:Float, pressure:Float) {
        this.temp = temp
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }

    fun measurementsChanged(){
        notifyObserver()
    }
}