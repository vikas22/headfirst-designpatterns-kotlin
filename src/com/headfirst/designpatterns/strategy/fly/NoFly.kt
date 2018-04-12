/*
 * Copyright (c) 12/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.strategy.fly

class NoFly:FlyBehaviour {
    override fun fly() {
        println("Can't Fly")
    }
}