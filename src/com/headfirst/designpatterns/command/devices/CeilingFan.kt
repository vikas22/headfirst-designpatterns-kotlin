/*
 * Copyright (c) 22/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.command.devices

import javax.swing.text.Highlighter

class CeilingFan {
    val location:String
    var SPEED:Int

    companion object {
        val HIGH = 3
        val MEDIUM = 2
        val LOW = 1
        val OFF = 0
    }
    constructor(location:String){
        this.location = location
        SPEED = OFF
    }

    fun high(){
        SPEED = HIGH
       on("high")
    }

    fun low(){
        SPEED = LOW
        on("low")
    }

    fun medium(){
        SPEED = MEDIUM
        on("medium")
    }

    fun getSpeed():Int{
        return SPEED
    }

    fun on(mode: String){
        println("$location ceiling fan is on $mode mode")
    }

    fun off(){
        println("$location ceiling fan is off")
    }
}