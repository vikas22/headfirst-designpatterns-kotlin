/*
 * Copyright (c) 22/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.command.devices

class TV {
    val location:String

    constructor(location:String){
        this.location = location
    }
    fun on(){
        println("${location} TV is on")
    }

    fun off(){
        println("${location} TV is off")
    }

    fun setDVD(){
        println("${location} TV is set to DVD mode")
    }

    fun setNormal(){
        println("${location} TV is set to Normal mode")
    }




}