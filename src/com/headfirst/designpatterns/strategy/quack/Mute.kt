/*
 * Copyright (c) 12/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.strategy.quack

class Mute:QuackBehaviour {
    override fun quack() {
        println("Can't make sound")
    }
}