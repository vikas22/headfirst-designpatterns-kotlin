/*
 * Copyright (c) 22/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.command.devices

class Stereo {
    val location:String


    constructor(location:String){
        this.location = location
    }

    fun on(){
        println("$location stereo is on")
    }

    fun off(){
        println("$location stereo is off")
    }

    fun setCD(){
        println("$location stereo is set in CD mode")
    }

    fun setDVD(){
        println("$location stereo is set in DVD mode")
    }

    fun setRadio(){
        println("$location stereo is set in Radio mode")
    }

    fun setVolume(volume: Int){
        println("$location stereo volume is set to $volume")
    }
}