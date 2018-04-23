/*
 * Copyright (c) 22/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.command.devices

class Light {
    val location:String


    constructor(location:String){
        this.location = location
    }

    fun on(){
        println("$location light is on")
    }

    fun off(){
        println("$location light is off")
    }
}