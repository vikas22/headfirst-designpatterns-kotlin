/*
 * Copyright (c) 12/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.strategy.duck

import com.headfirst.designpatterns.strategy.fly.FlyBehaviour
import com.headfirst.designpatterns.strategy.fly.NoFly
import com.headfirst.designpatterns.strategy.quack.Mute
import com.headfirst.designpatterns.strategy.quack.QuackBehaviour

class Decoy:Duck {
    override var flyBehaviour: FlyBehaviour? = NoFly()

    override var quackBehaviour: QuackBehaviour? = Mute()

    override fun setFly(flyBehaviour: FlyBehaviour) {
        this.flyBehaviour = flyBehaviour
    }

    override fun setQuack(quackBehaviour: QuackBehaviour) {
        this.quackBehaviour = quackBehaviour
    }

    override fun display() {
        println("Decoy Duck")
    }

    override fun perfromQuack() {
        quackBehaviour!!.quack()
    }

    override fun perfromFly() {
        flyBehaviour!!.fly()
    }

}