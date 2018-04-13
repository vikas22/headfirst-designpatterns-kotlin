/*
 * Copyright (c) 13/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.observer.custom.observers

interface Observer {
    fun update(temperature:Float, humidity:Float, pressure:Float)
}